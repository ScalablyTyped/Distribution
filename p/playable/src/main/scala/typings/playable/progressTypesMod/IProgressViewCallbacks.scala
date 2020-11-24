package typings.playable.progressTypesMod

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressViewCallbacks extends js.Object {
  
  def onChangePlayedPercent(percent: Double): Unit = js.native
  
  def onDragEnd(): Unit = js.native
  
  def onDragStart(): Unit = js.native
  
  def onSeekToByMouseEnd(): Unit = js.native
  
  def onSeekToByMouseStart(percent: Double): Unit = js.native
  
  def onSyncWithLiveClick(): Unit = js.native
  
  var onSyncWithLiveMouseEnter: EventListenerOrEventListenerObject = js.native
  
  var onSyncWithLiveMouseLeave: EventListenerOrEventListenerObject = js.native
}
object IProgressViewCallbacks {
  
  @scala.inline
  def apply(
    onChangePlayedPercent: Double => Unit,
    onDragEnd: () => Unit,
    onDragStart: () => Unit,
    onSeekToByMouseEnd: () => Unit,
    onSeekToByMouseStart: Double => Unit,
    onSyncWithLiveClick: () => Unit,
    onSyncWithLiveMouseEnter: EventListenerOrEventListenerObject,
    onSyncWithLiveMouseLeave: EventListenerOrEventListenerObject
  ): IProgressViewCallbacks = {
    val __obj = js.Dynamic.literal(onChangePlayedPercent = js.Any.fromFunction1(onChangePlayedPercent), onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onSeekToByMouseEnd = js.Any.fromFunction0(onSeekToByMouseEnd), onSeekToByMouseStart = js.Any.fromFunction1(onSeekToByMouseStart), onSyncWithLiveClick = js.Any.fromFunction0(onSyncWithLiveClick), onSyncWithLiveMouseEnter = onSyncWithLiveMouseEnter.asInstanceOf[js.Any], onSyncWithLiveMouseLeave = onSyncWithLiveMouseLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressViewCallbacks]
  }
  
  @scala.inline
  implicit class IProgressViewCallbacksOps[Self <: IProgressViewCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnChangePlayedPercent(value: Double => Unit): Self = this.set("onChangePlayedPercent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnd(value: () => Unit): Self = this.set("onDragEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSeekToByMouseEnd(value: () => Unit): Self = this.set("onSeekToByMouseEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSeekToByMouseStart(value: Double => Unit): Self = this.set("onSeekToByMouseStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSyncWithLiveClick(value: () => Unit): Self = this.set("onSyncWithLiveClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSyncWithLiveMouseEnterFunction1(value: /* evt */ Event => Unit): Self = this.set("onSyncWithLiveMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSyncWithLiveMouseEnter(value: EventListenerOrEventListenerObject): Self = this.set("onSyncWithLiveMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSyncWithLiveMouseLeaveFunction1(value: /* evt */ Event => Unit): Self = this.set("onSyncWithLiveMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSyncWithLiveMouseLeave(value: EventListenerOrEventListenerObject): Self = this.set("onSyncWithLiveMouseLeave", value.asInstanceOf[js.Any])
  }
}

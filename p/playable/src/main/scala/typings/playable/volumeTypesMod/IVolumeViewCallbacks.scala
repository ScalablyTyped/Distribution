package typings.playable.volumeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVolumeViewCallbacks extends js.Object {
  
  def onDragEnd(): Unit = js.native
  
  def onDragStart(): Unit = js.native
  
  def onToggleMuteClick(): Unit = js.native
  
  def onVolumeLevelChangeFromInput(level: Double): Unit = js.native
  
  def onVolumeLevelChangeFromWheel(delta: Double): Unit = js.native
}
object IVolumeViewCallbacks {
  
  @scala.inline
  def apply(
    onDragEnd: () => Unit,
    onDragStart: () => Unit,
    onToggleMuteClick: () => Unit,
    onVolumeLevelChangeFromInput: Double => Unit,
    onVolumeLevelChangeFromWheel: Double => Unit
  ): IVolumeViewCallbacks = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onToggleMuteClick = js.Any.fromFunction0(onToggleMuteClick), onVolumeLevelChangeFromInput = js.Any.fromFunction1(onVolumeLevelChangeFromInput), onVolumeLevelChangeFromWheel = js.Any.fromFunction1(onVolumeLevelChangeFromWheel))
    __obj.asInstanceOf[IVolumeViewCallbacks]
  }
  
  @scala.inline
  implicit class IVolumeViewCallbacksOps[Self <: IVolumeViewCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnDragEnd(value: () => Unit): Self = this.set("onDragEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnToggleMuteClick(value: () => Unit): Self = this.set("onToggleMuteClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVolumeLevelChangeFromInput(value: Double => Unit): Self = this.set("onVolumeLevelChangeFromInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeLevelChangeFromWheel(value: Double => Unit): Self = this.set("onVolumeLevelChangeFromWheel", js.Any.fromFunction1(value))
  }
}

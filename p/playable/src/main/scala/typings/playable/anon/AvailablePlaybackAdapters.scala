package typings.playable.anon

import typings.playable.adaptersTypesMod.IPlaybackAdapterClass
import typings.playable.configMod.IPlayerConfig
import typings.playable.eventEmitterTypesMod.IEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailablePlaybackAdapters extends js.Object {
  
  var availablePlaybackAdapters: js.Array[IPlaybackAdapterClass] = js.native
  
  var config: IPlayerConfig = js.native
  
  var eventEmitter: IEventEmitter = js.native
}
object AvailablePlaybackAdapters {
  
  @scala.inline
  def apply(
    availablePlaybackAdapters: js.Array[IPlaybackAdapterClass],
    config: IPlayerConfig,
    eventEmitter: IEventEmitter
  ): AvailablePlaybackAdapters = {
    val __obj = js.Dynamic.literal(availablePlaybackAdapters = availablePlaybackAdapters.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailablePlaybackAdapters]
  }
  
  @scala.inline
  implicit class AvailablePlaybackAdaptersOps[Self <: AvailablePlaybackAdapters] (val x: Self) extends AnyVal {
    
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
    def setAvailablePlaybackAdaptersVarargs(value: IPlaybackAdapterClass*): Self = this.set("availablePlaybackAdapters", js.Array(value :_*))
    
    @scala.inline
    def setAvailablePlaybackAdapters(value: js.Array[IPlaybackAdapterClass]): Self = this.set("availablePlaybackAdapters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
  }
}

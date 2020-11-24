package typings.playable.playbackEngineTypesMod

import typings.playable.adaptersTypesMod.IPlaybackAdapterClass
import typings.playable.configMod.IPlayerConfig
import typings.playable.eventEmitterTypesMod.IEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaybackEngineDependencies extends js.Object {
  
  var availablePlaybackAdapters: js.Array[IPlaybackAdapterClass] = js.native
  
  var config: IPlayerConfig = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var nativeOutput: IVideoOutput = js.native
}
object IPlaybackEngineDependencies {
  
  @scala.inline
  def apply(
    availablePlaybackAdapters: js.Array[IPlaybackAdapterClass],
    config: IPlayerConfig,
    eventEmitter: IEventEmitter,
    nativeOutput: IVideoOutput
  ): IPlaybackEngineDependencies = {
    val __obj = js.Dynamic.literal(availablePlaybackAdapters = availablePlaybackAdapters.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], nativeOutput = nativeOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaybackEngineDependencies]
  }
  
  @scala.inline
  implicit class IPlaybackEngineDependenciesOps[Self <: IPlaybackEngineDependencies] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setNativeOutput(value: IVideoOutput): Self = this.set("nativeOutput", value.asInstanceOf[js.Any])
  }
}

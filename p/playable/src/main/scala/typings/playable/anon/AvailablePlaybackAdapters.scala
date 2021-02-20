package typings.playable.anon

import typings.playable.adaptersTypesMod.IPlaybackAdapterClass
import typings.playable.configMod.IPlayerConfig
import typings.playable.eventEmitterTypesMod.IEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailablePlaybackAdapters extends StObject {
  
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
  implicit class AvailablePlaybackAdaptersMutableBuilder[Self <: AvailablePlaybackAdapters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailablePlaybackAdapters(value: js.Array[IPlaybackAdapterClass]): Self = StObject.set(x, "availablePlaybackAdapters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailablePlaybackAdaptersVarargs(value: IPlaybackAdapterClass*): Self = StObject.set(x, "availablePlaybackAdapters", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
  }
}

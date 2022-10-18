package typings.playable.anon

import typings.playable.distSrcCoreConfigMod.IPlayerConfig
import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesPlaybackEngineOutputNativeAdaptersTypesMod.IPlaybackAdapterClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailablePlaybackAdapters extends StObject {
  
  var availablePlaybackAdapters: js.Array[IPlaybackAdapterClass]
  
  var config: IPlayerConfig
  
  var eventEmitter: IEventEmitter
}
object AvailablePlaybackAdapters {
  
  inline def apply(
    availablePlaybackAdapters: js.Array[IPlaybackAdapterClass],
    config: IPlayerConfig,
    eventEmitter: IEventEmitter
  ): AvailablePlaybackAdapters = {
    val __obj = js.Dynamic.literal(availablePlaybackAdapters = availablePlaybackAdapters.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailablePlaybackAdapters]
  }
  
  extension [Self <: AvailablePlaybackAdapters](x: Self) {
    
    inline def setAvailablePlaybackAdapters(value: js.Array[IPlaybackAdapterClass]): Self = StObject.set(x, "availablePlaybackAdapters", value.asInstanceOf[js.Any])
    
    inline def setAvailablePlaybackAdaptersVarargs(value: IPlaybackAdapterClass*): Self = StObject.set(x, "availablePlaybackAdapters", js.Array(value*))
    
    inline def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
  }
}

package typings.playable.anon

import typings.playable.distSrcCoreConfigMod.IPlayerConfig
import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import typings.playable.distSrcModulesRootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEmitter extends StObject {
  
  var config: IPlayerConfig
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var rootContainer: IRootContainer
}
object EventEmitter {
  
  inline def apply(
    config: IPlayerConfig,
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    rootContainer: IRootContainer
  ): EventEmitter = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitter]
  }
  
  extension [Self <: EventEmitter](x: Self) {
    
    inline def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}

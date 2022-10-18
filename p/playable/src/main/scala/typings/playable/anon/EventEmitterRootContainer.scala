package typings.playable.anon

import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import typings.playable.distSrcModulesRootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEmitterRootContainer extends StObject {
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var rootContainer: IRootContainer
}
object EventEmitterRootContainer {
  
  inline def apply(engine: IPlaybackEngine, eventEmitter: IEventEmitter, rootContainer: IRootContainer): EventEmitterRootContainer = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitterRootContainer]
  }
  
  extension [Self <: EventEmitterRootContainer](x: Self) {
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}

package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Engine extends StObject {
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
}
object Engine {
  
  inline def apply(engine: IPlaybackEngine, eventEmitter: IEventEmitter): Engine = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
  
  extension [Self <: Engine](x: Self) {
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
  }
}

package typings.playable.anon

import typings.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineIPlaybackEngine extends StObject {
  
  var engine: IPlaybackEngine
}
object EngineIPlaybackEngine {
  
  inline def apply(engine: IPlaybackEngine): EngineIPlaybackEngine = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineIPlaybackEngine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EngineIPlaybackEngine] (val x: Self) extends AnyVal {
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
  }
}

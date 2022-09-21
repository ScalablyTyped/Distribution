package typings.pino.mod.pino

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransportTargetOptions[TransportOptions] extends StObject {
  
  var level: LevelWithSilent | String
  
  var options: TransportOptions
  
  var target: String
}
object TransportTargetOptions {
  
  inline def apply[TransportOptions](level: LevelWithSilent | String, options: TransportOptions, target: String): TransportTargetOptions[TransportOptions] = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportTargetOptions[TransportOptions]]
  }
  
  extension [Self <: TransportTargetOptions[?], TransportOptions](x: Self & TransportTargetOptions[TransportOptions]) {
    
    inline def setLevel(value: LevelWithSilent | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TransportOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}

package typings.pino.mod.pino

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransportSingleOptions[TransportOptions]
  extends StObject
     with TransportBaseOptions[TransportOptions] {
  
  var target: String
}
object TransportSingleOptions {
  
  inline def apply[TransportOptions](target: String): TransportSingleOptions[TransportOptions] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportSingleOptions[TransportOptions]]
  }
  
  extension [Self <: TransportSingleOptions[?], TransportOptions](x: Self & TransportSingleOptions[TransportOptions]) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}

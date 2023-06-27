package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encodedjitconfig extends StObject {
  
  /** @description The base64 encoded runner configuration. */
  var encoded_jit_config: String
  
  var runner: Os
}
object Encodedjitconfig {
  
  inline def apply(encoded_jit_config: String, runner: Os): Encodedjitconfig = {
    val __obj = js.Dynamic.literal(encoded_jit_config = encoded_jit_config.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encodedjitconfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encodedjitconfig] (val x: Self) extends AnyVal {
    
    inline def setEncoded_jit_config(value: String): Self = StObject.set(x, "encoded_jit_config", value.asInstanceOf[js.Any])
    
    inline def setRunner(value: Os): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
  }
}

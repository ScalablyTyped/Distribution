package typings.openpgp.anon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Err extends StObject {
  
  var err: js.Array[Error] | Null
  
  var keys: js.Array[typings.openpgp.mod.key.Key]
}
object Err {
  
  inline def apply(keys: js.Array[typings.openpgp.mod.key.Key]): Err = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], err = null)
    __obj.asInstanceOf[Err]
  }
  
  extension [Self <: Err](x: Self) {
    
    inline def setErr(value: js.Array[Error]): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrNull: Self = StObject.set(x, "err", null)
    
    inline def setErrVarargs(value: Error*): Self = StObject.set(x, "err", js.Array(value :_*))
    
    inline def setKeys(value: js.Array[typings.openpgp.mod.key.Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: typings.openpgp.mod.key.Key*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}

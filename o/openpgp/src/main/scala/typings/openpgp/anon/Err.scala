package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Err extends StObject {
  
  var err: js.Array[js.Error] | Null
  
  var keys: js.Array[typings.openpgp.mod.key.Key]
}
object Err {
  
  inline def apply(keys: js.Array[typings.openpgp.mod.key.Key]): Err = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], err = null)
    __obj.asInstanceOf[Err]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Err] (val x: Self) extends AnyVal {
    
    inline def setErr(value: js.Array[js.Error]): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrNull: Self = StObject.set(x, "err", null)
    
    inline def setErrVarargs(value: js.Error*): Self = StObject.set(x, "err", js.Array(value*))
    
    inline def setKeys(value: js.Array[typings.openpgp.mod.key.Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: typings.openpgp.mod.key.Key*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}

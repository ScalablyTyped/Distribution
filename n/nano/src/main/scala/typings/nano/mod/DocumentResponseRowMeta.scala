package typings.nano.mod

import typings.nano.anon.Rev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -------------------------------------
// Document scope request and response
// -------------------------------------
/** Bulk API per-document response. */
trait DocumentResponseRowMeta extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var key: String
  
  var value: Rev
}
object DocumentResponseRowMeta {
  
  inline def apply(id: String, key: String, value: Rev): DocumentResponseRowMeta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRowMeta]
  }
  
  extension [Self <: DocumentResponseRowMeta](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Rev): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

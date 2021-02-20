package typings.nano.mod

import typings.nano.anon.Rev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -------------------------------------
// Document scope request and response
// -------------------------------------
@js.native
trait DocumentResponseRowMeta extends StObject {
  
  var error: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var key: String = js.native
  
  var value: Rev = js.native
}
object DocumentResponseRowMeta {
  
  @scala.inline
  def apply(id: String, key: String, value: Rev): DocumentResponseRowMeta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRowMeta]
  }
  
  @scala.inline
  implicit class DocumentResponseRowMetaMutableBuilder[Self <: DocumentResponseRowMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Rev): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

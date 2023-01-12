package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Document fetch error */
trait DocumentLookupFailure extends StObject {
  
  var error: String
  
  var key: String
}
object DocumentLookupFailure {
  
  inline def apply(error: String, key: String): DocumentLookupFailure = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLookupFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentLookupFailure] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}

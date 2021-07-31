package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLookupFailure extends StObject {
  
  var error: String
  
  var key: String
}
object DocumentLookupFailure {
  
  @scala.inline
  def apply(error: String, key: String): DocumentLookupFailure = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLookupFailure]
  }
  
  @scala.inline
  implicit class DocumentLookupFailureMutableBuilder[Self <: DocumentLookupFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}

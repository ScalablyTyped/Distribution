package typings.minio.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostPolicyResult extends StObject {
  
  var formData: StringDictionary[Any]
  
  var postURL: String
}
object PostPolicyResult {
  
  inline def apply(formData: StringDictionary[Any], postURL: String): PostPolicyResult = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], postURL = postURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostPolicyResult] (val x: Self) extends AnyVal {
    
    inline def setFormData(value: StringDictionary[Any]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setPostURL(value: String): Self = StObject.set(x, "postURL", value.asInstanceOf[js.Any])
  }
}

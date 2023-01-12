package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content296 extends StObject {
  
  /** Deletes a review comment. */
  var delete: ParametersPathCommentidOwnerResponses6
  
  /** Provides details for a review comment. */
  var get: Responses200Content296
  
  /** Enables you to edit a review comment. */
  var patch: Responses297
}
object GetResponses200Content296 {
  
  inline def apply(delete: ParametersPathCommentidOwnerResponses6, get: Responses200Content296, patch: Responses297): GetResponses200Content296 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content296]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content296] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCommentidOwnerResponses6): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content296): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses297): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}

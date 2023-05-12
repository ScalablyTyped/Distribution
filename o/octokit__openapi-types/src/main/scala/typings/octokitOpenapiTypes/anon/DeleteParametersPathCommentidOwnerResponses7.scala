package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentidOwnerResponses7 extends StObject {
  
  /** Delete a commit comment */
  var delete: ParametersPathCommentidOwnerResponses7
  
  /** Get a commit comment */
  var get: ParametersPathCommentidOwner
  
  /** Update a commit comment */
  var patch: Responses200Content213
}
object DeleteParametersPathCommentidOwnerResponses7 {
  
  inline def apply(
    delete: ParametersPathCommentidOwnerResponses7,
    get: ParametersPathCommentidOwner,
    patch: Responses200Content213
  ): DeleteParametersPathCommentidOwnerResponses7 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentidOwnerResponses7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathCommentidOwnerResponses7] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCommentidOwnerResponses7): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCommentidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content213): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}

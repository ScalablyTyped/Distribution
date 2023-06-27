package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentidOwnerResponses9 extends StObject {
  
  /** Delete a commit comment */
  var delete: ParametersPathCommentidOwnerResponses9
  
  /** Get a commit comment */
  var get: ParametersPathCommentidOwner
  
  /** Update a commit comment */
  var patch: Responses200Content250
}
object DeleteParametersPathCommentidOwnerResponses9 {
  
  inline def apply(
    delete: ParametersPathCommentidOwnerResponses9,
    get: ParametersPathCommentidOwner,
    patch: Responses200Content250
  ): DeleteParametersPathCommentidOwnerResponses9 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentidOwnerResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathCommentidOwnerResponses9] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCommentidOwnerResponses9): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCommentidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content250): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses200Content325404422 extends StObject {
  
  /** Delete a pending review for a pull request */
  var delete: Responses200Content325404422
  
  /** Get a review for a pull request */
  var get: ParametersPathReviewid
  
  /**
    * Update a review for a pull request
    * @description Update the review summary comment with new text.
    */
  var put: Responses200Content325422
}
object DeleteResponses200Content325404422 {
  
  inline def apply(delete: Responses200Content325404422, get: ParametersPathReviewid, put: Responses200Content325422): DeleteResponses200Content325404422 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses200Content325404422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses200Content325404422] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses200Content325404422): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathReviewid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content325422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}

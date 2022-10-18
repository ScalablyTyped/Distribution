package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses200Content568404422 extends StObject {
  
  var delete: Responses200Content568404422
  
  var get: ParametersPathRepoReviewid
  
  /** Update the review summary comment with new text. */
  var put: Responses200Content568422
}
object DeleteResponses200Content568404422 {
  
  inline def apply(
    delete: Responses200Content568404422,
    get: ParametersPathRepoReviewid,
    put: Responses200Content568422
  ): DeleteResponses200Content568404422 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses200Content568404422]
  }
  
  extension [Self <: DeleteResponses200Content568404422](x: Self) {
    
    inline def setDelete(value: Responses200Content568404422): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRepoReviewid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content568422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathAssetidOwnerResponses extends StObject {
  
  var delete: ParametersPathAssetidOwnerResponses
  
  /** To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://docs.github.com/rest/overview/media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response. */
  var get: ParametersPathAssetidOwner
  
  /** Users with push access to the repository can edit a release asset. */
  var patch: Responses200Content573
}
object DeleteParametersPathAssetidOwnerResponses {
  
  inline def apply(
    delete: ParametersPathAssetidOwnerResponses,
    get: ParametersPathAssetidOwner,
    patch: Responses200Content573
  ): DeleteParametersPathAssetidOwnerResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathAssetidOwnerResponses]
  }
  
  extension [Self <: DeleteParametersPathAssetidOwnerResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathAssetidOwnerResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathAssetidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content573): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}

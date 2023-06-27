package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathAssetidResponses extends StObject {
  
  /** Delete a release asset */
  var delete: ParametersPathAssetidResponses
  
  /**
    * Get a release asset
    * @description To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://docs.github.com/rest/overview/media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.
    */
  var get: ParametersPathAssetid
  
  /**
    * Update a release asset
    * @description Users with push access to the repository can edit a release asset.
    */
  var patch: Responses200Content386
}
object DeleteParametersPathAssetidResponses {
  
  inline def apply(delete: ParametersPathAssetidResponses, get: ParametersPathAssetid, patch: Responses200Content386): DeleteParametersPathAssetidResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathAssetidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathAssetidResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathAssetidResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathAssetid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content386): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}

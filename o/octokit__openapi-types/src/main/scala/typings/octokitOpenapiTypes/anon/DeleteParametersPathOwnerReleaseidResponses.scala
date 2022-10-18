package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOwnerReleaseidResponses extends StObject {
  
  /** Users with push access to the repository can delete a release. */
  var delete: ParametersPathOwnerReleaseidResponses
  
  /** **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia). */
  var get: ParametersPathOwnerReleaseid
  
  /** Users with push access to the repository can edit a release. */
  var patch: Responses200575404Content6
}
object DeleteParametersPathOwnerReleaseidResponses {
  
  inline def apply(
    delete: ParametersPathOwnerReleaseidResponses,
    get: ParametersPathOwnerReleaseid,
    patch: Responses200575404Content6
  ): DeleteParametersPathOwnerReleaseidResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOwnerReleaseidResponses]
  }
  
  extension [Self <: DeleteParametersPathOwnerReleaseidResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathOwnerReleaseidResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOwnerReleaseid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200575404Content6): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}

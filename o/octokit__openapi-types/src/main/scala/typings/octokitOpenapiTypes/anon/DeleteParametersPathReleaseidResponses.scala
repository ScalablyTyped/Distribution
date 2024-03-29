package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathReleaseidResponses extends StObject {
  
  /**
    * Delete a release
    * @description Users with push access to the repository can delete a release.
    */
  var delete: ParametersPathReleaseidResponses
  
  /**
    * Get a release
    * @description **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia).
    */
  var get: ParametersPathReleaseid
  
  /**
    * Update a release
    * @description Users with push access to the repository can edit a release.
    */
  var patch: Responses200388404Content41
}
object DeleteParametersPathReleaseidResponses {
  
  inline def apply(
    delete: ParametersPathReleaseidResponses,
    get: ParametersPathReleaseid,
    patch: Responses200388404Content41
  ): DeleteParametersPathReleaseidResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathReleaseidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathReleaseidResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathReleaseidResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathReleaseid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200388404Content41): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}

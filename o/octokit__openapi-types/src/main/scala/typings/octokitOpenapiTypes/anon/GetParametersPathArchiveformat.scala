package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathArchiveformat extends StObject {
  
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in
    * the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathArchiveformat
}
object GetParametersPathArchiveformat {
  
  inline def apply(get: ParametersPathArchiveformat): GetParametersPathArchiveformat = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathArchiveformat]
  }
  
  extension [Self <: GetParametersPathArchiveformat](x: Self) {
    
    inline def setGet(value: ParametersPathArchiveformat): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

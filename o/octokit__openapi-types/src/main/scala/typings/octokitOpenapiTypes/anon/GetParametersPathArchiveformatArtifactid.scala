package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathArchiveformatArtifactid extends StObject {
  
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in
    * the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathArchiveformatArtifactid
}
object GetParametersPathArchiveformatArtifactid {
  
  inline def apply(get: ParametersPathArchiveformatArtifactid): GetParametersPathArchiveformatArtifactid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathArchiveformatArtifactid]
  }
  
  extension [Self <: GetParametersPathArchiveformatArtifactid](x: Self) {
    
    inline def setGet(value: ParametersPathArchiveformatArtifactid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

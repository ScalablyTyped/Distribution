package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses403500 extends StObject {
  
  /** Deletes all logs for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. */
  var delete: Responses403500
  
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for
    * `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use
    * this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have
    * the `actions:read` permission to use this endpoint.
    */
  var get: Parameters147
}
object DeleteResponses403500 {
  
  inline def apply(delete: Responses403500, get: Parameters147): DeleteResponses403500 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses403500]
  }
  
  extension [Self <: DeleteResponses403500](x: Self) {
    
    inline def setDelete(value: Responses403500): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters147): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

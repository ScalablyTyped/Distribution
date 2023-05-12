package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200202404 extends StObject {
  
  /**
    * Get a DNS health check for GitHub Pages
    * @description Gets a health check of the DNS settings for the `CNAME` record configured for a repository's GitHub Pages.
    *
    * The first request to this endpoint returns a `202 Accepted` status and starts an asynchronous background task to get the results for the domain. After the background task completes, subsequent requests to this endpoint return a `200 OK` status with the health check results in the response.
    *
    * To use this endpoint, you must be a repository administrator, maintainer, or have the 'manage GitHub Pages settings' permission. A token with the `repo` scope or Pages write permission is required. GitHub Apps must have the `administrative:write` and `pages:write` permissions.
    */
  var get: Responses200202404
}
object GetResponses200202404 {
  
  inline def apply(get: Responses200202404): GetResponses200202404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200202404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200202404] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200202404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

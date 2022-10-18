package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200202400 extends StObject {
  
  /**
    * Gets a health check of the DNS settings for the `CNAME` record configured for a repository's GitHub Pages.
    *
    * The first request to this endpoint returns a `202 Accepted` status and starts an asynchronous background task to get the results for the domain. After the background task completes, subsequent requests to this endpoint return a `200 OK` status with the health check results in the response.
    *
    * Users must have admin or owner permissions. GitHub Apps must have the `pages:write` and `administration:write` permission to use this endpoint.
    */
  var get: Responses200202400
}
object GetResponses200202400 {
  
  inline def apply(get: Responses200202400): GetResponses200202400 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200202400]
  }
  
  extension [Self <: GetResponses200202400](x: Self) {
    
    inline def setGet(value: Responses200202400): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

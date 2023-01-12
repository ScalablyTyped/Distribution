package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathJobidResponses extends StObject {
  
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look
    * for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can
    * use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must
    * have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathJobidResponses
}
object GetParametersPathJobidResponses {
  
  inline def apply(get: ParametersPathJobidResponses): GetParametersPathJobidResponses = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathJobidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathJobidResponses] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathJobidResponses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

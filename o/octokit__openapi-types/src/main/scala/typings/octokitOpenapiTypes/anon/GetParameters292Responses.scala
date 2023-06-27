package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters292Responses extends StObject {
  
  /**
    * Download a repository archive (zip)
    * @description Gets a redirect URL to download a zip archive for a repository. If you omit `:ref`, the repository’s default branch (usually
    * `main`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    *
    * **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.
    */
  var get: Parameters292Responses
}
object GetParameters292Responses {
  
  inline def apply(get: Parameters292Responses): GetParameters292Responses = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters292Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters292Responses] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters292Responses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

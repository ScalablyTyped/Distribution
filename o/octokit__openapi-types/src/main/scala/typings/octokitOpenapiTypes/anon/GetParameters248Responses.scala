package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters248Responses extends StObject {
  
  /**
    * Download a repository archive (zip)
    * @description Gets a redirect URL to download a zip archive for a repository. If you omit `:ref`, the repository’s default branch (usually
    * `main`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    *
    * **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.
    */
  var get: Parameters248Responses
}
object GetParameters248Responses {
  
  inline def apply(get: Parameters248Responses): GetParameters248Responses = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters248Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters248Responses] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters248Responses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters241Responses extends StObject {
  
  /**
    * Gets a redirect URL to download a zip archive for a repository. If you omit `:ref`, the repository’s default branch (usually
    * `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use
    * the `Location` header to make a second `GET` request.
    *
    * **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.
    */
  var get: Parameters241Responses
}
object GetParameters241Responses {
  
  inline def apply(get: Parameters241Responses): GetParameters241Responses = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters241Responses]
  }
  
  extension [Self <: GetParameters241Responses](x: Self) {
    
    inline def setGet(value: Parameters241Responses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

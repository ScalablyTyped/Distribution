package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content39 extends StObject {
  
  /**
    * Get GitHub meta information
    * @description Returns meta information about GitHub, including a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/)."
    *
    * The values shown in the documentation's response are example values. You must always query the API directly to get the latest values.
    *
    * **Note:** This endpoint returns both IPv4 and IPv6 addresses. However, not all features support IPv6. You should refer to the specific documentation for each feature to determine if IPv6 is supported.
    */
  var get: Responses200Content39
}
object GetResponses200Content39 {
  
  inline def apply(get: Responses200Content39): GetResponses200Content39 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content39]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content39] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content39): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

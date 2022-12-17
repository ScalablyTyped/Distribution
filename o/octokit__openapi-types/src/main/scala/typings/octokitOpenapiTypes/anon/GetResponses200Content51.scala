package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content51 extends StObject {
  
  /**
    * Returns meta information about GitHub, including a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/)."
    *
    * **Note:** The IP addresses shown in the documentation's response are only example values. You must always query the API directly to get the latest list of IP addresses.
    */
  var get: Responses200Content51
}
object GetResponses200Content51 {
  
  inline def apply(get: Responses200Content51): GetResponses200Content51 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content51]
  }
  
  extension [Self <: GetResponses200Content51](x: Self) {
    
    inline def setGet(value: Responses200Content51): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

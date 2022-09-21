package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content32 extends StObject {
  
  /**
    * Gets the free and paid storage used for GitHub Packages in gigabytes.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * The authenticated user must be an enterprise admin.
    */
  var get: Responses200Content32
}
object GetResponses200Content32 {
  
  inline def apply(get: Responses200Content32): GetResponses200Content32 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content32]
  }
  
  extension [Self <: GetResponses200Content32](x: Self) {
    
    inline def setGet(value: Responses200Content32): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

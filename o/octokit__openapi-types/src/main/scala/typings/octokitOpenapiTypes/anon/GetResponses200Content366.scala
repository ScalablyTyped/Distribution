package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content366 extends StObject {
  
  /**
    * Gets the free and paid storage used for GitHub Packages in gigabytes.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  var get: Responses200Content366
}
object GetResponses200Content366 {
  
  inline def apply(get: Responses200Content366): GetResponses200Content366 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content366]
  }
  
  extension [Self <: GetResponses200Content366](x: Self) {
    
    inline def setGet(value: Responses200Content366): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

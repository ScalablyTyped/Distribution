package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content131 extends StObject {
  
  /**
    * Get GitHub Packages billing for an organization
    * @description Gets the free and paid storage used for GitHub Packages in gigabytes.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  var get: Responses200Content131
}
object GetResponses200Content131 {
  
  inline def apply(get: Responses200Content131): GetResponses200Content131 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content131]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content131] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content131): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

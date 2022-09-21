package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200301404 extends StObject {
  
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: Responses200301404
}
object GetResponses200301404 {
  
  inline def apply(get: Responses200301404): GetResponses200301404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200301404]
  }
  
  extension [Self <: GetResponses200301404](x: Self) {
    
    inline def setGet(value: Responses200301404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

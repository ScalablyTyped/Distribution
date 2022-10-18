package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content624Headers extends StObject {
  
  /** Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope. */
  var get: Responses200Content624Headers
}
object GetResponses200Content624Headers {
  
  inline def apply(get: Responses200Content624Headers): GetResponses200Content624Headers = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content624Headers]
  }
  
  extension [Self <: GetResponses200Content624Headers](x: Self) {
    
    inline def setGet(value: Responses200Content624Headers): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

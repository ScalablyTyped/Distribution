package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content371Headers extends StObject {
  
  /** Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope. */
  var get: Responses200Content371Headers
}
object GetResponses200Content371Headers {
  
  inline def apply(get: Responses200Content371Headers): GetResponses200Content371Headers = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content371Headers]
  }
  
  extension [Self <: GetResponses200Content371Headers](x: Self) {
    
    inline def setGet(value: Responses200Content371Headers): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

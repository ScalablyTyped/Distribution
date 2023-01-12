package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content358Headers extends StObject {
  
  /** Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope. */
  var get: Responses200Content358Headers
}
object GetResponses200Content358Headers {
  
  inline def apply(get: Responses200Content358Headers): GetResponses200Content358Headers = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content358Headers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content358Headers] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content358Headers): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content382HeadersLink extends StObject {
  
  /**
    * List public email addresses for the authenticated user
    * @description Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  var get: Responses200Content382HeadersLink
}
object GetResponses200Content382HeadersLink {
  
  inline def apply(get: Responses200Content382HeadersLink): GetResponses200Content382HeadersLink = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content382HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content382HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content382HeadersLink): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

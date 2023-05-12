package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content45HeadersLink extends StObject {
  
  /**
    * List organizations for the authenticated user
    * @description List organizations for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.
    */
  var get: Responses200Content45HeadersLink
}
object GetResponses200Content45HeadersLink {
  
  inline def apply(get: Responses200Content45HeadersLink): GetResponses200Content45HeadersLink = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content45HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content45HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content45HeadersLink): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

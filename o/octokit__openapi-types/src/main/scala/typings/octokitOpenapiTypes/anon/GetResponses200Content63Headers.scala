package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content63Headers extends StObject {
  
  /**
    * List organizations for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.
    */
  var get: Responses200Content63Headers
}
object GetResponses200Content63Headers {
  
  inline def apply(get: Responses200Content63Headers): GetResponses200Content63Headers = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content63Headers]
  }
  
  extension [Self <: GetResponses200Content63Headers](x: Self) {
    
    inline def setGet(value: Responses200Content63Headers): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

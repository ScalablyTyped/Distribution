package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content253 extends StObject {
  
  /** When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations. */
  var get: Responses200Content253
}
object GetResponses200Content253 {
  
  inline def apply(get: Responses200Content253): GetResponses200Content253 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content253]
  }
  
  extension [Self <: GetResponses200Content253](x: Self) {
    
    inline def setGet(value: Responses200Content253): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content260 extends StObject {
  
  /** When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations. */
  var get: Responses200Content260
}
object GetResponses200Content260 {
  
  inline def apply(get: Responses200Content260): GetResponses200Content260 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content260]
  }
  
  extension [Self <: GetResponses200Content260](x: Self) {
    
    inline def setGet(value: Responses200Content260): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

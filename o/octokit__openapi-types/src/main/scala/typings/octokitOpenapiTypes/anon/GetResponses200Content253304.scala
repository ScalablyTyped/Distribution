package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content253304 extends StObject {
  
  /** When authenticating as a user, this endpoint will list all currently open repository invitations for that user. */
  var get: Responses200Content253304
}
object GetResponses200Content253304 {
  
  inline def apply(get: Responses200Content253304): GetResponses200Content253304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content253304]
  }
  
  extension [Self <: GetResponses200Content253304](x: Self) {
    
    inline def setGet(value: Responses200Content253304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

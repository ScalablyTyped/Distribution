package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content523304 extends StObject {
  
  /** When authenticating as a user, this endpoint will list all currently open repository invitations for that user. */
  var get: Responses200Content523304
}
object GetResponses200Content523304 {
  
  inline def apply(get: Responses200Content523304): GetResponses200Content523304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content523304]
  }
  
  extension [Self <: GetResponses200Content523304](x: Self) {
    
    inline def setGet(value: Responses200Content523304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

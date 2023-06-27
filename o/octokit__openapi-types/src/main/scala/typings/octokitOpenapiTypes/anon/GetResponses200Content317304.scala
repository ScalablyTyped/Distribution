package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content317304 extends StObject {
  
  /**
    * List repository invitations for the authenticated user
    * @description When authenticating as a user, this endpoint will list all currently open repository invitations for that user.
    */
  var get: Responses200Content317304
}
object GetResponses200Content317304 {
  
  inline def apply(get: Responses200Content317304): GetResponses200Content317304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content317304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content317304] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content317304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content523 extends StObject {
  
  /** When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations. */
  var get: Responses200Content523
}
object GetResponses200Content523 {
  
  inline def apply(get: Responses200Content523): GetResponses200Content523 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content523]
  }
  
  extension [Self <: GetResponses200Content523](x: Self) {
    
    inline def setGet(value: Responses200Content523): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

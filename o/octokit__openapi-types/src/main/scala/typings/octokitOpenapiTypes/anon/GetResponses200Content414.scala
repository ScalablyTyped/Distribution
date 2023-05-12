package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content414 extends StObject {
  
  /**
    * List public keys for a user
    * @description Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  var get: Responses200Content414
}
object GetResponses200Content414 {
  
  inline def apply(get: Responses200Content414): GetResponses200Content414 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content414]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content414] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content414): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

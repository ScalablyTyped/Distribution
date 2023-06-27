package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content488 extends StObject {
  
  /**
    * List public keys for a user
    * @description Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  var get: Responses200Content488
}
object GetResponses200Content488 {
  
  inline def apply(get: Responses200Content488): GetResponses200Content488 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content488]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content488] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content488): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

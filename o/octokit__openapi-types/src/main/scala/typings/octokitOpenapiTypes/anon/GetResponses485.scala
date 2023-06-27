package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses485 extends StObject {
  
  /**
    * List GPG keys for a user
    * @description Lists the GPG keys for a user. This information is accessible by anyone.
    */
  var get: Responses485
}
object GetResponses485 {
  
  inline def apply(get: Responses485): GetResponses485 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses485]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses485] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses485): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

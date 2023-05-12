package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content13 extends StObject {
  
  /**
    * Get emojis
    * @description Lists all the emojis available to use on GitHub.
    */
  var get: Responses200Content13
}
object GetResponses200Content13 {
  
  inline def apply(get: Responses200Content13): GetResponses200Content13 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content13]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content13] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content13): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

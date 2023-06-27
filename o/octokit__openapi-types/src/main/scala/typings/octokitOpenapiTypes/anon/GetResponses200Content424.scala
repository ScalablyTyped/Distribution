package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content424 extends StObject {
  
  /** List repository tags */
  var get: Responses200Content424
}
object GetResponses200Content424 {
  
  inline def apply(get: Responses200Content424): GetResponses200Content424 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content424]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content424] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content424): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

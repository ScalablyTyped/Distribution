package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content18 extends StObject {
  
  /** List public organization events */
  var get: Responses200Content18
}
object GetResponses200Content18 {
  
  inline def apply(get: Responses200Content18): GetResponses200Content18 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content18]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content18] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content18): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

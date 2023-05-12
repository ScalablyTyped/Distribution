package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content310 extends StObject {
  
  /** Get latest Pages build */
  var get: Responses200Content310
}
object GetResponses200Content310 {
  
  inline def apply(get: Responses200Content310): GetResponses200Content310 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content310]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content310] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content310): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

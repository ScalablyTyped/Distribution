package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomError extends StObject {
  
  /** The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow "last one wins" order. */
  var rules: js.UndefOr[js.Array[CustomErrorRule]] = js.undefined
  
  /** The list of custom error detail types, e.g. 'google.foo.v1.CustomError'. */
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object CustomError {
  
  inline def apply(): CustomError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomError] (val x: Self) extends AnyVal {
    
    inline def setRules(value: js.Array[CustomErrorRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: CustomErrorRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}

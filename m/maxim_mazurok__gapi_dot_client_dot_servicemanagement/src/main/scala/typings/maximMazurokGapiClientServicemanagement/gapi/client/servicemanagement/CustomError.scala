package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomError extends StObject {
  
  /** The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow "last one wins" order. */
  var rules: js.UndefOr[js.Array[CustomErrorRule]] = js.native
  
  /** The list of custom error detail types, e.g. 'google.foo.v1.CustomError'. */
  var types: js.UndefOr[js.Array[String]] = js.native
}
object CustomError {
  
  @scala.inline
  def apply(): CustomError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomError]
  }
  
  @scala.inline
  implicit class CustomErrorMutableBuilder[Self <: CustomError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[CustomErrorRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: CustomErrorRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}

package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomErrorRule extends StObject {
  
  /** Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload. */
  var isErrorType: js.UndefOr[Boolean] = js.undefined
  
  /** Selects messages to which this rule applies. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.undefined
}
object CustomErrorRule {
  
  inline def apply(): CustomErrorRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomErrorRule]
  }
  
  extension [Self <: CustomErrorRule](x: Self) {
    
    inline def setIsErrorType(value: Boolean): Self = StObject.set(x, "isErrorType", value.asInstanceOf[js.Any])
    
    inline def setIsErrorTypeUndefined: Self = StObject.set(x, "isErrorType", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}

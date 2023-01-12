package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultInfo extends StObject {
  
  // The result code.
  var code: js.UndefOr[Double] = js.undefined
  
  // The message.
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The result sub-code.
  var subcode: js.UndefOr[Double] = js.undefined
}
object ResultInfo {
  
  inline def apply(): ResultInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultInfo] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSubcode(value: Double): Self = StObject.set(x, "subcode", value.asInstanceOf[js.Any])
    
    inline def setSubcodeUndefined: Self = StObject.set(x, "subcode", js.undefined)
  }
}

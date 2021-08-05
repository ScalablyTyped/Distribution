package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicErrorDetail extends StObject {
  
  var code: js.UndefOr[NullableOption[String]] = js.undefined
  
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  var target: js.UndefOr[NullableOption[String]] = js.undefined
}
object PublicErrorDetail {
  
  inline def apply(): PublicErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicErrorDetail]
  }
  
  extension [Self <: PublicErrorDetail](x: Self) {
    
    inline def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTarget(value: NullableOption[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}

package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confirmation extends StObject {
  
  var confirmation: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var info: js.UndefOr[String] = js.undefined
  
  var warning: js.UndefOr[String] = js.undefined
}
object Confirmation {
  
  inline def apply(): Confirmation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Confirmation]
  }
  
  extension [Self <: Confirmation](x: Self) {
    
    inline def setConfirmation(value: String): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
    
    inline def setConfirmationUndefined: Self = StObject.set(x, "confirmation", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

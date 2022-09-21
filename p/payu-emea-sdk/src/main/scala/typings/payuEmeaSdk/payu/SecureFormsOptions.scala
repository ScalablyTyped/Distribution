package typings.payuEmeaSdk.payu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureFormsOptions extends StObject {
  
  var fonts: js.UndefOr[js.Array[FontOptions]] = js.undefined
}
object SecureFormsOptions {
  
  inline def apply(): SecureFormsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureFormsOptions]
  }
  
  extension [Self <: SecureFormsOptions](x: Self) {
    
    inline def setFonts(value: js.Array[FontOptions]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setFontsVarargs(value: FontOptions*): Self = StObject.set(x, "fonts", js.Array(value*))
  }
}

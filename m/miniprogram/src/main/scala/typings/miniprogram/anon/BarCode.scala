package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarCode extends StObject {
  
  var barCode: js.UndefOr[String] = js.undefined
  
  var code: String
  
  var qrCode: js.UndefOr[String] = js.undefined
}
object BarCode {
  
  inline def apply(code: String): BarCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCode]
  }
  
  extension [Self <: BarCode](x: Self) {
    
    inline def setBarCode(value: String): Self = StObject.set(x, "barCode", value.asInstanceOf[js.Any])
    
    inline def setBarCodeUndefined: Self = StObject.set(x, "barCode", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setQrCode(value: String): Self = StObject.set(x, "qrCode", value.asInstanceOf[js.Any])
    
    inline def setQrCodeUndefined: Self = StObject.set(x, "qrCode", js.undefined)
  }
}

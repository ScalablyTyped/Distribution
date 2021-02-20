package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarCode extends StObject {
  
  var barCode: js.UndefOr[String] = js.native
  
  var code: String = js.native
  
  var qrCode: js.UndefOr[String] = js.native
}
object BarCode {
  
  @scala.inline
  def apply(code: String): BarCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCode]
  }
  
  @scala.inline
  implicit class BarCodeMutableBuilder[Self <: BarCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarCode(value: String): Self = StObject.set(x, "barCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarCodeUndefined: Self = StObject.set(x, "barCode", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQrCode(value: String): Self = StObject.set(x, "qrCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQrCodeUndefined: Self = StObject.set(x, "qrCode", js.undefined)
  }
}

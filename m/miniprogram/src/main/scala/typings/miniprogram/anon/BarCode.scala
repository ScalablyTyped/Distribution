package typings.miniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarCode extends js.Object {
  
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
  implicit class BarCodeOps[Self <: BarCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarCode(value: String): Self = this.set("barCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarCode: Self = this.set("barCode", js.undefined)
    
    @scala.inline
    def setQrCode(value: String): Self = this.set("qrCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQrCode: Self = this.set("qrCode", js.undefined)
  }
}

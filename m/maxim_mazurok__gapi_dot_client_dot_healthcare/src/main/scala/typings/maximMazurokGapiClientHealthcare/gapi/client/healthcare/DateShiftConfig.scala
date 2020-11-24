package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateShiftConfig extends js.Object {
  
  /**
    * An AES 128/192/256 bit key. Causes the shift to be computed based on this key and the patient ID. A default key is generated for each Deidentify operation and is used wherever
    * crypto_key is not specified.
    */
  var cryptoKey: js.UndefOr[String] = js.native
}
object DateShiftConfig {
  
  @scala.inline
  def apply(): DateShiftConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateShiftConfig]
  }
  
  @scala.inline
  implicit class DateShiftConfigOps[Self <: DateShiftConfig] (val x: Self) extends AnyVal {
    
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
    def setCryptoKey(value: String): Self = this.set("cryptoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoKey: Self = this.set("cryptoKey", js.undefined)
  }
}

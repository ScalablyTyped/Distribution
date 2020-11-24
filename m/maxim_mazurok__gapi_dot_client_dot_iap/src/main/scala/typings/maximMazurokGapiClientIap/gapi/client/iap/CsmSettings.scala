package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsmSettings extends js.Object {
  
  /** Audience claim set in the generated RCToken. This value is not validated by IAP. */
  var rctokenAud: js.UndefOr[String] = js.native
}
object CsmSettings {
  
  @scala.inline
  def apply(): CsmSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsmSettings]
  }
  
  @scala.inline
  implicit class CsmSettingsOps[Self <: CsmSettings] (val x: Self) extends AnyVal {
    
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
    def setRctokenAud(value: String): Self = this.set("rctokenAud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRctokenAud: Self = this.set("rctokenAud", js.undefined)
  }
}

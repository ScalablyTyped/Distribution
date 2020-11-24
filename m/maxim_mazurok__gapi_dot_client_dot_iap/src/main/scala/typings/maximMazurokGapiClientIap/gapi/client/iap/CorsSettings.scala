package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorsSettings extends js.Object {
  
  /** Configuration to allow HTTP OPTIONS calls to skip authorization. If undefined, IAP will not apply any special logic to OPTIONS requests. */
  var allowHttpOptions: js.UndefOr[Boolean] = js.native
}
object CorsSettings {
  
  @scala.inline
  def apply(): CorsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorsSettings]
  }
  
  @scala.inline
  implicit class CorsSettingsOps[Self <: CorsSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowHttpOptions(value: Boolean): Self = this.set("allowHttpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHttpOptions: Self = this.set("allowHttpOptions", js.undefined)
  }
}

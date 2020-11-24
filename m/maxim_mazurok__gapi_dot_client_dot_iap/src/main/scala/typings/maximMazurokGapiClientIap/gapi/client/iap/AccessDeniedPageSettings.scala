package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessDeniedPageSettings extends js.Object {
  
  /** The URI to be redirected to when access is denied. */
  var accessDeniedPageUri: js.UndefOr[String] = js.native
}
object AccessDeniedPageSettings {
  
  @scala.inline
  def apply(): AccessDeniedPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessDeniedPageSettings]
  }
  
  @scala.inline
  implicit class AccessDeniedPageSettingsOps[Self <: AccessDeniedPageSettings] (val x: Self) extends AnyVal {
    
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
    def setAccessDeniedPageUri(value: String): Self = this.set("accessDeniedPageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessDeniedPageUri: Self = this.set("accessDeniedPageUri", js.undefined)
  }
}

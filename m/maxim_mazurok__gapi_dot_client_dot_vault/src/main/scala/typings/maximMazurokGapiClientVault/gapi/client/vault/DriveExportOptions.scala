package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveExportOptions extends js.Object {
  
  /** Set to true to include access level information for users with indirect access to files. */
  var includeAccessInfo: js.UndefOr[Boolean] = js.native
}
object DriveExportOptions {
  
  @scala.inline
  def apply(): DriveExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveExportOptions]
  }
  
  @scala.inline
  implicit class DriveExportOptionsOps[Self <: DriveExportOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeAccessInfo(value: Boolean): Self = this.set("includeAccessInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAccessInfo: Self = this.set("includeAccessInfo", js.undefined)
  }
}

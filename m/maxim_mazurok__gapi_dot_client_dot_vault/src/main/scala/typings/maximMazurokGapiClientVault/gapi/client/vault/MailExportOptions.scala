package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailExportOptions extends js.Object {
  
  /** The export file format. */
  var exportFormat: js.UndefOr[String] = js.native
  
  /** Set to true to export confidential mode content. */
  var showConfidentialModeContent: js.UndefOr[Boolean] = js.native
}
object MailExportOptions {
  
  @scala.inline
  def apply(): MailExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailExportOptions]
  }
  
  @scala.inline
  implicit class MailExportOptionsOps[Self <: MailExportOptions] (val x: Self) extends AnyVal {
    
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
    def setExportFormat(value: String): Self = this.set("exportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportFormat: Self = this.set("exportFormat", js.undefined)
    
    @scala.inline
    def setShowConfidentialModeContent(value: Boolean): Self = this.set("showConfidentialModeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowConfidentialModeContent: Self = this.set("showConfidentialModeContent", js.undefined)
  }
}

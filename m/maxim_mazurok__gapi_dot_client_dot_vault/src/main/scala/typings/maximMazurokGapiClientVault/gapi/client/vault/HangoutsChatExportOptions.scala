package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HangoutsChatExportOptions extends js.Object {
  
  /** The export format for hangouts chat export. */
  var exportFormat: js.UndefOr[String] = js.native
}
object HangoutsChatExportOptions {
  
  @scala.inline
  def apply(): HangoutsChatExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HangoutsChatExportOptions]
  }
  
  @scala.inline
  implicit class HangoutsChatExportOptionsOps[Self <: HangoutsChatExportOptions] (val x: Self) extends AnyVal {
    
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
  }
}

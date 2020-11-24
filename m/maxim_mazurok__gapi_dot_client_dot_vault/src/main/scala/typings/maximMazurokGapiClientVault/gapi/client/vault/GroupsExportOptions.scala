package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsExportOptions extends js.Object {
  
  /** The export format for groups export. */
  var exportFormat: js.UndefOr[String] = js.native
}
object GroupsExportOptions {
  
  @scala.inline
  def apply(): GroupsExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupsExportOptions]
  }
  
  @scala.inline
  implicit class GroupsExportOptionsOps[Self <: GroupsExportOptions] (val x: Self) extends AnyVal {
    
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

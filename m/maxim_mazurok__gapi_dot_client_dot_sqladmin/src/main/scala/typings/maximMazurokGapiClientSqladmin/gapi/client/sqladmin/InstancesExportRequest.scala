package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesExportRequest extends js.Object {
  
  /** Contains details about the export operation. */
  var exportContext: js.UndefOr[ExportContext] = js.native
}
object InstancesExportRequest {
  
  @scala.inline
  def apply(): InstancesExportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesExportRequest]
  }
  
  @scala.inline
  implicit class InstancesExportRequestOps[Self <: InstancesExportRequest] (val x: Self) extends AnyVal {
    
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
    def setExportContext(value: ExportContext): Self = this.set("exportContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportContext: Self = this.set("exportContext", js.undefined)
  }
}

package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportInstanceInfoRequest extends StObject {
  
  /** The metadata reported to Notebooks API. This will be merged to the instance metadata store */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.ReportInstanceInfoRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity */
  var vmId: js.UndefOr[String] = js.native
}
object ReportInstanceInfoRequest {
  
  @scala.inline
  def apply(): ReportInstanceInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportInstanceInfoRequest]
  }
  
  @scala.inline
  implicit class ReportInstanceInfoRequestMutableBuilder[Self <: ReportInstanceInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.ReportInstanceInfoRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}

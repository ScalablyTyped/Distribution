package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesExportRequest extends StObject {
  
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
  implicit class InstancesExportRequestMutableBuilder[Self <: InstancesExportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportContext(value: ExportContext): Self = StObject.set(x, "exportContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportContextUndefined: Self = StObject.set(x, "exportContext", js.undefined)
  }
}

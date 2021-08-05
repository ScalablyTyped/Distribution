package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesExportRequest extends StObject {
  
  /** Contains details about the export operation. */
  var exportContext: js.UndefOr[ExportContext] = js.undefined
}
object InstancesExportRequest {
  
  inline def apply(): InstancesExportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesExportRequest]
  }
  
  extension [Self <: InstancesExportRequest](x: Self) {
    
    inline def setExportContext(value: ExportContext): Self = StObject.set(x, "exportContext", value.asInstanceOf[js.Any])
    
    inline def setExportContextUndefined: Self = StObject.set(x, "exportContext", js.undefined)
  }
}

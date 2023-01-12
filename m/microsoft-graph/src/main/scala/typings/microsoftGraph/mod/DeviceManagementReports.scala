package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceManagementReports
  extends StObject
     with Entity {
  
  // Entity representing a job to export a report
  var exportJobs: js.UndefOr[NullableOption[js.Array[DeviceManagementExportJob]]] = js.undefined
}
object DeviceManagementReports {
  
  inline def apply(): DeviceManagementReports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementReports]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceManagementReports] (val x: Self) extends AnyVal {
    
    inline def setExportJobs(value: NullableOption[js.Array[DeviceManagementExportJob]]): Self = StObject.set(x, "exportJobs", value.asInstanceOf[js.Any])
    
    inline def setExportJobsNull: Self = StObject.set(x, "exportJobs", null)
    
    inline def setExportJobsUndefined: Self = StObject.set(x, "exportJobs", js.undefined)
    
    inline def setExportJobsVarargs(value: DeviceManagementExportJob*): Self = StObject.set(x, "exportJobs", js.Array(value*))
  }
}

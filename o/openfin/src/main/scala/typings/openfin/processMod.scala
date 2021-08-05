package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processMod {
  
  trait ProcessInfo extends StObject {
    
    var cpuUsage: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nonPagedPoolUsage: js.UndefOr[Double] = js.undefined
    
    var pageFaultCount: js.UndefOr[Double] = js.undefined
    
    var pagedPoolUsage: js.UndefOr[Double] = js.undefined
    
    var pagefileUsage: js.UndefOr[Double] = js.undefined
    
    var peakNonPagedPoolUsage: js.UndefOr[Double] = js.undefined
    
    var peakPagedPoolUsage: js.UndefOr[Double] = js.undefined
    
    var peakPagefileUsage: js.UndefOr[Double] = js.undefined
    
    var peakWorkingSetSize: js.UndefOr[Double] = js.undefined
    
    var processId: js.UndefOr[Double] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
    
    var workingSetSize: js.UndefOr[Double] = js.undefined
  }
  object ProcessInfo {
    
    inline def apply(): ProcessInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessInfo]
    }
    
    extension [Self <: ProcessInfo](x: Self) {
      
      inline def setCpuUsage(value: Double): Self = StObject.set(x, "cpuUsage", value.asInstanceOf[js.Any])
      
      inline def setCpuUsageUndefined: Self = StObject.set(x, "cpuUsage", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonPagedPoolUsage(value: Double): Self = StObject.set(x, "nonPagedPoolUsage", value.asInstanceOf[js.Any])
      
      inline def setNonPagedPoolUsageUndefined: Self = StObject.set(x, "nonPagedPoolUsage", js.undefined)
      
      inline def setPageFaultCount(value: Double): Self = StObject.set(x, "pageFaultCount", value.asInstanceOf[js.Any])
      
      inline def setPageFaultCountUndefined: Self = StObject.set(x, "pageFaultCount", js.undefined)
      
      inline def setPagedPoolUsage(value: Double): Self = StObject.set(x, "pagedPoolUsage", value.asInstanceOf[js.Any])
      
      inline def setPagedPoolUsageUndefined: Self = StObject.set(x, "pagedPoolUsage", js.undefined)
      
      inline def setPagefileUsage(value: Double): Self = StObject.set(x, "pagefileUsage", value.asInstanceOf[js.Any])
      
      inline def setPagefileUsageUndefined: Self = StObject.set(x, "pagefileUsage", js.undefined)
      
      inline def setPeakNonPagedPoolUsage(value: Double): Self = StObject.set(x, "peakNonPagedPoolUsage", value.asInstanceOf[js.Any])
      
      inline def setPeakNonPagedPoolUsageUndefined: Self = StObject.set(x, "peakNonPagedPoolUsage", js.undefined)
      
      inline def setPeakPagedPoolUsage(value: Double): Self = StObject.set(x, "peakPagedPoolUsage", value.asInstanceOf[js.Any])
      
      inline def setPeakPagedPoolUsageUndefined: Self = StObject.set(x, "peakPagedPoolUsage", js.undefined)
      
      inline def setPeakPagefileUsage(value: Double): Self = StObject.set(x, "peakPagefileUsage", value.asInstanceOf[js.Any])
      
      inline def setPeakPagefileUsageUndefined: Self = StObject.set(x, "peakPagefileUsage", js.undefined)
      
      inline def setPeakWorkingSetSize(value: Double): Self = StObject.set(x, "peakWorkingSetSize", value.asInstanceOf[js.Any])
      
      inline def setPeakWorkingSetSizeUndefined: Self = StObject.set(x, "peakWorkingSetSize", js.undefined)
      
      inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      inline def setWorkingSetSize(value: Double): Self = StObject.set(x, "workingSetSize", value.asInstanceOf[js.Any])
      
      inline def setWorkingSetSizeUndefined: Self = StObject.set(x, "workingSetSize", js.undefined)
    }
  }
}

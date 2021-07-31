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
    
    @scala.inline
    def apply(): ProcessInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessInfo]
    }
    
    @scala.inline
    implicit class ProcessInfoMutableBuilder[Self <: ProcessInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpuUsage(value: Double): Self = StObject.set(x, "cpuUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuUsageUndefined: Self = StObject.set(x, "cpuUsage", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonPagedPoolUsage(value: Double): Self = StObject.set(x, "nonPagedPoolUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonPagedPoolUsageUndefined: Self = StObject.set(x, "nonPagedPoolUsage", js.undefined)
      
      @scala.inline
      def setPageFaultCount(value: Double): Self = StObject.set(x, "pageFaultCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageFaultCountUndefined: Self = StObject.set(x, "pageFaultCount", js.undefined)
      
      @scala.inline
      def setPagedPoolUsage(value: Double): Self = StObject.set(x, "pagedPoolUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagedPoolUsageUndefined: Self = StObject.set(x, "pagedPoolUsage", js.undefined)
      
      @scala.inline
      def setPagefileUsage(value: Double): Self = StObject.set(x, "pagefileUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagefileUsageUndefined: Self = StObject.set(x, "pagefileUsage", js.undefined)
      
      @scala.inline
      def setPeakNonPagedPoolUsage(value: Double): Self = StObject.set(x, "peakNonPagedPoolUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakNonPagedPoolUsageUndefined: Self = StObject.set(x, "peakNonPagedPoolUsage", js.undefined)
      
      @scala.inline
      def setPeakPagedPoolUsage(value: Double): Self = StObject.set(x, "peakPagedPoolUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakPagedPoolUsageUndefined: Self = StObject.set(x, "peakPagedPoolUsage", js.undefined)
      
      @scala.inline
      def setPeakPagefileUsage(value: Double): Self = StObject.set(x, "peakPagefileUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakPagefileUsageUndefined: Self = StObject.set(x, "peakPagefileUsage", js.undefined)
      
      @scala.inline
      def setPeakWorkingSetSize(value: Double): Self = StObject.set(x, "peakWorkingSetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakWorkingSetSizeUndefined: Self = StObject.set(x, "peakWorkingSetSize", js.undefined)
      
      @scala.inline
      def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      @scala.inline
      def setWorkingSetSize(value: Double): Self = StObject.set(x, "workingSetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkingSetSizeUndefined: Self = StObject.set(x, "workingSetSize", js.undefined)
    }
  }
}

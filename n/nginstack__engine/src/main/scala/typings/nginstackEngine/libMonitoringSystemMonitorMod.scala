package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMonitoringSystemMonitorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/monitoring/SystemMonitor", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SystemMonitor {
    
    /* CompleteClass */
    var allocated: Double = js.native
    
    /* CompleteClass */
    var availablePageFile: Double = js.native
    
    /* CompleteClass */
    var availablePhysical: Double = js.native
    
    /* CompleteClass */
    var idoCacheSize: Double = js.native
    
    /* CompleteClass */
    var peakPhysical: Double = js.native
    
    /* CompleteClass */
    var peakVirtual: Double = js.native
    
    /* CompleteClass */
    var standaloneSessionsCount: Double = js.native
    
    /* CompleteClass */
    var statefulSessionsCount: Double = js.native
    
    /* CompleteClass */
    var statelessSessionsCount: Double = js.native
    
    /* CompleteClass */
    var totalPageFile: Double = js.native
    
    /* CompleteClass */
    var totalPhysical: Double = js.native
    
    /* CompleteClass */
    var usedPhysical: Double = js.native
    
    /* CompleteClass */
    var usedVirtual: Double = js.native
    
    /* CompleteClass */
    var virtualAllocated: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/monitoring/SystemMonitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): SystemMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[SystemMonitor]
  
  trait SystemMonitor extends StObject {
    
    var allocated: Double
    
    var availablePageFile: Double
    
    var availablePhysical: Double
    
    var idoCacheSize: Double
    
    var peakPhysical: Double
    
    var peakVirtual: Double
    
    var standaloneSessionsCount: Double
    
    var statefulSessionsCount: Double
    
    var statelessSessionsCount: Double
    
    var totalPageFile: Double
    
    var totalPhysical: Double
    
    var usedPhysical: Double
    
    var usedVirtual: Double
    
    var virtualAllocated: Double
  }
  object SystemMonitor {
    
    inline def apply(
      allocated: Double,
      availablePageFile: Double,
      availablePhysical: Double,
      idoCacheSize: Double,
      peakPhysical: Double,
      peakVirtual: Double,
      standaloneSessionsCount: Double,
      statefulSessionsCount: Double,
      statelessSessionsCount: Double,
      totalPageFile: Double,
      totalPhysical: Double,
      usedPhysical: Double,
      usedVirtual: Double,
      virtualAllocated: Double
    ): SystemMonitor = {
      val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], availablePageFile = availablePageFile.asInstanceOf[js.Any], availablePhysical = availablePhysical.asInstanceOf[js.Any], idoCacheSize = idoCacheSize.asInstanceOf[js.Any], peakPhysical = peakPhysical.asInstanceOf[js.Any], peakVirtual = peakVirtual.asInstanceOf[js.Any], standaloneSessionsCount = standaloneSessionsCount.asInstanceOf[js.Any], statefulSessionsCount = statefulSessionsCount.asInstanceOf[js.Any], statelessSessionsCount = statelessSessionsCount.asInstanceOf[js.Any], totalPageFile = totalPageFile.asInstanceOf[js.Any], totalPhysical = totalPhysical.asInstanceOf[js.Any], usedPhysical = usedPhysical.asInstanceOf[js.Any], usedVirtual = usedVirtual.asInstanceOf[js.Any], virtualAllocated = virtualAllocated.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemMonitor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SystemMonitor] (val x: Self) extends AnyVal {
      
      inline def setAllocated(value: Double): Self = StObject.set(x, "allocated", value.asInstanceOf[js.Any])
      
      inline def setAvailablePageFile(value: Double): Self = StObject.set(x, "availablePageFile", value.asInstanceOf[js.Any])
      
      inline def setAvailablePhysical(value: Double): Self = StObject.set(x, "availablePhysical", value.asInstanceOf[js.Any])
      
      inline def setIdoCacheSize(value: Double): Self = StObject.set(x, "idoCacheSize", value.asInstanceOf[js.Any])
      
      inline def setPeakPhysical(value: Double): Self = StObject.set(x, "peakPhysical", value.asInstanceOf[js.Any])
      
      inline def setPeakVirtual(value: Double): Self = StObject.set(x, "peakVirtual", value.asInstanceOf[js.Any])
      
      inline def setStandaloneSessionsCount(value: Double): Self = StObject.set(x, "standaloneSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setStatefulSessionsCount(value: Double): Self = StObject.set(x, "statefulSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setStatelessSessionsCount(value: Double): Self = StObject.set(x, "statelessSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setTotalPageFile(value: Double): Self = StObject.set(x, "totalPageFile", value.asInstanceOf[js.Any])
      
      inline def setTotalPhysical(value: Double): Self = StObject.set(x, "totalPhysical", value.asInstanceOf[js.Any])
      
      inline def setUsedPhysical(value: Double): Self = StObject.set(x, "usedPhysical", value.asInstanceOf[js.Any])
      
      inline def setUsedVirtual(value: Double): Self = StObject.set(x, "usedVirtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualAllocated(value: Double): Self = StObject.set(x, "virtualAllocated", value.asInstanceOf[js.Any])
    }
  }
}

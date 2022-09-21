package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/engine/MemoryManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MemoryManager {
    
    /* CompleteClass */
    var allocated: Double = js.native
    
    /* CompleteClass */
    var availablePageFile: Double = js.native
    
    /* CompleteClass */
    var availablePhysical: Double = js.native
    
    /* CompleteClass */
    var availableVirtual: Double = js.native
    
    /* CompleteClass */
    var idoCacheSize: Double = js.native
    
    /* CompleteClass */
    var objectCount: Double = js.native
    
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
    var totalVirtual: Double = js.native
    
    /* CompleteClass */
    var virtualAllocated: Double = js.native
    
    /* CompleteClass */
    var virtualObjectCount: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/engine/MemoryManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MemoryManager extends StObject {
    
    var allocated: Double
    
    var availablePageFile: Double
    
    var availablePhysical: Double
    
    var availableVirtual: Double
    
    var idoCacheSize: Double
    
    var objectCount: Double
    
    var standaloneSessionsCount: Double
    
    var statefulSessionsCount: Double
    
    var statelessSessionsCount: Double
    
    var totalPageFile: Double
    
    var totalPhysical: Double
    
    var totalVirtual: Double
    
    var virtualAllocated: Double
    
    var virtualObjectCount: Double
  }
  object MemoryManager {
    
    inline def apply(
      allocated: Double,
      availablePageFile: Double,
      availablePhysical: Double,
      availableVirtual: Double,
      idoCacheSize: Double,
      objectCount: Double,
      standaloneSessionsCount: Double,
      statefulSessionsCount: Double,
      statelessSessionsCount: Double,
      totalPageFile: Double,
      totalPhysical: Double,
      totalVirtual: Double,
      virtualAllocated: Double,
      virtualObjectCount: Double
    ): MemoryManager = {
      val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], availablePageFile = availablePageFile.asInstanceOf[js.Any], availablePhysical = availablePhysical.asInstanceOf[js.Any], availableVirtual = availableVirtual.asInstanceOf[js.Any], idoCacheSize = idoCacheSize.asInstanceOf[js.Any], objectCount = objectCount.asInstanceOf[js.Any], standaloneSessionsCount = standaloneSessionsCount.asInstanceOf[js.Any], statefulSessionsCount = statefulSessionsCount.asInstanceOf[js.Any], statelessSessionsCount = statelessSessionsCount.asInstanceOf[js.Any], totalPageFile = totalPageFile.asInstanceOf[js.Any], totalPhysical = totalPhysical.asInstanceOf[js.Any], totalVirtual = totalVirtual.asInstanceOf[js.Any], virtualAllocated = virtualAllocated.asInstanceOf[js.Any], virtualObjectCount = virtualObjectCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryManager]
    }
    
    extension [Self <: MemoryManager](x: Self) {
      
      inline def setAllocated(value: Double): Self = StObject.set(x, "allocated", value.asInstanceOf[js.Any])
      
      inline def setAvailablePageFile(value: Double): Self = StObject.set(x, "availablePageFile", value.asInstanceOf[js.Any])
      
      inline def setAvailablePhysical(value: Double): Self = StObject.set(x, "availablePhysical", value.asInstanceOf[js.Any])
      
      inline def setAvailableVirtual(value: Double): Self = StObject.set(x, "availableVirtual", value.asInstanceOf[js.Any])
      
      inline def setIdoCacheSize(value: Double): Self = StObject.set(x, "idoCacheSize", value.asInstanceOf[js.Any])
      
      inline def setObjectCount(value: Double): Self = StObject.set(x, "objectCount", value.asInstanceOf[js.Any])
      
      inline def setStandaloneSessionsCount(value: Double): Self = StObject.set(x, "standaloneSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setStatefulSessionsCount(value: Double): Self = StObject.set(x, "statefulSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setStatelessSessionsCount(value: Double): Self = StObject.set(x, "statelessSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setTotalPageFile(value: Double): Self = StObject.set(x, "totalPageFile", value.asInstanceOf[js.Any])
      
      inline def setTotalPhysical(value: Double): Self = StObject.set(x, "totalPhysical", value.asInstanceOf[js.Any])
      
      inline def setTotalVirtual(value: Double): Self = StObject.set(x, "totalVirtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualAllocated(value: Double): Self = StObject.set(x, "virtualAllocated", value.asInstanceOf[js.Any])
      
      inline def setVirtualObjectCount(value: Double): Self = StObject.set(x, "virtualObjectCount", value.asInstanceOf[js.Any])
    }
  }
}

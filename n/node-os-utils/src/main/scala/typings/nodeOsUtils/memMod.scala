package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memMod {
  
  @JSImport("node-os-utils/lib/mem", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Mem {
    
    /* CompleteClass */
    override def free(): js.Promise[MemFreeInfo] = js.native
    
    /* CompleteClass */
    override def info(): js.Promise[MemInfo] = js.native
    
    /* CompleteClass */
    override def totalMem(): Double = js.native
    
    /* CompleteClass */
    override def used(): js.Promise[MemUsedInfo] = js.native
  }
  
  trait Mem extends StObject {
    
    def free(): js.Promise[MemFreeInfo]
    
    def info(): js.Promise[MemInfo]
    
    def totalMem(): Double
    
    def used(): js.Promise[MemUsedInfo]
  }
  object Mem {
    
    inline def apply(
      free: () => js.Promise[MemFreeInfo],
      info: () => js.Promise[MemInfo],
      totalMem: () => Double,
      used: () => js.Promise[MemUsedInfo]
    ): Mem = {
      val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), info = js.Any.fromFunction0(info), totalMem = js.Any.fromFunction0(totalMem), used = js.Any.fromFunction0(used))
      __obj.asInstanceOf[Mem]
    }
    
    extension [Self <: Mem](x: Self) {
      
      inline def setFree(value: () => js.Promise[MemFreeInfo]): Self = StObject.set(x, "free", js.Any.fromFunction0(value))
      
      inline def setInfo(value: () => js.Promise[MemInfo]): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
      
      inline def setTotalMem(value: () => Double): Self = StObject.set(x, "totalMem", js.Any.fromFunction0(value))
      
      inline def setUsed(value: () => js.Promise[MemUsedInfo]): Self = StObject.set(x, "used", js.Any.fromFunction0(value))
    }
  }
  
  trait MemFreeInfo extends StObject {
    
    var freeMemMb: Double
    
    var totalMemMb: Double
  }
  object MemFreeInfo {
    
    inline def apply(freeMemMb: Double, totalMemMb: Double): MemFreeInfo = {
      val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemFreeInfo]
    }
    
    extension [Self <: MemFreeInfo](x: Self) {
      
      inline def setFreeMemMb(value: Double): Self = StObject.set(x, "freeMemMb", value.asInstanceOf[js.Any])
      
      inline def setTotalMemMb(value: Double): Self = StObject.set(x, "totalMemMb", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nodeOsUtils.memMod.MemUsedInfo because var conflicts: totalMemMb. Inlined usedMemMb */ trait MemInfo
    extends StObject
       with MemFreeInfo {
    
    var freeMemPercentage: Double
    
    var usedMemMb: Double
    
    var usedMemPercentage: Double
  }
  object MemInfo {
    
    inline def apply(
      freeMemMb: Double,
      freeMemPercentage: Double,
      totalMemMb: Double,
      usedMemMb: Double,
      usedMemPercentage: Double
    ): MemInfo = {
      val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], freeMemPercentage = freeMemPercentage.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any], usedMemMb = usedMemMb.asInstanceOf[js.Any], usedMemPercentage = usedMemPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemInfo]
    }
    
    extension [Self <: MemInfo](x: Self) {
      
      inline def setFreeMemPercentage(value: Double): Self = StObject.set(x, "freeMemPercentage", value.asInstanceOf[js.Any])
      
      inline def setUsedMemMb(value: Double): Self = StObject.set(x, "usedMemMb", value.asInstanceOf[js.Any])
      
      inline def setUsedMemPercentage(value: Double): Self = StObject.set(x, "usedMemPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  trait MemUsedInfo extends StObject {
    
    var totalMemMb: Double
    
    var usedMemMb: Double
  }
  object MemUsedInfo {
    
    inline def apply(totalMemMb: Double, usedMemMb: Double): MemUsedInfo = {
      val __obj = js.Dynamic.literal(totalMemMb = totalMemMb.asInstanceOf[js.Any], usedMemMb = usedMemMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemUsedInfo]
    }
    
    extension [Self <: MemUsedInfo](x: Self) {
      
      inline def setTotalMemMb(value: Double): Self = StObject.set(x, "totalMemMb", value.asInstanceOf[js.Any])
      
      inline def setUsedMemMb(value: Double): Self = StObject.set(x, "usedMemMb", value.asInstanceOf[js.Any])
    }
  }
}

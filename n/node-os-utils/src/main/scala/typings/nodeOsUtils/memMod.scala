package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memMod {
  
  @JSImport("node-os-utils/lib/mem", JSImport.Default)
  @js.native
  class default () extends Mem
  
  @js.native
  trait Mem extends StObject {
    
    def free(): js.Promise[MemFreeInfo] = js.native
    
    def info(): js.Promise[MemInfo] = js.native
    
    def totalMem(): Double = js.native
    
    def used(): js.Promise[MemUsedInfo] = js.native
  }
  object Mem {
    
    @scala.inline
    def apply(
      free: () => js.Promise[MemFreeInfo],
      info: () => js.Promise[MemInfo],
      totalMem: () => Double,
      used: () => js.Promise[MemUsedInfo]
    ): Mem = {
      val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), info = js.Any.fromFunction0(info), totalMem = js.Any.fromFunction0(totalMem), used = js.Any.fromFunction0(used))
      __obj.asInstanceOf[Mem]
    }
    
    @scala.inline
    implicit class MemMutableBuilder[Self <: Mem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFree(value: () => js.Promise[MemFreeInfo]): Self = StObject.set(x, "free", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInfo(value: () => js.Promise[MemInfo]): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTotalMem(value: () => Double): Self = StObject.set(x, "totalMem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUsed(value: () => js.Promise[MemUsedInfo]): Self = StObject.set(x, "used", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MemFreeInfo extends StObject {
    
    var freeMemMb: Double = js.native
    
    var totalMemMb: Double = js.native
  }
  object MemFreeInfo {
    
    @scala.inline
    def apply(freeMemMb: Double, totalMemMb: Double): MemFreeInfo = {
      val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemFreeInfo]
    }
    
    @scala.inline
    implicit class MemFreeInfoMutableBuilder[Self <: MemFreeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFreeMemMb(value: Double): Self = StObject.set(x, "freeMemMb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalMemMb(value: Double): Self = StObject.set(x, "totalMemMb", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nodeOsUtils.memMod.MemUsedInfo because var conflicts: totalMemMb. Inlined usedMemMb */ @js.native
  trait MemInfo extends MemFreeInfo {
    
    var freeMemPercentage: Double = js.native
    
    var usedMemMb: Double = js.native
  }
  object MemInfo {
    
    @scala.inline
    def apply(freeMemMb: Double, freeMemPercentage: Double, totalMemMb: Double, usedMemMb: Double): MemInfo = {
      val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], freeMemPercentage = freeMemPercentage.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any], usedMemMb = usedMemMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemInfo]
    }
    
    @scala.inline
    implicit class MemInfoMutableBuilder[Self <: MemInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFreeMemPercentage(value: Double): Self = StObject.set(x, "freeMemPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedMemMb(value: Double): Self = StObject.set(x, "usedMemMb", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MemUsedInfo extends StObject {
    
    var totalMemMb: Double = js.native
    
    var usedMemMb: Double = js.native
  }
  object MemUsedInfo {
    
    @scala.inline
    def apply(totalMemMb: Double, usedMemMb: Double): MemUsedInfo = {
      val __obj = js.Dynamic.literal(totalMemMb = totalMemMb.asInstanceOf[js.Any], usedMemMb = usedMemMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemUsedInfo]
    }
    
    @scala.inline
    implicit class MemUsedInfoMutableBuilder[Self <: MemUsedInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotalMemMb(value: Double): Self = StObject.set(x, "totalMemMb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedMemMb(value: Double): Self = StObject.set(x, "usedMemMb", value.asInstanceOf[js.Any])
    }
  }
}

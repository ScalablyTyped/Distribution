package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDriveMod {
  
  @JSImport("node-os-utils/lib/drive", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Drive {
    
    /* CompleteClass */
    override def free(diskName: String): js.Promise[DriveFreeInfo] = js.native
    
    /* CompleteClass */
    override def info(diskName: String): js.Promise[DriveInfo] = js.native
    
    /* CompleteClass */
    override def used(diskName: String): js.Promise[DriveUsedInfo] = js.native
  }
  
  trait Drive extends StObject {
    
    def free(diskName: String): js.Promise[DriveFreeInfo]
    
    def info(diskName: String): js.Promise[DriveInfo]
    
    def used(diskName: String): js.Promise[DriveUsedInfo]
  }
  object Drive {
    
    inline def apply(
      free: String => js.Promise[DriveFreeInfo],
      info: String => js.Promise[DriveInfo],
      used: String => js.Promise[DriveUsedInfo]
    ): Drive = {
      val __obj = js.Dynamic.literal(free = js.Any.fromFunction1(free), info = js.Any.fromFunction1(info), used = js.Any.fromFunction1(used))
      __obj.asInstanceOf[Drive]
    }
    
    extension [Self <: Drive](x: Self) {
      
      inline def setFree(value: String => js.Promise[DriveFreeInfo]): Self = StObject.set(x, "free", js.Any.fromFunction1(value))
      
      inline def setInfo(value: String => js.Promise[DriveInfo]): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setUsed(value: String => js.Promise[DriveUsedInfo]): Self = StObject.set(x, "used", js.Any.fromFunction1(value))
    }
  }
  
  trait DriveFreeInfo extends StObject {
    
    var freeGb: Double
    
    var freePercentage: Double
    
    var totalGb: Double
  }
  object DriveFreeInfo {
    
    inline def apply(freeGb: Double, freePercentage: Double, totalGb: Double): DriveFreeInfo = {
      val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveFreeInfo]
    }
    
    extension [Self <: DriveFreeInfo](x: Self) {
      
      inline def setFreeGb(value: Double): Self = StObject.set(x, "freeGb", value.asInstanceOf[js.Any])
      
      inline def setFreePercentage(value: Double): Self = StObject.set(x, "freePercentage", value.asInstanceOf[js.Any])
      
      inline def setTotalGb(value: Double): Self = StObject.set(x, "totalGb", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nodeOsUtils.libDriveMod.DriveUsedInfo because var conflicts: totalGb. Inlined usedGb, usedPercentage */ trait DriveInfo
    extends StObject
       with DriveFreeInfo {
    
    var usedGb: Double
    
    var usedPercentage: Double
  }
  object DriveInfo {
    
    inline def apply(freeGb: Double, freePercentage: Double, totalGb: Double, usedGb: Double, usedPercentage: Double): DriveInfo = {
      val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveInfo]
    }
    
    extension [Self <: DriveInfo](x: Self) {
      
      inline def setUsedGb(value: Double): Self = StObject.set(x, "usedGb", value.asInstanceOf[js.Any])
      
      inline def setUsedPercentage(value: Double): Self = StObject.set(x, "usedPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  trait DriveUsedInfo extends StObject {
    
    var totalGb: Double
    
    var usedGb: Double
    
    var usedPercentage: Double
  }
  object DriveUsedInfo {
    
    inline def apply(totalGb: Double, usedGb: Double, usedPercentage: Double): DriveUsedInfo = {
      val __obj = js.Dynamic.literal(totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveUsedInfo]
    }
    
    extension [Self <: DriveUsedInfo](x: Self) {
      
      inline def setTotalGb(value: Double): Self = StObject.set(x, "totalGb", value.asInstanceOf[js.Any])
      
      inline def setUsedGb(value: Double): Self = StObject.set(x, "usedGb", value.asInstanceOf[js.Any])
      
      inline def setUsedPercentage(value: Double): Self = StObject.set(x, "usedPercentage", value.asInstanceOf[js.Any])
    }
  }
}

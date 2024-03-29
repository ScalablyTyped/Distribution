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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Drive] (val x: Self) extends AnyVal {
      
      inline def setFree(value: String => js.Promise[DriveFreeInfo]): Self = StObject.set(x, "free", js.Any.fromFunction1(value))
      
      inline def setInfo(value: String => js.Promise[DriveInfo]): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setUsed(value: String => js.Promise[DriveUsedInfo]): Self = StObject.set(x, "used", js.Any.fromFunction1(value))
    }
  }
  
  trait DriveFreeInfo extends StObject {
    
    var freeGb: String
    
    var freePercentage: String
    
    var totalGb: String
  }
  object DriveFreeInfo {
    
    inline def apply(freeGb: String, freePercentage: String, totalGb: String): DriveFreeInfo = {
      val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveFreeInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DriveFreeInfo] (val x: Self) extends AnyVal {
      
      inline def setFreeGb(value: String): Self = StObject.set(x, "freeGb", value.asInstanceOf[js.Any])
      
      inline def setFreePercentage(value: String): Self = StObject.set(x, "freePercentage", value.asInstanceOf[js.Any])
      
      inline def setTotalGb(value: String): Self = StObject.set(x, "totalGb", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nodeOsUtils.libDriveMod.DriveUsedInfo because var conflicts: totalGb. Inlined usedGb, usedPercentage */ trait DriveInfo
    extends StObject
       with DriveFreeInfo {
    
    var usedGb: String
    
    var usedPercentage: String
  }
  object DriveInfo {
    
    inline def apply(freeGb: String, freePercentage: String, totalGb: String, usedGb: String, usedPercentage: String): DriveInfo = {
      val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DriveInfo] (val x: Self) extends AnyVal {
      
      inline def setUsedGb(value: String): Self = StObject.set(x, "usedGb", value.asInstanceOf[js.Any])
      
      inline def setUsedPercentage(value: String): Self = StObject.set(x, "usedPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  trait DriveUsedInfo extends StObject {
    
    var totalGb: String
    
    var usedGb: String
    
    var usedPercentage: String
  }
  object DriveUsedInfo {
    
    inline def apply(totalGb: String, usedGb: String, usedPercentage: String): DriveUsedInfo = {
      val __obj = js.Dynamic.literal(totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveUsedInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DriveUsedInfo] (val x: Self) extends AnyVal {
      
      inline def setTotalGb(value: String): Self = StObject.set(x, "totalGb", value.asInstanceOf[js.Any])
      
      inline def setUsedGb(value: String): Self = StObject.set(x, "usedGb", value.asInstanceOf[js.Any])
      
      inline def setUsedPercentage(value: String): Self = StObject.set(x, "usedPercentage", value.asInstanceOf[js.Any])
    }
  }
}

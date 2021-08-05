package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILockWorkingCopyOptions extends StObject {
  
  /**
    * The duration in seconds after which the lock will expire. Only applicable for lock type "edit".
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Locks the working copy, regardless if it is locked by another user. Only applicable for lock type "edit".
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The lock ID to use. Only applicable for lock type "edit".
    */
  var lockId: js.UndefOr[String] = js.undefined
  
  /**
    * The lock type, which indicates the purpose for which the working copy is locked.
    */
  var lockType: LockType
}
object ILockWorkingCopyOptions {
  
  inline def apply(lockType: LockType): ILockWorkingCopyOptions = {
    val __obj = js.Dynamic.literal(lockType = lockType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockWorkingCopyOptions]
  }
  
  extension [Self <: ILockWorkingCopyOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setLockId(value: String): Self = StObject.set(x, "lockId", value.asInstanceOf[js.Any])
    
    inline def setLockIdUndefined: Self = StObject.set(x, "lockId", js.undefined)
    
    inline def setLockType(value: LockType): Self = StObject.set(x, "lockType", value.asInstanceOf[js.Any])
  }
}

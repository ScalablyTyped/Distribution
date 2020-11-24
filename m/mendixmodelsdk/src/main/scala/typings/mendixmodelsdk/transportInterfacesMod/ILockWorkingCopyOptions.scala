package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILockWorkingCopyOptions extends js.Object {
  
  /**
    * The duration in seconds after which the lock will expire. Only applicable for lock type "edit".
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Locks the working copy, regardless if it is locked by another user. Only applicable for lock type "edit".
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * The lock ID to use. Only applicable for lock type "edit".
    */
  var lockId: js.UndefOr[String] = js.native
  
  /**
    * The lock type, which indicates the purpose for which the working copy is locked.
    */
  var lockType: LockType = js.native
}
object ILockWorkingCopyOptions {
  
  @scala.inline
  def apply(lockType: LockType): ILockWorkingCopyOptions = {
    val __obj = js.Dynamic.literal(lockType = lockType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockWorkingCopyOptions]
  }
  
  @scala.inline
  implicit class ILockWorkingCopyOptionsOps[Self <: ILockWorkingCopyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLockType(value: LockType): Self = this.set("lockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setLockId(value: String): Self = this.set("lockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockId: Self = this.set("lockId", js.undefined)
  }
}

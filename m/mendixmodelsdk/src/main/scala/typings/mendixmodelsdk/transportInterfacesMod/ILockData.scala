package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILockData extends js.Object {
  
  var duration: js.UndefOr[Double] = js.native
  
  var lockId: js.UndefOr[String] = js.native
  
  var lockType: LockType = js.native
  
  var requestedBy: String = js.native
  
  var timestamp: Double = js.native
}
object ILockData {
  
  @scala.inline
  def apply(lockType: LockType, requestedBy: String, timestamp: Double): ILockData = {
    val __obj = js.Dynamic.literal(lockType = lockType.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockData]
  }
  
  @scala.inline
  implicit class ILockDataOps[Self <: ILockData] (val x: Self) extends AnyVal {
    
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
    def setRequestedBy(value: String): Self = this.set("requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setLockId(value: String): Self = this.set("lockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockId: Self = this.set("lockId", js.undefined)
  }
}

package typings.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drive extends js.Object {
  
  def free(diskName: String): js.Promise[DriveFreeInfo] = js.native
  
  def info(diskName: String): js.Promise[DriveInfo] = js.native
  
  def used(diskName: String): js.Promise[DriveUsedInfo] = js.native
}
object Drive {
  
  @scala.inline
  def apply(
    free: String => js.Promise[DriveFreeInfo],
    info: String => js.Promise[DriveInfo],
    used: String => js.Promise[DriveUsedInfo]
  ): Drive = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction1(free), info = js.Any.fromFunction1(info), used = js.Any.fromFunction1(used))
    __obj.asInstanceOf[Drive]
  }
  
  @scala.inline
  implicit class DriveOps[Self <: Drive] (val x: Self) extends AnyVal {
    
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
    def setFree(value: String => js.Promise[DriveFreeInfo]): Self = this.set("free", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: String => js.Promise[DriveInfo]): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUsed(value: String => js.Promise[DriveUsedInfo]): Self = this.set("used", js.Any.fromFunction1(value))
  }
}

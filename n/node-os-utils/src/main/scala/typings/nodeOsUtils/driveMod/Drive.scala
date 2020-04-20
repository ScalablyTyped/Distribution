package typings.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive extends js.Object {
  def free(diskName: String): js.Promise[DriveFreeInfo]
  def info(diskName: String): js.Promise[DriveInfo]
  def used(diskName: String): js.Promise[DriveUsedInfo]
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
}


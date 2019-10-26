package typings.nodeDashOsDashUtils.libDriveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-os-utils/lib/drive", JSImport.Default)
@js.native
class default () extends Drive {
  /* CompleteClass */
  override def free(diskName: String): js.Promise[DriveFreeInfo] = js.native
  /* CompleteClass */
  override def info(diskName: String): js.Promise[DriveInfo] = js.native
  /* CompleteClass */
  override def used(diskName: String): js.Promise[DriveUsedInfo] = js.native
}


package typings.nodeDashOsDashUtils.libProcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-os-utils/lib/proc", JSImport.Default)
@js.native
class default () extends Proc {
  /* CompleteClass */
  override def totalProcesses(): js.Promise[Double | String] = js.native
  /* CompleteClass */
  override def zombieProcesses(): js.Promise[Double | String] = js.native
}


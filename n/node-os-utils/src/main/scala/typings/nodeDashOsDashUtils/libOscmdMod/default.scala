package typings.nodeDashOsDashUtils.libOscmdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-os-utils/lib/oscmd", JSImport.Default)
@js.native
class default () extends OsCmd {
  /* CompleteClass */
  override def diskUsage(): js.Promise[String] = js.native
  /* CompleteClass */
  override def ifconfig(): js.Promise[String] = js.native
  /* CompleteClass */
  override def openPorts(): js.Promise[String] = js.native
  /* CompleteClass */
  override def processesUsers(): js.Promise[String] = js.native
  /* CompleteClass */
  override def topCpu(): js.Function0[js.Promise[String]] = js.native
  /* CompleteClass */
  override def topMem(): js.Promise[String] = js.native
  /* CompleteClass */
  override def vmstats(): js.Promise[String] = js.native
  /* CompleteClass */
  override def who(): js.Promise[String] = js.native
  /* CompleteClass */
  override def whoami(): js.Promise[String] = js.native
}


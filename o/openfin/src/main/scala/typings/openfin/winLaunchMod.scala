package typings.openfin

import typings.node.childProcessMod.ChildProcess
import typings.openfin.wireMod.ConfigWithRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/launcher/win-launch", JSImport.Namespace)
@js.native
object winLaunchMod extends js.Object {
  def default(config: ConfigWithRuntime, manifestLocation: String, namedPipeName: String): js.Promise[ChildProcess] = js.native
}


package typings.openfin.nixLaunchMod

import typings.node.childProcessMod.ChildProcess
import typings.openfin.wireMod.ConfigWithRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/launcher/nix-launch", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(config: ConfigWithRuntime, osConfig: OsConfig): js.Promise[ChildProcess] = js.native
}


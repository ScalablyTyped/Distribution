package typings.openfin.launcherMod

import typings.node.childProcessMod.ChildProcess
import typings.openfin.wireMod.ConfigWithRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/launcher/launcher", JSImport.Default)
@js.native
class default () extends Launcher {
  /* CompleteClass */
  override var Installer_Work_Dir: String = js.native
  /* CompleteClass */
  override var OpenFin_Installer: String = js.native
  /* CompleteClass */
  override var Security_Realm_Config_Key: String = js.native
  /* CompleteClass */
  override var macLaunch: js.Any = js.native
  /* CompleteClass */
  override var os: js.Any = js.native
  /* CompleteClass */
  override var winLaunch: js.Any = js.native
  /* CompleteClass */
  override def launch(config: ConfigWithRuntime, manifestLocation: String, namedPipeName: String): js.Promise[ChildProcess] = js.native
}

/* static members */
@JSImport("openfin/_v2/launcher/launcher", JSImport.Default)
@js.native
object default extends js.Object {
  def IS_SUPPORTED(): Boolean = js.native
}


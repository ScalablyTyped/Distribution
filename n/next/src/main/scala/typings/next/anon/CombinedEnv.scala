package typings.next.anon

import typings.next.loadEnvConfigMod.Env
import typings.next.loadEnvConfigMod.LoadedEnvFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinedEnv extends js.Object {
  var combinedEnv: Env
  var loadedEnvFiles: LoadedEnvFiles
}

object CombinedEnv {
  @scala.inline
  def apply(combinedEnv: Env, loadedEnvFiles: LoadedEnvFiles): CombinedEnv = {
    val __obj = js.Dynamic.literal(combinedEnv = combinedEnv.asInstanceOf[js.Any], loadedEnvFiles = loadedEnvFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedEnv]
  }
}


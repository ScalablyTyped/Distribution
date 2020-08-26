package typings.next.anon

import typings.next.loadEnvConfigMod.Env
import typings.next.loadEnvConfigMod.LoadedEnvFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedEnv extends js.Object {
  var combinedEnv: Env = js.native
  var loadedEnvFiles: LoadedEnvFiles = js.native
}

object CombinedEnv {
  @scala.inline
  def apply(combinedEnv: Env, loadedEnvFiles: LoadedEnvFiles): CombinedEnv = {
    val __obj = js.Dynamic.literal(combinedEnv = combinedEnv.asInstanceOf[js.Any], loadedEnvFiles = loadedEnvFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedEnv]
  }
  @scala.inline
  implicit class CombinedEnvOps[Self <: CombinedEnv] (val x: Self) extends AnyVal {
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
    def setCombinedEnv(value: Env): Self = this.set("combinedEnv", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedEnvFilesVarargs(value: Contents*): Self = this.set("loadedEnvFiles", js.Array(value :_*))
    @scala.inline
    def setLoadedEnvFiles(value: LoadedEnvFiles): Self = this.set("loadedEnvFiles", value.asInstanceOf[js.Any])
  }
  
}


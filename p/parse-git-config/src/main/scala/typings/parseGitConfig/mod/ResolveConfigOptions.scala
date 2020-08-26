package typings.parseGitConfig.mod

import typings.parseGitConfig.parseGitConfigStrings.global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveConfigOptions extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[global] = js.native
}

object ResolveConfigOptions {
  @scala.inline
  def apply(): ResolveConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveConfigOptions]
  }
  @scala.inline
  implicit class ResolveConfigOptionsOps[Self <: ResolveConfigOptions] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setType(value: global): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


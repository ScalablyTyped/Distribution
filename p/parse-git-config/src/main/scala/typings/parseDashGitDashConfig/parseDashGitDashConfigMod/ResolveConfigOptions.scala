package typings.parseDashGitDashConfig.parseDashGitDashConfigMod

import typings.parseDashGitDashConfig.parseDashGitDashConfigStrings.global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveConfigOptions extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[global] = js.undefined
}

object ResolveConfigOptions {
  @scala.inline
  def apply(cwd: String = null, path: String = null, `type`: global = null): ResolveConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveConfigOptions]
  }
}


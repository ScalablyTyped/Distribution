package typings.parseDashGitDashConfig.parseDashGitDashConfigMod

import typings.parseDashGitDashConfig.parseDashGitDashConfigStrings.global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ResolveConfigOptions {
  var expandKeys: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: String = null,
    expandKeys: js.UndefOr[Boolean] = js.undefined,
    include: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    `type`: global = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(expandKeys)) __obj.updateDynamic("expandKeys")(expandKeys)
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Options]
  }
}


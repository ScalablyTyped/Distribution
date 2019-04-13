package typings
package parseDashGitDashConfigLib.parseDashGitDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ResolveConfigOptions {
  var expandKeys: js.UndefOr[scala.Boolean] = js.undefined
  var include: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    expandKeys: js.UndefOr[scala.Boolean] = js.undefined,
    include: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    `type`: parseDashGitDashConfigLib.parseDashGitDashConfigLibStrings.global = null
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


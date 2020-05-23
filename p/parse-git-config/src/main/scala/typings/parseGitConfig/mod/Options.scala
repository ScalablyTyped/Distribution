package typings.parseGitConfig.mod

import typings.parseGitConfig.parseGitConfigStrings.global
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
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(expandKeys)) __obj.updateDynamic("expandKeys")(expandKeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


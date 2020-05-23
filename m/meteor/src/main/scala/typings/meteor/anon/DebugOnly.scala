package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugOnly extends js.Object {
  var debugOnly: js.UndefOr[Boolean] = js.undefined
  var documentation: js.UndefOr[String] = js.undefined
  var git: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prodOnly: js.UndefOr[Boolean] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var testOnly: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object DebugOnly {
  @scala.inline
  def apply(
    debugOnly: js.UndefOr[Boolean] = js.undefined,
    documentation: String = null,
    git: String = null,
    name: String = null,
    prodOnly: js.UndefOr[Boolean] = js.undefined,
    summary: String = null,
    testOnly: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): DebugOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debugOnly)) __obj.updateDynamic("debugOnly")(debugOnly.get.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(prodOnly)) __obj.updateDynamic("prodOnly")(prodOnly.get.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnly)) __obj.updateDynamic("testOnly")(testOnly.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugOnly]
  }
}


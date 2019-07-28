package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DebugOnly extends js.Object {
  var debugOnly: js.UndefOr[Boolean] = js.undefined
  var documentation: js.UndefOr[String] = js.undefined
  var git: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prodOnly: js.UndefOr[Boolean] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var testOnly: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_DebugOnly {
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
  ): Anon_DebugOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debugOnly)) __obj.updateDynamic("debugOnly")(debugOnly)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (git != null) __obj.updateDynamic("git")(git)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(prodOnly)) __obj.updateDynamic("prodOnly")(prodOnly)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (!js.isUndefined(testOnly)) __obj.updateDynamic("testOnly")(testOnly)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_DebugOnly]
  }
}


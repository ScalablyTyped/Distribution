package typings.postcss.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtRuleRaws extends NodeRaws {
  var params: js.UndefOr[String] = js.undefined
}

object AtRuleRaws {
  @scala.inline
  def apply(
    after: String = null,
    afterName: String = null,
    before: String = null,
    between: String = null,
    important: String = null,
    left: String = null,
    params: String = null,
    right: String = null,
    semicolon: js.UndefOr[Boolean] = js.undefined
  ): AtRuleRaws = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterName != null) __obj.updateDynamic("afterName")(afterName)
    if (before != null) __obj.updateDynamic("before")(before)
    if (between != null) __obj.updateDynamic("between")(between)
    if (important != null) __obj.updateDynamic("important")(important)
    if (left != null) __obj.updateDynamic("left")(left)
    if (params != null) __obj.updateDynamic("params")(params)
    if (right != null) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon)
    __obj.asInstanceOf[AtRuleRaws]
  }
}


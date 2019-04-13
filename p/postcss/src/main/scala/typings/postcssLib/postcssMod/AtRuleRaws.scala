package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtRuleRaws extends NodeRaws {
  var params: js.UndefOr[java.lang.String] = js.undefined
}

object AtRuleRaws {
  @scala.inline
  def apply(
    after: java.lang.String = null,
    afterName: java.lang.String = null,
    before: java.lang.String = null,
    between: java.lang.String = null,
    important: java.lang.String = null,
    left: java.lang.String = null,
    params: java.lang.String = null,
    right: java.lang.String = null,
    semicolon: js.UndefOr[scala.Boolean] = js.undefined
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


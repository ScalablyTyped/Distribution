package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleRaws extends ContainerRaws {
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: js.UndefOr[String] = js.undefined
}

object RuleRaws {
  @scala.inline
  def apply(
    after: String = null,
    afterName: String = null,
    before: String = null,
    between: String = null,
    important: String = null,
    indent: String = null,
    left: String = null,
    right: String = null,
    selector: String = null,
    semicolon: js.UndefOr[Boolean] = js.undefined
  ): RuleRaws = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterName != null) __obj.updateDynamic("afterName")(afterName.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (important != null) __obj.updateDynamic("important")(important.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleRaws]
  }
}


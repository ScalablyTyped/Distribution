package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait After extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var attribute: js.UndefOr[PartialSpaceAround] = js.undefined
  var before: js.UndefOr[String] = js.undefined
  var insensitive: js.UndefOr[PartialSpaceAround] = js.undefined
  var operator: js.UndefOr[PartialSpaceAround] = js.undefined
  var value: js.UndefOr[PartialSpaceAround] = js.undefined
}

object After {
  @scala.inline
  def apply(
    after: String = null,
    attribute: PartialSpaceAround = null,
    before: String = null,
    insensitive: PartialSpaceAround = null,
    operator: PartialSpaceAround = null,
    value: PartialSpaceAround = null
  ): After = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (insensitive != null) __obj.updateDynamic("insensitive")(insensitive.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
}


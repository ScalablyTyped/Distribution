package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Before extends js.Object {
  var after: String
  var attribute: js.UndefOr[PartialSpaces] = js.undefined
  var before: String
  var insensitive: js.UndefOr[PartialSpaces] = js.undefined
  var operator: js.UndefOr[PartialSpaces] = js.undefined
  var value: js.UndefOr[PartialSpaces] = js.undefined
}

object Before {
  @scala.inline
  def apply(
    after: String,
    before: String,
    attribute: PartialSpaces = null,
    insensitive: PartialSpaces = null,
    operator: PartialSpaces = null,
    value: PartialSpaces = null
  ): Before = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (insensitive != null) __obj.updateDynamic("insensitive")(insensitive.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
}


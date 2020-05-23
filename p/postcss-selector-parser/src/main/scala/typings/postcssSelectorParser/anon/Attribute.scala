package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var attribute: js.UndefOr[PartialSpaces] = js.undefined
  var insensitive: js.UndefOr[PartialSpaces] = js.undefined
  var operator: js.UndefOr[PartialSpaces] = js.undefined
  var value: js.UndefOr[PartialSpaces] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(
    attribute: PartialSpaces = null,
    insensitive: PartialSpaces = null,
    operator: PartialSpaces = null,
    value: PartialSpaces = null
  ): Attribute = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (insensitive != null) __obj.updateDynamic("insensitive")(insensitive.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}


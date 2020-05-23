package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insensitive extends js.Object {
  var attribute: js.UndefOr[String] = js.undefined
  var insensitive: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var spaces: js.UndefOr[Attribute] = js.undefined
  /** @deprecated The attribute value is unquoted, use that instead.. */
  var unquoted: js.UndefOr[String] = js.undefined
  /** The value of the attribute with quotes and escapes. */
  var value: js.UndefOr[String] = js.undefined
}

object Insensitive {
  @scala.inline
  def apply(
    attribute: String = null,
    insensitive: String = null,
    operator: String = null,
    spaces: Attribute = null,
    unquoted: String = null,
    value: String = null
  ): Insensitive = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (insensitive != null) __obj.updateDynamic("insensitive")(insensitive.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (unquoted != null) __obj.updateDynamic("unquoted")(unquoted.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insensitive]
  }
}


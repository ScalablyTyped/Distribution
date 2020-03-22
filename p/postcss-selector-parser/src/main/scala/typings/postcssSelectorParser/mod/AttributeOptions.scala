package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.AnonAfter
import typings.postcssSelectorParser.AnonInsensitive
import typings.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeOptions
  extends NamespaceOptions[js.UndefOr[String]] {
  var attribute: String
  var insensitive: js.UndefOr[Boolean] = js.undefined
  var operator: js.UndefOr[AttributeOperator] = js.undefined
  var quoteMark: js.UndefOr[QuoteMark] = js.undefined
  /** @deprecated Use quoteMark instead. */
  var quoted: js.UndefOr[Boolean] = js.undefined
  var raws: AnonInsensitive
  @JSName("spaces")
  var spaces_AttributeOptions: js.UndefOr[AnonAfter] = js.undefined
}

object AttributeOptions {
  @scala.inline
  def apply(
    attribute: String,
    raws: AnonInsensitive,
    insensitive: js.UndefOr[Boolean] = js.undefined,
    namespace: String | `true` = null,
    operator: AttributeOperator = null,
    quoteMark: QuoteMark = null,
    quoted: js.UndefOr[Boolean] = js.undefined,
    source: NodeSource = null,
    sourceIndex: Int | Double = null,
    spaces: AnonAfter = null,
    value: String = null
  ): AttributeOptions = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], raws = raws.asInstanceOf[js.Any])
    if (!js.isUndefined(insensitive)) __obj.updateDynamic("insensitive")(insensitive.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (quoteMark != null) __obj.updateDynamic("quoteMark")(quoteMark.asInstanceOf[js.Any])
    if (!js.isUndefined(quoted)) __obj.updateDynamic("quoted")(quoted.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceIndex != null) __obj.updateDynamic("sourceIndex")(sourceIndex.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeOptions]
  }
}


package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.After
import typings.postcssSelectorParser.anon.Insensitive
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
  var raws: Insensitive
  @JSName("spaces")
  var spaces_AttributeOptions: js.UndefOr[After] = js.undefined
}

object AttributeOptions {
  @scala.inline
  def apply(
    attribute: String,
    raws: Insensitive,
    insensitive: js.UndefOr[Boolean] = js.undefined,
    namespace: String | `true` = null,
    operator: AttributeOperator = null,
    quoteMark: js.UndefOr[Null | QuoteMark] = js.undefined,
    quoted: js.UndefOr[Boolean] = js.undefined,
    source: NodeSource = null,
    sourceIndex: js.UndefOr[Double] = js.undefined,
    spaces: After = null,
    value: String = null
  ): AttributeOptions = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], raws = raws.asInstanceOf[js.Any])
    if (!js.isUndefined(insensitive)) __obj.updateDynamic("insensitive")(insensitive.get.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (!js.isUndefined(quoteMark)) __obj.updateDynamic("quoteMark")(quoteMark.asInstanceOf[js.Any])
    if (!js.isUndefined(quoted)) __obj.updateDynamic("quoted")(quoted.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceIndex)) __obj.updateDynamic("sourceIndex")(sourceIndex.get.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeOptions]
  }
}


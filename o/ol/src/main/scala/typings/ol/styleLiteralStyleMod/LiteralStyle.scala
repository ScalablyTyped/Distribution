package typings.ol.styleLiteralStyleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralStyle extends js.Object {
  var filter: js.UndefOr[ExpressionValue] = js.undefined
  var symbol: js.UndefOr[LiteralSymbolStyle] = js.undefined
  var variables: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object LiteralStyle {
  @scala.inline
  def apply(
    filter: ExpressionValue = null,
    symbol: LiteralSymbolStyle = null,
    variables: StringDictionary[Double] = null
  ): LiteralStyle = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralStyle]
  }
}


package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnparseConfig extends js.Object {
   // default: false
  var columns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // default: '"'
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
   // default: '"'
  var escapeChar: js.UndefOr[java.lang.String] = js.undefined
   // default: ","
  var header: js.UndefOr[scala.Boolean] = js.undefined
   // default: true
  var newline: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var quoteChar: js.UndefOr[java.lang.String] = js.undefined
  var quotes: js.UndefOr[scala.Boolean | js.Array[scala.Boolean]] = js.undefined
   // default: "\r\n"
  var skipEmptyLines: js.UndefOr[scala.Boolean | papaparseLib.papaparseLibStrings.greedy] = js.undefined
}

object UnparseConfig {
  @scala.inline
  def apply(
    columns: js.Array[java.lang.String] = null,
    delimiter: java.lang.String = null,
    escapeChar: java.lang.String = null,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    newline: java.lang.String = null,
    quoteChar: java.lang.String = null,
    quotes: scala.Boolean | js.Array[scala.Boolean] = null,
    skipEmptyLines: scala.Boolean | papaparseLib.papaparseLibStrings.greedy = null
  ): UnparseConfig = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (quoteChar != null) __obj.updateDynamic("quoteChar")(quoteChar)
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (skipEmptyLines != null) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnparseConfig]
  }
}


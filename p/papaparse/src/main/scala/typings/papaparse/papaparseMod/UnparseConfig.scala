package typings.papaparse.papaparseMod

import typings.papaparse.papaparseStrings.greedy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnparseConfig extends js.Object {
   // default: false
  var columns: js.UndefOr[js.Array[String]] = js.undefined
   // default: '"'
  var delimiter: js.UndefOr[String] = js.undefined
   // default: '"'
  var escapeChar: js.UndefOr[String] = js.undefined
   // default: ","
  var header: js.UndefOr[Boolean] = js.undefined
   // default: true
  var newline: js.UndefOr[String] = js.undefined
   // default: false
  var quoteChar: js.UndefOr[String] = js.undefined
  var quotes: js.UndefOr[Boolean | js.Array[Boolean]] = js.undefined
   // default: "\r\n"
  var skipEmptyLines: js.UndefOr[Boolean | greedy] = js.undefined
}

object UnparseConfig {
  @scala.inline
  def apply(
    columns: js.Array[String] = null,
    delimiter: String = null,
    escapeChar: String = null,
    header: js.UndefOr[Boolean] = js.undefined,
    newline: String = null,
    quoteChar: String = null,
    quotes: Boolean | js.Array[Boolean] = null,
    skipEmptyLines: Boolean | greedy = null
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


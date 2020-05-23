package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/issue/
trait Issue extends js.Object {
  var code: Double | String
  var column: js.UndefOr[Double] = js.undefined
  var endColumn: js.UndefOr[Double] = js.undefined
  var endLine: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var severity: IssueSeverity
  var source: String | Null
  var textRange: js.UndefOr[Range] = js.undefined
}

object Issue {
  @scala.inline
  def apply(
    code: Double | String,
    severity: IssueSeverity,
    column: js.UndefOr[Double] = js.undefined,
    endColumn: js.UndefOr[Double] = js.undefined,
    endLine: js.UndefOr[Double] = js.undefined,
    line: js.UndefOr[Double] = js.undefined,
    source: String = null,
    textRange: Range = null
  ): Issue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endColumn)) __obj.updateDynamic("endColumn")(endColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endLine)) __obj.updateDynamic("endLine")(endLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
}


package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BeginsWith
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Contains
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EndsWith
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NotContains
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Cell Value Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalTextComparisonRule extends js.Object {
  /**
    *
    * The operator of the text conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith
  /**
    *
    * The Text value of conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var text: String
}

object ConditionalTextComparisonRule {
  @scala.inline
  def apply(
    operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith,
    text: String
  ): ConditionalTextComparisonRule = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], text = text)
  
    __obj.asInstanceOf[ConditionalTextComparisonRule]
  }
}


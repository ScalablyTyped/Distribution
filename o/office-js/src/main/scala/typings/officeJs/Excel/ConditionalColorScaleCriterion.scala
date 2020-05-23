package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Formula
import typings.officeJs.officeJsStrings.HighestValue
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.LowestValue
import typings.officeJs.officeJsStrings.Number
import typings.officeJs.officeJsStrings.Percent
import typings.officeJs.officeJsStrings.Percentile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Color Scale Criterion which contains a type, value, and a color.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalColorScaleCriterion extends js.Object {
  /**
    *
    * HTML color code representation of the color scale color. e.g., #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * A number, a formula, or null (if Type is LowestValue).
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.undefined
  /**
    *
    * What the criterion conditional formula should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile
}

object ConditionalColorScaleCriterion {
  @scala.inline
  def apply(
    `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile,
    color: String = null,
    formula: String = null
  ): ConditionalColorScaleCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriterion]
  }
}


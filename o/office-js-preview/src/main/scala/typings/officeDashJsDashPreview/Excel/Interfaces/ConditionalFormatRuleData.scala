package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalFormatRule.toJSON()`. */
trait ConditionalFormatRuleData extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.undefined
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in the user's language.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: js.UndefOr[String] = js.undefined
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaR1C1: js.UndefOr[String] = js.undefined
}

object ConditionalFormatRuleData {
  @scala.inline
  def apply(formula: String = null, formulaLocal: String = null, formulaR1C1: String = null): ConditionalFormatRuleData = {
    val __obj = js.Dynamic.literal()
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (formulaLocal != null) __obj.updateDynamic("formulaLocal")(formulaLocal.asInstanceOf[js.Any])
    if (formulaR1C1 != null) __obj.updateDynamic("formulaR1C1")(formulaR1C1.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormatRuleData]
  }
}


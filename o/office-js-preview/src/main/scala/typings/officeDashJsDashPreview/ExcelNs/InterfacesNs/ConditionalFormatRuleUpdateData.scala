package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalFormatRule object, for use in "conditionalFormatRule.set({ ... })". */
trait ConditionalFormatRuleUpdateData extends js.Object {
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

object ConditionalFormatRuleUpdateData {
  @scala.inline
  def apply(formula: String = null, formulaLocal: String = null, formulaR1C1: String = null): ConditionalFormatRuleUpdateData = {
    val __obj = js.Dynamic.literal()
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (formulaLocal != null) __obj.updateDynamic("formulaLocal")(formulaLocal)
    if (formulaR1C1 != null) __obj.updateDynamic("formulaR1C1")(formulaR1C1)
    __obj.asInstanceOf[ConditionalFormatRuleUpdateData]
  }
}


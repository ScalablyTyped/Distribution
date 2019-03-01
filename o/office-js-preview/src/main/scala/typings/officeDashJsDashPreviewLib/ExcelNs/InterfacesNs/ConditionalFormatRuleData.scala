package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "conditionalFormatRule.toJSON()". */
trait ConditionalFormatRuleData extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in the user's language.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaR1C1: js.UndefOr[java.lang.String] = js.undefined
}

object ConditionalFormatRuleData {
  @scala.inline
  def apply(
    formula: java.lang.String = null,
    formulaLocal: java.lang.String = null,
    formulaR1C1: java.lang.String = null
  ): ConditionalFormatRuleData = {
    val __obj = js.Dynamic.literal()
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (formulaLocal != null) __obj.updateDynamic("formulaLocal")(formulaLocal)
    if (formulaR1C1 != null) __obj.updateDynamic("formulaR1C1")(formulaR1C1)
    __obj.asInstanceOf[ConditionalFormatRuleData]
  }
}


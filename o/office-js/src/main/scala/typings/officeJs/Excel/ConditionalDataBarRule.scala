package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Automatic
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
  * Represents a rule-type for a Data Bar.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalDataBarRule extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the databar rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.native
  /**
    *
    * The type of rule for the databar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile = js.native
}

object ConditionalDataBarRule {
  @scala.inline
  def apply(
    `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile
  ): ConditionalDataBarRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalDataBarRule]
  }
  @scala.inline
  implicit class ConditionalDataBarRuleOps[Self <: ConditionalDataBarRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(
      value: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
  }
  
}


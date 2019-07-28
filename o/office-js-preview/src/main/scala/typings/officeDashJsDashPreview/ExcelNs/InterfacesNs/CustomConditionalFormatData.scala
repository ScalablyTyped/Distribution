package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "customConditionalFormat.toJSON()". */
trait CustomConditionalFormatData extends js.Object {
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatData] = js.undefined
  /**
    *
    * Represents the Rule object on this conditional format. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalFormatRuleData] = js.undefined
}

object CustomConditionalFormatData {
  @scala.inline
  def apply(format: ConditionalRangeFormatData = null, rule: ConditionalFormatRuleData = null): CustomConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[CustomConditionalFormatData]
  }
}


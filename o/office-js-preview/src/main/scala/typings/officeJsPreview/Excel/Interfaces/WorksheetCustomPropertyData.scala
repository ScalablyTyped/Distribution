package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `worksheetCustomProperty.toJSON()`. */
trait WorksheetCustomPropertyData extends js.Object {
  /**
    *
    * Gets the key of the custom property. Custom property keys are case-insensitive.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: js.UndefOr[String] = js.undefined
}

object WorksheetCustomPropertyData {
  @scala.inline
  def apply(key: String = null, value: String = null): WorksheetCustomPropertyData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetCustomPropertyData]
  }
}


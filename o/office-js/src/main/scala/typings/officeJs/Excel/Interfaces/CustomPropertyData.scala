package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.DocumentPropertyType
import typings.officeJs.officeJsStrings.Boolean
import typings.officeJs.officeJsStrings.Date
import typings.officeJs.officeJsStrings.Float
import typings.officeJs.officeJsStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `customProperty.toJSON()`. */
trait CustomPropertyData extends js.Object {
  /**
    *
    * The key of the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    *
    * The type of the value used for the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    DocumentPropertyType | Number | Boolean | Date | typings.officeJs.officeJsStrings.String | Float
  ] = js.undefined
  /**
    *
    * The value of the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object CustomPropertyData {
  @scala.inline
  def apply(
    key: String = null,
    `type`: DocumentPropertyType | Number | Boolean | Date | typings.officeJs.officeJsStrings.String | Float = null,
    value: js.Any = null
  ): CustomPropertyData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyData]
  }
}


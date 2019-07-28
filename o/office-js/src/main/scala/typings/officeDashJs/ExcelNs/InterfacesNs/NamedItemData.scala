package typings.officeDashJs.ExcelNs.InterfacesNs

import typings.officeDashJs.ExcelNs.NamedItemScope
import typings.officeDashJs.ExcelNs.NamedItemType
import typings.officeDashJs.officeDashJsStrings.Array
import typings.officeDashJs.officeDashJsStrings.Boolean
import typings.officeDashJs.officeDashJsStrings.Double
import typings.officeDashJs.officeDashJsStrings.Error
import typings.officeDashJs.officeDashJsStrings.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "namedItem.toJSON()". */
trait NamedItemData extends js.Object {
  /**
    *
    * Returns an object containing values and types of the named item. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var arrayValues: js.UndefOr[NamedItemArrayValuesData] = js.undefined
  /**
    *
    * Represents the comment associated with this name.
    *
    * [Api set: ExcelApi 1.4]
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the formula of the named item.  Formula always starts with a '=' sign.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * The name of the object. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Indicates whether the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var scope: js.UndefOr[
    NamedItemScope | typings.officeDashJs.officeDashJsStrings.Worksheet | typings.officeDashJs.officeDashJsStrings.Workbook
  ] = js.undefined
  /**
    *
    * Indicates the type of the value returned by the name's formula. See Excel.NamedItemType for details. Read-only.
    *
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  var `type`: js.UndefOr[
    NamedItemType | typings.officeDashJs.officeDashJsStrings.String | Integer | Double | Boolean | typings.officeDashJs.officeDashJsStrings.Range | Error | Array
  ] = js.undefined
  /**
    *
    * Represents the value computed by the name's formula. For a named range, will return the range address. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Specifies whether the object is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object NamedItemData {
  @scala.inline
  def apply(
    arrayValues: NamedItemArrayValuesData = null,
    comment: String = null,
    formula: js.Any = null,
    name: String = null,
    scope: NamedItemScope | typings.officeDashJs.officeDashJsStrings.Worksheet | typings.officeDashJs.officeDashJsStrings.Workbook = null,
    `type`: NamedItemType | typings.officeDashJs.officeDashJsStrings.String | Integer | Double | Boolean | typings.officeDashJs.officeDashJsStrings.Range | Error | Array = null,
    value: js.Any = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): NamedItemData = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[NamedItemData]
  }
}


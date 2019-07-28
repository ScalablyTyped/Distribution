package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookNamedItem extends Entity {
  // Represents the comment associated with this name.
  var comment: js.UndefOr[String] = js.undefined
  // The name of the object. Read-only.
  var name: js.UndefOr[String] = js.undefined
  // Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
  var scope: js.UndefOr[String] = js.undefined
  /**
    * Indicates what type of reference is associated with the name. The possible values are: String, Integer, Double,
    * Boolean, Range. Read-only.
    */
  var `type`: js.UndefOr[String] = js.undefined
  // Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only.
  var value: js.UndefOr[js.Any] = js.undefined
  // Specifies whether the object is visible or not.
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet.
    * Read-only.
    */
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.undefined
}

object WorkbookNamedItem {
  @scala.inline
  def apply(
    comment: String = null,
    id: String = null,
    name: String = null,
    scope: String = null,
    `type`: String = null,
    value: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    worksheet: WorkbookWorksheet = null
  ): WorkbookNamedItem = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet)
    __obj.asInstanceOf[WorkbookNamedItem]
  }
}


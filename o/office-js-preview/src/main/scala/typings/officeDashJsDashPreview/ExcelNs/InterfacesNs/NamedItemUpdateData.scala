package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the NamedItem object, for use in `namedItem.set({ ... })`. */
trait NamedItemUpdateData extends js.Object {
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
    * Specifies whether the object is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object NamedItemUpdateData {
  @scala.inline
  def apply(comment: String = null, formula: js.Any = null, visible: js.UndefOr[Boolean] = js.undefined): NamedItemUpdateData = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[NamedItemUpdateData]
  }
}


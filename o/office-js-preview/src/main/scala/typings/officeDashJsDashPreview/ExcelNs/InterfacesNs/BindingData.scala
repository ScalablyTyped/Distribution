package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.officeDashJsDashPreview.ExcelNs.BindingType
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "binding.toJSON()". */
trait BindingData extends js.Object {
  /**
    *
    * Represents binding identifier. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[
    BindingType | typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Range | typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Table | Text
  ] = js.undefined
}

object BindingData {
  @scala.inline
  def apply(
    id: String = null,
    `type`: BindingType | typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Range | typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Table | Text = null
  ): BindingData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
}


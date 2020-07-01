package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the NamedSheetView object, for use in `namedSheetView.set({ ... })`. */
trait NamedSheetViewUpdateData extends js.Object {
  /**
    *
    * Gets or sets the name of the sheet view.
    The temporary sheet view name is the empty string ("").  Naming the view by using the name property causes the sheet view to be saved.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.undefined
}

object NamedSheetViewUpdateData {
  @scala.inline
  def apply(name: String = null): NamedSheetViewUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSheetViewUpdateData]
  }
}


package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableStyle object, for use in `tableStyle.set({ ... })`. */
trait TableStyleUpdateData extends js.Object {
  /**
    *
    * Gets the name of the TableStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.undefined
}

object TableStyleUpdateData {
  @scala.inline
  def apply(name: String = null): TableStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TableStyleUpdateData]
  }
}


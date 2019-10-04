package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SlicerStyle object, for use in `slicerStyle.set({ ... })`. */
trait SlicerStyleUpdateData extends js.Object {
  /**
    *
    * Gets the name of the SlicerStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.undefined
}

object SlicerStyleUpdateData {
  @scala.inline
  def apply(name: String = null): SlicerStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SlicerStyleUpdateData]
  }
}


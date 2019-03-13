package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TimelineStyle object, for use in "timelineStyle.set({ ... })". */
trait TimelineStyleUpdateData extends js.Object {
  /**
    *
    * Gets the name of the TimelineStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object TimelineStyleUpdateData {
  @scala.inline
  def apply(name: java.lang.String = null): TimelineStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TimelineStyleUpdateData]
  }
}


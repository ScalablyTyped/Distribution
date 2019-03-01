package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysis object, for use in "inkAnalysis.set({ ... })". */
trait InkAnalysisUpdateData extends js.Object {
  /**
    *
    * Gets the parent page object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var page: js.UndefOr[PageUpdateData] = js.undefined
}

object InkAnalysisUpdateData {
  @scala.inline
  def apply(page: PageUpdateData = null): InkAnalysisUpdateData = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[InkAnalysisUpdateData]
  }
}


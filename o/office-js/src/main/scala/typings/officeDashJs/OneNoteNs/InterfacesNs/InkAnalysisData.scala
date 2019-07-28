package typings.officeDashJs.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysis.toJSON()". */
trait InkAnalysisData extends js.Object {
  /**
    *
    * Gets the ID of the InkAnalysis object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the parent page object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var page: js.UndefOr[PageData] = js.undefined
}

object InkAnalysisData {
  @scala.inline
  def apply(id: String = null, page: PageData = null): InkAnalysisData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (page != null) __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[InkAnalysisData]
  }
}


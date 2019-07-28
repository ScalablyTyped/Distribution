package typings.officeDashJsDashPreview.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Page object, for use in "page.set({ ... })". */
trait PageUpdateData extends js.Object {
  /**
    *
    * Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisUpdateData] = js.undefined
  /**
    *
    * Gets or sets the indentation level of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the title of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var title: js.UndefOr[String] = js.undefined
}

object PageUpdateData {
  @scala.inline
  def apply(
    inkAnalysisOrNull: InkAnalysisUpdateData = null,
    pageLevel: Int | Double = null,
    title: String = null
  ): PageUpdateData = {
    val __obj = js.Dynamic.literal()
    if (inkAnalysisOrNull != null) __obj.updateDynamic("inkAnalysisOrNull")(inkAnalysisOrNull)
    if (pageLevel != null) __obj.updateDynamic("pageLevel")(pageLevel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PageUpdateData]
  }
}


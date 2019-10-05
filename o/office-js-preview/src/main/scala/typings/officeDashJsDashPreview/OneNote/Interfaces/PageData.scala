package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "page.toJSON()". */
trait PageData extends js.Object {
  /**
    *
    * Gets the ClassNotebookPageSource to the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var classNotebookPageSource: js.UndefOr[String] = js.undefined
  /**
    *
    * The client url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[String] = js.undefined
  /**
    *
    * The collection of PageContent objects on the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var contents: js.UndefOr[js.Array[PageContentData]] = js.undefined
  /**
    *
    * Gets the ID of the page. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisData] = js.undefined
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
  /**
    *
    * The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[String] = js.undefined
}

object PageData {
  @scala.inline
  def apply(
    classNotebookPageSource: String = null,
    clientUrl: String = null,
    contents: js.Array[PageContentData] = null,
    id: String = null,
    inkAnalysisOrNull: InkAnalysisData = null,
    pageLevel: Int | Double = null,
    title: String = null,
    webUrl: String = null
  ): PageData = {
    val __obj = js.Dynamic.literal()
    if (classNotebookPageSource != null) __obj.updateDynamic("classNotebookPageSource")(classNotebookPageSource)
    if (clientUrl != null) __obj.updateDynamic("clientUrl")(clientUrl)
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inkAnalysisOrNull != null) __obj.updateDynamic("inkAnalysisOrNull")(inkAnalysisOrNull)
    if (pageLevel != null) __obj.updateDynamic("pageLevel")(pageLevel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[PageData]
  }
}


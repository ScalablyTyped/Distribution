package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a OneNote page.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait PageLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the ClassNotebookPageSource to the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var classNotebookPageSource: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The client url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The collection of PageContent objects on the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var contents: js.UndefOr[PageContentCollectionLoadOptions] = js.undefined
  /**
    *
    * Gets the ID of the page. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the indentation level of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the section that contains the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the title of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var title: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[scala.Boolean] = js.undefined
}

object PageLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    classNotebookPageSource: js.UndefOr[scala.Boolean] = js.undefined,
    clientUrl: js.UndefOr[scala.Boolean] = js.undefined,
    contents: PageContentCollectionLoadOptions = null,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    inkAnalysisOrNull: InkAnalysisLoadOptions = null,
    pageLevel: js.UndefOr[scala.Boolean] = js.undefined,
    parentSection: SectionLoadOptions = null,
    title: js.UndefOr[scala.Boolean] = js.undefined,
    webUrl: js.UndefOr[scala.Boolean] = js.undefined
  ): PageLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(classNotebookPageSource)) __obj.updateDynamic("classNotebookPageSource")(classNotebookPageSource)
    if (!js.isUndefined(clientUrl)) __obj.updateDynamic("clientUrl")(clientUrl)
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (inkAnalysisOrNull != null) __obj.updateDynamic("inkAnalysisOrNull")(inkAnalysisOrNull)
    if (!js.isUndefined(pageLevel)) __obj.updateDynamic("pageLevel")(pageLevel)
    if (parentSection != null) __obj.updateDynamic("parentSection")(parentSection)
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(webUrl)) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[PageLoadOptions]
  }
}


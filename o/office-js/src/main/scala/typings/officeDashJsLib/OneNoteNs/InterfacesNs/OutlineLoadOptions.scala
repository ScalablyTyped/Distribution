package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a container for Paragraph objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait OutlineLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the ID of the Outline object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the PageContent object that contains the Outline. This object defines the position of the Outline on the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageContent: js.UndefOr[PageContentLoadOptions] = js.undefined
  /**
    *
    * Gets the collection of Paragraph objects in the Outline.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.undefined
}

object OutlineLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    pageContent: PageContentLoadOptions = null,
    paragraphs: ParagraphCollectionLoadOptions = null
  ): OutlineLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (pageContent != null) __obj.updateDynamic("pageContent")(pageContent)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    __obj.asInstanceOf[OutlineLoadOptions]
  }
}


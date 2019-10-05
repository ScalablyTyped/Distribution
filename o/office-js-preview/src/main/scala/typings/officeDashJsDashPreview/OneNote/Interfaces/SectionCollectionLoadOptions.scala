package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of sections.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait SectionCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The client url of the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if this section is encrypted with a password. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if this section is locked. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isLocked: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the name of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the notebook that contains the section.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebook: js.UndefOr[NotebookLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The collection of pages in the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pages: js.UndefOr[PageCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the section group that contains the section. Throws ItemNotFound if the section is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroup: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the section group that contains the section. Returns null if the section is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroupOrNull: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[Boolean] = js.undefined
}

object SectionCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    clientUrl: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    isEncrypted: js.UndefOr[Boolean] = js.undefined,
    isLocked: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    notebook: NotebookLoadOptions = null,
    pages: PageCollectionLoadOptions = null,
    parentSectionGroup: SectionGroupLoadOptions = null,
    parentSectionGroupOrNull: SectionGroupLoadOptions = null,
    webUrl: js.UndefOr[Boolean] = js.undefined
  ): SectionCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(clientUrl)) __obj.updateDynamic("clientUrl")(clientUrl)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isEncrypted)) __obj.updateDynamic("isEncrypted")(isEncrypted)
    if (!js.isUndefined(isLocked)) __obj.updateDynamic("isLocked")(isLocked)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (notebook != null) __obj.updateDynamic("notebook")(notebook)
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (parentSectionGroup != null) __obj.updateDynamic("parentSectionGroup")(parentSectionGroup)
    if (parentSectionGroupOrNull != null) __obj.updateDynamic("parentSectionGroupOrNull")(parentSectionGroupOrNull)
    if (!js.isUndefined(webUrl)) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[SectionCollectionLoadOptions]
  }
}


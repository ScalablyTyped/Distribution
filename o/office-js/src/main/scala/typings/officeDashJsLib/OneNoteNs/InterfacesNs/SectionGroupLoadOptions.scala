package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a OneNote section group. Section groups can contain sections and other section groups.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait SectionGroupLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The client url of the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the ID of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the name of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the notebook that contains the section group.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebook: js.UndefOr[NotebookLoadOptions] = js.undefined
  /**
    *
    * Gets the section group that contains the section group. Throws ItemNotFound if the section group is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroup: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  /**
    *
    * Gets the section group that contains the section group. Returns null if the section group is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroupOrNull: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  /**
    *
    * The collection of section groups in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[SectionGroupCollectionLoadOptions] = js.undefined
  /**
    *
    * The collection of sections in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[SectionCollectionLoadOptions] = js.undefined
}

object SectionGroupLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    clientUrl: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    notebook: NotebookLoadOptions = null,
    parentSectionGroup: SectionGroupLoadOptions = null,
    parentSectionGroupOrNull: SectionGroupLoadOptions = null,
    sectionGroups: SectionGroupCollectionLoadOptions = null,
    sections: SectionCollectionLoadOptions = null
  ): SectionGroupLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(clientUrl)) __obj.updateDynamic("clientUrl")(clientUrl)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (notebook != null) __obj.updateDynamic("notebook")(notebook)
    if (parentSectionGroup != null) __obj.updateDynamic("parentSectionGroup")(parentSectionGroup)
    if (parentSectionGroupOrNull != null) __obj.updateDynamic("parentSectionGroupOrNull")(parentSectionGroupOrNull)
    if (sectionGroups != null) __obj.updateDynamic("sectionGroups")(sectionGroups)
    if (sections != null) __obj.updateDynamic("sections")(sections)
    __obj.asInstanceOf[SectionGroupLoadOptions]
  }
}


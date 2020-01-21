package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Onenote extends Entity {
  // The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.undefined
  /**
    * The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of
    * long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
    */
  var operations: js.UndefOr[js.Array[OnenoteOperation]] = js.undefined
  // The pages in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var pages: js.UndefOr[js.Array[OnenotePage]] = js.undefined
  /**
    * The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get
    * the binary content of a specific resource. Read-only. Nullable.
    */
  var resources: js.UndefOr[js.Array[OnenoteResource]] = js.undefined
  // The section groups in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sectionGroups: js.UndefOr[js.Array[SectionGroup]] = js.undefined
  // The sections in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sections: js.UndefOr[js.Array[OnenoteSection]] = js.undefined
}

object Onenote {
  @scala.inline
  def apply(
    id: String = null,
    notebooks: js.Array[Notebook] = null,
    operations: js.Array[OnenoteOperation] = null,
    pages: js.Array[OnenotePage] = null,
    resources: js.Array[OnenoteResource] = null,
    sectionGroups: js.Array[SectionGroup] = null,
    sections: js.Array[OnenoteSection] = null
  ): Onenote = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (notebooks != null) __obj.updateDynamic("notebooks")(notebooks.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (sectionGroups != null) __obj.updateDynamic("sectionGroups")(sectionGroups.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Onenote]
  }
}


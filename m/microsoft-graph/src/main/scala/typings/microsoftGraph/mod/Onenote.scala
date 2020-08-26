package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Onenote extends Entity {
  // The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  /**
    * The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of
    * long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
    */
  var operations: js.UndefOr[js.Array[OnenoteOperation]] = js.native
  // The pages in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var pages: js.UndefOr[js.Array[OnenotePage]] = js.native
  /**
    * The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get
    * the binary content of a specific resource. Read-only. Nullable.
    */
  var resources: js.UndefOr[js.Array[OnenoteResource]] = js.native
  // The section groups in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sectionGroups: js.UndefOr[js.Array[SectionGroup]] = js.native
  // The sections in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sections: js.UndefOr[js.Array[OnenoteSection]] = js.native
}

object Onenote {
  @scala.inline
  def apply(): Onenote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onenote]
  }
  @scala.inline
  implicit class OnenoteOps[Self <: Onenote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotebooksVarargs(value: Notebook*): Self = this.set("notebooks", js.Array(value :_*))
    @scala.inline
    def setNotebooks(value: js.Array[Notebook]): Self = this.set("notebooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebooks: Self = this.set("notebooks", js.undefined)
    @scala.inline
    def setOperationsVarargs(value: OnenoteOperation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[OnenoteOperation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    @scala.inline
    def setPagesVarargs(value: OnenotePage*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[OnenotePage]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: OnenoteResource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[OnenoteResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setSectionGroupsVarargs(value: SectionGroup*): Self = this.set("sectionGroups", js.Array(value :_*))
    @scala.inline
    def setSectionGroups(value: js.Array[SectionGroup]): Self = this.set("sectionGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionGroups: Self = this.set("sectionGroups", js.undefined)
    @scala.inline
    def setSectionsVarargs(value: OnenoteSection*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[OnenoteSection]): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
  }
  
}


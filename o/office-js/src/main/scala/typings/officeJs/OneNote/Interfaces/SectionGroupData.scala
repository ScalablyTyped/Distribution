package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "sectionGroup.toJSON()". */
@js.native
trait SectionGroupData extends js.Object {
  
  /**
    *
    * The client url of the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the ID of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the name of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * The collection of section groups in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[js.Array[SectionGroupData]] = js.native
  
  /**
    *
    * The collection of sections in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.native
}
object SectionGroupData {
  
  @scala.inline
  def apply(): SectionGroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupData]
  }
  
  @scala.inline
  implicit class SectionGroupDataOps[Self <: SectionGroupData] (val x: Self) extends AnyVal {
    
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
    def setClientUrl(value: String): Self = this.set("clientUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientUrl: Self = this.set("clientUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSectionGroupsVarargs(value: SectionGroupData*): Self = this.set("sectionGroups", js.Array(value :_*))
    
    @scala.inline
    def setSectionGroups(value: js.Array[SectionGroupData]): Self = this.set("sectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionGroups: Self = this.set("sectionGroups", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: SectionData*): Self = this.set("sections", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: js.Array[SectionData]): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
  }
}

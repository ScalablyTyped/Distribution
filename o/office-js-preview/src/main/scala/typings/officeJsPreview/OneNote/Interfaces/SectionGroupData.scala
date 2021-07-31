package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "sectionGroup.toJSON()". */
trait SectionGroupData extends StObject {
  
  /**
    *
    * The client url of the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the ID of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the name of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The collection of section groups in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[js.Array[SectionGroupData]] = js.undefined
  
  /**
    *
    * The collection of sections in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.undefined
}
object SectionGroupData {
  
  @scala.inline
  def apply(): SectionGroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupData]
  }
  
  @scala.inline
  implicit class SectionGroupDataMutableBuilder[Self <: SectionGroupData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientUrl(value: String): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUrlUndefined: Self = StObject.set(x, "clientUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSectionGroups(value: js.Array[SectionGroupData]): Self = StObject.set(x, "sectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionGroupsUndefined: Self = StObject.set(x, "sectionGroups", js.undefined)
    
    @scala.inline
    def setSectionGroupsVarargs(value: SectionGroupData*): Self = StObject.set(x, "sectionGroups", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: js.Array[SectionData]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: SectionData*): Self = StObject.set(x, "sections", js.Array(value :_*))
  }
}

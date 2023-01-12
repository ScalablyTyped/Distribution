package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `sectionGroup.toJSON()`. */
trait SectionGroupData extends StObject {
  
  /**
    * The client url of the section group. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the ID of the section group. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the name of the section group. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of section groups in the section group. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[js.Array[SectionGroupData]] = js.undefined
  
  /**
    * The collection of sections in the section group. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.undefined
}
object SectionGroupData {
  
  inline def apply(): SectionGroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionGroupData] (val x: Self) extends AnyVal {
    
    inline def setClientUrl(value: String): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    inline def setClientUrlUndefined: Self = StObject.set(x, "clientUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSectionGroups(value: js.Array[SectionGroupData]): Self = StObject.set(x, "sectionGroups", value.asInstanceOf[js.Any])
    
    inline def setSectionGroupsUndefined: Self = StObject.set(x, "sectionGroups", js.undefined)
    
    inline def setSectionGroupsVarargs(value: SectionGroupData*): Self = StObject.set(x, "sectionGroups", js.Array(value*))
    
    inline def setSections(value: js.Array[SectionData]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: SectionData*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Onenote
  extends StObject
     with Entity {
  
  // The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var notebooks: js.UndefOr[NullableOption[js.Array[Notebook]]] = js.undefined
  
  /**
    * The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of
    * long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
    */
  var operations: js.UndefOr[NullableOption[js.Array[OnenoteOperation]]] = js.undefined
  
  // The pages in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var pages: js.UndefOr[NullableOption[js.Array[OnenotePage]]] = js.undefined
  
  /**
    * The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get
    * the binary content of a specific resource. Read-only. Nullable.
    */
  var resources: js.UndefOr[NullableOption[js.Array[OnenoteResource]]] = js.undefined
  
  // The section groups in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sectionGroups: js.UndefOr[NullableOption[js.Array[SectionGroup]]] = js.undefined
  
  // The sections in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sections: js.UndefOr[NullableOption[js.Array[OnenoteSection]]] = js.undefined
}
object Onenote {
  
  inline def apply(): Onenote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onenote]
  }
  
  extension [Self <: Onenote](x: Self) {
    
    inline def setNotebooks(value: NullableOption[js.Array[Notebook]]): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    inline def setNotebooksNull: Self = StObject.set(x, "notebooks", null)
    
    inline def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    inline def setNotebooksVarargs(value: Notebook*): Self = StObject.set(x, "notebooks", js.Array(value*))
    
    inline def setOperations(value: NullableOption[js.Array[OnenoteOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: OnenoteOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setPages(value: NullableOption[js.Array[OnenotePage]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesNull: Self = StObject.set(x, "pages", null)
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: OnenotePage*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setResources(value: NullableOption[js.Array[OnenoteResource]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: OnenoteResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSectionGroups(value: NullableOption[js.Array[SectionGroup]]): Self = StObject.set(x, "sectionGroups", value.asInstanceOf[js.Any])
    
    inline def setSectionGroupsNull: Self = StObject.set(x, "sectionGroups", null)
    
    inline def setSectionGroupsUndefined: Self = StObject.set(x, "sectionGroups", js.undefined)
    
    inline def setSectionGroupsVarargs(value: SectionGroup*): Self = StObject.set(x, "sectionGroups", js.Array(value*))
    
    inline def setSections(value: NullableOption[js.Array[OnenoteSection]]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsNull: Self = StObject.set(x, "sections", null)
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: OnenoteSection*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}

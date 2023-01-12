package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecentNotebook extends StObject {
  
  // The name of the notebook.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The date and time when the notebook was last modified. The timestamp represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var lastAccessedTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote client, if it's installed.
    * The oneNoteWebURL link opens the notebook in OneNote on the web.
    */
  var links: js.UndefOr[NullableOption[RecentNotebookLinks]] = js.undefined
  
  // The backend store where the Notebook resides, either OneDriveForBusiness or OneDrive.
  var sourceService: js.UndefOr[NullableOption[OnenoteSourceService]] = js.undefined
}
object RecentNotebook {
  
  inline def apply(): RecentNotebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentNotebook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecentNotebook] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastAccessedTime(value: NullableOption[String]): Self = StObject.set(x, "lastAccessedTime", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedTimeNull: Self = StObject.set(x, "lastAccessedTime", null)
    
    inline def setLastAccessedTimeUndefined: Self = StObject.set(x, "lastAccessedTime", js.undefined)
    
    inline def setLinks(value: NullableOption[RecentNotebookLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksNull: Self = StObject.set(x, "links", null)
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setSourceService(value: NullableOption[OnenoteSourceService]): Self = StObject.set(x, "sourceService", value.asInstanceOf[js.Any])
    
    inline def setSourceServiceNull: Self = StObject.set(x, "sourceService", null)
    
    inline def setSourceServiceUndefined: Self = StObject.set(x, "sourceService", js.undefined)
  }
}

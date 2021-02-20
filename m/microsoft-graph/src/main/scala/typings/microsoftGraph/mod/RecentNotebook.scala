package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentNotebook extends StObject {
  
  // The name of the notebook.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The date and time when the notebook was last modified. The timestamp represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastAccessedTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote client, if it's installed.
    * The oneNoteWebURL link opens the notebook in OneNote on the web.
    */
  var links: js.UndefOr[NullableOption[RecentNotebookLinks]] = js.native
  
  // The backend store where the Notebook resides, either OneDriveForBusiness or OneDrive.
  var sourceService: js.UndefOr[NullableOption[OnenoteSourceService]] = js.native
}
object RecentNotebook {
  
  @scala.inline
  def apply(): RecentNotebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentNotebook]
  }
  
  @scala.inline
  implicit class RecentNotebookMutableBuilder[Self <: RecentNotebook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastAccessedTime(value: NullableOption[String]): Self = StObject.set(x, "lastAccessedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedTimeNull: Self = StObject.set(x, "lastAccessedTime", null)
    
    @scala.inline
    def setLastAccessedTimeUndefined: Self = StObject.set(x, "lastAccessedTime", js.undefined)
    
    @scala.inline
    def setLinks(value: NullableOption[RecentNotebookLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksNull: Self = StObject.set(x, "links", null)
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setSourceService(value: NullableOption[OnenoteSourceService]): Self = StObject.set(x, "sourceService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceServiceNull: Self = StObject.set(x, "sourceService", null)
    
    @scala.inline
    def setSourceServiceUndefined: Self = StObject.set(x, "sourceService", js.undefined)
  }
}

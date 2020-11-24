package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentNotebook extends js.Object {
  
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
  implicit class RecentNotebookOps[Self <: RecentNotebook] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setLastAccessedTime(value: NullableOption[String]): Self = this.set("lastAccessedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessedTime: Self = this.set("lastAccessedTime", js.undefined)
    
    @scala.inline
    def setLastAccessedTimeNull: Self = this.set("lastAccessedTime", null)
    
    @scala.inline
    def setLinks(value: NullableOption[RecentNotebookLinks]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setLinksNull: Self = this.set("links", null)
    
    @scala.inline
    def setSourceService(value: NullableOption[OnenoteSourceService]): Self = this.set("sourceService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceService: Self = this.set("sourceService", js.undefined)
    
    @scala.inline
    def setSourceServiceNull: Self = this.set("sourceService", null)
  }
}

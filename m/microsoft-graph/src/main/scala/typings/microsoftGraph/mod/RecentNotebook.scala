package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecentNotebook extends js.Object {
  // The name of the notebook.
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the notebook was last modified. The timestamp represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastAccessedTime: js.UndefOr[String] = js.undefined
  /**
    * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote client, if it's installed.
    * The oneNoteWebURL link opens the notebook in OneNote on the web.
    */
  var links: js.UndefOr[RecentNotebookLinks] = js.undefined
  // The backend store where the Notebook resides, either OneDriveForBusiness or OneDrive.
  var sourceService: js.UndefOr[OnenoteSourceService] = js.undefined
}

object RecentNotebook {
  @scala.inline
  def apply(
    displayName: String = null,
    lastAccessedTime: String = null,
    links: RecentNotebookLinks = null,
    sourceService: OnenoteSourceService = null
  ): RecentNotebook = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (lastAccessedTime != null) __obj.updateDynamic("lastAccessedTime")(lastAccessedTime.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (sourceService != null) __obj.updateDynamic("sourceService")(sourceService.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecentNotebook]
  }
}


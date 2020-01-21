package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecentNotebookLinks extends js.Object {
  // Opens the notebook in the OneNote native client if it's installed.
  var oneNoteClientUrl: js.UndefOr[ExternalLink] = js.undefined
  // Opens the notebook in OneNote on the web.
  var oneNoteWebUrl: js.UndefOr[ExternalLink] = js.undefined
}

object RecentNotebookLinks {
  @scala.inline
  def apply(oneNoteClientUrl: ExternalLink = null, oneNoteWebUrl: ExternalLink = null): RecentNotebookLinks = {
    val __obj = js.Dynamic.literal()
    if (oneNoteClientUrl != null) __obj.updateDynamic("oneNoteClientUrl")(oneNoteClientUrl.asInstanceOf[js.Any])
    if (oneNoteWebUrl != null) __obj.updateDynamic("oneNoteWebUrl")(oneNoteWebUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecentNotebookLinks]
  }
}


package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecentNotebookLinks extends js.Object {
  /** Opens the notebook in the OneNote native client if it's installed. */
  var oneNoteClientUrl: js.UndefOr[ExternalLink] = js.undefined
  /** Opens the notebook in OneNote Online. */
  var oneNoteWebUrl: js.UndefOr[ExternalLink] = js.undefined
}

object RecentNotebookLinks {
  @scala.inline
  def apply(oneNoteClientUrl: ExternalLink = null, oneNoteWebUrl: ExternalLink = null): RecentNotebookLinks = {
    val __obj = js.Dynamic.literal()
    if (oneNoteClientUrl != null) __obj.updateDynamic("oneNoteClientUrl")(oneNoteClientUrl)
    if (oneNoteWebUrl != null) __obj.updateDynamic("oneNoteWebUrl")(oneNoteWebUrl)
    __obj.asInstanceOf[RecentNotebookLinks]
  }
}


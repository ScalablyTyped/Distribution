package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionLinks extends js.Object {
  /** Opens the section in the OneNote native client if it's installed. */
  var oneNoteClientUrl: js.UndefOr[ExternalLink] = js.undefined
  /** Opens the section in OneNote Online. */
  var oneNoteWebUrl: js.UndefOr[ExternalLink] = js.undefined
}

object SectionLinks {
  @scala.inline
  def apply(oneNoteClientUrl: ExternalLink = null, oneNoteWebUrl: ExternalLink = null): SectionLinks = {
    val __obj = js.Dynamic.literal()
    if (oneNoteClientUrl != null) __obj.updateDynamic("oneNoteClientUrl")(oneNoteClientUrl)
    if (oneNoteWebUrl != null) __obj.updateDynamic("oneNoteWebUrl")(oneNoteWebUrl)
    __obj.asInstanceOf[SectionLinks]
  }
}


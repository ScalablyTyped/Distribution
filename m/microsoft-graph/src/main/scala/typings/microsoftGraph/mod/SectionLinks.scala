package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionLinks extends js.Object {
  // Opens the section in the OneNote native client if it's installed.
  var oneNoteClientUrl: js.UndefOr[ExternalLink] = js.undefined
  // Opens the section in OneNote on the web.
  var oneNoteWebUrl: js.UndefOr[ExternalLink] = js.undefined
}

object SectionLinks {
  @scala.inline
  def apply(oneNoteClientUrl: ExternalLink = null, oneNoteWebUrl: ExternalLink = null): SectionLinks = {
    val __obj = js.Dynamic.literal()
    if (oneNoteClientUrl != null) __obj.updateDynamic("oneNoteClientUrl")(oneNoteClientUrl.asInstanceOf[js.Any])
    if (oneNoteWebUrl != null) __obj.updateDynamic("oneNoteWebUrl")(oneNoteWebUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionLinks]
  }
}


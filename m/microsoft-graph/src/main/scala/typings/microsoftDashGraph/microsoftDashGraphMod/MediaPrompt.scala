package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPrompt extends Prompt {
  var mediaInfo: js.UndefOr[MediaInfo] = js.undefined
}

object MediaPrompt {
  @scala.inline
  def apply(mediaInfo: MediaInfo = null): MediaPrompt = {
    val __obj = js.Dynamic.literal()
    if (mediaInfo != null) __obj.updateDynamic("mediaInfo")(mediaInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPrompt]
  }
}


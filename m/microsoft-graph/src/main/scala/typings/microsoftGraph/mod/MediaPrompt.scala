package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPrompt extends Prompt {
  // The media information
  var mediaInfo: js.UndefOr[MediaInfo] = js.native
}

object MediaPrompt {
  @scala.inline
  def apply(): MediaPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPrompt]
  }
  @scala.inline
  implicit class MediaPromptOps[Self <: MediaPrompt] (val x: Self) extends AnyVal {
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
    def setMediaInfo(value: MediaInfo): Self = this.set("mediaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaInfo: Self = this.set("mediaInfo", js.undefined)
  }
  
}


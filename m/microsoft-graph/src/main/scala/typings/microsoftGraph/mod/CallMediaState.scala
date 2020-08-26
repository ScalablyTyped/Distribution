package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallMediaState extends js.Object {
  // The audio media state. Possible values are: active, inactive.
  var audio: js.UndefOr[MediaState] = js.native
}

object CallMediaState {
  @scala.inline
  def apply(): CallMediaState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallMediaState]
  }
  @scala.inline
  implicit class CallMediaStateOps[Self <: CallMediaState] (val x: Self) extends AnyVal {
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
    def setAudio(value: MediaState): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
  }
  
}


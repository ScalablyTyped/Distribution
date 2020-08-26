package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceWebAudioApi extends js.Object {
  var forceWebAudioApi: js.UndefOr[Boolean] = js.native
}

object ForceWebAudioApi {
  @scala.inline
  def apply(): ForceWebAudioApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceWebAudioApi]
  }
  @scala.inline
  implicit class ForceWebAudioApiOps[Self <: ForceWebAudioApi] (val x: Self) extends AnyVal {
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
    def setForceWebAudioApi(value: Boolean): Self = this.set("forceWebAudioApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceWebAudioApi: Self = this.set("forceWebAudioApi", js.undefined)
  }
  
}


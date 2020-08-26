package typings.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicTextTrack extends js.Object {
  var label: String = js.native
  var language: String = js.native
  var stream: js.Any = js.native
  def augmentPayload(payload: js.Any, startTime: Double, endTime: Double): Unit = js.native
}

object DynamicTextTrack {
  @scala.inline
  def apply(augmentPayload: (js.Any, Double, Double) => Unit, label: String, language: String, stream: js.Any): DynamicTextTrack = {
    val __obj = js.Dynamic.literal(augmentPayload = js.Any.fromFunction3(augmentPayload), label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicTextTrack]
  }
  @scala.inline
  implicit class DynamicTextTrackOps[Self <: DynamicTextTrack] (val x: Self) extends AnyVal {
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
    def setAugmentPayload(value: (js.Any, Double, Double) => Unit): Self = this.set("augmentPayload", js.Any.fromFunction3(value))
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setStream(value: js.Any): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
  
}


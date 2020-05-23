package typings.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTextTrack extends js.Object {
  var label: String
  var language: String
  var stream: js.Any
  def augmentPayload(payload: js.Any, startTime: Double, endTime: Double): Unit
}

object DynamicTextTrack {
  @scala.inline
  def apply(augmentPayload: (js.Any, Double, Double) => Unit, label: String, language: String, stream: js.Any): DynamicTextTrack = {
    val __obj = js.Dynamic.literal(augmentPayload = js.Any.fromFunction3(augmentPayload), label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicTextTrack]
  }
}


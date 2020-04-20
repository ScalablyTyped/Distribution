package typings.nteractTransformVdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaType extends js.Object {
  var mediaType: String
  def onVDOMEvent(): Unit
}

object AnonMediaType {
  @scala.inline
  def apply(mediaType: String, onVDOMEvent: () => Unit): AnonMediaType = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], onVDOMEvent = js.Any.fromFunction0(onVDOMEvent))
    __obj.asInstanceOf[AnonMediaType]
  }
}


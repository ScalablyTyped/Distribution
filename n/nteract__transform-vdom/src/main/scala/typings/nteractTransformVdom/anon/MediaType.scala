package typings.nteractTransformVdom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var mediaType: String
  def onVDOMEvent(): Unit
}

object MediaType {
  @scala.inline
  def apply(mediaType: String, onVDOMEvent: () => Unit): MediaType = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], onVDOMEvent = js.Any.fromFunction0(onVDOMEvent))
    __obj.asInstanceOf[MediaType]
  }
}


package typings
package atNteractTransformDashVdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MediaType extends js.Object {
  var mediaType: java.lang.String
  def onVDOMEvent(): scala.Unit
}

object Anon_MediaType {
  @scala.inline
  def apply(mediaType: java.lang.String, onVDOMEvent: () => scala.Unit): Anon_MediaType = {
    val __obj = js.Dynamic.literal(mediaType = mediaType, onVDOMEvent = js.Any.fromFunction0(onVDOMEvent))
  
    __obj.asInstanceOf[Anon_MediaType]
  }
}


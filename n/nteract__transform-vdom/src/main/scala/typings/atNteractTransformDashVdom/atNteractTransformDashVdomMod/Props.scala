package typings.atNteractTransformDashVdom.atNteractTransformDashVdomMod

import typings.atNteractTransformDashVdom.atNteractTransformDashVdomStrings.`application/vdomDOTv1+json`
import typings.atNteractTransformDashVdom.libEventDashToDashObjectMod.SerializedEvent
import typings.atNteractTransformDashVdom.libObjectDashToDashReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var data: VDOMEl
  var mediaType: `application/vdomDOTv1+json`
  def onVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit
}

object Props {
  @scala.inline
  def apply(
    data: VDOMEl,
    mediaType: `application/vdomDOTv1+json`,
    onVDOMEvent: (String, SerializedEvent[_]) => Unit
  ): Props = {
    val __obj = js.Dynamic.literal(data = data, mediaType = mediaType, onVDOMEvent = js.Any.fromFunction2(onVDOMEvent))
  
    __obj.asInstanceOf[Props]
  }
}


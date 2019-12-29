package typings.atNteractTransformDashVdom.atNteractTransformDashVdomMod

import typings.atNteractTransformDashVdom.atNteractTransformDashVdomStrings.applicationSlashvdomDotv1Plussignjson
import typings.atNteractTransformDashVdom.libEventDashToDashObjectMod.SerializedEvent
import typings.atNteractTransformDashVdom.libObjectDashToDashReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var data: VDOMEl
  var mediaType: applicationSlashvdomDotv1Plussignjson
  def onVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit
}

object Props {
  @scala.inline
  def apply(
    data: VDOMEl,
    mediaType: applicationSlashvdomDotv1Plussignjson,
    onVDOMEvent: (String, SerializedEvent[_]) => Unit
  ): Props = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], onVDOMEvent = js.Any.fromFunction2(onVDOMEvent))
  
    __obj.asInstanceOf[Props]
  }
}


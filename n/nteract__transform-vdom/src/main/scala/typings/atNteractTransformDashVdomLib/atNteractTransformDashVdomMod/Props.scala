package typings
package atNteractTransformDashVdomLib.atNteractTransformDashVdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var data: atNteractTransformDashVdomLib.libObjectDashToDashReactMod.VDOMEl
  var mediaType: atNteractTransformDashVdomLib.atNteractTransformDashVdomLibStrings.`application/vdomDOTv1+json`
  def onVDOMEvent(
    targetName: java.lang.String,
    event: atNteractTransformDashVdomLib.libEventDashToDashObjectMod.SerializedEvent[_]
  ): scala.Unit
}

object Props {
  @scala.inline
  def apply(
    data: atNteractTransformDashVdomLib.libObjectDashToDashReactMod.VDOMEl,
    mediaType: atNteractTransformDashVdomLib.atNteractTransformDashVdomLibStrings.`application/vdomDOTv1+json`,
    onVDOMEvent: (java.lang.String, atNteractTransformDashVdomLib.libEventDashToDashObjectMod.SerializedEvent[_]) => scala.Unit
  ): Props = {
    val __obj = js.Dynamic.literal(data = data, mediaType = mediaType, onVDOMEvent = js.Any.fromFunction2(onVDOMEvent))
  
    __obj.asInstanceOf[Props]
  }
}


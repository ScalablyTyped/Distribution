package typings.nteractTransformVdom.mod

import typings.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typings.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typings.nteractTransformVdom.objectToReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var data: VDOMEl = js.native
  var mediaType: applicationSlashvdomDotv1Plussignjson = js.native
  def onVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit = js.native
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
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setData(value: VDOMEl): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: applicationSlashvdomDotv1Plussignjson): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnVDOMEvent(value: (String, SerializedEvent[_]) => Unit): Self = this.set("onVDOMEvent", js.Any.fromFunction2(value))
  }
  
}


package typings.nteractTransformVdom.anon

import typings.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typings.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typings.nteractTransformVdom.objectToReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nteract/transform-vdom.@nteract/transform-vdom.Props> */
@js.native
trait PartialProps extends js.Object {
  var data: js.UndefOr[VDOMEl] = js.native
  var mediaType: js.UndefOr[applicationSlashvdomDotv1Plussignjson] = js.native
  var onVDOMEvent: js.UndefOr[js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]] = js.native
}

object PartialProps {
  @scala.inline
  def apply(): PartialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProps]
  }
  @scala.inline
  implicit class PartialPropsOps[Self <: PartialProps] (val x: Self) extends AnyVal {
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
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMediaType(value: applicationSlashvdomDotv1Plussignjson): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setOnVDOMEvent(value: (/* targetName */ String, /* event */ SerializedEvent[_]) => Unit): Self = this.set("onVDOMEvent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnVDOMEvent: Self = this.set("onVDOMEvent", js.undefined)
  }
  
}


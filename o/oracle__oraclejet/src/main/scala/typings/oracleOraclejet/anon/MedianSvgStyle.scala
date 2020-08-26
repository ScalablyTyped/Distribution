package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MedianSvgStyle extends js.Object {
  var medianSvgClassName: js.UndefOr[String] = js.native
  var medianSvgStyle: js.UndefOr[js.Object] = js.native
  var q2Color: js.UndefOr[String] = js.native
  var q2SvgClassName: js.UndefOr[String] = js.native
  var q2SvgStyle: js.UndefOr[js.Object] = js.native
  var q3SvgClassName: js.UndefOr[String] = js.native
  var q3SvgStyle: js.UndefOr[js.Object] = js.native
  var whiskerEndLength: js.UndefOr[String] = js.native
  var whiskerEndSvgClassName: js.UndefOr[String] = js.native
  var whiskerEndSvgStyle: js.UndefOr[js.Object] = js.native
  var whiskerSvgClassName: js.UndefOr[String] = js.native
  var whiskerSvgStyle: js.UndefOr[js.Object] = js.native
}

object MedianSvgStyle {
  @scala.inline
  def apply(): MedianSvgStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedianSvgStyle]
  }
  @scala.inline
  implicit class MedianSvgStyleOps[Self <: MedianSvgStyle] (val x: Self) extends AnyVal {
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
    def setMedianSvgClassName(value: String): Self = this.set("medianSvgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedianSvgClassName: Self = this.set("medianSvgClassName", js.undefined)
    @scala.inline
    def setMedianSvgStyle(value: js.Object): Self = this.set("medianSvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedianSvgStyle: Self = this.set("medianSvgStyle", js.undefined)
    @scala.inline
    def setQ2Color(value: String): Self = this.set("q2Color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ2Color: Self = this.set("q2Color", js.undefined)
    @scala.inline
    def setQ2SvgClassName(value: String): Self = this.set("q2SvgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ2SvgClassName: Self = this.set("q2SvgClassName", js.undefined)
    @scala.inline
    def setQ2SvgStyle(value: js.Object): Self = this.set("q2SvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ2SvgStyle: Self = this.set("q2SvgStyle", js.undefined)
    @scala.inline
    def setQ3SvgClassName(value: String): Self = this.set("q3SvgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ3SvgClassName: Self = this.set("q3SvgClassName", js.undefined)
    @scala.inline
    def setQ3SvgStyle(value: js.Object): Self = this.set("q3SvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ3SvgStyle: Self = this.set("q3SvgStyle", js.undefined)
    @scala.inline
    def setWhiskerEndLength(value: String): Self = this.set("whiskerEndLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiskerEndLength: Self = this.set("whiskerEndLength", js.undefined)
    @scala.inline
    def setWhiskerEndSvgClassName(value: String): Self = this.set("whiskerEndSvgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiskerEndSvgClassName: Self = this.set("whiskerEndSvgClassName", js.undefined)
    @scala.inline
    def setWhiskerEndSvgStyle(value: js.Object): Self = this.set("whiskerEndSvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiskerEndSvgStyle: Self = this.set("whiskerEndSvgStyle", js.undefined)
    @scala.inline
    def setWhiskerSvgClassName(value: String): Self = this.set("whiskerSvgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiskerSvgClassName: Self = this.set("whiskerSvgClassName", js.undefined)
    @scala.inline
    def setWhiskerSvgStyle(value: js.Object): Self = this.set("whiskerSvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiskerSvgStyle: Self = this.set("whiskerSvgStyle", js.undefined)
  }
  
}


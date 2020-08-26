package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MedianSvgClassName extends js.Object {
  var medianSvgClassName: String = js.native
  var medianSvgStyle: js.Object = js.native
  var whiskerEndLength: String = js.native
  var whiskerEndSvgClassName: String = js.native
  var whiskerEndSvgStyle: js.Object = js.native
  var whiskerSvgClassName: String = js.native
  var whiskerSvgStyle: js.Object = js.native
}

object MedianSvgClassName {
  @scala.inline
  def apply(
    medianSvgClassName: String,
    medianSvgStyle: js.Object,
    whiskerEndLength: String,
    whiskerEndSvgClassName: String,
    whiskerEndSvgStyle: js.Object,
    whiskerSvgClassName: String,
    whiskerSvgStyle: js.Object
  ): MedianSvgClassName = {
    val __obj = js.Dynamic.literal(medianSvgClassName = medianSvgClassName.asInstanceOf[js.Any], medianSvgStyle = medianSvgStyle.asInstanceOf[js.Any], whiskerEndLength = whiskerEndLength.asInstanceOf[js.Any], whiskerEndSvgClassName = whiskerEndSvgClassName.asInstanceOf[js.Any], whiskerEndSvgStyle = whiskerEndSvgStyle.asInstanceOf[js.Any], whiskerSvgClassName = whiskerSvgClassName.asInstanceOf[js.Any], whiskerSvgStyle = whiskerSvgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedianSvgClassName]
  }
  @scala.inline
  implicit class MedianSvgClassNameOps[Self <: MedianSvgClassName] (val x: Self) extends AnyVal {
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
    def setMedianSvgStyle(value: js.Object): Self = this.set("medianSvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiskerEndLength(value: String): Self = this.set("whiskerEndLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiskerEndSvgClassName(value: String): Self = this.set("whiskerEndSvgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiskerEndSvgStyle(value: js.Object): Self = this.set("whiskerEndSvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiskerSvgClassName(value: String): Self = this.set("whiskerSvgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiskerSvgStyle(value: js.Object): Self = this.set("whiskerSvgStyle", value.asInstanceOf[js.Any])
  }
  
}


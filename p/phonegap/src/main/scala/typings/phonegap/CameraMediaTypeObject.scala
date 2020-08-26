package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraMediaTypeObject extends js.Object {
  var ALLMEDIA: Double = js.native
  var PICTURE: Double = js.native
  var VIDEO: Double = js.native
}

object CameraMediaTypeObject {
  @scala.inline
  def apply(ALLMEDIA: Double, PICTURE: Double, VIDEO: Double): CameraMediaTypeObject = {
    val __obj = js.Dynamic.literal(ALLMEDIA = ALLMEDIA.asInstanceOf[js.Any], PICTURE = PICTURE.asInstanceOf[js.Any], VIDEO = VIDEO.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraMediaTypeObject]
  }
  @scala.inline
  implicit class CameraMediaTypeObjectOps[Self <: CameraMediaTypeObject] (val x: Self) extends AnyVal {
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
    def setALLMEDIA(value: Double): Self = this.set("ALLMEDIA", value.asInstanceOf[js.Any])
    @scala.inline
    def setPICTURE(value: Double): Self = this.set("PICTURE", value.asInstanceOf[js.Any])
    @scala.inline
    def setVIDEO(value: Double): Self = this.set("VIDEO", value.asInstanceOf[js.Any])
  }
  
}


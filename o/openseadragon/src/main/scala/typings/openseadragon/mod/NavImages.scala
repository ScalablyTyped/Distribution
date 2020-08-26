package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavImages extends js.Object {
  var flip: NavImagesValues = js.native
  var fullpage: NavImagesValues = js.native
  var home: NavImagesValues = js.native
  var next: NavImagesValues = js.native
  var previous: NavImagesValues = js.native
  var rotateleft: NavImagesValues = js.native
  var rotateright: NavImagesValues = js.native
  var zoomIn: NavImagesValues = js.native
  var zoomOut: NavImagesValues = js.native
}

object NavImages {
  @scala.inline
  def apply(
    flip: NavImagesValues,
    fullpage: NavImagesValues,
    home: NavImagesValues,
    next: NavImagesValues,
    previous: NavImagesValues,
    rotateleft: NavImagesValues,
    rotateright: NavImagesValues,
    zoomIn: NavImagesValues,
    zoomOut: NavImagesValues
  ): NavImages = {
    val __obj = js.Dynamic.literal(flip = flip.asInstanceOf[js.Any], fullpage = fullpage.asInstanceOf[js.Any], home = home.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], rotateleft = rotateleft.asInstanceOf[js.Any], rotateright = rotateright.asInstanceOf[js.Any], zoomIn = zoomIn.asInstanceOf[js.Any], zoomOut = zoomOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavImages]
  }
  @scala.inline
  implicit class NavImagesOps[Self <: NavImages] (val x: Self) extends AnyVal {
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
    def setFlip(value: NavImagesValues): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullpage(value: NavImagesValues): Self = this.set("fullpage", value.asInstanceOf[js.Any])
    @scala.inline
    def setHome(value: NavImagesValues): Self = this.set("home", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: NavImagesValues): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: NavImagesValues): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateleft(value: NavImagesValues): Self = this.set("rotateleft", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateright(value: NavImagesValues): Self = this.set("rotateright", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomIn(value: NavImagesValues): Self = this.set("zoomIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomOut(value: NavImagesValues): Self = this.set("zoomOut", value.asInstanceOf[js.Any])
  }
  
}


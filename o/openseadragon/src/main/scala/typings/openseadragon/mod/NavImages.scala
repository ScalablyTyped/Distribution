package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavImages extends js.Object {
  var flip: NavImagesValues
  var fullpage: NavImagesValues
  var home: NavImagesValues
  var next: NavImagesValues
  var previous: NavImagesValues
  var rotateleft: NavImagesValues
  var rotateright: NavImagesValues
  var zoomIn: NavImagesValues
  var zoomOut: NavImagesValues
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
}


package typings
package olLib.sourceImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Image", "ImageSourceEvent")
@js.native
class ImageSourceEvent protected ()
  extends olLib.eventsEventMod.default {
  def this(`type`: java.lang.String, image: olLib.imageMod.default) = this()
  var image: olLib.imageMod.default = js.native
}


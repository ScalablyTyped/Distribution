package typings.ol.sourceImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Image", "ImageSourceEvent")
@js.native
class ImageSourceEvent protected ()
  extends typings.ol.eventsEventMod.default {
  def this(`type`: String, image: typings.ol.imageMod.default) = this()
  var image: typings.ol.imageMod.default = js.native
}


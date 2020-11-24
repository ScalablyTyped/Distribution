package typings.ol.sourceImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/Image", "ImageSourceEvent")
@js.native
class ImageSourceEvent protected ()
  extends typings.ol.eventMod.default {
  def this(`type`: String, image: typings.ol.olImageMod.default) = this()
  
  /**
    * The image related to the event.
    */
  var image: typings.ol.olImageMod.default = js.native
}

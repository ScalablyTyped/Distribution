package typings.openlayers.openlayersMod.source

import typings.openlayers.openlayersMod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Events emitted by {@link ol.source.Image} instances are instances of this
  * type.
  *
  * @param type Type.
  * @param image The image.
  */
@JSImport("openlayers", "source.ImageEvent")
@js.native
class ImageEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Image} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param image The image.
    */
  def this(`type`: String, image: typings.openlayers.openlayersMod.Image) = this()
  /**
    * The image related to the event.
    * @api
    */
  var image: typings.openlayers.openlayersMod.Image = js.native
}


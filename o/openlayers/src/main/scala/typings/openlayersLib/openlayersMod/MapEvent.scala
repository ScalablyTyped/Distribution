package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "MapEvent")
@js.native
class MapEvent protected ()
  extends openlayersLib.openlayersMod.eventsNs.Event {
  /**
    * @classdesc
    * Events emitted as map events are instances of this type.
    * See {@link ol.Map} for which events trigger a map event.
    *
    * @param type Event type.
    * @param map Map.
    * @param opt_frameState Frame state.
    */
  def this(`type`: java.lang.String, map: Map) = this()
  def this(`type`: java.lang.String, map: Map, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState) = this()
  /**
    * The frame state at the time of the event.
    * @api
    */
  var frameState: openlayersLib.openlayersMod.olxNs.FrameState = js.native
  /**
    * The map where the event occurred.
    * @api stable
    */
  var map: Map = js.native
}


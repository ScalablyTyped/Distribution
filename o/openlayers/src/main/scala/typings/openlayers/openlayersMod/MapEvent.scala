package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.events.Event
import typings.openlayers.openlayersMod.olx.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "MapEvent")
@js.native
class MapEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted as map events are instances of this type.
    * See {@link ol.Map} for which events trigger a map event.
    *
    * @param type Event type.
    * @param map Map.
    * @param opt_frameState Frame state.
    */
  def this(`type`: String, map: Map) = this()
  def this(`type`: String, map: Map, opt_frameState: FrameState) = this()
  /**
    * The frame state at the time of the event.
    * @api
    */
  var frameState: FrameState = js.native
  /**
    * The map where the event occurred.
    * @api stable
    */
  var map: Map = js.native
}


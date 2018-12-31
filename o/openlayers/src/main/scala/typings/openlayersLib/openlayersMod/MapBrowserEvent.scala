package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "MapBrowserEvent")
@js.native
class MapBrowserEvent protected () extends MapEvent {
  /**
    * @classdesc
    * Events emitted as map browser events are instances of this type.
    * See {@link ol.Map} for which events trigger a map browser event.
    *
    * @param type Event type.
    * @param map Map.
    * @param browserEvent Browser event.
    * @param opt_dragging Is the map currently being dragged?
    * @param opt_frameState Frame state.
    */
  def this(`type`: java.lang.String, map: Map, browserEvent: stdLib.Event) = this()
  def this(`type`: java.lang.String, map: Map, browserEvent: stdLib.Event, opt_dragging: scala.Boolean) = this()
  def this(`type`: java.lang.String, map: Map, browserEvent: stdLib.Event, opt_dragging: scala.Boolean, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState) = this()
  /**
    * The coordinate of the original browser event.
    * @api stable
    */
  var coordinate: Coordinate = js.native
  /**
    * Indicates if the map is currently being dragged. Only set for
    * `POINTERDRAG` and `POINTERMOVE` events. Default is `false`.
    *
    * @api stable
    */
  var dragging: scala.Boolean = js.native
  /**
    * The original browser event.
    * @const
    * @api stable
    */
  var originalEvent: stdLib.Event = js.native
  /**
    * The pixel of the original browser event.
    * @api stable
    */
  var pixel: Pixel = js.native
}


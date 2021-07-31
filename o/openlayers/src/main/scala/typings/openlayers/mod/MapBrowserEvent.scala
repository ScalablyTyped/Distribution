package typings.openlayers.mod

import typings.openlayers.mod.olx.FrameState
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(`type`: String, map: Map, browserEvent: Event) = this()
  def this(`type`: String, map: Map, browserEvent: Event, opt_dragging: Boolean) = this()
  def this(`type`: String, map: Map, browserEvent: Event, opt_dragging: Boolean, opt_frameState: FrameState) = this()
  def this(`type`: String, map: Map, browserEvent: Event, opt_dragging: Unit, opt_frameState: FrameState) = this()
  
  /**
    * The coordinate of the original browser event.
    * @api stable
    */
  var coordinate: Coordinate_ = js.native
  
  /**
    * Indicates if the map is currently being dragged. Only set for
    * `POINTERDRAG` and `POINTERMOVE` events. Default is `false`.
    *
    * @api stable
    */
  var dragging: Boolean = js.native
  
  /**
    * The original browser event.
    * @const
    * @api stable
    */
  var originalEvent: Event = js.native
  
  /**
    * The pixel of the original browser event.
    * @api stable
    */
  var pixel: Pixel = js.native
}

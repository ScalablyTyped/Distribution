package typings.openlayers.mod

import typings.openlayers.mod.olx.FrameState
import typings.openlayers.mod.pointer.PointerEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "MapBrowserPointerEvent")
@js.native
class MapBrowserPointerEvent protected () extends MapBrowserEvent {
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
  
  // /**
  //  * @param type Event type.
  //  * @param map Map.
  //  * @param pointerEvent Pointer event.
  //  * @param opt_dragging Is the map currently being dragged?
  //  * @param opt_frameState Frame state.
  //  */
  // constructor (type: string,
  //           map: ol.Map,
  //           pointerEvent: ol.pointer.PointerEvent,
  //           opt_dragging?: boolean,
  //           opt_frameState?: olx.FrameState)
  var pointerEvent: PointerEvent = js.native
}

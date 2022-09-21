package typings.openlayers.global.ol

import typings.openlayers.mod.olx.FrameState
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.MapBrowserEvent")
@js.native
open class MapBrowserEvent protected ()
  extends typings.openlayers.mod.MapBrowserEvent {
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
  def this(`type`: String, map: typings.openlayers.mod.Map, browserEvent: Event) = this()
  def this(`type`: String, map: typings.openlayers.mod.Map, browserEvent: Event, opt_dragging: Boolean) = this()
  def this(
    `type`: String,
    map: typings.openlayers.mod.Map,
    browserEvent: Event,
    opt_dragging: Boolean,
    opt_frameState: FrameState
  ) = this()
  def this(
    `type`: String,
    map: typings.openlayers.mod.Map,
    browserEvent: Event,
    opt_dragging: Unit,
    opt_frameState: FrameState
  ) = this()
}

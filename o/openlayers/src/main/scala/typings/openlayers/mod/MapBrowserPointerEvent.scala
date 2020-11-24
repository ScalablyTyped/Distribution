package typings.openlayers.mod

import typings.openlayers.mod.pointer.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "MapBrowserPointerEvent")
@js.native
class MapBrowserPointerEvent () extends MapBrowserEvent {
  
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

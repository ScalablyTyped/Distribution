package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.pointer.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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


package typings
package olLib.interactionDragBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/DragBox", "DragBoxEvent")
@js.native
class DragBoxEvent protected ()
  extends olLib.eventsEventMod.default {
  def this(`type`: java.lang.String, coordinate: olLib.coordinateMod.Coordinate, mapBrowserEvent: olLib.mapBrowserEventMod.default) = this()
  var coordinate: olLib.coordinateMod.Coordinate = js.native
  var mapBrowserEvent: olLib.mapBrowserEventMod.default = js.native
}


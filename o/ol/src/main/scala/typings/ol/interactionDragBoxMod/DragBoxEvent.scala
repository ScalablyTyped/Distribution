package typings.ol.interactionDragBoxMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/DragBox", "DragBoxEvent")
@js.native
class DragBoxEvent protected ()
  extends typings.ol.eventsEventMod.default {
  def this(`type`: String, coordinate: Coordinate, mapBrowserEvent: typings.ol.mapBrowserEventMod.default) = this()
  var coordinate: Coordinate = js.native
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default = js.native
}


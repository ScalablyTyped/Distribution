package typings.ol.dragBoxMod

import typings.ol.coordinateMod.Coordinate
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragBoxEvent
  extends typings.ol.eventMod.default {
  
  /**
    * The coordinate of the drag event.
    */
  var coordinate: Coordinate = js.native
  
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent] = js.native
}

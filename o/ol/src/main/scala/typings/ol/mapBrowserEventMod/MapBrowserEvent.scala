package typings.ol.mapBrowserEventMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapBrowserEvent
  extends typings.ol.mapEventMod.default {
  var coordinate: Coordinate = js.native
  var dragging: Boolean = js.native
  var originalEvent: Event = js.native
  var pixel: Pixel = js.native
}


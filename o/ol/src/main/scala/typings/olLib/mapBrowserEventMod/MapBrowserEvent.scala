package typings
package olLib.mapBrowserEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapBrowserEvent
  extends olLib.mapEventMod.default {
  var coordinate: olLib.coordinateMod.Coordinate = js.native
  var dragging: scala.Boolean = js.native
  var originalEvent: stdLib.Event = js.native
  var pixel: olLib.pixelMod.Pixel = js.native
}


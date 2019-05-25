package typings
package olLib.olMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapBrowserPointerEvent")
@js.native
class MapBrowserPointerEvent protected ()
  extends olLib.mapBrowserPointerEventMod.default {
  def this(`type`: java.lang.String, map: olLib.pluggableMapMod.default, pointerEvent: olLib.pointerPointerEventMod.default) = this()
  def this(`type`: java.lang.String, map: olLib.pluggableMapMod.default, pointerEvent: olLib.pointerPointerEventMod.default, opt_dragging: scala.Boolean) = this()
  def this(`type`: java.lang.String, map: olLib.pluggableMapMod.default, pointerEvent: olLib.pointerPointerEventMod.default, opt_dragging: scala.Boolean, opt_frameState: olLib.pluggableMapMod.FrameState) = this()
}


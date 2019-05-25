package typings
package olLib.olMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapBrowserEvent")
@js.native
class MapBrowserEvent protected ()
  extends olLib.mapBrowserEventMod.default {
  def this(`type`: java.lang.String, map: olLib.pluggableMapMod.default, browserEvent: stdLib.Event) = this()
  def this(`type`: java.lang.String, map: olLib.pluggableMapMod.default, browserEvent: stdLib.Event, opt_dragging: scala.Boolean) = this()
  def this(`type`: java.lang.String, map: olLib.pluggableMapMod.default, browserEvent: stdLib.Event, opt_dragging: scala.Boolean, opt_frameState: olLib.pluggableMapMod.FrameState) = this()
}


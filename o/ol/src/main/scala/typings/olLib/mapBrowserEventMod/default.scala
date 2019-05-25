package typings
package olLib.mapBrowserEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserEvent", JSImport.Default)
@js.native
class default protected () extends MapBrowserEvent {
  def this(`type`: java.lang.String, map: olLib.pluggableMapMod.default, browserEvent: stdLib.Event) = this()
  def this(`type`: java.lang.String, map: olLib.pluggableMapMod.default, browserEvent: stdLib.Event, opt_dragging: scala.Boolean) = this()
  def this(`type`: java.lang.String, map: olLib.pluggableMapMod.default, browserEvent: stdLib.Event, opt_dragging: scala.Boolean, opt_frameState: olLib.pluggableMapMod.FrameState) = this()
}


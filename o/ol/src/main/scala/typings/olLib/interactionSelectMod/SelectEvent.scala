package typings
package olLib.interactionSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Select", "SelectEvent")
@js.native
class SelectEvent protected ()
  extends olLib.eventsEventMod.default {
  def this(`type`: SelectEventType, selected: js.Array[olLib.featureMod.default], deselected: js.Array[olLib.featureMod.default], mapBrowserEvent: olLib.mapBrowserEventMod.default) = this()
  var deselected: js.Array[olLib.featureMod.default] = js.native
  var mapBrowserEvent: olLib.mapBrowserEventMod.default = js.native
  var selected: js.Array[olLib.featureMod.default] = js.native
}


package typings
package olLib.interactionModifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Modify", "ModifyEvent")
@js.native
class ModifyEvent ()
  extends olLib.eventsEventMod.default {
  var features: olLib.collectionMod.default[olLib.featureMod.default] = js.native
  var mapBrowserEvent: olLib.mapBrowserEventMod.default = js.native
}


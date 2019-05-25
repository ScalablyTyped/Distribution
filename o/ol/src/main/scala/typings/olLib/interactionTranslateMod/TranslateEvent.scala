package typings
package olLib.interactionTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Translate", "TranslateEvent")
@js.native
class TranslateEvent ()
  extends olLib.eventsEventMod.default {
  var coordinate: olLib.coordinateMod.Coordinate = js.native
  var features: olLib.collectionMod.default[olLib.featureMod.default] = js.native
}


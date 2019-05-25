package typings
package olLib.interactionDrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Draw", "DrawEvent")
@js.native
class DrawEvent protected ()
  extends olLib.eventsEventMod.default {
  def this(`type`: DrawEventType, feature: olLib.featureMod.default) = this()
  var feature: olLib.featureMod.default = js.native
}


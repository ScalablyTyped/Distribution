package typings.ol.interactionDrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Draw", "DrawEvent")
@js.native
class DrawEvent protected ()
  extends typings.ol.eventsEventMod.default {
  def this(`type`: DrawEventType, feature: typings.ol.featureMod.default) = this()
  var feature: typings.ol.featureMod.default = js.native
}


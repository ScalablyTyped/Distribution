package typings.ol.drawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Draw", "DrawEvent")
@js.native
class DrawEvent protected ()
  extends typings.ol.eventMod.default {
  def this(`type`: DrawEventType, feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]) = this()
  var feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
}


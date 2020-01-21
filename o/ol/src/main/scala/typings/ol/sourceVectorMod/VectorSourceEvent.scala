package typings.ol.sourceVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Vector", "VectorSourceEvent")
@js.native
class VectorSourceEvent[GeomType /* <: typings.ol.geometryMod.default */] ()
  extends typings.ol.eventMod.default {
  var feature: typings.ol.olFeatureMod.default[GeomType] = js.native
}


package typings.ol.sourceVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Vector", "VectorSourceEvent")
@js.native
class VectorSourceEvent[GeomType /* <: typings.ol.geomGeometryMod.default */] ()
  extends typings.ol.eventsEventMod.default {
  var feature: typings.ol.featureMod.default[GeomType] = js.native
}


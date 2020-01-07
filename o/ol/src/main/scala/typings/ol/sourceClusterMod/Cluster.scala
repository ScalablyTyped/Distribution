package typings.ol.sourceClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] {
  var distance: Double = js.native
  var features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
  var resolution: Double = js.native
  var source: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] = js.native
  /* protected */ def cluster(): Unit = js.native
  /* protected */ def createCluster(features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
  /* protected */ def geometryFunction(feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): typings.ol.geomPointMod.default = js.native
  def getDistance(): Double = js.native
  def getSource(): typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] = js.native
  def setDistance(distance: Double): Unit = js.native
}


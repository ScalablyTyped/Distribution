package typings.ol.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] {
  var distance: Double = js.native
  var features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
  var resolution: Double = js.native
  var source: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] = js.native
  /* protected */ def cluster(): Unit = js.native
  /* protected */ def createCluster(features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
  /* protected */ def geometryFunction(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): typings.ol.pointMod.default = js.native
  def getDistance(): Double = js.native
  def getSource(): typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] = js.native
  def setDistance(distance: Double): Unit = js.native
}


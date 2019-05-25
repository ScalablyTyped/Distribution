package typings
package olLib.sourceClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends olLib.sourceVectorMod.default {
  var distance: scala.Double = js.native
  var features: js.Array[olLib.featureMod.default] = js.native
  var resolution: scala.Double = js.native
  var source: olLib.sourceVectorMod.default = js.native
  /* protected */ def cluster(): scala.Unit = js.native
  /* protected */ def createCluster(features: js.Array[olLib.featureMod.default]): olLib.featureMod.default = js.native
  /* protected */ def geometryFunction(param0: olLib.featureMod.default): olLib.geomPointMod.default = js.native
  def getDistance(): scala.Double = js.native
  def getSource(): olLib.sourceVectorMod.default = js.native
  def setDistance(distance: scala.Double): scala.Unit = js.native
}


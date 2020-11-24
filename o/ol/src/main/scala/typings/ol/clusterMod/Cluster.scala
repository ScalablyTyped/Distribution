package typings.ol.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster
  extends typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] {
  
  /* protected */ def cluster(): Unit = js.native
  
  /* protected */ def createCluster(features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
  
  var distance: Double = js.native
  
  var features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
  
  /* protected */ def geometryFunction(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): typings.ol.pointMod.default = js.native
  
  /**
    * Get the distance in pixels between clusters.
    */
  def getDistance(): Double = js.native
  
  /**
    * Get a reference to the wrapped source.
    */
  def getSource(): typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] = js.native
  
  var resolution: Double = js.native
  
  /**
    * Set the distance in pixels between clusters.
    */
  def setDistance(distance: Double): Unit = js.native
  
  /**
    * Replace the wrapped source.
    */
  def setSource(source: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]): Unit = js.native
}

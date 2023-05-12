package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "WorldClusters")
@js.native
open class WorldClusters protected () extends StObject {
  def this(device: Any) = this()
  
  var _cells: Vec3 = js.native
  
  var _cellsDirty: Boolean = js.native
  
  var _cellsLimit: Vec3 = js.native
  
  var _clusterBoundsDeltaData: js.typedarray.Float32Array = js.native
  
  var _clusterBoundsDeltaId: Any = js.native
  
  var _clusterBoundsMinData: js.typedarray.Float32Array = js.native
  
  var _clusterBoundsMinId: Any = js.native
  
  var _clusterCellsCountByBoundsSizeData: js.typedarray.Float32Array = js.native
  
  var _clusterCellsCountByBoundsSizeId: Any = js.native
  
  var _clusterCellsDotData: js.typedarray.Float32Array = js.native
  
  var _clusterCellsDotId: Any = js.native
  
  var _clusterCellsMaxData: js.typedarray.Float32Array = js.native
  
  var _clusterCellsMaxId: Any = js.native
  
  var _clusterCompressionLimit0Data: js.typedarray.Float32Array = js.native
  
  var _clusterCompressionLimit0Id: Any = js.native
  
  var _clusterMaxCellsId: Any = js.native
  
  var _clusterSkipId: Any = js.native
  
  var _clusterTextureSizeData: js.typedarray.Float32Array = js.native
  
  var _clusterTextureSizeId: Any = js.native
  
  var _clusterWorldTextureId: Any = js.native
  
  var _maxAttenuation: Double = js.native
  
  var _maxCellLightCount: Any = js.native
  
  var _maxColorValue: Double = js.native
  
  var _usedLights: js.Array[ClusterLight] = js.native
  
  def activate(): Unit = js.native
  
  var boundsDelta: Vec3 = js.native
  
  var boundsMax: Vec3 = js.native
  
  var boundsMin: Vec3 = js.native
  
  def cells: Vec3 = js.native
  def cells_=(arg: Vec3): Unit = js.native
  
  /** @type {import('../../platform/graphics/texture.js').Texture} */
  var clusterTexture: Texture = js.native
  
  var clusters: js.typedarray.Uint8ClampedArray = js.native
  
  def collectLights(lights: Any): Unit = js.native
  
  var counts: js.typedarray.Int32Array = js.native
  
  def destroy(): Unit = js.native
  
  var device: Any = js.native
  
  def evalLightCellMinMax(clusteredLight: Any, min: Any, max: Any): Unit = js.native
  
  def evaluateBounds(): Unit = js.native
  
  def evaluateCompressionLimits(gammaCorrection: Any): Unit = js.native
  
  var lightsBuffer: LightsBuffer = js.native
  
  def maxCellLightCount: Any = js.native
  def maxCellLightCount_=(arg: Any): Unit = js.native
  
  var name: String = js.native
  
  def registerUniforms(device: Any): Unit = js.native
  
  def releaseClusterTexture(): Unit = js.native
  
  var reportCount: Double = js.native
  
  def update(lights: Any, gammaCorrection: Any, lightingParams: Any): Unit = js.native
  
  def updateCells(): Unit = js.native
  
  def updateClusters(gammaCorrection: Any): Unit = js.native
  
  def updateParams(lightingParams: Any): Unit = js.native
  
  def updateUniforms(): Unit = js.native
  
  def uploadTextures(): Unit = js.native
}

package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "ParticleEmitter")
@js.native
open class ParticleEmitter protected () extends StObject {
  def this(graphicsDevice: Any, options: Any) = this()
  
  var _addTimeTime: Double = js.native
  
  def _allocate(numParticles: Any): Unit = js.native
  
  def _compParticleFaceParams(): Unit = js.native
  
  var _cpuUpdater: ParticleCPUUpdater = js.native
  
  def _destroyResources(): Unit = js.native
  
  var _gpuUpdater: ParticleGPUUpdater = js.native
  
  def _initializeTextures(): Unit = js.native
  
  def _isAnimated(): Any = js.native
  
  var _layer: Any = js.native
  
  def addTime(delta: Any, isOnStop: Any): Unit = js.native
  
  var alphaUMax: js.Array[Double] = js.native
  
  var animIndexParams: js.typedarray.Float32Array = js.native
  
  var animParams: js.typedarray.Float32Array = js.native
  
  var animTilesParams: js.typedarray.Float32Array = js.native
  
  var beenReset: Boolean = js.native
  
  def calculateBoundsMad(): Unit = js.native
  
  def calculateLocalBounds(): Unit = js.native
  
  def calculateWorldBounds(): Unit = js.native
  
  var camera: Any = js.native
  
  var colorMap: Any = js.native
  
  var colorParam: Texture = js.native
  
  var colorUMax: js.typedarray.Float32Array = js.native
  
  var constantLightCube: Any = js.native
  
  def defaultParamTexture: Any = js.native
  
  def destroy(): Unit = js.native
  
  var drawOrder: Double = js.native
  
  var emitterPosUniform: js.typedarray.Float32Array = js.native
  
  var emitterScaleUniform: js.typedarray.Float32Array = js.native
  
  var endTime: Double = js.native
  
  def finishFrame(): Unit = js.native
  
  var fixedTimeStep: Double = js.native
  
  var graphicsDevice: Any = js.native
  
  var indexBuffer: IndexBuffer = js.native
  
  var internalTex0: Texture = js.native
  
  var internalTex1: Texture = js.native
  
  var internalTex2: Texture = js.native
  
  var internalTex3: Texture = js.native
  
  var lightCube: js.typedarray.Float32Array = js.native
  
  var lightCubeDir: js.Array[Any] = js.native
  
  var localBounds: BoundingBox = js.native
  
  var localVelocityUMax: js.typedarray.Float32Array = js.native
  
  var loop: Any = js.native
  
  var material: Material = js.native
  
  var maxSubSteps: Double = js.native
  
  var maxVel: Double = js.native
  
  var meshInstance: MeshInstance = js.native
  
  var normalOption: Double = js.native
  
  var numParticleIndices: Double = js.native
  
  var numParticleVerts: Double = js.native
  
  var numParticles: Any = js.native
  
  var numParticlesPot: Double = js.native
  
  def onChangeCamera(): Unit = js.native
  
  var pack8: Boolean = js.native
  
  var particleDistance: js.typedarray.Float32Array = js.native
  
  var particleTex: js.typedarray.Float32Array = js.native
  
  var particleTexIN: Texture = js.native
  
  var particleTexOUT: Texture = js.native
  
  var particleTexStart: Any = js.native
  
  var precision: Double = js.native
  
  var prevEmitterExtents: Any = js.native
  
  var prevEmitterRadius: Any = js.native
  
  var prevWorldBoundsCenter: Vec3 = js.native
  
  var prevWorldBoundsSize: Vec3 = js.native
  
  def prewarm(time: Any): Unit = js.native
  
  var qAlpha: Any = js.native
  
  var qAlpha2: Any = js.native
  
  var qAlphaDiv: js.typedarray.Float32Array = js.native
  
  var qColor: Any = js.native
  
  var qColor2: Any = js.native
  
  var qColorDiv: js.typedarray.Float32Array = js.native
  
  var qLocalVelocity: Any = js.native
  
  var qLocalVelocity2: Any = js.native
  
  var qLocalVelocityDiv: js.typedarray.Float32Array = js.native
  
  var qRadialSpeed: Any = js.native
  
  var qRadialSpeed2: Any = js.native
  
  var qRadialSpeedDiv: js.typedarray.Float32Array = js.native
  
  var qRotSpeed: Any = js.native
  
  var qRotSpeed2: Any = js.native
  
  var qRotSpeedDiv: js.typedarray.Float32Array = js.native
  
  var qScale: Any = js.native
  
  var qScale2: Any = js.native
  
  var qScaleDiv: js.typedarray.Float32Array = js.native
  
  var qVelocity: Any = js.native
  
  var qVelocity2: Any = js.native
  
  var qVelocityDiv: js.typedarray.Float32Array = js.native
  
  var radialSpeedUMax: js.Array[Double] = js.native
  
  def rebuild(): Unit = js.native
  
  def rebuildGraphs(): Unit = js.native
  
  def regenShader(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resetMaterial(): Unit = js.native
  
  def resetTime(): Unit = js.native
  
  def resetWorldBounds(): Unit = js.native
  
  var rotSpeedUMax: js.Array[Double] = js.native
  
  var rtParticleTexIN: RenderTarget = js.native
  
  var rtParticleTexOUT: RenderTarget = js.native
  
  var scaleUMax: js.Array[Double] = js.native
  
  var seed: Double = js.native
  
  var shaderParticleUpdateNoRespawn: Shader = js.native
  
  var shaderParticleUpdateOnStop: Shader = js.native
  
  var shaderParticleUpdateRespawn: Shader = js.native
  
  var simTime: Double = js.native
  
  var simTimeTotal: Double = js.native
  
  var spawnBounds: Any = js.native
  
  var swapTex: Boolean = js.native
  
  var timeToSwitchBounds: Double = js.native
  
  var useCpu: Boolean = js.native
  
  var useMesh: Boolean = js.native
  
  var vbCPU: js.typedarray.Float32Array = js.native
  
  var vbOld: js.typedarray.Float32Array = js.native
  
  var vbToSort: js.Array[Any] = js.native
  
  var velocityUMax: js.typedarray.Float32Array = js.native
  
  var vertexBuffer: VertexBuffer = js.native
  
  var worldBounds: BoundingBox = js.native
  
  var worldBoundsAdd: Vec3 = js.native
  
  var worldBoundsMul: Vec3 = js.native
  
  var worldBoundsNoTrail: BoundingBox = js.native
  
  var worldBoundsSize: Vec3 = js.native
  
  var worldBoundsTrail: js.Array[BoundingBox] = js.native
  
  var wrapBoundsUniform: js.typedarray.Float32Array = js.native
}

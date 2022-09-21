package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleGPUUpdater extends StObject {
  
  var _emitter: Any
  
  def _setInputBounds(): Unit
  
  var constantDelta: Any
  
  var constantEmitterMatrix: Any
  
  var constantEmitterMatrixInv: Any
  
  var constantEmitterPos: Any
  
  var constantEmitterScale: Any
  
  var constantFaceBinorm: Any
  
  var constantFaceTangent: Any
  
  var constantFrameRandom: Any
  
  var constantGraphNumSamples: Any
  
  var constantGraphSampleSize: Any
  
  var constantInBoundsCenter: Any
  
  var constantInBoundsSize: Any
  
  var constantInitialVelocity: Any
  
  var constantInternalTex0: Any
  
  var constantInternalTex1: Any
  
  var constantInternalTex2: Any
  
  var constantInternalTex3: Any
  
  var constantLifetime: Any
  
  var constantLocalVelocityDivMult: Any
  
  var constantMaxVel: Any
  
  var constantNumParticles: Any
  
  var constantNumParticlesPot: Any
  
  var constantOutBoundsAdd: Any
  
  var constantOutBoundsMul: Any
  
  var constantParticleTexIN: Any
  
  var constantParticleTexOUT: Any
  
  var constantRate: Any
  
  var constantRateDiv: Any
  
  var constantRotSpeedDivMult: Any
  
  var constantSeed: Any
  
  var constantSpawnBounds: Any
  
  var constantSpawnBoundsSphere: Any
  
  var constantSpawnBoundsSphereInnerRatio: Any
  
  var constantSpawnPosInnerRatio: Any
  
  var constantStartAngle: Any
  
  var constantStartAngle2: Any
  
  var constantVelocityDivMult: Any
  
  var emitterPosUniform: js.typedarray.Float32Array
  
  var emitterScaleUniform: js.typedarray.Float32Array
  
  var frameRandomUniform: js.typedarray.Float32Array
  
  var inBoundsCenterUniform: js.typedarray.Float32Array
  
  var inBoundsSizeUniform: js.typedarray.Float32Array
  
  def randomize(): Unit
  
  def update(device: Any, spawnMatrix: Any, extentsInnerRatioUniform: Any, delta: Any, isOnStop: Any): Unit
  
  var worldBoundsAddUniform: js.typedarray.Float32Array
  
  var worldBoundsMulUniform: js.typedarray.Float32Array
}
object ParticleGPUUpdater {
  
  inline def apply(
    _emitter: Any,
    _setInputBounds: () => Unit,
    constantDelta: Any,
    constantEmitterMatrix: Any,
    constantEmitterMatrixInv: Any,
    constantEmitterPos: Any,
    constantEmitterScale: Any,
    constantFaceBinorm: Any,
    constantFaceTangent: Any,
    constantFrameRandom: Any,
    constantGraphNumSamples: Any,
    constantGraphSampleSize: Any,
    constantInBoundsCenter: Any,
    constantInBoundsSize: Any,
    constantInitialVelocity: Any,
    constantInternalTex0: Any,
    constantInternalTex1: Any,
    constantInternalTex2: Any,
    constantInternalTex3: Any,
    constantLifetime: Any,
    constantLocalVelocityDivMult: Any,
    constantMaxVel: Any,
    constantNumParticles: Any,
    constantNumParticlesPot: Any,
    constantOutBoundsAdd: Any,
    constantOutBoundsMul: Any,
    constantParticleTexIN: Any,
    constantParticleTexOUT: Any,
    constantRate: Any,
    constantRateDiv: Any,
    constantRotSpeedDivMult: Any,
    constantSeed: Any,
    constantSpawnBounds: Any,
    constantSpawnBoundsSphere: Any,
    constantSpawnBoundsSphereInnerRatio: Any,
    constantSpawnPosInnerRatio: Any,
    constantStartAngle: Any,
    constantStartAngle2: Any,
    constantVelocityDivMult: Any,
    emitterPosUniform: js.typedarray.Float32Array,
    emitterScaleUniform: js.typedarray.Float32Array,
    frameRandomUniform: js.typedarray.Float32Array,
    inBoundsCenterUniform: js.typedarray.Float32Array,
    inBoundsSizeUniform: js.typedarray.Float32Array,
    randomize: () => Unit,
    update: (Any, Any, Any, Any, Any) => Unit,
    worldBoundsAddUniform: js.typedarray.Float32Array,
    worldBoundsMulUniform: js.typedarray.Float32Array
  ): ParticleGPUUpdater = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], _setInputBounds = js.Any.fromFunction0(_setInputBounds), constantDelta = constantDelta.asInstanceOf[js.Any], constantEmitterMatrix = constantEmitterMatrix.asInstanceOf[js.Any], constantEmitterMatrixInv = constantEmitterMatrixInv.asInstanceOf[js.Any], constantEmitterPos = constantEmitterPos.asInstanceOf[js.Any], constantEmitterScale = constantEmitterScale.asInstanceOf[js.Any], constantFaceBinorm = constantFaceBinorm.asInstanceOf[js.Any], constantFaceTangent = constantFaceTangent.asInstanceOf[js.Any], constantFrameRandom = constantFrameRandom.asInstanceOf[js.Any], constantGraphNumSamples = constantGraphNumSamples.asInstanceOf[js.Any], constantGraphSampleSize = constantGraphSampleSize.asInstanceOf[js.Any], constantInBoundsCenter = constantInBoundsCenter.asInstanceOf[js.Any], constantInBoundsSize = constantInBoundsSize.asInstanceOf[js.Any], constantInitialVelocity = constantInitialVelocity.asInstanceOf[js.Any], constantInternalTex0 = constantInternalTex0.asInstanceOf[js.Any], constantInternalTex1 = constantInternalTex1.asInstanceOf[js.Any], constantInternalTex2 = constantInternalTex2.asInstanceOf[js.Any], constantInternalTex3 = constantInternalTex3.asInstanceOf[js.Any], constantLifetime = constantLifetime.asInstanceOf[js.Any], constantLocalVelocityDivMult = constantLocalVelocityDivMult.asInstanceOf[js.Any], constantMaxVel = constantMaxVel.asInstanceOf[js.Any], constantNumParticles = constantNumParticles.asInstanceOf[js.Any], constantNumParticlesPot = constantNumParticlesPot.asInstanceOf[js.Any], constantOutBoundsAdd = constantOutBoundsAdd.asInstanceOf[js.Any], constantOutBoundsMul = constantOutBoundsMul.asInstanceOf[js.Any], constantParticleTexIN = constantParticleTexIN.asInstanceOf[js.Any], constantParticleTexOUT = constantParticleTexOUT.asInstanceOf[js.Any], constantRate = constantRate.asInstanceOf[js.Any], constantRateDiv = constantRateDiv.asInstanceOf[js.Any], constantRotSpeedDivMult = constantRotSpeedDivMult.asInstanceOf[js.Any], constantSeed = constantSeed.asInstanceOf[js.Any], constantSpawnBounds = constantSpawnBounds.asInstanceOf[js.Any], constantSpawnBoundsSphere = constantSpawnBoundsSphere.asInstanceOf[js.Any], constantSpawnBoundsSphereInnerRatio = constantSpawnBoundsSphereInnerRatio.asInstanceOf[js.Any], constantSpawnPosInnerRatio = constantSpawnPosInnerRatio.asInstanceOf[js.Any], constantStartAngle = constantStartAngle.asInstanceOf[js.Any], constantStartAngle2 = constantStartAngle2.asInstanceOf[js.Any], constantVelocityDivMult = constantVelocityDivMult.asInstanceOf[js.Any], emitterPosUniform = emitterPosUniform.asInstanceOf[js.Any], emitterScaleUniform = emitterScaleUniform.asInstanceOf[js.Any], frameRandomUniform = frameRandomUniform.asInstanceOf[js.Any], inBoundsCenterUniform = inBoundsCenterUniform.asInstanceOf[js.Any], inBoundsSizeUniform = inBoundsSizeUniform.asInstanceOf[js.Any], randomize = js.Any.fromFunction0(randomize), update = js.Any.fromFunction5(update), worldBoundsAddUniform = worldBoundsAddUniform.asInstanceOf[js.Any], worldBoundsMulUniform = worldBoundsMulUniform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleGPUUpdater]
  }
  
  extension [Self <: ParticleGPUUpdater](x: Self) {
    
    inline def setConstantDelta(value: Any): Self = StObject.set(x, "constantDelta", value.asInstanceOf[js.Any])
    
    inline def setConstantEmitterMatrix(value: Any): Self = StObject.set(x, "constantEmitterMatrix", value.asInstanceOf[js.Any])
    
    inline def setConstantEmitterMatrixInv(value: Any): Self = StObject.set(x, "constantEmitterMatrixInv", value.asInstanceOf[js.Any])
    
    inline def setConstantEmitterPos(value: Any): Self = StObject.set(x, "constantEmitterPos", value.asInstanceOf[js.Any])
    
    inline def setConstantEmitterScale(value: Any): Self = StObject.set(x, "constantEmitterScale", value.asInstanceOf[js.Any])
    
    inline def setConstantFaceBinorm(value: Any): Self = StObject.set(x, "constantFaceBinorm", value.asInstanceOf[js.Any])
    
    inline def setConstantFaceTangent(value: Any): Self = StObject.set(x, "constantFaceTangent", value.asInstanceOf[js.Any])
    
    inline def setConstantFrameRandom(value: Any): Self = StObject.set(x, "constantFrameRandom", value.asInstanceOf[js.Any])
    
    inline def setConstantGraphNumSamples(value: Any): Self = StObject.set(x, "constantGraphNumSamples", value.asInstanceOf[js.Any])
    
    inline def setConstantGraphSampleSize(value: Any): Self = StObject.set(x, "constantGraphSampleSize", value.asInstanceOf[js.Any])
    
    inline def setConstantInBoundsCenter(value: Any): Self = StObject.set(x, "constantInBoundsCenter", value.asInstanceOf[js.Any])
    
    inline def setConstantInBoundsSize(value: Any): Self = StObject.set(x, "constantInBoundsSize", value.asInstanceOf[js.Any])
    
    inline def setConstantInitialVelocity(value: Any): Self = StObject.set(x, "constantInitialVelocity", value.asInstanceOf[js.Any])
    
    inline def setConstantInternalTex0(value: Any): Self = StObject.set(x, "constantInternalTex0", value.asInstanceOf[js.Any])
    
    inline def setConstantInternalTex1(value: Any): Self = StObject.set(x, "constantInternalTex1", value.asInstanceOf[js.Any])
    
    inline def setConstantInternalTex2(value: Any): Self = StObject.set(x, "constantInternalTex2", value.asInstanceOf[js.Any])
    
    inline def setConstantInternalTex3(value: Any): Self = StObject.set(x, "constantInternalTex3", value.asInstanceOf[js.Any])
    
    inline def setConstantLifetime(value: Any): Self = StObject.set(x, "constantLifetime", value.asInstanceOf[js.Any])
    
    inline def setConstantLocalVelocityDivMult(value: Any): Self = StObject.set(x, "constantLocalVelocityDivMult", value.asInstanceOf[js.Any])
    
    inline def setConstantMaxVel(value: Any): Self = StObject.set(x, "constantMaxVel", value.asInstanceOf[js.Any])
    
    inline def setConstantNumParticles(value: Any): Self = StObject.set(x, "constantNumParticles", value.asInstanceOf[js.Any])
    
    inline def setConstantNumParticlesPot(value: Any): Self = StObject.set(x, "constantNumParticlesPot", value.asInstanceOf[js.Any])
    
    inline def setConstantOutBoundsAdd(value: Any): Self = StObject.set(x, "constantOutBoundsAdd", value.asInstanceOf[js.Any])
    
    inline def setConstantOutBoundsMul(value: Any): Self = StObject.set(x, "constantOutBoundsMul", value.asInstanceOf[js.Any])
    
    inline def setConstantParticleTexIN(value: Any): Self = StObject.set(x, "constantParticleTexIN", value.asInstanceOf[js.Any])
    
    inline def setConstantParticleTexOUT(value: Any): Self = StObject.set(x, "constantParticleTexOUT", value.asInstanceOf[js.Any])
    
    inline def setConstantRate(value: Any): Self = StObject.set(x, "constantRate", value.asInstanceOf[js.Any])
    
    inline def setConstantRateDiv(value: Any): Self = StObject.set(x, "constantRateDiv", value.asInstanceOf[js.Any])
    
    inline def setConstantRotSpeedDivMult(value: Any): Self = StObject.set(x, "constantRotSpeedDivMult", value.asInstanceOf[js.Any])
    
    inline def setConstantSeed(value: Any): Self = StObject.set(x, "constantSeed", value.asInstanceOf[js.Any])
    
    inline def setConstantSpawnBounds(value: Any): Self = StObject.set(x, "constantSpawnBounds", value.asInstanceOf[js.Any])
    
    inline def setConstantSpawnBoundsSphere(value: Any): Self = StObject.set(x, "constantSpawnBoundsSphere", value.asInstanceOf[js.Any])
    
    inline def setConstantSpawnBoundsSphereInnerRatio(value: Any): Self = StObject.set(x, "constantSpawnBoundsSphereInnerRatio", value.asInstanceOf[js.Any])
    
    inline def setConstantSpawnPosInnerRatio(value: Any): Self = StObject.set(x, "constantSpawnPosInnerRatio", value.asInstanceOf[js.Any])
    
    inline def setConstantStartAngle(value: Any): Self = StObject.set(x, "constantStartAngle", value.asInstanceOf[js.Any])
    
    inline def setConstantStartAngle2(value: Any): Self = StObject.set(x, "constantStartAngle2", value.asInstanceOf[js.Any])
    
    inline def setConstantVelocityDivMult(value: Any): Self = StObject.set(x, "constantVelocityDivMult", value.asInstanceOf[js.Any])
    
    inline def setEmitterPosUniform(value: js.typedarray.Float32Array): Self = StObject.set(x, "emitterPosUniform", value.asInstanceOf[js.Any])
    
    inline def setEmitterScaleUniform(value: js.typedarray.Float32Array): Self = StObject.set(x, "emitterScaleUniform", value.asInstanceOf[js.Any])
    
    inline def setFrameRandomUniform(value: js.typedarray.Float32Array): Self = StObject.set(x, "frameRandomUniform", value.asInstanceOf[js.Any])
    
    inline def setInBoundsCenterUniform(value: js.typedarray.Float32Array): Self = StObject.set(x, "inBoundsCenterUniform", value.asInstanceOf[js.Any])
    
    inline def setInBoundsSizeUniform(value: js.typedarray.Float32Array): Self = StObject.set(x, "inBoundsSizeUniform", value.asInstanceOf[js.Any])
    
    inline def setRandomize(value: () => Unit): Self = StObject.set(x, "randomize", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: (Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction5(value))
    
    inline def setWorldBoundsAddUniform(value: js.typedarray.Float32Array): Self = StObject.set(x, "worldBoundsAddUniform", value.asInstanceOf[js.Any])
    
    inline def setWorldBoundsMulUniform(value: js.typedarray.Float32Array): Self = StObject.set(x, "worldBoundsMulUniform", value.asInstanceOf[js.Any])
    
    inline def set_emitter(value: Any): Self = StObject.set(x, "_emitter", value.asInstanceOf[js.Any])
    
    inline def set_setInputBounds(value: () => Unit): Self = StObject.set(x, "_setInputBounds", js.Any.fromFunction0(value))
  }
}

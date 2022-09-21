package typings.playcanvas.mod

import typings.playcanvas.anon.Bias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A light.
  *
  * @ignore
  */
@JSImport("playcanvas", "Light")
@js.native
open class Light protected () extends StObject {
  def this(graphicsDevice: Any) = this()
  
  var _atlasViewport: Vec4 = js.native
  
  var _castShadows: Boolean = js.native
  
  var _color: Color = js.native
  
  var _cookie: Any = js.native
  
  var _cookieChannel: String = js.native
  
  var _cookieFalloff: Boolean = js.native
  
  var _cookieMatrix: Mat4 = js.native
  
  var _cookieOffset: Any = js.native
  
  var _cookieOffsetSet: Boolean = js.native
  
  var _cookieOffsetUniform: js.typedarray.Float32Array = js.native
  
  var _cookieTransform: Any = js.native
  
  var _cookieTransformSet: Boolean = js.native
  
  var _cookieTransformUniform: js.typedarray.Float32Array = js.native
  
  def _destroyShadowMap(): Unit = js.native
  
  var _direction: Vec3 = js.native
  
  var _enabled: Boolean = js.native
  
  var _falloffMode: Double = js.native
  
  var _finalColor: js.typedarray.Float32Array = js.native
  
  def _getUniformBiasValues(lightRenderData: Any): Bias = js.native
  
  var _innerConeAngle: Double = js.native
  
  var _innerConeAngleCos: Double = js.native
  
  var _intensity: Double = js.native
  
  var _isPcf: Boolean = js.native
  
  var _isVsm: Boolean = js.native
  
  var _linearFinalColor: js.typedarray.Float32Array = js.native
  
  var _node: Any = js.native
  
  var _normalOffsetBias: Double = js.native
  
  var _outerConeAngle: Double = js.native
  
  var _outerConeAngleCos: Double = js.native
  
  var _position: Vec3 = js.native
  
  var _renderData: js.Array[Any] = js.native
  
  var _scene: Any = js.native
  
  var _shadowCascadeDistances: js.typedarray.Float32Array = js.native
  
  var _shadowMap: Any = js.native
  
  var _shadowMatrixPalette: js.typedarray.Float32Array = js.native
  
  var _shadowRenderParams: js.Array[Any] = js.native
  
  var _shadowResolution: Double = js.native
  
  var _shadowType: Double = js.native
  
  var _shape: Double = js.native
  
  var _type: Double = js.native
  
  def _updateFinalColor(): Unit = js.native
  
  var _vsmBlurSize: Double = js.native
  
  var atlasSlotIndex: Double = js.native
  
  var atlasSlotUpdated: Boolean = js.native
  
  var atlasVersion: Double = js.native
  
  def atlasViewport: Vec4 = js.native
  
  var atlasViewportAllocated: Boolean = js.native
  
  var attenuationEnd: Double = js.native
  
  var attenuationStart: Double = js.native
  
  var bakeArea: Double = js.native
  
  var bakeDir: Boolean = js.native
  
  var bakeNumSamples: Double = js.native
  
  def beginFrame(): Unit = js.native
  
  var cascadeDistribution: Double = js.native
  
  var cascades: Any = js.native
  
  def castShadows: Boolean = js.native
  def castShadows_=(arg: Boolean): Unit = js.native
  
  def cookie: Any = js.native
  
  def cookieChannel: String = js.native
  def cookieChannel_=(arg: String): Unit = js.native
  
  def cookieFalloff: Boolean = js.native
  def cookieFalloff_=(arg: Boolean): Unit = js.native
  
  var cookieIntensity: Double = js.native
  
  def cookieMatrix: Mat4 = js.native
  
  def cookieOffset: Any = js.native
  def cookieOffset_=(arg: Any): Unit = js.native
  
  def cookieTransform: Any = js.native
  def cookieTransform_=(arg: Any): Unit = js.native
  
  def cookie_=(arg: Any): Unit = js.native
  
  def destroy(): Unit = js.native
  
  var device: Any = js.native
  
  def enabled: Boolean = js.native
  def enabled_=(arg: Boolean): Unit = js.native
  
  def falloffMode: Double = js.native
  def falloffMode_=(arg: Double): Unit = js.native
  
  def getBoundingBox(box: Any): Unit = js.native
  
  def getBoundingSphere(sphere: Any): Unit = js.native
  
  def getColor(): Color = js.native
  
  def getRenderData(camera: Any, face: Any): Any = js.native
  
  var id: Double = js.native
  
  def innerConeAngle: Double = js.native
  def innerConeAngle_=(arg: Double): Unit = js.native
  
  def intensity: Double = js.native
  def intensity_=(arg: Double): Unit = js.native
  
  var isStatic: Boolean = js.native
  
  var key: Double = js.native
  
  def layersDirty(): Unit = js.native
  
  var mask: Double = js.native
  
  var maxScreenSize: Double = js.native
  
  def normalOffsetBias: Double = js.native
  def normalOffsetBias_=(arg: Double): Unit = js.native
  
  def numCascades: Any = js.native
  def numCascades_=(arg: Any): Unit = js.native
  
  def numShadowFaces: Any = js.native
  
  def outerConeAngle: Double = js.native
  def outerConeAngle_=(arg: Double): Unit = js.native
  
  def setColor(args: Any*): Unit = js.native
  
  var shadowBias: Double = js.native
  
  var shadowDistance: Double = js.native
  
  var shadowIntensity: Double = js.native
  
  def shadowMap: Any = js.native
  def shadowMap_=(arg: Any): Unit = js.native
  
  def shadowResolution: Double = js.native
  def shadowResolution_=(arg: Double): Unit = js.native
  
  def shadowType: Double = js.native
  def shadowType_=(arg: Double): Unit = js.native
  
  var shadowUpdateMode: Double = js.native
  
  def shape: Double = js.native
  def shape_=(arg: Double): Unit = js.native
  
  def `type`: Double = js.native
  def type_=(arg: Double): Unit = js.native
  
  def updateKey(): Unit = js.native
  
  def updateShadow(): Unit = js.native
  
  var visibleThisFrame: Boolean = js.native
  
  var vsmBias: Double = js.native
  
  var vsmBlurMode: Double = js.native
  
  def vsmBlurSize: Double = js.native
  def vsmBlurSize_=(arg: Double): Unit = js.native
}

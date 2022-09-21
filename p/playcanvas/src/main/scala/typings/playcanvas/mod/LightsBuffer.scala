package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightsBuffer extends StObject {
  
  var _lightsTexture8Id: Any
  
  var _lightsTextureFloatId: Any
  
  var _lightsTextureInvSizeData: js.typedarray.Float32Array
  
  var _lightsTextureInvSizeId: Any
  
  def addLightAreaSizes(data8: Any, index: Any, light: Any): Unit
  
  def addLightAtlasViewport(data8: Any, index: Any, atlasViewport: Any): Unit
  
  def addLightData(light: Any, lightIndex: Any, gammaCorrection: Any): Unit
  
  def addLightDataColor(data8: Any, index: Any, light: Any, gammaCorrection: Any, isCookie: Any): Unit
  
  def addLightDataCookies(data8: Any, index: Any, light: Any): Unit
  
  def addLightDataFlags(data8: Any, index: Any, light: Any, isSpot: Any, castShadows: Any, shadowIntensity: Any): Unit
  
  def addLightDataLightProjMatrix(data8: Any, index: Any, lightProjectionMatrix: Any): Unit
  
  def addLightDataPositionRange(data8: Any, index: Any, light: Any, pos: Any): Unit
  
  def addLightDataShadowBias(data8: Any, index: Any, light: Any): Unit
  
  def addLightDataSpotAngles(data8: Any, index: Any, light: Any): Unit
  
  def addLightDataSpotDirection(data8: Any, index: Any, light: Any): Unit
  
  var areaLightsEnabled: Boolean
  
  var boundsDelta: Vec3
  
  var boundsMin: Vec3
  
  var cookiesEnabled: Boolean
  
  def destroy(): Unit
  
  var device: Any
  
  def getLightAreaSizes(light: Any): js.typedarray.Float32Array
  
  def getSpotDirection(direction: Any, spot: Any): Unit
  
  var invMaxAttenuation: Double
  
  var invMaxColorValue: Double
  
  var lights8: js.typedarray.Uint8ClampedArray
  
  var lightsFloat: js.typedarray.Float32Array
  
  var lightsTexture8: Texture
  
  var lightsTextureFloat: Texture
  
  var maxLights: Double
  
  def setBounds(min: Any, delta: Any): Unit
  
  def setCompressionRanges(maxAttenuation: Any, maxColorValue: Any): Unit
  
  var shadowsEnabled: Boolean
  
  def updateUniforms(): Unit
  
  def uploadTextures(): Unit
}
object LightsBuffer {
  
  inline def apply(
    _lightsTexture8Id: Any,
    _lightsTextureFloatId: Any,
    _lightsTextureInvSizeData: js.typedarray.Float32Array,
    _lightsTextureInvSizeId: Any,
    addLightAreaSizes: (Any, Any, Any) => Unit,
    addLightAtlasViewport: (Any, Any, Any) => Unit,
    addLightData: (Any, Any, Any) => Unit,
    addLightDataColor: (Any, Any, Any, Any, Any) => Unit,
    addLightDataCookies: (Any, Any, Any) => Unit,
    addLightDataFlags: (Any, Any, Any, Any, Any, Any) => Unit,
    addLightDataLightProjMatrix: (Any, Any, Any) => Unit,
    addLightDataPositionRange: (Any, Any, Any, Any) => Unit,
    addLightDataShadowBias: (Any, Any, Any) => Unit,
    addLightDataSpotAngles: (Any, Any, Any) => Unit,
    addLightDataSpotDirection: (Any, Any, Any) => Unit,
    areaLightsEnabled: Boolean,
    boundsDelta: Vec3,
    boundsMin: Vec3,
    cookiesEnabled: Boolean,
    destroy: () => Unit,
    device: Any,
    getLightAreaSizes: Any => js.typedarray.Float32Array,
    getSpotDirection: (Any, Any) => Unit,
    invMaxAttenuation: Double,
    invMaxColorValue: Double,
    lights8: js.typedarray.Uint8ClampedArray,
    lightsFloat: js.typedarray.Float32Array,
    lightsTexture8: Texture,
    lightsTextureFloat: Texture,
    maxLights: Double,
    setBounds: (Any, Any) => Unit,
    setCompressionRanges: (Any, Any) => Unit,
    shadowsEnabled: Boolean,
    updateUniforms: () => Unit,
    uploadTextures: () => Unit
  ): LightsBuffer = {
    val __obj = js.Dynamic.literal(_lightsTexture8Id = _lightsTexture8Id.asInstanceOf[js.Any], _lightsTextureFloatId = _lightsTextureFloatId.asInstanceOf[js.Any], _lightsTextureInvSizeData = _lightsTextureInvSizeData.asInstanceOf[js.Any], _lightsTextureInvSizeId = _lightsTextureInvSizeId.asInstanceOf[js.Any], addLightAreaSizes = js.Any.fromFunction3(addLightAreaSizes), addLightAtlasViewport = js.Any.fromFunction3(addLightAtlasViewport), addLightData = js.Any.fromFunction3(addLightData), addLightDataColor = js.Any.fromFunction5(addLightDataColor), addLightDataCookies = js.Any.fromFunction3(addLightDataCookies), addLightDataFlags = js.Any.fromFunction6(addLightDataFlags), addLightDataLightProjMatrix = js.Any.fromFunction3(addLightDataLightProjMatrix), addLightDataPositionRange = js.Any.fromFunction4(addLightDataPositionRange), addLightDataShadowBias = js.Any.fromFunction3(addLightDataShadowBias), addLightDataSpotAngles = js.Any.fromFunction3(addLightDataSpotAngles), addLightDataSpotDirection = js.Any.fromFunction3(addLightDataSpotDirection), areaLightsEnabled = areaLightsEnabled.asInstanceOf[js.Any], boundsDelta = boundsDelta.asInstanceOf[js.Any], boundsMin = boundsMin.asInstanceOf[js.Any], cookiesEnabled = cookiesEnabled.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), device = device.asInstanceOf[js.Any], getLightAreaSizes = js.Any.fromFunction1(getLightAreaSizes), getSpotDirection = js.Any.fromFunction2(getSpotDirection), invMaxAttenuation = invMaxAttenuation.asInstanceOf[js.Any], invMaxColorValue = invMaxColorValue.asInstanceOf[js.Any], lights8 = lights8.asInstanceOf[js.Any], lightsFloat = lightsFloat.asInstanceOf[js.Any], lightsTexture8 = lightsTexture8.asInstanceOf[js.Any], lightsTextureFloat = lightsTextureFloat.asInstanceOf[js.Any], maxLights = maxLights.asInstanceOf[js.Any], setBounds = js.Any.fromFunction2(setBounds), setCompressionRanges = js.Any.fromFunction2(setCompressionRanges), shadowsEnabled = shadowsEnabled.asInstanceOf[js.Any], updateUniforms = js.Any.fromFunction0(updateUniforms), uploadTextures = js.Any.fromFunction0(uploadTextures))
    __obj.asInstanceOf[LightsBuffer]
  }
  
  extension [Self <: LightsBuffer](x: Self) {
    
    inline def setAddLightAreaSizes(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addLightAreaSizes", js.Any.fromFunction3(value))
    
    inline def setAddLightAtlasViewport(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addLightAtlasViewport", js.Any.fromFunction3(value))
    
    inline def setAddLightData(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addLightData", js.Any.fromFunction3(value))
    
    inline def setAddLightDataColor(value: (Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "addLightDataColor", js.Any.fromFunction5(value))
    
    inline def setAddLightDataCookies(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addLightDataCookies", js.Any.fromFunction3(value))
    
    inline def setAddLightDataFlags(value: (Any, Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "addLightDataFlags", js.Any.fromFunction6(value))
    
    inline def setAddLightDataLightProjMatrix(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addLightDataLightProjMatrix", js.Any.fromFunction3(value))
    
    inline def setAddLightDataPositionRange(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "addLightDataPositionRange", js.Any.fromFunction4(value))
    
    inline def setAddLightDataShadowBias(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addLightDataShadowBias", js.Any.fromFunction3(value))
    
    inline def setAddLightDataSpotAngles(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addLightDataSpotAngles", js.Any.fromFunction3(value))
    
    inline def setAddLightDataSpotDirection(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addLightDataSpotDirection", js.Any.fromFunction3(value))
    
    inline def setAreaLightsEnabled(value: Boolean): Self = StObject.set(x, "areaLightsEnabled", value.asInstanceOf[js.Any])
    
    inline def setBoundsDelta(value: Vec3): Self = StObject.set(x, "boundsDelta", value.asInstanceOf[js.Any])
    
    inline def setBoundsMin(value: Vec3): Self = StObject.set(x, "boundsMin", value.asInstanceOf[js.Any])
    
    inline def setCookiesEnabled(value: Boolean): Self = StObject.set(x, "cookiesEnabled", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDevice(value: Any): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGetLightAreaSizes(value: Any => js.typedarray.Float32Array): Self = StObject.set(x, "getLightAreaSizes", js.Any.fromFunction1(value))
    
    inline def setGetSpotDirection(value: (Any, Any) => Unit): Self = StObject.set(x, "getSpotDirection", js.Any.fromFunction2(value))
    
    inline def setInvMaxAttenuation(value: Double): Self = StObject.set(x, "invMaxAttenuation", value.asInstanceOf[js.Any])
    
    inline def setInvMaxColorValue(value: Double): Self = StObject.set(x, "invMaxColorValue", value.asInstanceOf[js.Any])
    
    inline def setLights8(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "lights8", value.asInstanceOf[js.Any])
    
    inline def setLightsFloat(value: js.typedarray.Float32Array): Self = StObject.set(x, "lightsFloat", value.asInstanceOf[js.Any])
    
    inline def setLightsTexture8(value: Texture): Self = StObject.set(x, "lightsTexture8", value.asInstanceOf[js.Any])
    
    inline def setLightsTextureFloat(value: Texture): Self = StObject.set(x, "lightsTextureFloat", value.asInstanceOf[js.Any])
    
    inline def setMaxLights(value: Double): Self = StObject.set(x, "maxLights", value.asInstanceOf[js.Any])
    
    inline def setSetBounds(value: (Any, Any) => Unit): Self = StObject.set(x, "setBounds", js.Any.fromFunction2(value))
    
    inline def setSetCompressionRanges(value: (Any, Any) => Unit): Self = StObject.set(x, "setCompressionRanges", js.Any.fromFunction2(value))
    
    inline def setShadowsEnabled(value: Boolean): Self = StObject.set(x, "shadowsEnabled", value.asInstanceOf[js.Any])
    
    inline def setUpdateUniforms(value: () => Unit): Self = StObject.set(x, "updateUniforms", js.Any.fromFunction0(value))
    
    inline def setUploadTextures(value: () => Unit): Self = StObject.set(x, "uploadTextures", js.Any.fromFunction0(value))
    
    inline def set_lightsTexture8Id(value: Any): Self = StObject.set(x, "_lightsTexture8Id", value.asInstanceOf[js.Any])
    
    inline def set_lightsTextureFloatId(value: Any): Self = StObject.set(x, "_lightsTextureFloatId", value.asInstanceOf[js.Any])
    
    inline def set_lightsTextureInvSizeData(value: js.typedarray.Float32Array): Self = StObject.set(x, "_lightsTextureInvSizeData", value.asInstanceOf[js.Any])
    
    inline def set_lightsTextureInvSizeId(value: Any): Self = StObject.set(x, "_lightsTextureInvSizeId", value.asInstanceOf[js.Any])
  }
}

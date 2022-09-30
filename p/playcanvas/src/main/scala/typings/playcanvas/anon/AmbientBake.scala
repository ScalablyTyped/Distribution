package typings.playcanvas.anon

import typings.playcanvas.mod.Vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmbientBake extends StObject {
  
  var ambientBake: Boolean
  
  var ambientBakeNumSamples: Double
  
  var ambientBakeOcclusionBrightness: Double
  
  var ambientBakeOcclusionContrast: Double
  
  var ambientBakeSpherePart: Double
  
  var ambientLuminance: Double
  
  var clusteredLightingEnabled: Boolean
  
  var exposure: Double
  
  var fog: String
  
  var fog_color: js.Array[Double]
  
  var fog_density: Double
  
  var fog_end: Double
  
  var fog_start: Double
  
  var gamma_correction: Double
  
  var global_ambient: js.Array[Double]
  
  var lightingAreaLightsEnabled: Boolean
  
  var lightingCells: Vec3
  
  var lightingCookieAtlasResolution: Double
  
  var lightingCookiesEnabled: Boolean
  
  var lightingMaxLightsPerCell: Double
  
  var lightingShadowAtlasResolution: Double
  
  var lightingShadowType: Double
  
  var lightingShadowsEnabled: Boolean
  
  var lightmapMaxResolution: Double
  
  var lightmapMode: Double
  
  var lightmapSizeMultiplier: Double
  
  var skybox: js.UndefOr[Double | Null] = js.undefined
  
  var skyboxIntensity: Double
  
  var skyboxLuminance: Double
  
  var skyboxMip: Double
  
  var skyboxRotation: js.Array[Double]
  
  var tonemapping: Double
}
object AmbientBake {
  
  inline def apply(
    ambientBake: Boolean,
    ambientBakeNumSamples: Double,
    ambientBakeOcclusionBrightness: Double,
    ambientBakeOcclusionContrast: Double,
    ambientBakeSpherePart: Double,
    ambientLuminance: Double,
    clusteredLightingEnabled: Boolean,
    exposure: Double,
    fog: String,
    fog_color: js.Array[Double],
    fog_density: Double,
    fog_end: Double,
    fog_start: Double,
    gamma_correction: Double,
    global_ambient: js.Array[Double],
    lightingAreaLightsEnabled: Boolean,
    lightingCells: Vec3,
    lightingCookieAtlasResolution: Double,
    lightingCookiesEnabled: Boolean,
    lightingMaxLightsPerCell: Double,
    lightingShadowAtlasResolution: Double,
    lightingShadowType: Double,
    lightingShadowsEnabled: Boolean,
    lightmapMaxResolution: Double,
    lightmapMode: Double,
    lightmapSizeMultiplier: Double,
    skyboxIntensity: Double,
    skyboxLuminance: Double,
    skyboxMip: Double,
    skyboxRotation: js.Array[Double],
    tonemapping: Double
  ): AmbientBake = {
    val __obj = js.Dynamic.literal(ambientBake = ambientBake.asInstanceOf[js.Any], ambientBakeNumSamples = ambientBakeNumSamples.asInstanceOf[js.Any], ambientBakeOcclusionBrightness = ambientBakeOcclusionBrightness.asInstanceOf[js.Any], ambientBakeOcclusionContrast = ambientBakeOcclusionContrast.asInstanceOf[js.Any], ambientBakeSpherePart = ambientBakeSpherePart.asInstanceOf[js.Any], ambientLuminance = ambientLuminance.asInstanceOf[js.Any], clusteredLightingEnabled = clusteredLightingEnabled.asInstanceOf[js.Any], exposure = exposure.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], fog_color = fog_color.asInstanceOf[js.Any], fog_density = fog_density.asInstanceOf[js.Any], fog_end = fog_end.asInstanceOf[js.Any], fog_start = fog_start.asInstanceOf[js.Any], gamma_correction = gamma_correction.asInstanceOf[js.Any], global_ambient = global_ambient.asInstanceOf[js.Any], lightingAreaLightsEnabled = lightingAreaLightsEnabled.asInstanceOf[js.Any], lightingCells = lightingCells.asInstanceOf[js.Any], lightingCookieAtlasResolution = lightingCookieAtlasResolution.asInstanceOf[js.Any], lightingCookiesEnabled = lightingCookiesEnabled.asInstanceOf[js.Any], lightingMaxLightsPerCell = lightingMaxLightsPerCell.asInstanceOf[js.Any], lightingShadowAtlasResolution = lightingShadowAtlasResolution.asInstanceOf[js.Any], lightingShadowType = lightingShadowType.asInstanceOf[js.Any], lightingShadowsEnabled = lightingShadowsEnabled.asInstanceOf[js.Any], lightmapMaxResolution = lightmapMaxResolution.asInstanceOf[js.Any], lightmapMode = lightmapMode.asInstanceOf[js.Any], lightmapSizeMultiplier = lightmapSizeMultiplier.asInstanceOf[js.Any], skyboxIntensity = skyboxIntensity.asInstanceOf[js.Any], skyboxLuminance = skyboxLuminance.asInstanceOf[js.Any], skyboxMip = skyboxMip.asInstanceOf[js.Any], skyboxRotation = skyboxRotation.asInstanceOf[js.Any], tonemapping = tonemapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbientBake]
  }
  
  extension [Self <: AmbientBake](x: Self) {
    
    inline def setAmbientBake(value: Boolean): Self = StObject.set(x, "ambientBake", value.asInstanceOf[js.Any])
    
    inline def setAmbientBakeNumSamples(value: Double): Self = StObject.set(x, "ambientBakeNumSamples", value.asInstanceOf[js.Any])
    
    inline def setAmbientBakeOcclusionBrightness(value: Double): Self = StObject.set(x, "ambientBakeOcclusionBrightness", value.asInstanceOf[js.Any])
    
    inline def setAmbientBakeOcclusionContrast(value: Double): Self = StObject.set(x, "ambientBakeOcclusionContrast", value.asInstanceOf[js.Any])
    
    inline def setAmbientBakeSpherePart(value: Double): Self = StObject.set(x, "ambientBakeSpherePart", value.asInstanceOf[js.Any])
    
    inline def setAmbientLuminance(value: Double): Self = StObject.set(x, "ambientLuminance", value.asInstanceOf[js.Any])
    
    inline def setClusteredLightingEnabled(value: Boolean): Self = StObject.set(x, "clusteredLightingEnabled", value.asInstanceOf[js.Any])
    
    inline def setExposure(value: Double): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
    
    inline def setFog(value: String): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
    
    inline def setFog_color(value: js.Array[Double]): Self = StObject.set(x, "fog_color", value.asInstanceOf[js.Any])
    
    inline def setFog_colorVarargs(value: Double*): Self = StObject.set(x, "fog_color", js.Array(value*))
    
    inline def setFog_density(value: Double): Self = StObject.set(x, "fog_density", value.asInstanceOf[js.Any])
    
    inline def setFog_end(value: Double): Self = StObject.set(x, "fog_end", value.asInstanceOf[js.Any])
    
    inline def setFog_start(value: Double): Self = StObject.set(x, "fog_start", value.asInstanceOf[js.Any])
    
    inline def setGamma_correction(value: Double): Self = StObject.set(x, "gamma_correction", value.asInstanceOf[js.Any])
    
    inline def setGlobal_ambient(value: js.Array[Double]): Self = StObject.set(x, "global_ambient", value.asInstanceOf[js.Any])
    
    inline def setGlobal_ambientVarargs(value: Double*): Self = StObject.set(x, "global_ambient", js.Array(value*))
    
    inline def setLightingAreaLightsEnabled(value: Boolean): Self = StObject.set(x, "lightingAreaLightsEnabled", value.asInstanceOf[js.Any])
    
    inline def setLightingCells(value: Vec3): Self = StObject.set(x, "lightingCells", value.asInstanceOf[js.Any])
    
    inline def setLightingCookieAtlasResolution(value: Double): Self = StObject.set(x, "lightingCookieAtlasResolution", value.asInstanceOf[js.Any])
    
    inline def setLightingCookiesEnabled(value: Boolean): Self = StObject.set(x, "lightingCookiesEnabled", value.asInstanceOf[js.Any])
    
    inline def setLightingMaxLightsPerCell(value: Double): Self = StObject.set(x, "lightingMaxLightsPerCell", value.asInstanceOf[js.Any])
    
    inline def setLightingShadowAtlasResolution(value: Double): Self = StObject.set(x, "lightingShadowAtlasResolution", value.asInstanceOf[js.Any])
    
    inline def setLightingShadowType(value: Double): Self = StObject.set(x, "lightingShadowType", value.asInstanceOf[js.Any])
    
    inline def setLightingShadowsEnabled(value: Boolean): Self = StObject.set(x, "lightingShadowsEnabled", value.asInstanceOf[js.Any])
    
    inline def setLightmapMaxResolution(value: Double): Self = StObject.set(x, "lightmapMaxResolution", value.asInstanceOf[js.Any])
    
    inline def setLightmapMode(value: Double): Self = StObject.set(x, "lightmapMode", value.asInstanceOf[js.Any])
    
    inline def setLightmapSizeMultiplier(value: Double): Self = StObject.set(x, "lightmapSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setSkybox(value: Double): Self = StObject.set(x, "skybox", value.asInstanceOf[js.Any])
    
    inline def setSkyboxIntensity(value: Double): Self = StObject.set(x, "skyboxIntensity", value.asInstanceOf[js.Any])
    
    inline def setSkyboxLuminance(value: Double): Self = StObject.set(x, "skyboxLuminance", value.asInstanceOf[js.Any])
    
    inline def setSkyboxMip(value: Double): Self = StObject.set(x, "skyboxMip", value.asInstanceOf[js.Any])
    
    inline def setSkyboxNull: Self = StObject.set(x, "skybox", null)
    
    inline def setSkyboxRotation(value: js.Array[Double]): Self = StObject.set(x, "skyboxRotation", value.asInstanceOf[js.Any])
    
    inline def setSkyboxRotationVarargs(value: Double*): Self = StObject.set(x, "skyboxRotation", js.Array(value*))
    
    inline def setSkyboxUndefined: Self = StObject.set(x, "skybox", js.undefined)
    
    inline def setTonemapping(value: Double): Self = StObject.set(x, "tonemapping", value.asInstanceOf[js.Any])
  }
}

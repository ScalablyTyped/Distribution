package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exposure extends StObject {
  
  var exposure: Double
  
  var fog: String
  
  var fog_color: js.Array[Double]
  
  var fog_density: Double
  
  var fog_end: Double
  
  var fog_start: Double
  
  var gamma_correction: Double
  
  var global_ambient: js.Array[Double]
  
  var lightmapMaxResolution: Double
  
  var lightmapMode: Double
  
  var lightmapSizeMultiplier: Double
  
  var skybox: js.UndefOr[Double | Null] = js.undefined
  
  var skyboxIntensity: Double
  
  var skyboxMip: Double
  
  var skyboxRotation: js.Array[Double]
  
  var tonemapping: Double
}
object Exposure {
  
  @scala.inline
  def apply(
    exposure: Double,
    fog: String,
    fog_color: js.Array[Double],
    fog_density: Double,
    fog_end: Double,
    fog_start: Double,
    gamma_correction: Double,
    global_ambient: js.Array[Double],
    lightmapMaxResolution: Double,
    lightmapMode: Double,
    lightmapSizeMultiplier: Double,
    skyboxIntensity: Double,
    skyboxMip: Double,
    skyboxRotation: js.Array[Double],
    tonemapping: Double
  ): Exposure = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], fog_color = fog_color.asInstanceOf[js.Any], fog_density = fog_density.asInstanceOf[js.Any], fog_end = fog_end.asInstanceOf[js.Any], fog_start = fog_start.asInstanceOf[js.Any], gamma_correction = gamma_correction.asInstanceOf[js.Any], global_ambient = global_ambient.asInstanceOf[js.Any], lightmapMaxResolution = lightmapMaxResolution.asInstanceOf[js.Any], lightmapMode = lightmapMode.asInstanceOf[js.Any], lightmapSizeMultiplier = lightmapSizeMultiplier.asInstanceOf[js.Any], skyboxIntensity = skyboxIntensity.asInstanceOf[js.Any], skyboxMip = skyboxMip.asInstanceOf[js.Any], skyboxRotation = skyboxRotation.asInstanceOf[js.Any], tonemapping = tonemapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exposure]
  }
  
  @scala.inline
  implicit class ExposureMutableBuilder[Self <: Exposure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExposure(value: Double): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog(value: String): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog_color(value: js.Array[Double]): Self = StObject.set(x, "fog_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog_colorVarargs(value: Double*): Self = StObject.set(x, "fog_color", js.Array(value :_*))
    
    @scala.inline
    def setFog_density(value: Double): Self = StObject.set(x, "fog_density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog_end(value: Double): Self = StObject.set(x, "fog_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog_start(value: Double): Self = StObject.set(x, "fog_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamma_correction(value: Double): Self = StObject.set(x, "gamma_correction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal_ambient(value: js.Array[Double]): Self = StObject.set(x, "global_ambient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal_ambientVarargs(value: Double*): Self = StObject.set(x, "global_ambient", js.Array(value :_*))
    
    @scala.inline
    def setLightmapMaxResolution(value: Double): Self = StObject.set(x, "lightmapMaxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightmapMode(value: Double): Self = StObject.set(x, "lightmapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightmapSizeMultiplier(value: Double): Self = StObject.set(x, "lightmapSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkybox(value: Double): Self = StObject.set(x, "skybox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxIntensity(value: Double): Self = StObject.set(x, "skyboxIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxMip(value: Double): Self = StObject.set(x, "skyboxMip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxNull: Self = StObject.set(x, "skybox", null)
    
    @scala.inline
    def setSkyboxRotation(value: js.Array[Double]): Self = StObject.set(x, "skyboxRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxRotationVarargs(value: Double*): Self = StObject.set(x, "skyboxRotation", js.Array(value :_*))
    
    @scala.inline
    def setSkyboxUndefined: Self = StObject.set(x, "skybox", js.undefined)
    
    @scala.inline
    def setTonemapping(value: Double): Self = StObject.set(x, "tonemapping", value.asInstanceOf[js.Any])
  }
}

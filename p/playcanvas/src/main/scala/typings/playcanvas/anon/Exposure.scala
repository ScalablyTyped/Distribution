package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exposure extends js.Object {
  
  var exposure: Double = js.native
  
  var fog: String = js.native
  
  var fog_color: js.Array[Double] = js.native
  
  var fog_density: Double = js.native
  
  var fog_end: Double = js.native
  
  var fog_start: Double = js.native
  
  var gamma_correction: Double = js.native
  
  var global_ambient: js.Array[Double] = js.native
  
  var lightmapMaxResolution: Double = js.native
  
  var lightmapMode: Double = js.native
  
  var lightmapSizeMultiplier: Double = js.native
  
  var skybox: js.UndefOr[Double | Null] = js.native
  
  var skyboxIntensity: Double = js.native
  
  var skyboxMip: Double = js.native
  
  var skyboxRotation: js.Array[Double] = js.native
  
  var tonemapping: Double = js.native
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
  implicit class ExposureOps[Self <: Exposure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExposure(value: Double): Self = this.set("exposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog(value: String): Self = this.set("fog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog_colorVarargs(value: Double*): Self = this.set("fog_color", js.Array(value :_*))
    
    @scala.inline
    def setFog_color(value: js.Array[Double]): Self = this.set("fog_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog_density(value: Double): Self = this.set("fog_density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog_end(value: Double): Self = this.set("fog_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog_start(value: Double): Self = this.set("fog_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamma_correction(value: Double): Self = this.set("gamma_correction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal_ambientVarargs(value: Double*): Self = this.set("global_ambient", js.Array(value :_*))
    
    @scala.inline
    def setGlobal_ambient(value: js.Array[Double]): Self = this.set("global_ambient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightmapMaxResolution(value: Double): Self = this.set("lightmapMaxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightmapMode(value: Double): Self = this.set("lightmapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightmapSizeMultiplier(value: Double): Self = this.set("lightmapSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxIntensity(value: Double): Self = this.set("skyboxIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxMip(value: Double): Self = this.set("skyboxMip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxRotationVarargs(value: Double*): Self = this.set("skyboxRotation", js.Array(value :_*))
    
    @scala.inline
    def setSkyboxRotation(value: js.Array[Double]): Self = this.set("skyboxRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTonemapping(value: Double): Self = this.set("tonemapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkybox(value: Double): Self = this.set("skybox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkybox: Self = this.set("skybox", js.undefined)
    
    @scala.inline
    def setSkyboxNull: Self = this.set("skybox", null)
  }
}

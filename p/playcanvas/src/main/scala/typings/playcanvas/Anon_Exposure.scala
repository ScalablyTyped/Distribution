package typings.playcanvas

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exposure extends js.Object {
  var exposure: Double
  var fog: String
  var fog_color: js.Array[Number]
  var fog_density: Double
  var fog_end: Double
  var fog_start: Double
  var gamma_correction: Double
  var global_ambient: js.Array[Number]
  var lightmapMaxResolution: Double
  var lightmapMode: Double
  var lightmapSizeMultiplier: Double
  var skybox: js.UndefOr[Double | Null] = js.undefined
  var skyboxIntensity: Double
  var skyboxMip: Double
  var tonemapping: Double
}

object Anon_Exposure {
  @scala.inline
  def apply(
    exposure: Double,
    fog: String,
    fog_color: js.Array[Number],
    fog_density: Double,
    fog_end: Double,
    fog_start: Double,
    gamma_correction: Double,
    global_ambient: js.Array[Number],
    lightmapMaxResolution: Double,
    lightmapMode: Double,
    lightmapSizeMultiplier: Double,
    skyboxIntensity: Double,
    skyboxMip: Double,
    tonemapping: Double,
    skybox: Int | Double = null
  ): Anon_Exposure = {
    val __obj = js.Dynamic.literal(exposure = exposure, fog = fog, fog_color = fog_color, fog_density = fog_density, fog_end = fog_end, fog_start = fog_start, gamma_correction = gamma_correction, global_ambient = global_ambient, lightmapMaxResolution = lightmapMaxResolution, lightmapMode = lightmapMode, lightmapSizeMultiplier = lightmapSizeMultiplier, skyboxIntensity = skyboxIntensity, skyboxMip = skyboxMip, tonemapping = tonemapping)
    if (skybox != null) __obj.updateDynamic("skybox")(skybox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Exposure]
  }
}


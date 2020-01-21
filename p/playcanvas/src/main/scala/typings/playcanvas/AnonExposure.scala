package typings.playcanvas

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExposure extends js.Object {
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

object AnonExposure {
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
  ): AnonExposure = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], fog_color = fog_color.asInstanceOf[js.Any], fog_density = fog_density.asInstanceOf[js.Any], fog_end = fog_end.asInstanceOf[js.Any], fog_start = fog_start.asInstanceOf[js.Any], gamma_correction = gamma_correction.asInstanceOf[js.Any], global_ambient = global_ambient.asInstanceOf[js.Any], lightmapMaxResolution = lightmapMaxResolution.asInstanceOf[js.Any], lightmapMode = lightmapMode.asInstanceOf[js.Any], lightmapSizeMultiplier = lightmapSizeMultiplier.asInstanceOf[js.Any], skyboxIntensity = skyboxIntensity.asInstanceOf[js.Any], skyboxMip = skyboxMip.asInstanceOf[js.Any], tonemapping = tonemapping.asInstanceOf[js.Any])
    if (skybox != null) __obj.updateDynamic("skybox")(skybox.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExposure]
  }
}


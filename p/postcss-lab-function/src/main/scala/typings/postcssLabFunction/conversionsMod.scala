package typings.postcssLabFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionsMod {
  
  @JSImport("postcss-lab-function/dist/css-color-4/conversions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-lab-function/dist/css-color-4/conversions", "D50")
  @js.native
  val D50: js.Array[Double] = js.native
  
  inline def D50ToD65(XYZ: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("D50_to_D65")(XYZ.asInstanceOf[js.Any]).asInstanceOf[color]
  
  @JSImport("postcss-lab-function/dist/css-color-4/conversions", "D65")
  @js.native
  val D65: js.Array[Double] = js.native
  
  inline def D65ToD50(XYZ: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("D65_to_D50")(XYZ.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def LCHToLab(LCH: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("LCH_to_Lab")(LCH.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def LabToLCH(Lab: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("Lab_to_LCH")(Lab.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def LabToXYZ(Lab: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("Lab_to_XYZ")(Lab.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def OKLCHToOKLab(OKLCH: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("OKLCH_to_OKLab")(OKLCH.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def OKLabToOKLCH(OKLab: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("OKLab_to_OKLCH")(OKLab.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def OKLabToXYZ(OKLab: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("OKLab_to_XYZ")(OKLab.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def XYZToLab(XYZ: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_Lab")(XYZ.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def XYZToLin2020(XYZ: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_2020")(XYZ.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def XYZToLinA98rgb(XYZ: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_a98rgb")(XYZ.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def XYZToLinP3(XYZ: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_P3")(XYZ.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def XYZToLinProPhoto(XYZ: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_ProPhoto")(XYZ.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def XYZToLinSRGB(XYZ: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_sRGB")(XYZ.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def XYZToOKLab(XYZ: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_OKLab")(XYZ.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def gam2020(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_2020")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def gamA98rgb(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_a98rgb")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def gamP3(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_P3")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def gamProPhoto(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_ProPhoto")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def gamSRGB(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_sRGB")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def hslPremultiply(color: color, alpha: Double): color = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl_premultiply")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[color]
  
  inline def lin2020(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_2020")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def lin2020ToXYZ(rgb: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_2020_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def linA98rgb(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_a98rgb")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def linA98rgbToXYZ(rgb: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_a98rgb_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def linP3(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_P3")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def linP3ToXYZ(rgb: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_P3_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def linProPhoto(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_ProPhoto")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def linProPhotoToXYZ(rgb: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_ProPhoto_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def linSRGB(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_sRGB")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def linSRGBToXYZ(rgb: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_sRGB_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def polarPremultiply(color: color, alpha: Double, hueIndex: Double): color = (^.asInstanceOf[js.Dynamic].applyDynamic("polar_premultiply")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], hueIndex.asInstanceOf[js.Any])).asInstanceOf[color]
  
  inline def polarUnPremultiply(color: color, alpha: Double, hueIndex: Double): color = (^.asInstanceOf[js.Dynamic].applyDynamic("polar_un_premultiply")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], hueIndex.asInstanceOf[js.Any])).asInstanceOf[color]
  
  inline def rectangularPremultiply(color: color, alpha: Double): color = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangular_premultiply")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[color]
  
  inline def rectangularUnPremultiply(color: color, alpha: Double): color = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangular_un_premultiply")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}

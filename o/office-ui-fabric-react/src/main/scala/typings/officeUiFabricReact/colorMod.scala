package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings.a
import typings.officeUiFabricReact.officeUiFabricReactStrings.b
import typings.officeUiFabricReact.officeUiFabricReactStrings.g
import typings.officeUiFabricReact.officeUiFabricReactStrings.r
import typings.officeUiFabricReact.shadesMod.Shade
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "HEX_REGEX")
  @js.native
  val HEX_REGEX: RegExp = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MAX_COLOR_ALPHA")
  @js.native
  val MAX_COLOR_ALPHA: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MAX_COLOR_HUE")
  @js.native
  val MAX_COLOR_HUE: /* 359 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MAX_COLOR_RGB")
  @js.native
  val MAX_COLOR_RGB: /* 255 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MAX_COLOR_RGBA")
  @js.native
  val MAX_COLOR_RGBA: /* 255 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MAX_COLOR_SATURATION")
  @js.native
  val MAX_COLOR_SATURATION: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MAX_COLOR_VALUE")
  @js.native
  val MAX_COLOR_VALUE: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MAX_HEX_LENGTH")
  @js.native
  val MAX_HEX_LENGTH: /* 6 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MAX_RGBA_LENGTH")
  @js.native
  val MAX_RGBA_LENGTH: /* 3 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MIN_HEX_LENGTH")
  @js.native
  val MIN_HEX_LENGTH: /* 3 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "MIN_RGBA_LENGTH")
  @js.native
  val MIN_RGBA_LENGTH: /* 1 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "RGBA_REGEX")
  @js.native
  val RGBA_REGEX: RegExp = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color", "Shade")
  @js.native
  object Shade extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.shadesMod.Shade & Double] = js.native
    
    /* 1 */ val Shade1: typings.officeUiFabricReact.shadesMod.Shade.Shade1 & Double = js.native
    
    /* 2 */ val Shade2: typings.officeUiFabricReact.shadesMod.Shade.Shade2 & Double = js.native
    
    /* 3 */ val Shade3: typings.officeUiFabricReact.shadesMod.Shade.Shade3 & Double = js.native
    
    /* 4 */ val Shade4: typings.officeUiFabricReact.shadesMod.Shade.Shade4 & Double = js.native
    
    /* 5 */ val Shade5: typings.officeUiFabricReact.shadesMod.Shade.Shade5 & Double = js.native
    
    /* 6 */ val Shade6: typings.officeUiFabricReact.shadesMod.Shade.Shade6 & Double = js.native
    
    /* 7 */ val Shade7: typings.officeUiFabricReact.shadesMod.Shade.Shade7 & Double = js.native
    
    /* 8 */ val Shade8: typings.officeUiFabricReact.shadesMod.Shade.Shade8 & Double = js.native
    
    /* 0 */ val Unshaded: typings.officeUiFabricReact.shadesMod.Shade.Unshaded & Double = js.native
  }
  
  @scala.inline
  def clamp(value: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def clamp(value: Double, max: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def correctHSV(color: typings.officeUiFabricReact.interfacesMod.IHSV): typings.officeUiFabricReact.interfacesMod.IHSV = ^.asInstanceOf[js.Dynamic].applyDynamic("correctHSV")(color.asInstanceOf[js.Any]).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IHSV]
  
  @scala.inline
  def correctHex(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("correctHex")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def correctRGB(color: typings.officeUiFabricReact.interfacesMod.IRGB): typings.officeUiFabricReact.interfacesMod.IRGB = ^.asInstanceOf[js.Dynamic].applyDynamic("correctRGB")(color.asInstanceOf[js.Any]).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IRGB]
  
  @scala.inline
  def cssColor(): js.UndefOr[typings.officeUiFabricReact.interfacesMod.IRGB] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssColor")().asInstanceOf[js.UndefOr[typings.officeUiFabricReact.interfacesMod.IRGB]]
  @scala.inline
  def cssColor(color: String): js.UndefOr[typings.officeUiFabricReact.interfacesMod.IRGB] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssColor")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.officeUiFabricReact.interfacesMod.IRGB]]
  
  @scala.inline
  def getBackgroundShade(color: typings.officeUiFabricReact.interfacesMod.IColor, shade: Shade): typings.officeUiFabricReact.interfacesMod.IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor | Null]
  @scala.inline
  def getBackgroundShade(color: typings.officeUiFabricReact.interfacesMod.IColor, shade: Shade, isInverted: Boolean): typings.officeUiFabricReact.interfacesMod.IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any], isInverted.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor | Null]
  
  @scala.inline
  def getColorFromHSV(hsv: typings.officeUiFabricReact.interfacesMod.IHSV): typings.officeUiFabricReact.interfacesMod.IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromHSV")(hsv.asInstanceOf[js.Any]).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  @scala.inline
  def getColorFromHSV(hsv: typings.officeUiFabricReact.interfacesMod.IHSV, a: Double): typings.officeUiFabricReact.interfacesMod.IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromHSV")(hsv.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  @scala.inline
  def getColorFromRGBA(rgba: typings.officeUiFabricReact.interfacesMod.IRGB): typings.officeUiFabricReact.interfacesMod.IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromRGBA")(rgba.asInstanceOf[js.Any]).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  @scala.inline
  def getColorFromString(inputColor: String): js.UndefOr[typings.officeUiFabricReact.interfacesMod.IColor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromString")(inputColor.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.officeUiFabricReact.interfacesMod.IColor]]
  
  @scala.inline
  def getContrastRatio(
    color1: typings.officeUiFabricReact.interfacesMod.IColor,
    color2: typings.officeUiFabricReact.interfacesMod.IColor
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getFullColorString(color: typings.officeUiFabricReact.interfacesMod.IColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullColorString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getShade(color: typings.officeUiFabricReact.interfacesMod.IColor, shade: Shade): typings.officeUiFabricReact.interfacesMod.IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor | Null]
  @scala.inline
  def getShade(color: typings.officeUiFabricReact.interfacesMod.IColor, shade: Shade, isInverted: Boolean): typings.officeUiFabricReact.interfacesMod.IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any], isInverted.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor | Null]
  
  @scala.inline
  def hsl2hsv(h: Double, s: Double, l: Double): typings.officeUiFabricReact.interfacesMod.IHSV = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2hsv")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IHSV]
  
  @scala.inline
  def hsl2rgb(h: Double, s: Double, l: Double): typings.officeUiFabricReact.interfacesMod.IRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IRGB]
  
  @scala.inline
  def hsv2hex(h: Double, s: Double, v: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2hex")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hsv2hsl(h: Double, s: Double, v: Double): typings.officeUiFabricReact.interfacesMod.IHSL = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2hsl")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IHSL]
  
  @scala.inline
  def hsv2rgb(h: Double, s: Double, v: Double): typings.officeUiFabricReact.interfacesMod.IRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IRGB]
  
  @scala.inline
  def isDark(color: typings.officeUiFabricReact.interfacesMod.IColor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDark")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidShade(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidShade")().asInstanceOf[Boolean]
  @scala.inline
  def isValidShade(shade: Shade): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidShade")(shade.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def rgb2hex(r: Double, g: Double, b: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def rgb2hsv(r: Double, g: Double, b: Double): typings.officeUiFabricReact.interfacesMod.IHSV = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsv")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IHSV]
  
  @scala.inline
  def updateA(color: typings.officeUiFabricReact.interfacesMod.IColor, a: Double): typings.officeUiFabricReact.interfacesMod.IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateA")(color.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  @scala.inline
  def updateH(color: typings.officeUiFabricReact.interfacesMod.IColor, h: Double): typings.officeUiFabricReact.interfacesMod.IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateH")(color.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  @scala.inline
  def updateRGB_a(color: typings.officeUiFabricReact.interfacesMod.IColor, component: a, value: Double): typings.officeUiFabricReact.interfacesMod.IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRGB")(color.asInstanceOf[js.Any], component.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  @scala.inline
  def updateRGB_b(color: typings.officeUiFabricReact.interfacesMod.IColor, component: b, value: Double): typings.officeUiFabricReact.interfacesMod.IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRGB")(color.asInstanceOf[js.Any], component.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  @scala.inline
  def updateRGB_g(color: typings.officeUiFabricReact.interfacesMod.IColor, component: g, value: Double): typings.officeUiFabricReact.interfacesMod.IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRGB")(color.asInstanceOf[js.Any], component.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  @scala.inline
  def updateRGB_r(color: typings.officeUiFabricReact.interfacesMod.IColor, component: r, value: Double): typings.officeUiFabricReact.interfacesMod.IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRGB")(color.asInstanceOf[js.Any], component.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  @scala.inline
  def updateSV(color: typings.officeUiFabricReact.interfacesMod.IColor, s: Double, v: Double): typings.officeUiFabricReact.interfacesMod.IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSV")(color.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  @scala.inline
  def updateT(color: typings.officeUiFabricReact.interfacesMod.IColor, t: Double): typings.officeUiFabricReact.interfacesMod.IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateT")(color.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.officeUiFabricReact.interfacesMod.IColor]
  
  trait IColor
    extends StObject
       with typings.officeUiFabricReact.interfacesMod.IColor
  object IColor {
    
    @scala.inline
    def apply(b: Double, g: Double, h: Double, hex: String, r: Double, s: Double, str: String, v: Double): IColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColor]
    }
  }
  
  trait IHSL
    extends StObject
       with typings.officeUiFabricReact.interfacesMod.IHSL
  object IHSL {
    
    @scala.inline
    def apply(h: Double, l: Double, s: Double): IHSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHSL]
    }
  }
  
  trait IHSV
    extends StObject
       with typings.officeUiFabricReact.interfacesMod.IHSV
  object IHSV {
    
    @scala.inline
    def apply(h: Double, s: Double, v: Double): IHSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHSV]
    }
  }
  
  trait IRGB
    extends StObject
       with typings.officeUiFabricReact.interfacesMod.IRGB
  object IRGB {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): IRGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRGB]
    }
  }
}

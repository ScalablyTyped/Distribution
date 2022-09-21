package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.interfacesMod.IHSL
import typings.officeUiFabricReact.interfacesMod.IHSV
import typings.officeUiFabricReact.interfacesMod.IRGB
import typings.officeUiFabricReact.officeUiFabricReactStrings.a
import typings.officeUiFabricReact.officeUiFabricReactStrings.b
import typings.officeUiFabricReact.officeUiFabricReactStrings.g
import typings.officeUiFabricReact.officeUiFabricReactStrings.r
import typings.officeUiFabricReact.shadesMod.Shade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorMod {
  
  @JSImport("office-ui-fabric-react/lib/Color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "HEX_REGEX")
  @js.native
  val HEX_REGEX: js.RegExp = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_ALPHA")
  @js.native
  val MAX_COLOR_ALPHA: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_HUE")
  @js.native
  val MAX_COLOR_HUE: /* 359 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_RGB")
  @js.native
  val MAX_COLOR_RGB: /* 255 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_RGBA")
  @js.native
  val MAX_COLOR_RGBA: /* 255 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_SATURATION")
  @js.native
  val MAX_COLOR_SATURATION: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_COLOR_VALUE")
  @js.native
  val MAX_COLOR_VALUE: /* 100 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_HEX_LENGTH")
  @js.native
  val MAX_HEX_LENGTH: /* 6 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MAX_RGBA_LENGTH")
  @js.native
  val MAX_RGBA_LENGTH: /* 3 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MIN_HEX_LENGTH")
  @js.native
  val MIN_HEX_LENGTH: /* 3 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "MIN_RGBA_LENGTH")
  @js.native
  val MIN_RGBA_LENGTH: /* 1 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "RGBA_REGEX")
  @js.native
  val RGBA_REGEX: js.RegExp = js.native
  
  @JSImport("office-ui-fabric-react/lib/Color", "Shade")
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
  
  inline def clamp(value: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clamp(value: Double, max: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def correctHSV(color: IHSV): IHSV = ^.asInstanceOf[js.Dynamic].applyDynamic("correctHSV")(color.asInstanceOf[js.Any]).asInstanceOf[IHSV]
  
  inline def correctHex(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("correctHex")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def correctRGB(color: IRGB): IRGB = ^.asInstanceOf[js.Dynamic].applyDynamic("correctRGB")(color.asInstanceOf[js.Any]).asInstanceOf[IRGB]
  
  inline def cssColor(): js.UndefOr[IRGB] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssColor")().asInstanceOf[js.UndefOr[IRGB]]
  inline def cssColor(color: String): js.UndefOr[IRGB] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssColor")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRGB]]
  
  inline def getBackgroundShade(color: IColor, shade: Shade): IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any])).asInstanceOf[IColor | Null]
  inline def getBackgroundShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any], isInverted.asInstanceOf[js.Any])).asInstanceOf[IColor | Null]
  
  inline def getColorFromHSV(hsv: IHSV): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromHSV")(hsv.asInstanceOf[js.Any]).asInstanceOf[IColor]
  inline def getColorFromHSV(hsv: IHSV, a: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromHSV")(hsv.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[IColor]
  
  inline def getColorFromRGBA(rgba: IRGB): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromRGBA")(rgba.asInstanceOf[js.Any]).asInstanceOf[IColor]
  
  inline def getColorFromString(inputColor: String): js.UndefOr[IColor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromString")(inputColor.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IColor]]
  
  inline def getContrastRatio(color1: IColor, color2: IColor): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getFullColorString(color: IColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullColorString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getShade(color: IColor, shade: Shade): IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any])).asInstanceOf[IColor | Null]
  inline def getShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any], isInverted.asInstanceOf[js.Any])).asInstanceOf[IColor | Null]
  
  inline def hsl2hsv(h: Double, s: Double, l: Double): IHSV = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2hsv")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[IHSV]
  
  inline def hsl2rgb(h: Double, s: Double, l: Double): IRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[IRGB]
  
  inline def hsv2hex(h: Double, s: Double, v: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2hex")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hsv2hsl(h: Double, s: Double, v: Double): IHSL = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2hsl")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[IHSL]
  
  inline def hsv2rgb(h: Double, s: Double, v: Double): IRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[IRGB]
  
  inline def isDark(color: IColor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDark")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidShade(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidShade")().asInstanceOf[Boolean]
  inline def isValidShade(shade: Shade): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidShade")(shade.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def rgb2hex(r: Double, g: Double, b: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rgb2hsv(r: Double, g: Double, b: Double): IHSV = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsv")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[IHSV]
  
  inline def updateA(color: IColor, a: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateA")(color.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[IColor]
  
  inline def updateH(color: IColor, h: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateH")(color.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[IColor]
  
  inline def updateRGB(color: IColor, component: r | g | b | a, value: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRGB")(color.asInstanceOf[js.Any], component.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IColor]
  
  inline def updateSV(color: IColor, s: Double, v: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSV")(color.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[IColor]
  
  inline def updateT(color: IColor, t: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateT")(color.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[IColor]
}

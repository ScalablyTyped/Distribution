package typings.nivoColors

import typings.d3Color.mod.RGBColor
import typings.nivoColors.anon.PartialPickCompleteThemeb
import typings.nivoColors.nivoColorsStrings.brighter
import typings.nivoColors.nivoColorsStrings.darker
import typings.nivoColors.nivoColorsStrings.opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInheritedColorMod {
  
  @JSImport("@nivo/colors/dist/types/inheritedColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInheritedColorGenerator[Datum](config: InheritedColorConfig[Datum]): InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getInheritedColorGenerator")(config.asInstanceOf[js.Any]).asInstanceOf[InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any])]
  inline def getInheritedColorGenerator[Datum](config: InheritedColorConfig[Datum], theme: PartialPickCompleteThemeb): InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getInheritedColorGenerator")(config.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any])]
  
  inline def useInheritedColor[Datum](config: InheritedColorConfig[Datum]): InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useInheritedColor")(config.asInstanceOf[js.Any]).asInstanceOf[InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any])]
  inline def useInheritedColor[Datum](config: InheritedColorConfig[Datum], theme: PartialPickCompleteThemeb): InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useInheritedColor")(config.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any])]
  
  type ColorModifier = ColorModifierBrightness | ColorModifierDarkness | ColorModifierOpacity
  
  type ColorModifierBrightness = js.Tuple2[brighter, Double]
  
  type ColorModifierDarkness = js.Tuple2[darker, Double]
  
  type ColorModifierFunction = js.Function1[/* color */ RGBColor, RGBColor]
  
  type ColorModifierOpacity = js.Tuple2[opacity, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigStaticColor
    - typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigCustomFunction[Datum]
    - typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigFromTheme
    - typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigFromContext
  */
  type InheritedColorConfig[Datum] = _InheritedColorConfig[Datum] | InheritedColorConfigStaticColor
  
  @js.native
  trait InheritedColorConfigCustomFunction[Datum]
    extends StObject
       with _InheritedColorConfig[Datum] {
    
    def apply(d: Datum, drest: Datum*): String = js.native
  }
  
  trait InheritedColorConfigFromContext
    extends StObject
       with _InheritedColorConfig[Any] {
    
    var from: String
    
    var modifiers: js.UndefOr[js.Array[ColorModifier]] = js.undefined
  }
  object InheritedColorConfigFromContext {
    
    inline def apply(from: String): InheritedColorConfigFromContext = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[InheritedColorConfigFromContext]
    }
    
    extension [Self <: InheritedColorConfigFromContext](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setModifiers(value: js.Array[ColorModifier]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: ColorModifier*): Self = StObject.set(x, "modifiers", js.Array(value*))
    }
  }
  
  trait InheritedColorConfigFromTheme
    extends StObject
       with _InheritedColorConfig[Any] {
    
    var theme: String
  }
  object InheritedColorConfigFromTheme {
    
    inline def apply(theme: String): InheritedColorConfigFromTheme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[InheritedColorConfigFromTheme]
    }
    
    extension [Self <: InheritedColorConfigFromTheme](x: Self) {
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type InheritedColorConfigStaticColor = String
  
  trait _InheritedColorConfig[Datum] extends StObject
}

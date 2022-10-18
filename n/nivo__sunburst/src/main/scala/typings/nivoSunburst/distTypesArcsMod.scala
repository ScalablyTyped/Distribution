package typings.nivoSunburst

import typings.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.distTypesTypesMod.ArcGenerator
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoSunburst.distTypesTypesMod.ComputedDatum
import typings.nivoSunburst.distTypesTypesMod.MouseHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcsMod {
  
  @JSImport("@nivo/sunburst/dist/types/Arcs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Arcs[RawDatum](
    hasCenterDataArcGeneratorBorderWidthBorderColorIsInteractiveOnClickOnMouseEnterOnMouseMoveOnMouseLeaveTooltipTransitionMode: ArcsProps[RawDatum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Arcs")(hasCenterDataArcGeneratorBorderWidthBorderColorIsInteractiveOnClickOnMouseEnterOnMouseMoveOnMouseLeaveTooltipTransitionMode.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ArcsProps[RawDatum] extends StObject {
    
    var arcGenerator: ArcGenerator
    
    var borderColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var borderWidth: Double
    
    var center: js.Tuple2[Double, Double]
    
    var data: js.Array[ComputedDatum[RawDatum]]
    
    var isInteractive: Boolean
    
    var onClick: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var tooltip: js.Function1[/* props */ ComputedDatum[RawDatum], Element]
    
    var transitionMode: ArcTransitionMode
  }
  object ArcsProps {
    
    inline def apply[RawDatum](
      arcGenerator: ArcGenerator,
      borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderWidth: Double,
      center: js.Tuple2[Double, Double],
      data: js.Array[ComputedDatum[RawDatum]],
      isInteractive: Boolean,
      tooltip: /* props */ ComputedDatum[RawDatum] => Element,
      transitionMode: ArcTransitionMode
    ): ArcsProps[RawDatum] = {
      val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), transitionMode = transitionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcsProps[RawDatum]]
    }
    
    extension [Self <: ArcsProps[?], RawDatum](x: Self & ArcsProps[RawDatum]) {
      
      inline def setArcGenerator(value: ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setOnClick(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTooltip(value: /* props */ ComputedDatum[RawDatum] => Element): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      inline def setTransitionMode(value: ArcTransitionMode): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
    }
  }
}

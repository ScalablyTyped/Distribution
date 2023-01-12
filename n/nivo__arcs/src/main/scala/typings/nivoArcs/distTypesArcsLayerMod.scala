package typings.nivoArcs

import typings.nivoArcs.distTypesArcShapeMod.ArcMouseHandler
import typings.nivoArcs.distTypesArcShapeMod.ArcShapeProps
import typings.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.distTypesTypesMod.ArcGenerator
import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcsLayerMod {
  
  @JSImport("@nivo/arcs/dist/types/ArcsLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcsLayer[Datum /* <: DatumWithArcAndColor */](param0: ArcsLayerProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcsLayer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ArcComponent[Datum /* <: DatumWithArcAndColor */] = js.Function1[/* props */ ArcShapeProps[Datum], Element]
  
  trait ArcsLayerProps[Datum /* <: DatumWithArcAndColor */] extends StObject {
    
    var arcGenerator: ArcGenerator
    
    var borderColor: InheritedColorConfig[Datum]
    
    var borderWidth: Double
    
    var center: js.Tuple2[Double, Double]
    
    var component: js.UndefOr[ArcComponent[Datum]] = js.undefined
    
    var data: js.Array[Datum]
    
    var onClick: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var transitionMode: ArcTransitionMode
  }
  object ArcsLayerProps {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](
      arcGenerator: ArcGenerator,
      borderColor: InheritedColorConfig[Datum],
      borderWidth: Double,
      center: js.Tuple2[Double, Double],
      data: js.Array[Datum],
      transitionMode: ArcTransitionMode
    ): ArcsLayerProps[Datum] = {
      val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], transitionMode = transitionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcsLayerProps[Datum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArcsLayerProps[?], Datum /* <: DatumWithArcAndColor */] (val x: Self & ArcsLayerProps[Datum]) extends AnyVal {
      
      inline def setArcGenerator(value: ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: /* props */ ArcShapeProps[Datum] => Element): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setOnClick(value: (Datum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: (Datum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (Datum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: (Datum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTransitionMode(value: ArcTransitionMode): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
    }
  }
}

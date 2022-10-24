package typings.nivoArcs

import typings.nivoArcs.anon.BorderColor
import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcShapeMod {
  
  @JSImport("@nivo/arcs/dist/types/ArcShape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcShape[Datum /* <: DatumWithArcAndColor */](param0: ArcShapeProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcShape")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ArcMouseHandler[Datum /* <: DatumWithArcAndColor */] = js.Function2[/* datum */ Datum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent], Unit]
  
  trait ArcShapeProps[Datum /* <: DatumWithArcAndColor */] extends StObject {
    
    var datum: Datum
    
    var onClick: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var style: BorderColor
  }
  object ArcShapeProps {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](datum: Datum, style: BorderColor): ArcShapeProps[Datum] = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcShapeProps[Datum]]
    }
    
    extension [Self <: ArcShapeProps[?], Datum /* <: DatumWithArcAndColor */](x: Self & ArcShapeProps[Datum]) {
      
      inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: (Datum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: (Datum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (Datum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: (Datum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setStyle(value: BorderColor): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}

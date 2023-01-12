package typings.nivoHeatmap.distTypesTypesMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellComponentProps[Datum /* <: HeatMapDatum */] extends StObject {
  
  var animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<CellAnimatedProps> */ Any
  
  var borderRadius: Double
  
  var borderWidth: Double
  
  var cell: ComputedCell[Datum]
  
  var enableLabels: Boolean
  
  var onClick: js.UndefOr[
    js.Function1[
      /* cell */ ComputedCell[Datum], 
      js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* cell */ ComputedCell[Datum], 
      js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* cell */ ComputedCell[Datum], 
      js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]
    ]
  ] = js.undefined
  
  var onMouseMove: js.UndefOr[
    js.Function1[
      /* cell */ ComputedCell[Datum], 
      js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]
    ]
  ] = js.undefined
}
object CellComponentProps {
  
  inline def apply[Datum /* <: HeatMapDatum */](
    animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<CellAnimatedProps> */ Any,
    borderRadius: Double,
    borderWidth: Double,
    cell: ComputedCell[Datum],
    enableLabels: Boolean
  ): CellComponentProps[Datum] = {
    val __obj = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellComponentProps[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellComponentProps[?], Datum /* <: HeatMapDatum */] (val x: Self & CellComponentProps[Datum]) extends AnyVal {
    
    inline def setAnimatedProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<CellAnimatedProps> */ Any
    ): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setCell(value: ComputedCell[Datum]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: /* cell */ ComputedCell[Datum] => js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: /* cell */ ComputedCell[Datum] => js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: /* cell */ ComputedCell[Datum] => js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: /* cell */ ComputedCell[Datum] => js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
  }
}

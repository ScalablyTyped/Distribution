package typings.nivoAxes

import typings.nivoAxes.anon.TextTransform
import typings.nivoAxes.nivoAxesStrings.after
import typings.nivoAxes.nivoAxesStrings.before
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.nivoScales.distTypesTypesMod.TicksSpec
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.mod.SpringValues
import typings.std.MouseEvent
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoAxes.nivoAxesStrings.start
    - typings.nivoAxes.nivoAxesStrings.middle
    - typings.nivoAxes.nivoAxesStrings.end
  */
  trait AxisLegendPosition extends StObject
  object AxisLegendPosition {
    
    inline def end: typings.nivoAxes.nivoAxesStrings.end = "end".asInstanceOf[typings.nivoAxes.nivoAxesStrings.end]
    
    inline def middle: typings.nivoAxes.nivoAxesStrings.middle = "middle".asInstanceOf[typings.nivoAxes.nivoAxesStrings.middle]
    
    inline def start: typings.nivoAxes.nivoAxesStrings.start = "start".asInstanceOf[typings.nivoAxes.nivoAxesStrings.start]
  }
  
  trait AxisProps[Value /* <: ScaleValue */] extends StObject {
    
    var ariaHidden: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String | ValueFormatter[Value]] = js.undefined
    
    var legend: js.UndefOr[ReactNode] = js.undefined
    
    var legendOffset: js.UndefOr[Double] = js.undefined
    
    var legendPosition: js.UndefOr[AxisLegendPosition] = js.undefined
    
    var renderTick: js.UndefOr[js.Function1[/* props */ AxisTickProps[Value], Element]] = js.undefined
    
    var tickPadding: js.UndefOr[Double] = js.undefined
    
    var tickRotation: js.UndefOr[Double] = js.undefined
    
    var tickSize: js.UndefOr[Double] = js.undefined
    
    var tickValues: js.UndefOr[TicksSpec[Value]] = js.undefined
    
    var ticksPosition: js.UndefOr[before | after] = js.undefined
  }
  object AxisProps {
    
    inline def apply[Value /* <: ScaleValue */](): AxisProps[Value] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisProps[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxisProps[?], Value /* <: ScaleValue */] (val x: Self & AxisProps[Value]) extends AnyVal {
      
      inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
      
      inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
      
      inline def setFormat(value: String | ValueFormatter[Value]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: Value => Value | String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLegend(value: ReactNode): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendOffset(value: Double): Self = StObject.set(x, "legendOffset", value.asInstanceOf[js.Any])
      
      inline def setLegendOffsetUndefined: Self = StObject.set(x, "legendOffset", js.undefined)
      
      inline def setLegendPosition(value: AxisLegendPosition): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
      
      inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setRenderTick(value: /* props */ AxisTickProps[Value] => Element): Self = StObject.set(x, "renderTick", js.Any.fromFunction1(value))
      
      inline def setRenderTickUndefined: Self = StObject.set(x, "renderTick", js.undefined)
      
      inline def setTickPadding(value: Double): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
      
      inline def setTickPaddingUndefined: Self = StObject.set(x, "tickPadding", js.undefined)
      
      inline def setTickRotation(value: Double): Self = StObject.set(x, "tickRotation", value.asInstanceOf[js.Any])
      
      inline def setTickRotationUndefined: Self = StObject.set(x, "tickRotation", js.undefined)
      
      inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickValues(value: TicksSpec[Value]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
      
      inline def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
      
      inline def setTickValuesVarargs(value: Value*): Self = StObject.set(x, "tickValues", js.Array(value*))
      
      inline def setTicksPosition(value: before | after): Self = StObject.set(x, "ticksPosition", value.asInstanceOf[js.Any])
      
      inline def setTicksPositionUndefined: Self = StObject.set(x, "ticksPosition", js.undefined)
    }
  }
  
  trait AxisTickProps[Value /* <: ScaleValue */] extends StObject {
    
    var animatedProps: SpringValues[TextTransform]
    
    var format: js.UndefOr[ValueFormatter[Value]] = js.undefined
    
    var lineX: Double
    
    var lineY: Double
    
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ typings.react.mod.MouseEvent[SVGGElement, MouseEvent], 
          /* value */ Value | String, 
          Unit
        ]
      ] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var textAnchor: String
    
    var textBaseline: String
    
    var textX: Double
    
    var textY: Double
    
    var tickIndex: Double
    
    var value: Value
    
    var x: Double
    
    var y: Double
  }
  object AxisTickProps {
    
    inline def apply[Value /* <: ScaleValue */](
      animatedProps: SpringValues[TextTransform],
      lineX: Double,
      lineY: Double,
      textAnchor: String,
      textBaseline: String,
      textX: Double,
      textY: Double,
      tickIndex: Double,
      value: Value,
      x: Double,
      y: Double
    ): AxisTickProps[Value] = {
      val __obj = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], lineX = lineX.asInstanceOf[js.Any], lineY = lineY.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], textX = textX.asInstanceOf[js.Any], textY = textY.asInstanceOf[js.Any], tickIndex = tickIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisTickProps[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxisTickProps[?], Value /* <: ScaleValue */] (val x: Self & AxisTickProps[Value]) extends AnyVal {
      
      inline def setAnimatedProps(value: SpringValues[TextTransform]): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Value => Value | String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLineX(value: Double): Self = StObject.set(x, "lineX", value.asInstanceOf[js.Any])
      
      inline def setLineY(value: Double): Self = StObject.set(x, "lineY", value.asInstanceOf[js.Any])
      
      inline def setOnClick(
        value: (/* event */ typings.react.mod.MouseEvent[SVGGElement, MouseEvent], /* value */ Value | String) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextX(value: Double): Self = StObject.set(x, "textX", value.asInstanceOf[js.Any])
      
      inline def setTextY(value: Double): Self = StObject.set(x, "textY", value.asInstanceOf[js.Any])
      
      inline def setTickIndex(value: Double): Self = StObject.set(x, "tickIndex", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<@nivo/axes.@nivo/axes/dist/types/types.AxisProps<Value>, 'legend'> */
  trait CanvasAxisProps[Value /* <: ScaleValue */] extends StObject {
    
    var ariaHidden: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String | ValueFormatter[Value]] = js.undefined
    
    var legend: js.UndefOr[String] = js.undefined
    
    var legendOffset: js.UndefOr[Double] = js.undefined
    
    var legendPosition: js.UndefOr[AxisLegendPosition] = js.undefined
    
    var renderTick: js.UndefOr[js.Function1[/* props */ AxisTickProps[Value], Element]] = js.undefined
    
    var tickPadding: js.UndefOr[Double] = js.undefined
    
    var tickRotation: js.UndefOr[Double] = js.undefined
    
    var tickSize: js.UndefOr[Double] = js.undefined
    
    var tickValues: js.UndefOr[TicksSpec[Value]] = js.undefined
    
    var ticksPosition: js.UndefOr[before | after] = js.undefined
  }
  object CanvasAxisProps {
    
    inline def apply[Value /* <: ScaleValue */](): CanvasAxisProps[Value] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasAxisProps[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanvasAxisProps[?], Value /* <: ScaleValue */] (val x: Self & CanvasAxisProps[Value]) extends AnyVal {
      
      inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
      
      inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
      
      inline def setFormat(value: String | ValueFormatter[Value]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: Value => Value | String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendOffset(value: Double): Self = StObject.set(x, "legendOffset", value.asInstanceOf[js.Any])
      
      inline def setLegendOffsetUndefined: Self = StObject.set(x, "legendOffset", js.undefined)
      
      inline def setLegendPosition(value: AxisLegendPosition): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
      
      inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setRenderTick(value: /* props */ AxisTickProps[Value] => Element): Self = StObject.set(x, "renderTick", js.Any.fromFunction1(value))
      
      inline def setRenderTickUndefined: Self = StObject.set(x, "renderTick", js.undefined)
      
      inline def setTickPadding(value: Double): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
      
      inline def setTickPaddingUndefined: Self = StObject.set(x, "tickPadding", js.undefined)
      
      inline def setTickRotation(value: Double): Self = StObject.set(x, "tickRotation", value.asInstanceOf[js.Any])
      
      inline def setTickRotationUndefined: Self = StObject.set(x, "tickRotation", js.undefined)
      
      inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickValues(value: TicksSpec[Value]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
      
      inline def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
      
      inline def setTickValuesVarargs(value: Value*): Self = StObject.set(x, "tickValues", js.Array(value*))
      
      inline def setTicksPosition(value: before | after): Self = StObject.set(x, "ticksPosition", value.asInstanceOf[js.Any])
      
      inline def setTicksPositionUndefined: Self = StObject.set(x, "ticksPosition", js.undefined)
    }
  }
  
  type GridValues[T /* <: ScaleValue */] = Double | GridValuesBuilder[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends number ? std.Array<number> : T extends string ? std.Array<string> : T extends std.Date ? std.Array<std.Date> : never
    }}}
    */
  type GridValuesBuilder[T] = js.Array[Double]
  
  trait Line extends StObject {
    
    var key: String
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object Line {
    
    inline def apply(key: String, x1: Double, x2: Double, y1: Double, y2: Double): Line = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueFormatter[Value /* <: ScaleValue */] = js.Function1[/* value */ Value, Value | String]
}

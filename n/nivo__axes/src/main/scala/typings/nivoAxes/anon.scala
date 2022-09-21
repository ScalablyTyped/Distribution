package typings.nivoAxes

import typings.nivoAxes.nivoAxesStrings.after
import typings.nivoAxes.nivoAxesStrings.before
import typings.nivoAxes.nivoAxesStrings.canvas
import typings.nivoAxes.nivoAxesStrings.svg
import typings.nivoAxes.nivoAxesStrings.x
import typings.nivoAxes.nivoAxesStrings.y
import typings.nivoAxes.typesMod.AxisLegendPosition
import typings.nivoAxes.typesMod.AxisProps
import typings.nivoAxes.typesMod.CanvasAxisProps
import typings.nivoAxes.typesMod.Line
import typings.nivoAxes.typesMod.ValueFormatter
import typings.nivoCore.mod.CompleteTheme
import typings.nivoScales.typesMod.AnyScale
import typings.nivoScales.typesMod.ScaleValue
import typings.nivoScales.typesMod.TicksSpec
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.MouseEvent
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnimatedProps extends StObject {
    
    var animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  opacity :number,   x1 :number,   x2 :number,   y1 :number,   y2 :number}> */ Any
  }
  object AnimatedProps {
    
    inline def apply(
      animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  opacity :number,   x1 :number,   x2 :number,   y1 :number,   y2 :number}> */ Any
    ): AnimatedProps = {
      val __obj = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimatedProps]
    }
    
    extension [Self <: AnimatedProps](x: Self) {
      
      inline def setAnimatedProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  opacity :number,   x1 :number,   x2 :number,   y1 :number,   y2 :number}> */ Any
      ): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait AriaHidden extends StObject {
    
    var ariaHidden: Requireable[Boolean]
    
    var format: Requireable[String | (js.Function1[/* repeated */ Any, Any])]
    
    var legend: Requireable[ReactNodeLike]
    
    var legendOffset: Requireable[Double]
    
    var legendPosition: Requireable[String]
    
    var renderTick: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var tickPadding: Requireable[Double]
    
    var tickRotation: Requireable[Double]
    
    var tickSize: Requireable[Double]
    
    var tickValues: Requireable[String | Double | (js.Array[js.UndefOr[String | Double | js.Date | Null]])]
    
    var ticksPosition: Requireable[String]
  }
  object AriaHidden {
    
    inline def apply(
      ariaHidden: Requireable[Boolean],
      format: Requireable[String | (js.Function1[/* repeated */ Any, Any])],
      legend: Requireable[ReactNodeLike],
      legendOffset: Requireable[Double],
      legendPosition: Requireable[String],
      renderTick: Requireable[js.Function1[/* repeated */ Any, Any]],
      tickPadding: Requireable[Double],
      tickRotation: Requireable[Double],
      tickSize: Requireable[Double],
      tickValues: Requireable[String | Double | (js.Array[js.UndefOr[String | Double | js.Date | Null]])],
      ticksPosition: Requireable[String]
    ): AriaHidden = {
      val __obj = js.Dynamic.literal(ariaHidden = ariaHidden.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], legendOffset = legendOffset.asInstanceOf[js.Any], legendPosition = legendPosition.asInstanceOf[js.Any], renderTick = renderTick.asInstanceOf[js.Any], tickPadding = tickPadding.asInstanceOf[js.Any], tickRotation = tickRotation.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any], tickValues = tickValues.asInstanceOf[js.Any], ticksPosition = ticksPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[AriaHidden]
    }
    
    extension [Self <: AriaHidden](x: Self) {
      
      inline def setAriaHidden(value: Requireable[Boolean]): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Requireable[String | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setLegend(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendOffset(value: Requireable[Double]): Self = StObject.set(x, "legendOffset", value.asInstanceOf[js.Any])
      
      inline def setLegendPosition(value: Requireable[String]): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
      
      inline def setRenderTick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "renderTick", value.asInstanceOf[js.Any])
      
      inline def setTickPadding(value: Requireable[Double]): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
      
      inline def setTickRotation(value: Requireable[Double]): Self = StObject.set(x, "tickRotation", value.asInstanceOf[js.Any])
      
      inline def setTickSize(value: Requireable[Double]): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickValues(value: Requireable[String | Double | (js.Array[js.UndefOr[String | Double | js.Date | Null]])]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
      
      inline def setTicksPosition(value: Requireable[String]): Self = StObject.set(x, "ticksPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait Axis[Value /* <: ScaleValue */] extends StObject {
    
    var axis: x | y
    
    var format: js.UndefOr[String | ValueFormatter[Value]] = js.undefined
    
    var legend: js.UndefOr[String] = js.undefined
    
    var legendOffset: js.UndefOr[Double] = js.undefined
    
    var legendPosition: js.UndefOr[AxisLegendPosition] = js.undefined
    
    var length: Double
    
    var scale: AnyScale
    
    var theme: CompleteTheme
    
    var tickPadding: js.UndefOr[Double] = js.undefined
    
    var tickRotation: js.UndefOr[Double] = js.undefined
    
    var tickSize: js.UndefOr[Double] = js.undefined
    
    var tickValues: js.UndefOr[TicksSpec[Value]] = js.undefined
    
    var ticksPosition: before | after
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Axis {
    
    inline def apply[Value /* <: ScaleValue */](axis: x | y, length: Double, scale: AnyScale, theme: CompleteTheme, ticksPosition: before | after): Axis[Value] = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ticksPosition = ticksPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Axis[Value]]
    }
    
    extension [Self <: Axis[?], Value /* <: ScaleValue */](x: Self & Axis[Value]) {
      
      inline def setAxis(value: typings.nivoAxes.nivoAxesStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String | ValueFormatter[Value]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: Value => Value | String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendOffset(value: Double): Self = StObject.set(x, "legendOffset", value.asInstanceOf[js.Any])
      
      inline def setLegendOffsetUndefined: Self = StObject.set(x, "legendOffset", js.undefined)
      
      inline def setLegendPosition(value: AxisLegendPosition): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
      
      inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setScale(value: AnyScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
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
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Bottom[X /* <: ScaleValue */, Y /* <: ScaleValue */] extends StObject {
    
    var bottom: js.UndefOr[CanvasAxisProps[X] | Null] = js.undefined
    
    var height: Double
    
    var left: js.UndefOr[CanvasAxisProps[Y] | Null] = js.undefined
    
    var right: js.UndefOr[CanvasAxisProps[Y] | Null] = js.undefined
    
    var theme: CompleteTheme
    
    var top: js.UndefOr[CanvasAxisProps[X] | Null] = js.undefined
    
    var width: Double
    
    var xScale: AnyScale
    
    var yScale: AnyScale
  }
  object Bottom {
    
    inline def apply[X /* <: ScaleValue */, Y /* <: ScaleValue */](height: Double, theme: CompleteTheme, width: Double, xScale: AnyScale, yScale: AnyScale): Bottom[X, Y] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom[X, Y]]
    }
    
    extension [Self <: Bottom[?, ?], X /* <: ScaleValue */, Y /* <: ScaleValue */](x: Self & (Bottom[X, Y])) {
      
      inline def setBottom(value: CanvasAxisProps[X]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomNull: Self = StObject.set(x, "bottom", null)
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: CanvasAxisProps[Y]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftNull: Self = StObject.set(x, "left", null)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: CanvasAxisProps[Y]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightNull: Self = StObject.set(x, "right", null)
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTop(value: CanvasAxisProps[X]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopNull: Self = StObject.set(x, "top", null)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXScale(value: AnyScale): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setYScale(value: AnyScale): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    }
  }
  
  trait Engine[Value /* <: ScaleValue */] extends StObject {
    
    var axis: x | y
    
    var engine: js.UndefOr[svg | canvas] = js.undefined
    
    var scale: AnyScale
    
    var tickPadding: Double
    
    var tickRotation: Double
    
    var tickSize: Double
    
    var tickValues: js.UndefOr[TicksSpec[Value]] = js.undefined
    
    var ticksPosition: js.UndefOr[before | after] = js.undefined
  }
  object Engine {
    
    inline def apply[Value /* <: ScaleValue */](axis: x | y, scale: AnyScale, tickPadding: Double, tickRotation: Double, tickSize: Double): Engine[Value] = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tickPadding = tickPadding.asInstanceOf[js.Any], tickRotation = tickRotation.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Engine[Value]]
    }
    
    extension [Self <: Engine[?], Value /* <: ScaleValue */](x: Self & Engine[Value]) {
      
      inline def setAxis(value: typings.nivoAxes.nivoAxesStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: svg | canvas): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setScale(value: AnyScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTickPadding(value: Double): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
      
      inline def setTickRotation(value: Double): Self = StObject.set(x, "tickRotation", value.asInstanceOf[js.Any])
      
      inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickValues(value: TicksSpec[Value]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
      
      inline def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
      
      inline def setTickValuesVarargs(value: Value*): Self = StObject.set(x, "tickValues", js.Array(value*))
      
      inline def setTicksPosition(value: before | after): Self = StObject.set(x, "ticksPosition", value.asInstanceOf[js.Any])
      
      inline def setTicksPositionUndefined: Self = StObject.set(x, "ticksPosition", js.undefined)
    }
  }
  
  trait Height[Value /* <: ScaleValue */] extends StObject {
    
    var axis: x | y
    
    var height: Double
    
    var scale: AnyScale
    
    var values: js.UndefOr[TicksSpec[Value]] = js.undefined
    
    var width: Double
  }
  object Height {
    
    inline def apply[Value /* <: ScaleValue */](axis: x | y, height: Double, scale: AnyScale, width: Double): Height[Value] = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height[Value]]
    }
    
    extension [Self <: Height[?], Value /* <: ScaleValue */](x: Self & Height[Value]) {
      
      inline def setAxis(value: typings.nivoAxes.nivoAxesStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setScale(value: AnyScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setValues(value: TicksSpec[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key[Value /* <: ScaleValue */] extends StObject {
    
    var key: String
    
    var lineX: Double
    
    var lineY: Double
    
    var textX: Double
    
    var textY: Double
    
    var value: Value
    
    var x: Double
    
    var y: Double
  }
  object Key {
    
    inline def apply[Value /* <: ScaleValue */](
      key: String,
      lineX: Double,
      lineY: Double,
      textX: Double,
      textY: Double,
      value: Value,
      x: Double,
      y: Double
    ): Key[Value] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], lineX = lineX.asInstanceOf[js.Any], lineY = lineY.asInstanceOf[js.Any], textX = textX.asInstanceOf[js.Any], textY = textY.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[Value]]
    }
    
    extension [Self <: Key[?], Value /* <: ScaleValue */](x: Self & Key[Value]) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLineX(value: Double): Self = StObject.set(x, "lineX", value.asInstanceOf[js.Any])
      
      inline def setLineY(value: Double): Self = StObject.set(x, "lineY", value.asInstanceOf[js.Any])
      
      inline def setTextX(value: Double): Self = StObject.set(x, "textX", value.asInstanceOf[js.Any])
      
      inline def setTextY(value: Double): Self = StObject.set(x, "textY", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left[X /* <: ScaleValue */, Y /* <: ScaleValue */] extends StObject {
    
    var bottom: js.UndefOr[AxisProps[X] | Null] = js.undefined
    
    var height: Double
    
    var left: js.UndefOr[AxisProps[Y] | Null] = js.undefined
    
    var right: js.UndefOr[AxisProps[Y] | Null] = js.undefined
    
    var top: js.UndefOr[AxisProps[X] | Null] = js.undefined
    
    var width: Double
    
    var xScale: AnyScale
    
    var yScale: AnyScale
  }
  object Left {
    
    inline def apply[X /* <: ScaleValue */, Y /* <: ScaleValue */](height: Double, width: Double, xScale: AnyScale, yScale: AnyScale): Left[X, Y] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left[X, Y]]
    }
    
    extension [Self <: Left[?, ?], X /* <: ScaleValue */, Y /* <: ScaleValue */](x: Self & (Left[X, Y])) {
      
      inline def setBottom(value: AxisProps[X]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomNull: Self = StObject.set(x, "bottom", null)
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: AxisProps[Y]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftNull: Self = StObject.set(x, "left", null)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: AxisProps[Y]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightNull: Self = StObject.set(x, "right", null)
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: AxisProps[X]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopNull: Self = StObject.set(x, "top", null)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXScale(value: AnyScale): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setYScale(value: AnyScale): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length[Value /* <: ScaleValue */] extends StObject {
    
    var axis: x | y
    
    var length: Double
    
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ typings.react.mod.MouseEvent[SVGGElement, MouseEvent], 
          /* value */ String | Value, 
          Unit
        ]
      ] = js.undefined
    
    var scale: AnyScale
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Length {
    
    inline def apply[Value /* <: ScaleValue */](axis: x | y, length: Double, scale: AnyScale): Length[Value] = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length[Value]]
    }
    
    extension [Self <: Length[?], Value /* <: ScaleValue */](x: Self & Length[Value]) {
      
      inline def setAxis(value: typings.nivoAxes.nivoAxesStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOnClick(
        value: (/* event */ typings.react.mod.MouseEvent[SVGGElement, MouseEvent], /* value */ String | Value) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setScale(value: AnyScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Lines extends StObject {
    
    var lines: js.Array[Line]
  }
  object Lines {
    
    inline def apply(lines: js.Array[Line]): Lines = {
      val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lines]
    }
    
    extension [Self <: Lines](x: Self) {
      
      inline def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value*))
    }
  }
  
  trait TextAlign[Value /* <: ScaleValue */] extends StObject {
    
    var textAlign: CanvasTextAlign
    
    var textBaseline: CanvasTextBaseline
    
    var ticks: js.Array[Key[Value]]
  }
  object TextAlign {
    
    inline def apply[Value /* <: ScaleValue */](textAlign: CanvasTextAlign, textBaseline: CanvasTextBaseline, ticks: js.Array[Key[Value]]): TextAlign[Value] = {
      val __obj = js.Dynamic.literal(textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextAlign[Value]]
    }
    
    extension [Self <: TextAlign[?], Value /* <: ScaleValue */](x: Self & TextAlign[Value]) {
      
      inline def setTextAlign(value: CanvasTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextBaseline(value: CanvasTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTicks(value: js.Array[Key[Value]]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksVarargs(value: Key[Value]*): Self = StObject.set(x, "ticks", js.Array(value*))
    }
  }
  
  trait Width[X /* <: ScaleValue */, Y /* <: ScaleValue */] extends StObject {
    
    var height: Double
    
    var width: Double
    
    var xScale: js.UndefOr[AnyScale | Null] = js.undefined
    
    var xValues: js.UndefOr[TicksSpec[X]] = js.undefined
    
    var yScale: js.UndefOr[AnyScale | Null] = js.undefined
    
    var yValues: js.UndefOr[TicksSpec[Y]] = js.undefined
  }
  object Width {
    
    inline def apply[X /* <: ScaleValue */, Y /* <: ScaleValue */](height: Double, width: Double): Width[X, Y] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width[X, Y]]
    }
    
    extension [Self <: Width[?, ?], X /* <: ScaleValue */, Y /* <: ScaleValue */](x: Self & (Width[X, Y])) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXScale(value: AnyScale): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setXScaleNull: Self = StObject.set(x, "xScale", null)
      
      inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
      
      inline def setXValues(value: TicksSpec[X]): Self = StObject.set(x, "xValues", value.asInstanceOf[js.Any])
      
      inline def setXValuesUndefined: Self = StObject.set(x, "xValues", js.undefined)
      
      inline def setXValuesVarargs(value: X*): Self = StObject.set(x, "xValues", js.Array(value*))
      
      inline def setYScale(value: AnyScale): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
      
      inline def setYScaleNull: Self = StObject.set(x, "yScale", null)
      
      inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
      
      inline def setYValues(value: TicksSpec[Y]): Self = StObject.set(x, "yValues", value.asInstanceOf[js.Any])
      
      inline def setYValuesUndefined: Self = StObject.set(x, "yValues", js.undefined)
      
      inline def setYValuesVarargs(value: Y*): Self = StObject.set(x, "yValues", js.Array(value*))
    }
  }
}

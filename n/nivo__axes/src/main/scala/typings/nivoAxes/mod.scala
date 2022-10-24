package typings.nivoAxes

import typings.nivoAxes.anon.AnimatedProps
import typings.nivoAxes.anon.AriaHidden
import typings.nivoAxes.anon.Axis
import typings.nivoAxes.anon.Bottom
import typings.nivoAxes.anon.Height
import typings.nivoAxes.anon.Left
import typings.nivoAxes.anon.Length
import typings.nivoAxes.anon.Lines
import typings.nivoAxes.anon.Width
import typings.nivoAxes.distTypesTypesMod.AxisProps
import typings.nivoAxes.distTypesTypesMod.AxisTickProps
import typings.nivoAxes.nivoAxesStrings.bottom
import typings.nivoAxes.nivoAxesStrings.left
import typings.nivoAxes.nivoAxesStrings.right
import typings.nivoAxes.nivoAxesStrings.top
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/axes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nivo/axes", "Axes")
  @js.native
  val Axes: MemoExoticComponent[js.Function1[/* param0 */ Left[ScaleValue, ScaleValue], Element]] = js.native
  
  inline def Axis[Value /* <: ScaleValue */](param0: AxisProps[Value] & Length[Value]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Axis")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def AxisTick[Value /* <: ScaleValue */](param0: AxisTickProps[Value]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AxisTick")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/axes", "Grid")
  @js.native
  val Grid: MemoExoticComponent[js.Function1[/* param0 */ Width[ScaleValue, ScaleValue], Element]] = js.native
  
  @JSImport("@nivo/axes", "GridLine")
  @js.native
  val GridLine: MemoExoticComponent[js.Function1[/* param0 */ AnimatedProps, Element]] = js.native
  
  @JSImport("@nivo/axes", "GridLines")
  @js.native
  val GridLines: MemoExoticComponent[js.Function1[/* param0 */ Lines, Element]] = js.native
  
  @JSImport("@nivo/axes", "axisPropType")
  @js.native
  val axisPropType: Requireable[InferProps[AriaHidden]] = js.native
  
  object axisPropTypes {
    
    @JSImport("@nivo/axes", "axisPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/axes", "axisPropTypes.ariaHidden")
    @js.native
    def ariaHidden: Requireable[Boolean] = js.native
    inline def ariaHidden_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaHidden")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes", "axisPropTypes.format")
    @js.native
    def format: Requireable[String | (js.Function1[/* repeated */ Any, Any])] = js.native
    inline def format_=(x: Requireable[String | (js.Function1[/* repeated */ Any, Any])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes", "axisPropTypes.legend")
    @js.native
    def legend: Requireable[ReactNodeLike] = js.native
    
    @JSImport("@nivo/axes", "axisPropTypes.legendOffset")
    @js.native
    def legendOffset: Requireable[Double] = js.native
    inline def legendOffset_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes", "axisPropTypes.legendPosition")
    @js.native
    def legendPosition: Requireable[String] = js.native
    inline def legendPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(x.asInstanceOf[js.Any])
    
    inline def legend_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legend")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes", "axisPropTypes.renderTick")
    @js.native
    def renderTick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def renderTick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderTick")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes", "axisPropTypes.tickPadding")
    @js.native
    def tickPadding: Requireable[Double] = js.native
    inline def tickPadding_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes", "axisPropTypes.tickRotation")
    @js.native
    def tickRotation: Requireable[Double] = js.native
    inline def tickRotation_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes", "axisPropTypes.tickSize")
    @js.native
    def tickSize: Requireable[Double] = js.native
    inline def tickSize_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes", "axisPropTypes.tickValues")
    @js.native
    def tickValues: Requireable[String | Double | (js.Array[js.UndefOr[String | Double | js.Date | Null]])] = js.native
    inline def tickValues_=(x: Requireable[String | Double | (js.Array[js.UndefOr[String | Double | js.Date | Null]])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickValues")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/axes", "axisPropTypes.ticksPosition")
    @js.native
    def ticksPosition: Requireable[String] = js.native
    inline def ticksPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticksPosition")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@nivo/axes", "positions")
  @js.native
  val positions: js.Tuple4[top, right, bottom, left] = js.native
  
  inline def renderAxesToCanvas[X /* <: ScaleValue */, Y /* <: ScaleValue */](ctx: CanvasRenderingContext2D, param1: Bottom[X, Y]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderAxesToCanvas")(ctx.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderAxisToCanvas[Value /* <: ScaleValue */](ctx: CanvasRenderingContext2D, param1: Axis[Value]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderAxisToCanvas")(ctx.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderGridLinesToCanvas[Value /* <: ScaleValue */](ctx: CanvasRenderingContext2D, param1: Height[Value]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGridLinesToCanvas")(ctx.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

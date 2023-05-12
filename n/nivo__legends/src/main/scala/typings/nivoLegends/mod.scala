package typings.nivoLegends

import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.anon.Color
import typings.nivoLegends.anon.ColorStops
import typings.nivoLegends.anon.Domain
import typings.nivoLegends.anon.Height
import typings.nivoLegends.anon.LabelAlignment
import typings.nivoLegends.anon.On
import typings.nivoLegends.anon.PickBoxLegendSvgPropsdire
import typings.nivoLegends.anon.X
import typings.nivoLegends.anon.anchorLegendAnchorRecordt
import typings.nivoLegends.anon.anchorLegendAnchortransla
import typings.nivoLegends.anon.directionLegendItemDirect
import typings.nivoLegends.distTypesSvgSymbolsTypesMod.SymbolProps
import typings.nivoLegends.distTypesTypesMod.AnchoredContinuousColorsLegendProps
import typings.nivoLegends.distTypesTypesMod.BoxLegendSvgProps
import typings.nivoLegends.distTypesTypesMod.ContinuousColorsLegendProps
import typings.nivoLegends.distTypesTypesMod.LegendCanvasProps
import typings.nivoLegends.distTypesTypesMod.LegendDirection
import typings.nivoLegends.distTypesTypesMod.LegendSvgItemProps
import typings.nivoLegends.distTypesTypesMod.LegendSvgProps
import typings.nivoLegends.nivoLegendsStrings.after
import typings.nivoLegends.nivoLegendsStrings.before
import typings.nivoLegends.nivoLegendsStrings.end
import typings.nivoLegends.nivoLegendsStrings.middle
import typings.nivoLegends.nivoLegendsStrings.start
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/legends", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AnchoredContinuousColorsLegendSvg(param0: AnchoredContinuousColorsLegendProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AnchoredContinuousColorsLegendSvg")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def BoxLegendSvg(param0: BoxLegendSvgProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BoxLegendSvg")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ContinuousColorsLegendSvg(param0: ContinuousColorsLegendProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ContinuousColorsLegendSvg")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object LegendPropShape {
    
    @JSImport("@nivo/legends", "LegendPropShape")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/legends", "LegendPropShape.anchor")
    @js.native
    def anchor: Validator[String] = js.native
    inline def anchor_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.data")
    @js.native
    def data: Requireable[js.Array[js.UndefOr[js.Object | Null]]] = js.native
    inline def data_=(x: Requireable[js.Array[js.UndefOr[js.Object | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.direction")
    @js.native
    def direction: Validator[String] = js.native
    inline def direction_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.effects")
    @js.native
    def effects: Requireable[js.Array[js.UndefOr[InferProps[On] | Null]]] = js.native
    inline def effects_=(x: Requireable[js.Array[js.UndefOr[InferProps[On] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("effects")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.itemBackground")
    @js.native
    def itemBackground: Requireable[String] = js.native
    inline def itemBackground_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemBackground")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.itemDirection")
    @js.native
    def itemDirection: Requireable[String] = js.native
    inline def itemDirection_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemDirection")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.itemHeight")
    @js.native
    def itemHeight: Validator[Double] = js.native
    inline def itemHeight_=(x: Validator[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.itemOpacity")
    @js.native
    def itemOpacity: Requireable[Double] = js.native
    inline def itemOpacity_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.itemTextColor")
    @js.native
    def itemTextColor: Requireable[String] = js.native
    inline def itemTextColor_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemTextColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.itemWidth")
    @js.native
    def itemWidth: Validator[Double] = js.native
    inline def itemWidth_=(x: Validator[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.itemsSpacing")
    @js.native
    def itemsSpacing: Requireable[Double] = js.native
    inline def itemsSpacing_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemsSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.onClick")
    @js.native
    def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.onMouseEnter")
    @js.native
    def onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onMouseEnter_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.onMouseLeave")
    @js.native
    def onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onMouseLeave_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.symbolBorderColor")
    @js.native
    def symbolBorderColor: Requireable[String] = js.native
    inline def symbolBorderColor_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.symbolBorderWidth")
    @js.native
    def symbolBorderWidth: Requireable[Double] = js.native
    inline def symbolBorderWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.symbolShape")
    @js.native
    def symbolShape: Requireable[NonNullable[js.UndefOr[String | (js.Function1[/* repeated */ Any, Any]) | Null]]] = js.native
    inline def symbolShape_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Function1[/* repeated */ Any, Any]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolShape")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.symbolSize")
    @js.native
    def symbolSize: Requireable[Double] = js.native
    inline def symbolSize_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.symbolSpacing")
    @js.native
    def symbolSpacing: Requireable[Double] = js.native
    inline def symbolSpacing_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.translateX")
    @js.native
    def translateX: Requireable[Double] = js.native
    inline def translateX_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "LegendPropShape.translateY")
    @js.native
    def translateY: Requireable[Double] = js.native
    inline def translateY_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateY")(x.asInstanceOf[js.Any])
  }
  
  inline def LegendSvg(param0: LegendSvgProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LegendSvg")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def LegendSvgItem(param0: LegendSvgItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LegendSvgItem")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SymbolCircle(param0: SymbolProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SymbolCircle")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SymbolDiamond(param0: SymbolProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SymbolDiamond")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SymbolSquare(param0: SymbolProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SymbolSquare")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SymbolTriangle(param0: SymbolProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SymbolTriangle")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def computeContinuousColorsLegend(param0: ContinuousColorsLegendProps): ColorStops = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorsLegend")(param0.asInstanceOf[js.Any]).asInstanceOf[ColorStops]
  
  inline def computeDimensions(param0: PickBoxLegendSvgPropsdire): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDimensions")(param0.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def computeItemLayout(param0: directionLegendItemDirect): LabelAlignment = ^.asInstanceOf[js.Dynamic].applyDynamic("computeItemLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[LabelAlignment]
  
  inline def computePositionFromAnchor(param0: anchorLegendAnchorRecordt): X = ^.asInstanceOf[js.Dynamic].applyDynamic("computePositionFromAnchor")(param0.asInstanceOf[js.Any]).asInstanceOf[X]
  
  object continuousColorsLegendDefaults {
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.direction")
    @js.native
    def direction: NonNullable[js.UndefOr[LegendDirection]] = js.native
    inline def direction_=(x: NonNullable[js.UndefOr[LegendDirection]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.length")
    @js.native
    def length: NonNullable[js.UndefOr[Double]] = js.native
    inline def length_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.thickness")
    @js.native
    def thickness: NonNullable[js.UndefOr[Double]] = js.native
    inline def thickness_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thickness")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.tickFormat")
    @js.native
    def tickFormat: NonNullable[js.UndefOr[ValueFormat[Double, Unit]]] = js.native
    inline def tickFormat_=(x: NonNullable[js.UndefOr[ValueFormat[Double, Unit]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.tickOverlap")
    @js.native
    def tickOverlap: NonNullable[js.UndefOr[Boolean]] = js.native
    inline def tickOverlap_=(x: NonNullable[js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOverlap")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.tickPosition")
    @js.native
    def tickPosition: NonNullable[js.UndefOr[before | after]] = js.native
    inline def tickPosition_=(x: NonNullable[js.UndefOr[before | after]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.tickSize")
    @js.native
    def tickSize: NonNullable[js.UndefOr[Double]] = js.native
    inline def tickSize_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.tickSpacing")
    @js.native
    def tickSpacing: NonNullable[js.UndefOr[Double]] = js.native
    inline def tickSpacing_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.titleAlign")
    @js.native
    def titleAlign: NonNullable[js.UndefOr[start | middle | end]] = js.native
    inline def titleAlign_=(x: NonNullable[js.UndefOr[start | middle | end]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends", "continuousColorsLegendDefaults.titleOffset")
    @js.native
    def titleOffset: NonNullable[js.UndefOr[Double]] = js.native
    inline def titleOffset_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleOffset")(x.asInstanceOf[js.Any])
  }
  
  inline def renderContinuousColorLegendToCanvas(ctx: CanvasRenderingContext2D, param1: anchorLegendAnchortransla): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContinuousColorLegendToCanvas")(ctx.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderLegendToCanvas(ctx: CanvasRenderingContext2D, param1: LegendCanvasProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLegendToCanvas")(ctx.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useQuantizeColorScaleLegendData(param0: Domain): js.Array[Color] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuantizeColorScaleLegendData")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color]]
}

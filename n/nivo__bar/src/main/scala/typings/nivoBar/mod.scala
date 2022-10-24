package typings.nivoBar

import typings.nivoBar.anon.From
import typings.nivoBar.anon.OmitBarCanvasPropsBarDatu
import typings.nivoBar.anon.PartialBarCommonPropsBarD
import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.BarItemProps
import typings.nivoBar.distTypesTypesMod.BarSvgProps
import typings.nivoBar.distTypesTypesMod.BarTooltipProps
import typings.nivoBar.distTypesTypesMod.ComputedDatum
import typings.nivoBar.nivoBarStrings.auto
import typings.nivoBar.nivoBarStrings.height
import typings.nivoBar.nivoBarStrings.id
import typings.nivoBar.nivoBarStrings.stacked
import typings.nivoBar.nivoBarStrings.vertical
import typings.nivoBar.nivoBarStrings.width
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoScales.distTypesTypesMod.ScaleBandSpec
import typings.nivoScales.distTypesTypesMod.ScaleSpec
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bar[RawDatum /* <: BarDatum */](param0: BarSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bar")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/bar", "BarCanvas")
  @js.native
  val BarCanvas: ForwardRefExoticComponent[PartialBarCommonPropsBarD] = js.native
  
  inline def BarItem[RawDatum /* <: BarDatum */](param0: BarItemProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BarItem")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveBar[RawDatum /* <: BarDatum */](props: Omit[BarSvgProps[RawDatum], height | width]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveBar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/bar", "ResponsiveBarCanvas")
  @js.native
  val ResponsiveBarCanvas: ForwardRefExoticComponent[OmitBarCanvasPropsBarDatu] = js.native
  
  object canvasDefaultProps {
    
    @JSImport("@nivo/bar", "canvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/bar", "canvasDefaultProps.annotations")
    @js.native
    def annotations: js.Array[scala.Nothing] = js.native
    inline def annotations_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[Any] = js.native
    inline def borderColor_=(x: InheritedColorConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.borderRadius")
    @js.native
    def borderRadius: Double = js.native
    inline def borderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.colorBy")
    @js.native
    def colorBy: id = js.native
    inline def colorBy_=(x: id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[Any] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.groupMode")
    @js.native
    def groupMode: stacked = js.native
    inline def groupMode_=(x: stacked): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.indexBy")
    @js.native
    def indexBy: String = js.native
    inline def indexBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.indexScale")
    @js.native
    def indexScale: ScaleBandSpec = js.native
    inline def indexScale_=(x: ScaleBandSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.initialHiddenIds")
    @js.native
    def initialHiddenIds: js.Array[scala.Nothing] = js.native
    inline def initialHiddenIds_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialHiddenIds")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.keys")
    @js.native
    def keys: js.Array[String] = js.native
    inline def keys_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.label")
    @js.native
    def label: String = js.native
    
    @JSImport("@nivo/bar", "canvasDefaultProps.labelSkipHeight")
    @js.native
    def labelSkipHeight: Double = js.native
    inline def labelSkipHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.labelSkipWidth")
    @js.native
    def labelSkipWidth: Double = js.native
    inline def labelSkipWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: From = js.native
    inline def labelTextColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.layers")
    @js.native
    def layers: js.Array[String] = js.native
    inline def layers_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.layout")
    @js.native
    def layout: vertical = js.native
    inline def layout_=(x: vertical): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layout")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.markers")
    @js.native
    def markers: js.Array[scala.Nothing] = js.native
    inline def markers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.maxValue")
    @js.native
    def maxValue: auto = js.native
    inline def maxValue_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.minValue")
    @js.native
    def minValue: auto = js.native
    inline def minValue_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.padding")
    @js.native
    def padding: Double = js.native
    inline def padding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "canvasDefaultProps.reverse")
    @js.native
    def reverse: Boolean = js.native
    inline def reverse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum](param0: BarTooltipProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def tooltipLabel[RawDatum_1](datum: ComputedDatum[RawDatum_1]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltipLabel")(datum.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@nivo/bar", "canvasDefaultProps.valueScale")
    @js.native
    def valueScale: ScaleSpec = js.native
    inline def valueScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueScale")(x.asInstanceOf[js.Any])
  }
  
  object defaultProps {
    
    @JSImport("@nivo/bar", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/bar", "defaultProps.annotations")
    @js.native
    def annotations: js.Array[scala.Nothing] = js.native
    inline def annotations_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[Any] = js.native
    inline def borderColor_=(x: InheritedColorConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.borderRadius")
    @js.native
    def borderRadius: Double = js.native
    inline def borderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.colorBy")
    @js.native
    def colorBy: id = js.native
    inline def colorBy_=(x: id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[Any] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.groupMode")
    @js.native
    def groupMode: stacked = js.native
    inline def groupMode_=(x: stacked): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.indexBy")
    @js.native
    def indexBy: String = js.native
    inline def indexBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.indexScale")
    @js.native
    def indexScale: ScaleBandSpec = js.native
    inline def indexScale_=(x: ScaleBandSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.initialHiddenIds")
    @js.native
    def initialHiddenIds: js.Array[scala.Nothing] = js.native
    inline def initialHiddenIds_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialHiddenIds")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.keys")
    @js.native
    def keys: js.Array[String] = js.native
    inline def keys_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.label")
    @js.native
    def label: String = js.native
    
    @JSImport("@nivo/bar", "defaultProps.labelSkipHeight")
    @js.native
    def labelSkipHeight: Double = js.native
    inline def labelSkipHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.labelSkipWidth")
    @js.native
    def labelSkipWidth: Double = js.native
    inline def labelSkipWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.labelTextColor")
    @js.native
    def labelTextColor: From = js.native
    inline def labelTextColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.layout")
    @js.native
    def layout: vertical = js.native
    inline def layout_=(x: vertical): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layout")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.markers")
    @js.native
    def markers: js.Array[scala.Nothing] = js.native
    inline def markers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.maxValue")
    @js.native
    def maxValue: auto = js.native
    inline def maxValue_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.minValue")
    @js.native
    def minValue: auto = js.native
    inline def minValue_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.padding")
    @js.native
    def padding: Double = js.native
    inline def padding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "defaultProps.reverse")
    @js.native
    def reverse: Boolean = js.native
    inline def reverse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum](param0: BarTooltipProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def tooltipLabel[RawDatum_1](datum: ComputedDatum[RawDatum_1]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltipLabel")(datum.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@nivo/bar", "defaultProps.valueScale")
    @js.native
    def valueScale: ScaleSpec = js.native
    inline def valueScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueScale")(x.asInstanceOf[js.Any])
  }
  
  object svgDefaultProps {
    
    @JSImport("@nivo/bar", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/bar", "svgDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.annotations")
    @js.native
    def annotations: js.Array[scala.Nothing] = js.native
    inline def annotations_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    inline def barComponent[RawDatum /* <: BarDatum */](param0: BarItemProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("barComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/bar", "svgDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[Any] = js.native
    inline def borderColor_=(x: InheritedColorConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.borderRadius")
    @js.native
    def borderRadius: Double = js.native
    inline def borderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.colorBy")
    @js.native
    def colorBy: id = js.native
    inline def colorBy_=(x: id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[Any] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.defs")
    @js.native
    def defs: js.Array[scala.Nothing] = js.native
    inline def defs_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.fill")
    @js.native
    def fill: js.Array[scala.Nothing] = js.native
    inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.groupMode")
    @js.native
    def groupMode: stacked = js.native
    inline def groupMode_=(x: stacked): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.indexBy")
    @js.native
    def indexBy: String = js.native
    inline def indexBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.indexScale")
    @js.native
    def indexScale: ScaleBandSpec = js.native
    inline def indexScale_=(x: ScaleBandSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.initialHiddenIds")
    @js.native
    def initialHiddenIds: js.Array[scala.Nothing] = js.native
    inline def initialHiddenIds_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialHiddenIds")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.isFocusable")
    @js.native
    def isFocusable: Boolean = js.native
    inline def isFocusable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFocusable")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.keys")
    @js.native
    def keys: js.Array[String] = js.native
    inline def keys_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.label")
    @js.native
    def label: String = js.native
    
    @JSImport("@nivo/bar", "svgDefaultProps.labelSkipHeight")
    @js.native
    def labelSkipHeight: Double = js.native
    inline def labelSkipHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.labelSkipWidth")
    @js.native
    def labelSkipWidth: Double = js.native
    inline def labelSkipWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: From = js.native
    inline def labelTextColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[String] = js.native
    inline def layers_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.layout")
    @js.native
    def layout: vertical = js.native
    inline def layout_=(x: vertical): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layout")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.markers")
    @js.native
    def markers: js.Array[scala.Nothing] = js.native
    inline def markers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.maxValue")
    @js.native
    def maxValue: auto = js.native
    inline def maxValue_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.minValue")
    @js.native
    def minValue: auto = js.native
    inline def minValue_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.padding")
    @js.native
    def padding: Double = js.native
    inline def padding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.reverse")
    @js.native
    def reverse: Boolean = js.native
    inline def reverse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/bar", "svgDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum](param0: BarTooltipProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def tooltipLabel[RawDatum_1](datum: ComputedDatum[RawDatum_1]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltipLabel")(datum.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@nivo/bar", "svgDefaultProps.valueScale")
    @js.native
    def valueScale: ScaleSpec = js.native
    inline def valueScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueScale")(x.asInstanceOf[js.Any])
  }
}

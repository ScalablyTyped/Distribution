package typings.nivoStream

import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.AreaCurve
import typings.nivoCore.mod.StackOffset
import typings.nivoCore.mod.StackOrder
import typings.nivoStream.anon.From
import typings.nivoStream.anon.OmitStreamLayerDatalabelc
import typings.nivoStream.nivoStreamStrings.center
import typings.nivoStream.nivoStreamStrings.end
import typings.nivoStream.nivoStreamStrings.height
import typings.nivoStream.nivoStreamStrings.start
import typings.nivoStream.nivoStreamStrings.width
import typings.nivoStream.streamDotsItemMod.StreamDotsItemProps
import typings.nivoStream.typesMod.StackTooltipProps
import typings.nivoStream.typesMod.StreamDatum
import typings.nivoStream.typesMod.StreamLayerData
import typings.nivoStream.typesMod.StreamLayerId
import typings.nivoStream.typesMod.StreamSvgProps
import typings.nivoStream.typesMod.TooltipProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveStream[RawDatum /* <: StreamDatum */](props: Omit[StreamSvgProps[RawDatum], height | width]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveStream")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Stream[RawDatum /* <: StreamDatum */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: StreamSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Stream")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object defaultProps {
    
    @JSImport("@nivo/stream", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/stream", "defaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[StreamLayerData] = js.native
    inline def borderColor_=(x: InheritedColorConfig[StreamLayerData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.curve")
    @js.native
    def curve: AreaCurve = js.native
    inline def curve_=(x: AreaCurve): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("curve")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.dotBorderColor")
    @js.native
    def dotBorderColor: From = js.native
    inline def dotBorderColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.dotBorderWidth")
    @js.native
    def dotBorderWidth: Double = js.native
    inline def dotBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.dotColor")
    @js.native
    def dotColor: From = js.native
    inline def dotColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(x.asInstanceOf[js.Any])
    
    inline def dotComponent(hasXYSizeColorBorderWidthBorderColor: StreamDotsItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("dotComponent")(hasXYSizeColorBorderWidthBorderColor.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/stream", "defaultProps.dotPosition")
    @js.native
    def dotPosition: start | center | end = js.native
    inline def dotPosition_=(x: start | center | end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.dotSize")
    @js.native
    def dotSize: Double = js.native
    inline def dotSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.enableDots")
    @js.native
    def enableDots: Boolean = js.native
    inline def enableDots_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableDots")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.enableStackTooltip")
    @js.native
    def enableStackTooltip: Boolean = js.native
    inline def enableStackTooltip_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableStackTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.fillOpacity")
    @js.native
    def fillOpacity: Double = js.native
    inline def fillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.label")
    @js.native
    def label: String = js.native
    inline def label_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.legendLabel")
    @js.native
    def legendLabel: String = js.native
    inline def legendLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.offsetType")
    @js.native
    def offsetType: StackOffset = js.native
    inline def offsetType_=(x: StackOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offsetType")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.order")
    @js.native
    def order: StackOrder = js.native
    inline def order_=(x: StackOrder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("order")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "defaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    inline def stackTooltip(hasSlice: StackTooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("stackTooltip")(hasSlice.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def tooltip(hasLayer: TooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(hasLayer.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  object svgDefaultProps {
    
    @JSImport("@nivo/stream", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/stream", "svgDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[StreamLayerData] = js.native
    inline def borderColor_=(x: InheritedColorConfig[StreamLayerData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.curve")
    @js.native
    def curve: AreaCurve = js.native
    inline def curve_=(x: AreaCurve): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("curve")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.defs")
    @js.native
    def defs: js.Array[scala.Nothing] = js.native
    inline def defs_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.dotBorderColor")
    @js.native
    def dotBorderColor: From = js.native
    inline def dotBorderColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.dotBorderWidth")
    @js.native
    def dotBorderWidth: Double = js.native
    inline def dotBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.dotColor")
    @js.native
    def dotColor: From = js.native
    inline def dotColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(x.asInstanceOf[js.Any])
    
    inline def dotComponent(hasXYSizeColorBorderWidthBorderColor: StreamDotsItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("dotComponent")(hasXYSizeColorBorderWidthBorderColor.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/stream", "svgDefaultProps.dotPosition")
    @js.native
    def dotPosition: start | center | end = js.native
    inline def dotPosition_=(x: start | center | end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.dotSize")
    @js.native
    def dotSize: Double = js.native
    inline def dotSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.enableDots")
    @js.native
    def enableDots: Boolean = js.native
    inline def enableDots_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableDots")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.enableStackTooltip")
    @js.native
    def enableStackTooltip: Boolean = js.native
    inline def enableStackTooltip_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableStackTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.fill")
    @js.native
    def fill: js.Array[scala.Nothing] = js.native
    
    @JSImport("@nivo/stream", "svgDefaultProps.fillOpacity")
    @js.native
    def fillOpacity: Double = js.native
    inline def fillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(x.asInstanceOf[js.Any])
    
    inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.isFocusable")
    @js.native
    def isFocusable: Boolean = js.native
    inline def isFocusable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFocusable")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.label")
    @js.native
    def label: String = js.native
    inline def label_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[StreamLayerId] = js.native
    inline def layers_=(x: js.Array[StreamLayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.legendLabel")
    @js.native
    def legendLabel: String = js.native
    inline def legendLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.offsetType")
    @js.native
    def offsetType: StackOffset = js.native
    inline def offsetType_=(x: StackOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offsetType")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.order")
    @js.native
    def order: StackOrder = js.native
    inline def order_=(x: StackOrder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("order")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream", "svgDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    inline def stackTooltip(hasSlice: StackTooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("stackTooltip")(hasSlice.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def tooltip(hasLayer: TooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(hasLayer.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
}

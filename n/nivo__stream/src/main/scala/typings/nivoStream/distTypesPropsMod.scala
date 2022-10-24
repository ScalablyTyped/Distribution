package typings.nivoStream

import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.AreaCurve
import typings.nivoCore.mod.StackOffset
import typings.nivoCore.mod.StackOrder
import typings.nivoStream.anon.From
import typings.nivoStream.anon.OmitStreamLayerDatalabelc
import typings.nivoStream.distTypesStreamDotsItemMod.StreamDotsItemProps
import typings.nivoStream.distTypesTypesMod.StackTooltipProps
import typings.nivoStream.distTypesTypesMod.StreamLayerData
import typings.nivoStream.distTypesTypesMod.StreamLayerId
import typings.nivoStream.distTypesTypesMod.TooltipProps
import typings.nivoStream.nivoStreamStrings.center
import typings.nivoStream.nivoStreamStrings.end
import typings.nivoStream.nivoStreamStrings.start
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPropsMod {
  
  object defaultProps {
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[StreamLayerData] = js.native
    inline def borderColor_=(x: InheritedColorConfig[StreamLayerData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.curve")
    @js.native
    def curve: AreaCurve = js.native
    inline def curve_=(x: AreaCurve): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("curve")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.dotBorderColor")
    @js.native
    def dotBorderColor: From = js.native
    inline def dotBorderColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.dotBorderWidth")
    @js.native
    def dotBorderWidth: Double = js.native
    inline def dotBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.dotColor")
    @js.native
    def dotColor: From = js.native
    inline def dotColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(x.asInstanceOf[js.Any])
    
    inline def dotComponent(param0: StreamDotsItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("dotComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.dotPosition")
    @js.native
    def dotPosition: start | center | end = js.native
    inline def dotPosition_=(x: start | center | end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.dotSize")
    @js.native
    def dotSize: Double = js.native
    inline def dotSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.enableDots")
    @js.native
    def enableDots: Boolean = js.native
    inline def enableDots_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableDots")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.enableStackTooltip")
    @js.native
    def enableStackTooltip: Boolean = js.native
    inline def enableStackTooltip_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableStackTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.fillOpacity")
    @js.native
    def fillOpacity: Double = js.native
    inline def fillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.label")
    @js.native
    def label: String = js.native
    inline def label_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.legendLabel")
    @js.native
    def legendLabel: String = js.native
    inline def legendLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.offsetType")
    @js.native
    def offsetType: StackOffset = js.native
    inline def offsetType_=(x: StackOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offsetType")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.order")
    @js.native
    def order: StackOrder = js.native
    inline def order_=(x: StackOrder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("order")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "defaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    inline def stackTooltip(param0: StackTooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("stackTooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def tooltip(param0: TooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  object svgDefaultProps {
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[StreamLayerData] = js.native
    inline def borderColor_=(x: InheritedColorConfig[StreamLayerData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.curve")
    @js.native
    def curve: AreaCurve = js.native
    inline def curve_=(x: AreaCurve): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("curve")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.defs")
    @js.native
    def defs: js.Array[scala.Nothing] = js.native
    inline def defs_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.dotBorderColor")
    @js.native
    def dotBorderColor: From = js.native
    inline def dotBorderColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.dotBorderWidth")
    @js.native
    def dotBorderWidth: Double = js.native
    inline def dotBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.dotColor")
    @js.native
    def dotColor: From = js.native
    inline def dotColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(x.asInstanceOf[js.Any])
    
    inline def dotComponent(param0: StreamDotsItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("dotComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.dotPosition")
    @js.native
    def dotPosition: start | center | end = js.native
    inline def dotPosition_=(x: start | center | end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.dotSize")
    @js.native
    def dotSize: Double = js.native
    inline def dotSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.enableDots")
    @js.native
    def enableDots: Boolean = js.native
    inline def enableDots_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableDots")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.enableStackTooltip")
    @js.native
    def enableStackTooltip: Boolean = js.native
    inline def enableStackTooltip_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableStackTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.fill")
    @js.native
    def fill: js.Array[scala.Nothing] = js.native
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.fillOpacity")
    @js.native
    def fillOpacity: Double = js.native
    inline def fillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(x.asInstanceOf[js.Any])
    
    inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.isFocusable")
    @js.native
    def isFocusable: Boolean = js.native
    inline def isFocusable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFocusable")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.label")
    @js.native
    def label: String = js.native
    inline def label_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[StreamLayerId] = js.native
    inline def layers_=(x: js.Array[StreamLayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.legendLabel")
    @js.native
    def legendLabel: String = js.native
    inline def legendLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.offsetType")
    @js.native
    def offsetType: StackOffset = js.native
    inline def offsetType_=(x: StackOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offsetType")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.order")
    @js.native
    def order: StackOrder = js.native
    inline def order_=(x: StackOrder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("order")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/stream/dist/types/props", "svgDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    inline def stackTooltip(param0: StackTooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("stackTooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def tooltip(param0: TooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
}

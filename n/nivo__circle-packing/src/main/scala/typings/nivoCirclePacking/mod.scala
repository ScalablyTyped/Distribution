package typings.nivoCirclePacking

import typings.nivoCirclePacking.anon.CanvasEl
import typings.nivoCirclePacking.anon.ChildColor
import typings.nivoCirclePacking.anon.Filter
import typings.nivoCirclePacking.anon.From
import typings.nivoCirclePacking.anon.Label
import typings.nivoCirclePacking.anon.Nodes
import typings.nivoCirclePacking.anon.PartialRecordonMouseMoveo
import typings.nivoCirclePacking.distTypesCirclePackingHtmlMod.InnerCirclePackingHtmlProps
import typings.nivoCirclePacking.distTypesResponsiveCirclePackingCanvasMod.ResponsiveCirclePackingCanvasProps
import typings.nivoCirclePacking.distTypesResponsiveCirclePackingHtmlMod.ResponsiveCirclePackingHtmlProps
import typings.nivoCirclePacking.distTypesResponsiveCirclePackingMod.ResponsiveCirclePackingProps
import typings.nivoCirclePacking.distTypesTypesMod.CirclePackingCanvasProps
import typings.nivoCirclePacking.distTypesTypesMod.CirclePackingCustomLayerProps
import typings.nivoCirclePacking.distTypesTypesMod.CirclePackingHtmlProps
import typings.nivoCirclePacking.distTypesTypesMod.CirclePackingLayerId
import typings.nivoCirclePacking.distTypesTypesMod.CirclePackingSvgProps
import typings.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typings.nivoCirclePacking.distTypesTypesMod.MouseHandlers
import typings.nivoCirclePacking.nivoCirclePackingStrings.data
import typings.nivoCirclePacking.nivoCirclePackingStrings.depth
import typings.nivoCirclePacking.nivoCirclePackingStrings.height
import typings.nivoCirclePacking.nivoCirclePackingStrings.width
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/circle-packing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CirclePacking[RawDatum](
    param0: (Partial[Omit[CirclePackingSvgProps[RawDatum], data | height | width]]) & (Pick[CirclePackingSvgProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CirclePacking")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CirclePackingCanvas[RawDatum](
    param0: (Partial[Omit[CirclePackingCanvasProps[RawDatum], data | height | width]]) & (Pick[CirclePackingCanvasProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CirclePackingCanvas")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CirclePackingHtml[RawDatum](
    param0: (Partial[Omit[CirclePackingHtmlProps[RawDatum], data | height | width]]) & (Pick[CirclePackingHtmlProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CirclePackingHtml")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCirclePackingHtml[RawDatum](param0: InnerCirclePackingHtmlProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCirclePackingHtml")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveCirclePacking[RawDatum](props: ResponsiveCirclePackingProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveCirclePacking")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveCirclePackingCanvas[RawDatum](props: ResponsiveCirclePackingCanvasProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveCirclePackingCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveCirclePackingHtml[RawDatum](props: ResponsiveCirclePackingHtmlProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveCirclePackingHtml")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object defaultProps {
    
    @JSImport("@nivo/circle-packing", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/circle-packing", "defaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.borderColor")
    @js.native
    def borderColor: From = js.native
    inline def borderColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.childColor")
    @js.native
    def childColor: From = js.native
    inline def childColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.colorBy")
    @js.native
    def colorBy: depth = js.native
    inline def colorBy_=(x: depth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[Any] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.defs")
    @js.native
    def defs: js.Array[scala.Nothing] = js.native
    inline def defs_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.enableLabels")
    @js.native
    def enableLabels: Boolean = js.native
    inline def enableLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.fill")
    @js.native
    def fill: js.Array[scala.Nothing] = js.native
    inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.inheritColorFromParent")
    @js.native
    def inheritColorFromParent: Boolean = js.native
    inline def inheritColorFromParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inheritColorFromParent")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.label")
    @js.native
    def label: String = js.native
    
    @JSImport("@nivo/circle-packing", "defaultProps.labelTextColor")
    @js.native
    def labelTextColor: From = js.native
    inline def labelTextColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.labelsSkipRadius")
    @js.native
    def labelsSkipRadius: Double = js.native
    inline def labelsSkipRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelsSkipRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.layers")
    @js.native
    def layers: js.Array[CirclePackingLayerId] = js.native
    inline def layers_=(x: js.Array[CirclePackingLayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.leavesOnly")
    @js.native
    def leavesOnly: Boolean = js.native
    inline def leavesOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.padding")
    @js.native
    def padding: Double = js.native
    inline def padding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/circle-packing", "defaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum](param0: ComputedDatum[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/circle-packing", "defaultProps.value")
    @js.native
    def value: String = js.native
    inline def value_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  inline def useCirclePacking[RawDatum](param0: ChildColor[RawDatum]): js.Array[ComputedDatum[RawDatum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePacking")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  
  inline def useCirclePackingLabels[RawDatum](param0: Filter[RawDatum]): js.Array[Label[RawDatum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingLabels")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Label[RawDatum]]]
  
  inline def useCirclePackingLayerContext[RawDatum](param0: Nodes[RawDatum]): CirclePackingCustomLayerProps[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingLayerContext")(param0.asInstanceOf[js.Any]).asInstanceOf[CirclePackingCustomLayerProps[RawDatum]]
  
  inline def useCirclePackingZoom[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]], zoomedId: String, width: Double, height: Double): js.Array[ComputedDatum[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingZoom")(nodes.asInstanceOf[js.Any], zoomedId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  inline def useCirclePackingZoom[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]], zoomedId: Null, width: Double, height: Double): js.Array[ComputedDatum[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingZoom")(nodes.asInstanceOf[js.Any], zoomedId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  inline def useCirclePackingZoom[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]], zoomedId: Unit, width: Double, height: Double): js.Array[ComputedDatum[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingZoom")(nodes.asInstanceOf[js.Any], zoomedId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  
  inline def useMouseCircleDetection[RawDatum](param0: CanvasEl[RawDatum]): js.Function1[
    /* event */ MouseEvent[typings.std.Element, NativeMouseEvent], 
    js.UndefOr[ComputedDatum[RawDatum] | Null]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMouseCircleDetection")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* event */ MouseEvent[typings.std.Element, NativeMouseEvent], 
    js.UndefOr[ComputedDatum[RawDatum] | Null]
  ]]
  
  inline def useNodeMouseHandlers[RawDatum](node: ComputedDatum[RawDatum], param1: MouseHandlers[RawDatum]): PartialRecordonMouseMoveo = (^.asInstanceOf[js.Dynamic].applyDynamic("useNodeMouseHandlers")(node.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[PartialRecordonMouseMoveo]
}

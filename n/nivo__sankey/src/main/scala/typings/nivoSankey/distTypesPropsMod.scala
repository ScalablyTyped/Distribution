package typings.nivoSankey

import typings.d3Sankey.anon.SankeyNode
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoSankey.anon.Scheme
import typings.nivoSankey.distTypesSankeyLinkTooltipMod.SankeyLinkTooltipProps
import typings.nivoSankey.distTypesSankeyNodeTooltipMod.SankeyNodeTooltipProps
import typings.nivoSankey.distTypesTypesMod.DefaultLink
import typings.nivoSankey.distTypesTypesMod.DefaultNode
import typings.nivoSankey.distTypesTypesMod.SankeyAlignType
import typings.nivoSankey.distTypesTypesMod.SankeyLayerId
import typings.nivoSankey.nivoSankeyStrings.auto
import typings.nivoSankey.nivoSankeyStrings.center
import typings.nivoSankey.nivoSankeyStrings.horizontal
import typings.nivoSankey.nivoSankeyStrings.inside
import typings.nivoSankey.nivoSankeyStrings.multiply
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPropsMod {
  
  @JSImport("@nivo/sankey/dist/types/props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sankeyAlignmentFromProp(prop: SankeyAlignType): js.Function2[/* node */ SankeyNode, /* n */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankeyAlignmentFromProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* node */ SankeyNode, /* n */ Double, Double]]
  
  @JSImport("@nivo/sankey/dist/types/props", "sankeyAlignmentPropKeys")
  @js.native
  val sankeyAlignmentPropKeys: js.Array[SankeyAlignType] = js.native
  
  object sankeyAlignmentPropMapping {
    
    @JSImport("@nivo/sankey/dist/types/props", "sankeyAlignmentPropMapping")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/sankey/dist/types/props", "sankeyAlignmentPropMapping.center")
    @js.native
    def center: js.Function2[/* node */ SankeyNode, /* n */ Double, Double] = js.native
    inline def center_=(x: js.Function2[/* node */ SankeyNode, /* n */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "sankeyAlignmentPropMapping.end")
    @js.native
    def end: js.Function2[/* node */ SankeyNode, /* n */ Double, Double] = js.native
    inline def end_=(x: js.Function2[/* node */ SankeyNode, /* n */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "sankeyAlignmentPropMapping.justify")
    @js.native
    def justify: js.Function2[/* node */ SankeyNode, /* n */ Double, Double] = js.native
    inline def justify_=(x: js.Function2[/* node */ SankeyNode, /* n */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("justify")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "sankeyAlignmentPropMapping.start")
    @js.native
    def start: js.Function2[/* node */ SankeyNode, /* n */ Double, Double] = js.native
    inline def start_=(x: js.Function2[/* node */ SankeyNode, /* n */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  object svgDefaultProps {
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.align")
    @js.native
    def align: center = js.native
    inline def align_=(x: center): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.colors")
    @js.native
    def colors: Scheme = js.native
    inline def colors_=(x: Scheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.enableLabels")
    @js.native
    def enableLabels: Boolean = js.native
    inline def enableLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.enableLinkGradient")
    @js.native
    def enableLinkGradient: Boolean = js.native
    inline def enableLinkGradient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLinkGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.label")
    @js.native
    def label: String = js.native
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.labelOrientation")
    @js.native
    def labelOrientation: horizontal = js.native
    inline def labelOrientation_=(x: horizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOrientation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.labelPadding")
    @js.native
    def labelPadding: Double = js.native
    inline def labelPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.labelPosition")
    @js.native
    def labelPosition: inside = js.native
    inline def labelPosition_=(x: inside): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[Any] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[SankeyLayerId] = js.native
    inline def layers_=(x: js.Array[SankeyLayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.layout")
    @js.native
    def layout: horizontal = js.native
    inline def layout_=(x: horizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layout")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.linkBlendMode")
    @js.native
    def linkBlendMode: multiply = js.native
    inline def linkBlendMode_=(x: multiply): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkBlendMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.linkContract")
    @js.native
    def linkContract: Double = js.native
    inline def linkContract_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkContract")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.linkHoverOpacity")
    @js.native
    def linkHoverOpacity: Double = js.native
    inline def linkHoverOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkHoverOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.linkHoverOthersOpacity")
    @js.native
    def linkHoverOthersOpacity: Double = js.native
    inline def linkHoverOthersOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkHoverOthersOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.linkOpacity")
    @js.native
    def linkOpacity: Double = js.native
    inline def linkOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkOpacity")(x.asInstanceOf[js.Any])
    
    inline def linkTooltip[N_1 /* <: DefaultNode */, L_1 /* <: DefaultLink */](param0: SankeyLinkTooltipProps[N_1, L_1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("linkTooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.nodeBorderColor")
    @js.native
    def nodeBorderColor: InheritedColorConfig[Any] = js.native
    inline def nodeBorderColor_=(x: InheritedColorConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.nodeBorderRadius")
    @js.native
    def nodeBorderRadius: Double = js.native
    inline def nodeBorderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeBorderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.nodeBorderWidth")
    @js.native
    def nodeBorderWidth: Double = js.native
    inline def nodeBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.nodeHoverOpacity")
    @js.native
    def nodeHoverOpacity: Double = js.native
    inline def nodeHoverOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeHoverOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.nodeHoverOthersOpacity")
    @js.native
    def nodeHoverOthersOpacity: Double = js.native
    inline def nodeHoverOthersOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeHoverOthersOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.nodeInnerPadding")
    @js.native
    def nodeInnerPadding: Double = js.native
    inline def nodeInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.nodeOpacity")
    @js.native
    def nodeOpacity: Double = js.native
    inline def nodeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.nodeSpacing")
    @js.native
    def nodeSpacing: Double = js.native
    inline def nodeSpacing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.nodeThickness")
    @js.native
    def nodeThickness: Double = js.native
    inline def nodeThickness_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeThickness")(x.asInstanceOf[js.Any])
    
    inline def nodeTooltip[N /* <: DefaultNode */, L /* <: DefaultLink */](param0: SankeyNodeTooltipProps[N, L]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeTooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sankey/dist/types/props", "svgDefaultProps.sort")
    @js.native
    def sort: auto = js.native
    inline def sort_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sort")(x.asInstanceOf[js.Any])
  }
}

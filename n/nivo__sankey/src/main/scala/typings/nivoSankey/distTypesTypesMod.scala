package typings.nivoSankey

import typings.d3Sankey.mod.SankeyNodeMinimal
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.distTypesTypesMod.LegendProps
import typings.nivoSankey.anon.Depth
import typings.nivoSankey.anon.EndColor
import typings.nivoSankey.anon.Link
import typings.nivoSankey.anon.Links
import typings.nivoSankey.anon.Node
import typings.nivoSankey.nivoSankeyStrings.color
import typings.nivoSankey.nivoSankeyStrings.horizontal
import typings.nivoSankey.nivoSankeyStrings.inside
import typings.nivoSankey.nivoSankeyStrings.label
import typings.nivoSankey.nivoSankeyStrings.outside
import typings.nivoSankey.nivoSankeyStrings.source
import typings.nivoSankey.nivoSankeyStrings.target
import typings.nivoSankey.nivoSankeyStrings.value
import typings.nivoSankey.nivoSankeyStrings.vertical
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactSpringCore.mod.SpringConfig
import typings.std.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait DefaultLink extends StObject {
    
    var endColor: js.UndefOr[String] = js.undefined
    
    var source: String
    
    var startColor: js.UndefOr[String] = js.undefined
    
    var target: String
    
    var value: Double
  }
  object DefaultLink {
    
    inline def apply(source: String, target: String, value: Double): DefaultLink = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultLink]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultLink] (val x: Self) extends AnyVal {
      
      inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
      
      inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
      
      inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultNode extends StObject {
    
    var id: String
  }
  object DefaultNode {
    
    inline def apply(id: String): DefaultNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultNode] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtraLinkProps[L /* <: DefaultLink */] = Omit[L, source | target | value]
  
  type SankeyAlignFunction = js.Function2[/* node */ SankeyNodeMinimal[Any, Any], /* n */ Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoSankey.nivoSankeyStrings.center
    - typings.nivoSankey.nivoSankeyStrings.justify
    - typings.nivoSankey.nivoSankeyStrings.start
    - typings.nivoSankey.nivoSankeyStrings.end
  */
  trait SankeyAlignType extends StObject
  object SankeyAlignType {
    
    inline def center: typings.nivoSankey.nivoSankeyStrings.center = "center".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.center]
    
    inline def end: typings.nivoSankey.nivoSankeyStrings.end = "end".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.end]
    
    inline def justify: typings.nivoSankey.nivoSankeyStrings.justify = "justify".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.justify]
    
    inline def start: typings.nivoSankey.nivoSankeyStrings.start = "start".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.start]
  }
  
  trait SankeyCommonProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var align: SankeyAlignType | SankeyAlignFunction
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var colors: OrdinalColorScaleConfig[Omit[SankeyNodeDatum[N, L], color | label]]
    
    var enableLabels: Boolean
    
    var enableLinkGradient: Boolean
    
    var isInteractive: Boolean
    
    var label: PropertyAccessor[
        Omit[SankeyNodeDatum[N, L], color | typings.nivoSankey.nivoSankeyStrings.label], 
        String
      ]
    
    var labelOrientation: horizontal | vertical
    
    var labelPadding: Double
    
    var labelPosition: inside | outside
    
    var labelTextColor: InheritedColorConfig[SankeyNodeDatum[N, L]]
    
    var layers: js.Array[SankeyLayerId]
    
    var layout: horizontal | vertical
    
    var legends: js.Array[LegendProps]
    
    var linkBlendMode: CssMixBlendMode
    
    var linkContract: Double
    
    var linkHoverOpacity: Double
    
    var linkHoverOthersOpacity: Double
    
    var linkOpacity: Double
    
    var linkTooltip: FunctionComponent[Link[N, L]]
    
    var margin: Box
    
    var nodeBorderColor: InheritedColorConfig[SankeyNodeDatum[N, L]]
    
    var nodeBorderRadius: Double
    
    var nodeBorderWidth: Double
    
    var nodeHoverOpacity: Double
    
    var nodeHoverOthersOpacity: Double
    
    var nodeInnerPadding: Double
    
    var nodeOpacity: Double
    
    var nodeSpacing: Double
    
    var nodeThickness: Double
    
    var nodeTooltip: FunctionComponent[Node[N, L]]
    
    var onClick: SankeyMouseHandler
    
    var renderWrapper: Boolean
    
    var role: String
    
    var sort: SankeySortType | (SankeySortFunction[N, L])
    
    var theme: Theme
    
    var valueFormat: ValueFormat[Double, Unit]
  }
  object SankeyCommonProps {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
      align: SankeyAlignType | SankeyAlignFunction,
      colors: OrdinalColorScaleConfig[Omit[SankeyNodeDatum[N, L], color | label]],
      enableLabels: Boolean,
      enableLinkGradient: Boolean,
      isInteractive: Boolean,
      label: PropertyAccessor[Omit[SankeyNodeDatum[N, L], color | label], String],
      labelOrientation: horizontal | vertical,
      labelPadding: Double,
      labelPosition: inside | outside,
      labelTextColor: InheritedColorConfig[SankeyNodeDatum[N, L]],
      layers: js.Array[SankeyLayerId],
      layout: horizontal | vertical,
      legends: js.Array[LegendProps],
      linkBlendMode: CssMixBlendMode,
      linkContract: Double,
      linkHoverOpacity: Double,
      linkHoverOthersOpacity: Double,
      linkOpacity: Double,
      linkTooltip: FunctionComponent[Link[N, L]],
      margin: Box,
      nodeBorderColor: InheritedColorConfig[SankeyNodeDatum[N, L]],
      nodeBorderRadius: Double,
      nodeBorderWidth: Double,
      nodeHoverOpacity: Double,
      nodeHoverOthersOpacity: Double,
      nodeInnerPadding: Double,
      nodeOpacity: Double,
      nodeSpacing: Double,
      nodeThickness: Double,
      nodeTooltip: FunctionComponent[Node[N, L]],
      onClick: (/* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
      renderWrapper: Boolean,
      role: String,
      sort: SankeySortType | (SankeySortFunction[N, L]),
      theme: Theme,
      valueFormat: ValueFormat[Double, Unit]
    ): SankeyCommonProps[N, L] = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any], enableLinkGradient = enableLinkGradient.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelOrientation = labelOrientation.asInstanceOf[js.Any], labelPadding = labelPadding.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], linkBlendMode = linkBlendMode.asInstanceOf[js.Any], linkContract = linkContract.asInstanceOf[js.Any], linkHoverOpacity = linkHoverOpacity.asInstanceOf[js.Any], linkHoverOthersOpacity = linkHoverOthersOpacity.asInstanceOf[js.Any], linkOpacity = linkOpacity.asInstanceOf[js.Any], linkTooltip = linkTooltip.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], nodeBorderColor = nodeBorderColor.asInstanceOf[js.Any], nodeBorderRadius = nodeBorderRadius.asInstanceOf[js.Any], nodeBorderWidth = nodeBorderWidth.asInstanceOf[js.Any], nodeHoverOpacity = nodeHoverOpacity.asInstanceOf[js.Any], nodeHoverOthersOpacity = nodeHoverOthersOpacity.asInstanceOf[js.Any], nodeInnerPadding = nodeInnerPadding.asInstanceOf[js.Any], nodeOpacity = nodeOpacity.asInstanceOf[js.Any], nodeSpacing = nodeSpacing.asInstanceOf[js.Any], nodeThickness = nodeThickness.asInstanceOf[js.Any], nodeTooltip = nodeTooltip.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], valueFormat = valueFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyCommonProps[N, L]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SankeyCommonProps[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */] (val x: Self & (SankeyCommonProps[N, L])) extends AnyVal {
      
      inline def setAlign(value: SankeyAlignType | SankeyAlignFunction): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignFunction2(value: (/* node */ SankeyNodeMinimal[Any, Any], /* n */ Double) => Double): Self = StObject.set(x, "align", js.Any.fromFunction2(value))
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[SankeyNodeDatum[N, L], color | label]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[SankeyNodeDatum[N, L], color | label] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableLinkGradient(value: Boolean): Self = StObject.set(x, "enableLinkGradient", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: PropertyAccessor[Omit[SankeyNodeDatum[N, L], color | label], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: Omit[SankeyNodeDatum[N, L], color | label] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelOrientation(value: horizontal | vertical): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      inline def setLabelPadding(value: Double): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPosition(value: inside | outside): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColor(value: InheritedColorConfig[SankeyNodeDatum[N, L]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[SankeyLayerId]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: SankeyLayerId*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setLinkBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "linkBlendMode", value.asInstanceOf[js.Any])
      
      inline def setLinkContract(value: Double): Self = StObject.set(x, "linkContract", value.asInstanceOf[js.Any])
      
      inline def setLinkHoverOpacity(value: Double): Self = StObject.set(x, "linkHoverOpacity", value.asInstanceOf[js.Any])
      
      inline def setLinkHoverOthersOpacity(value: Double): Self = StObject.set(x, "linkHoverOthersOpacity", value.asInstanceOf[js.Any])
      
      inline def setLinkOpacity(value: Double): Self = StObject.set(x, "linkOpacity", value.asInstanceOf[js.Any])
      
      inline def setLinkTooltip(value: FunctionComponent[Link[N, L]]): Self = StObject.set(x, "linkTooltip", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setNodeBorderColor(value: InheritedColorConfig[SankeyNodeDatum[N, L]]): Self = StObject.set(x, "nodeBorderColor", value.asInstanceOf[js.Any])
      
      inline def setNodeBorderRadius(value: Double): Self = StObject.set(x, "nodeBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setNodeBorderWidth(value: Double): Self = StObject.set(x, "nodeBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setNodeHoverOpacity(value: Double): Self = StObject.set(x, "nodeHoverOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeHoverOthersOpacity(value: Double): Self = StObject.set(x, "nodeHoverOthersOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeInnerPadding(value: Double): Self = StObject.set(x, "nodeInnerPadding", value.asInstanceOf[js.Any])
      
      inline def setNodeOpacity(value: Double): Self = StObject.set(x, "nodeOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeSpacing(value: Double): Self = StObject.set(x, "nodeSpacing", value.asInstanceOf[js.Any])
      
      inline def setNodeThickness(value: Double): Self = StObject.set(x, "nodeThickness", value.asInstanceOf[js.Any])
      
      inline def setNodeTooltip(value: FunctionComponent[Node[N, L]]): Self = StObject.set(x, "nodeTooltip", value.asInstanceOf[js.Any])
      
      inline def setOnClick(
        value: (/* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setSort(value: SankeySortType | (SankeySortFunction[N, L])): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* a */ SankeyNodeDatum[N, L], /* b */ SankeyNodeDatum[N, L]) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    }
  }
  
  trait SankeyDataProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var data: Links[N, L]
  }
  object SankeyDataProps {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](data: Links[N, L]): SankeyDataProps[N, L] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyDataProps[N, L]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SankeyDataProps[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */] (val x: Self & (SankeyDataProps[N, L])) extends AnyVal {
      
      inline def setData(value: Links[N, L]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoSankey.nivoSankeyStrings.links
    - typings.nivoSankey.nivoSankeyStrings.nodes
    - typings.nivoSankey.nivoSankeyStrings.labels
    - typings.nivoSankey.nivoSankeyStrings.legends
  */
  trait SankeyLayerId extends StObject
  object SankeyLayerId {
    
    inline def labels: typings.nivoSankey.nivoSankeyStrings.labels = "labels".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.labels]
    
    inline def legends: typings.nivoSankey.nivoSankeyStrings.legends = "legends".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.legends]
    
    inline def links: typings.nivoSankey.nivoSankeyStrings.links = "links".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.links]
    
    inline def nodes: typings.nivoSankey.nivoSankeyStrings.nodes = "nodes".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.nodes]
  }
  
  type SankeyLinkDatum[N /* <: DefaultNode */, L /* <: DefaultLink */] = ExtraLinkProps[L] & (EndColor[N, L])
  
  type SankeyMouseHandler = js.Function2[
    /* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), 
    /* event */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
  
  type SankeyNodeDatum[N /* <: DefaultNode */, L /* <: DefaultLink */] = N & (Depth[N, L])
  
  trait SankeyRawLink extends StObject {
    
    var endColor: js.UndefOr[String] = js.undefined
    
    var source: String
    
    var startColor: js.UndefOr[String] = js.undefined
    
    var target: String
    
    var value: Double
  }
  object SankeyRawLink {
    
    inline def apply(source: String, target: String, value: Double): SankeyRawLink = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyRawLink]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SankeyRawLink] (val x: Self) extends AnyVal {
      
      inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
      
      inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
      
      inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SankeyRawNode extends StObject {
    
    var id: String
  }
  object SankeyRawNode {
    
    inline def apply(id: String): SankeyRawNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyRawNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SankeyRawNode] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type SankeySortFunction[N /* <: DefaultNode */, L /* <: DefaultLink */] = js.Function2[/* a */ SankeyNodeDatum[N, L], /* b */ SankeyNodeDatum[N, L], Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoSankey.nivoSankeyStrings.auto
    - typings.nivoSankey.nivoSankeyStrings.input
    - typings.nivoSankey.nivoSankeyStrings.ascending
    - typings.nivoSankey.nivoSankeyStrings.descending
  */
  trait SankeySortType extends StObject
  object SankeySortType {
    
    inline def ascending: typings.nivoSankey.nivoSankeyStrings.ascending = "ascending".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.ascending]
    
    inline def auto: typings.nivoSankey.nivoSankeyStrings.auto = "auto".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.auto]
    
    inline def descending: typings.nivoSankey.nivoSankeyStrings.descending = "descending".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.descending]
    
    inline def input: typings.nivoSankey.nivoSankeyStrings.input = "input".asInstanceOf[typings.nivoSankey.nivoSankeyStrings.input]
  }
  
  /* Inlined std.Partial<@nivo/sankey.@nivo/sankey/dist/types/types.SankeyCommonProps<N, L>> & @nivo/sankey.@nivo/sankey/dist/types/types.SankeyDataProps<N, L> & @nivo/core.@nivo/core.Dimensions & @nivo/core.@nivo/core.MotionProps */
  trait SankeySvgProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var align: js.UndefOr[SankeyAlignType | SankeyAlignFunction] = js.undefined
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[Omit[SankeyNodeDatum[N, L], color | label]]] = js.undefined
    
    var data: Links[N, L]
    
    var enableLabels: js.UndefOr[Boolean] = js.undefined
    
    var enableLinkGradient: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[
        PropertyAccessor[
          Omit[SankeyNodeDatum[N, L], color | typings.nivoSankey.nivoSankeyStrings.label], 
          String
        ]
      ] = js.undefined
    
    var labelOrientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var labelPadding: js.UndefOr[Double] = js.undefined
    
    var labelPosition: js.UndefOr[inside | outside] = js.undefined
    
    var labelTextColor: js.UndefOr[InheritedColorConfig[SankeyNodeDatum[N, L]]] = js.undefined
    
    var layers: js.UndefOr[js.Array[SankeyLayerId]] = js.undefined
    
    var layout: js.UndefOr[horizontal | vertical] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var linkBlendMode: js.UndefOr[CssMixBlendMode] = js.undefined
    
    var linkContract: js.UndefOr[Double] = js.undefined
    
    var linkHoverOpacity: js.UndefOr[Double] = js.undefined
    
    var linkHoverOthersOpacity: js.UndefOr[Double] = js.undefined
    
    var linkOpacity: js.UndefOr[Double] = js.undefined
    
    var linkTooltip: js.UndefOr[FunctionComponent[Link[N, L]]] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[String | SpringConfig] = js.undefined
    
    var nodeBorderColor: js.UndefOr[InheritedColorConfig[SankeyNodeDatum[N, L]]] = js.undefined
    
    var nodeBorderRadius: js.UndefOr[Double] = js.undefined
    
    var nodeBorderWidth: js.UndefOr[Double] = js.undefined
    
    var nodeHoverOpacity: js.UndefOr[Double] = js.undefined
    
    var nodeHoverOthersOpacity: js.UndefOr[Double] = js.undefined
    
    var nodeInnerPadding: js.UndefOr[Double] = js.undefined
    
    var nodeOpacity: js.UndefOr[Double] = js.undefined
    
    var nodeSpacing: js.UndefOr[Double] = js.undefined
    
    var nodeThickness: js.UndefOr[Double] = js.undefined
    
    var nodeTooltip: js.UndefOr[FunctionComponent[Node[N, L]]] = js.undefined
    
    var onClick: js.UndefOr[SankeyMouseHandler] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var sort: js.UndefOr[SankeySortType | (SankeySortFunction[N, L])] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object SankeySvgProps {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](data: Links[N, L], height: Double, width: Double): SankeySvgProps[N, L] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeySvgProps[N, L]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SankeySvgProps[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */] (val x: Self & (SankeySvgProps[N, L])) extends AnyVal {
      
      inline def setAlign(value: SankeyAlignType | SankeyAlignFunction): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignFunction2(value: (/* node */ SankeyNodeMinimal[Any, Any], /* n */ Double) => Double): Self = StObject.set(x, "align", js.Any.fromFunction2(value))
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[SankeyNodeDatum[N, L], color | label]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[SankeyNodeDatum[N, L], color | label] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: Links[N, L]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelsUndefined: Self = StObject.set(x, "enableLabels", js.undefined)
      
      inline def setEnableLinkGradient(value: Boolean): Self = StObject.set(x, "enableLinkGradient", value.asInstanceOf[js.Any])
      
      inline def setEnableLinkGradientUndefined: Self = StObject.set(x, "enableLinkGradient", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setLabel(value: PropertyAccessor[Omit[SankeyNodeDatum[N, L], color | label], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: Omit[SankeyNodeDatum[N, L], color | label] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelOrientation(value: horizontal | vertical): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      inline def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
      
      inline def setLabelPadding(value: Double): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      inline def setLabelPosition(value: inside | outside): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelTextColor(value: InheritedColorConfig[SankeyNodeDatum[N, L]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayers(value: js.Array[SankeyLayerId]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: SankeyLayerId*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setLinkBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "linkBlendMode", value.asInstanceOf[js.Any])
      
      inline def setLinkBlendModeUndefined: Self = StObject.set(x, "linkBlendMode", js.undefined)
      
      inline def setLinkContract(value: Double): Self = StObject.set(x, "linkContract", value.asInstanceOf[js.Any])
      
      inline def setLinkContractUndefined: Self = StObject.set(x, "linkContract", js.undefined)
      
      inline def setLinkHoverOpacity(value: Double): Self = StObject.set(x, "linkHoverOpacity", value.asInstanceOf[js.Any])
      
      inline def setLinkHoverOpacityUndefined: Self = StObject.set(x, "linkHoverOpacity", js.undefined)
      
      inline def setLinkHoverOthersOpacity(value: Double): Self = StObject.set(x, "linkHoverOthersOpacity", value.asInstanceOf[js.Any])
      
      inline def setLinkHoverOthersOpacityUndefined: Self = StObject.set(x, "linkHoverOthersOpacity", js.undefined)
      
      inline def setLinkOpacity(value: Double): Self = StObject.set(x, "linkOpacity", value.asInstanceOf[js.Any])
      
      inline def setLinkOpacityUndefined: Self = StObject.set(x, "linkOpacity", js.undefined)
      
      inline def setLinkTooltip(value: FunctionComponent[Link[N, L]]): Self = StObject.set(x, "linkTooltip", value.asInstanceOf[js.Any])
      
      inline def setLinkTooltipUndefined: Self = StObject.set(x, "linkTooltip", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(value: String | SpringConfig): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setNodeBorderColor(value: InheritedColorConfig[SankeyNodeDatum[N, L]]): Self = StObject.set(x, "nodeBorderColor", value.asInstanceOf[js.Any])
      
      inline def setNodeBorderColorUndefined: Self = StObject.set(x, "nodeBorderColor", js.undefined)
      
      inline def setNodeBorderRadius(value: Double): Self = StObject.set(x, "nodeBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setNodeBorderRadiusUndefined: Self = StObject.set(x, "nodeBorderRadius", js.undefined)
      
      inline def setNodeBorderWidth(value: Double): Self = StObject.set(x, "nodeBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setNodeBorderWidthUndefined: Self = StObject.set(x, "nodeBorderWidth", js.undefined)
      
      inline def setNodeHoverOpacity(value: Double): Self = StObject.set(x, "nodeHoverOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeHoverOpacityUndefined: Self = StObject.set(x, "nodeHoverOpacity", js.undefined)
      
      inline def setNodeHoverOthersOpacity(value: Double): Self = StObject.set(x, "nodeHoverOthersOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeHoverOthersOpacityUndefined: Self = StObject.set(x, "nodeHoverOthersOpacity", js.undefined)
      
      inline def setNodeInnerPadding(value: Double): Self = StObject.set(x, "nodeInnerPadding", value.asInstanceOf[js.Any])
      
      inline def setNodeInnerPaddingUndefined: Self = StObject.set(x, "nodeInnerPadding", js.undefined)
      
      inline def setNodeOpacity(value: Double): Self = StObject.set(x, "nodeOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeOpacityUndefined: Self = StObject.set(x, "nodeOpacity", js.undefined)
      
      inline def setNodeSpacing(value: Double): Self = StObject.set(x, "nodeSpacing", value.asInstanceOf[js.Any])
      
      inline def setNodeSpacingUndefined: Self = StObject.set(x, "nodeSpacing", js.undefined)
      
      inline def setNodeThickness(value: Double): Self = StObject.set(x, "nodeThickness", value.asInstanceOf[js.Any])
      
      inline def setNodeThicknessUndefined: Self = StObject.set(x, "nodeThickness", js.undefined)
      
      inline def setNodeTooltip(value: FunctionComponent[Node[N, L]]): Self = StObject.set(x, "nodeTooltip", value.asInstanceOf[js.Any])
      
      inline def setNodeTooltipUndefined: Self = StObject.set(x, "nodeTooltip", js.undefined)
      
      inline def setOnClick(
        value: (/* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSort(value: SankeySortType | (SankeySortFunction[N, L])): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* a */ SankeyNodeDatum[N, L], /* b */ SankeyNodeDatum[N, L]) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

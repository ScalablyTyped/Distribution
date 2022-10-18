package typings.nivoSankey

import typings.d3Sankey.mod.SankeyNodeMinimal
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigCustomFunction
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.ValueFormat
import typings.nivoSankey.distTypesTypesMod.DefaultLink
import typings.nivoSankey.distTypesTypesMod.DefaultNode
import typings.nivoSankey.distTypesTypesMod.SankeyAlignFunction
import typings.nivoSankey.distTypesTypesMod.SankeyAlignType
import typings.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import typings.nivoSankey.distTypesTypesMod.SankeyNodeDatum
import typings.nivoSankey.distTypesTypesMod.SankeySortFunction
import typings.nivoSankey.distTypesTypesMod.SankeySortType
import typings.nivoSankey.nivoSankeyStrings.color
import typings.nivoSankey.nivoSankeyStrings.horizontal
import typings.nivoSankey.nivoSankeyStrings.label
import typings.nivoSankey.nivoSankeyStrings.nivo
import typings.nivoSankey.nivoSankeyStrings.vertical
import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var align: SankeyAlignType | SankeyAlignFunction
    
    var colors: OrdinalColorScaleConfig[Omit[SankeyNodeDatum[N, L], color | label]]
    
    var data: Links[N, L]
    
    var height: Double
    
    var label: PropertyAccessor[
        Omit[SankeyNodeDatum[N, L], color | typings.nivoSankey.nivoSankeyStrings.label], 
        String
      ]
    
    var labelTextColor: InheritedColorConfig[SankeyNodeDatum[N, L]]
    
    var layout: horizontal | vertical
    
    var nodeBorderColor: InheritedColorConfig[SankeyNodeDatum[N, L]]
    
    var nodeInnerPadding: Double
    
    var nodeSpacing: Double
    
    var nodeThickness: Double
    
    var sort: SankeySortType | (SankeySortFunction[N, L])
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object Align {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
      align: SankeyAlignType | SankeyAlignFunction,
      colors: OrdinalColorScaleConfig[Omit[SankeyNodeDatum[N, L], color | label]],
      data: Links[N, L],
      height: Double,
      label: PropertyAccessor[Omit[SankeyNodeDatum[N, L], color | label], String],
      labelTextColor: InheritedColorConfig[SankeyNodeDatum[N, L]],
      layout: horizontal | vertical,
      nodeBorderColor: InheritedColorConfig[SankeyNodeDatum[N, L]],
      nodeInnerPadding: Double,
      nodeSpacing: Double,
      nodeThickness: Double,
      sort: SankeySortType | (SankeySortFunction[N, L]),
      width: Double
    ): Align[N, L] = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodeBorderColor = nodeBorderColor.asInstanceOf[js.Any], nodeInnerPadding = nodeInnerPadding.asInstanceOf[js.Any], nodeSpacing = nodeSpacing.asInstanceOf[js.Any], nodeThickness = nodeThickness.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align[N, L]]
    }
    
    extension [Self <: Align[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (Align[N, L])) {
      
      inline def setAlign(value: SankeyAlignType | SankeyAlignFunction): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignFunction2(value: (/* node */ SankeyNodeMinimal[Any, Any], /* n */ Double) => Double): Self = StObject.set(x, "align", js.Any.fromFunction2(value))
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[SankeyNodeDatum[N, L], color | label]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[SankeyNodeDatum[N, L], color | label] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: Links[N, L]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: PropertyAccessor[Omit[SankeyNodeDatum[N, L], color | label], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: Omit[SankeyNodeDatum[N, L], color | label] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelTextColor(value: InheritedColorConfig[SankeyNodeDatum[N, L]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setNodeBorderColor(value: InheritedColorConfig[SankeyNodeDatum[N, L]]): Self = StObject.set(x, "nodeBorderColor", value.asInstanceOf[js.Any])
      
      inline def setNodeInnerPadding(value: Double): Self = StObject.set(x, "nodeInnerPadding", value.asInstanceOf[js.Any])
      
      inline def setNodeSpacing(value: Double): Self = StObject.set(x, "nodeSpacing", value.asInstanceOf[js.Any])
      
      inline def setNodeThickness(value: Double): Self = StObject.set(x, "nodeThickness", value.asInstanceOf[js.Any])
      
      inline def setSort(value: SankeySortType | (SankeySortFunction[N, L])): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* a */ SankeyNodeDatum[N, L], /* b */ SankeyNodeDatum[N, L]) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlignFunction[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var alignFunction: SankeyAlignFunction
    
    var data: Links[N, L]
    
    def formatValue(value: Double): String
    
    def getColor(node: Omit[SankeyNodeDatum[N, L], color | label]): String
    
    def getLabel(node: Omit[SankeyNodeDatum[N, L], color | label]): String
    
    var height: Double
    
    var layout: horizontal | vertical
    
    var linkSortMode: js.UndefOr[Null] = js.undefined
    
    var nodeInnerPadding: Double
    
    var nodeSpacing: Double
    
    var nodeThickness: Double
    
    var sortFunction: js.UndefOr[(SankeySortFunction[N, L]) | Null] = js.undefined
    
    var width: Double
  }
  object AlignFunction {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
      alignFunction: (/* node */ SankeyNodeMinimal[Any, Any], /* n */ Double) => Double,
      data: Links[N, L],
      formatValue: Double => String,
      getColor: Omit[SankeyNodeDatum[N, L], color | label] => String,
      getLabel: Omit[SankeyNodeDatum[N, L], color | label] => String,
      height: Double,
      layout: horizontal | vertical,
      nodeInnerPadding: Double,
      nodeSpacing: Double,
      nodeThickness: Double,
      width: Double
    ): AlignFunction[N, L] = {
      val __obj = js.Dynamic.literal(alignFunction = js.Any.fromFunction2(alignFunction), data = data.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), getColor = js.Any.fromFunction1(getColor), getLabel = js.Any.fromFunction1(getLabel), height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodeInnerPadding = nodeInnerPadding.asInstanceOf[js.Any], nodeSpacing = nodeSpacing.asInstanceOf[js.Any], nodeThickness = nodeThickness.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignFunction[N, L]]
    }
    
    extension [Self <: AlignFunction[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (AlignFunction[N, L])) {
      
      inline def setAlignFunction(value: (/* node */ SankeyNodeMinimal[Any, Any], /* n */ Double) => Double): Self = StObject.set(x, "alignFunction", js.Any.fromFunction2(value))
      
      inline def setData(value: Links[N, L]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFormatValue(value: Double => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
      
      inline def setGetColor(value: Omit[SankeyNodeDatum[N, L], color | label] => String): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
      
      inline def setGetLabel(value: Omit[SankeyNodeDatum[N, L], color | label] => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setNodeInnerPadding(value: Double): Self = StObject.set(x, "nodeInnerPadding", value.asInstanceOf[js.Any])
      
      inline def setNodeSpacing(value: Double): Self = StObject.set(x, "nodeSpacing", value.asInstanceOf[js.Any])
      
      inline def setNodeThickness(value: Double): Self = StObject.set(x, "nodeThickness", value.asInstanceOf[js.Any])
      
      inline def setSortFunction(value: (/* a */ SankeyNodeDatum[N, L], /* b */ SankeyNodeDatum[N, L]) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction2(value))
      
      inline def setSortFunctionNull: Self = StObject.set(x, "sortFunction", null)
      
      inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: String
    
    var id: String
    
    var label: String
  }
  object Color {
    
    inline def apply(color: String, id: String, label: String): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentLink[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var currentLink: (SankeyLinkDatum[N, L]) | Null
    
    var currentNode: (SankeyNodeDatum[N, L]) | Null
    
    var getLabelTextColor: (InheritedColorConfigCustomFunction[SankeyNodeDatum[N, L]]) | (js.Function1[/* d */ SankeyNodeDatum[N, L], Any])
    
    var getNodeBorderColor: (InheritedColorConfigCustomFunction[SankeyNodeDatum[N, L]]) | (js.Function1[/* d */ SankeyNodeDatum[N, L], Any])
    
    var legendData: js.Array[Color]
    
    var links: js.Array[SankeyLinkDatum[N, L]]
    
    var nodes: js.Array[SankeyNodeDatum[N, L]]
    
    var setCurrentLink: Dispatch[SetStateAction[(SankeyLinkDatum[N, L]) | Null]]
    
    var setCurrentNode: Dispatch[SetStateAction[(SankeyNodeDatum[N, L]) | Null]]
  }
  object CurrentLink {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
      getLabelTextColor: (InheritedColorConfigCustomFunction[SankeyNodeDatum[N, L]]) | (js.Function1[/* d */ SankeyNodeDatum[N, L], Any]),
      getNodeBorderColor: (InheritedColorConfigCustomFunction[SankeyNodeDatum[N, L]]) | (js.Function1[/* d */ SankeyNodeDatum[N, L], Any]),
      legendData: js.Array[Color],
      links: js.Array[SankeyLinkDatum[N, L]],
      nodes: js.Array[SankeyNodeDatum[N, L]],
      setCurrentLink: SetStateAction[(SankeyLinkDatum[N, L]) | Null] => Unit,
      setCurrentNode: SetStateAction[(SankeyNodeDatum[N, L]) | Null] => Unit
    ): CurrentLink[N, L] = {
      val __obj = js.Dynamic.literal(getLabelTextColor = getLabelTextColor.asInstanceOf[js.Any], getNodeBorderColor = getNodeBorderColor.asInstanceOf[js.Any], legendData = legendData.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], setCurrentLink = js.Any.fromFunction1(setCurrentLink), setCurrentNode = js.Any.fromFunction1(setCurrentNode), currentLink = null, currentNode = null)
      __obj.asInstanceOf[CurrentLink[N, L]]
    }
    
    extension [Self <: CurrentLink[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (CurrentLink[N, L])) {
      
      inline def setCurrentLink(value: SankeyLinkDatum[N, L]): Self = StObject.set(x, "currentLink", value.asInstanceOf[js.Any])
      
      inline def setCurrentLinkNull: Self = StObject.set(x, "currentLink", null)
      
      inline def setCurrentNode(value: SankeyNodeDatum[N, L]): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
      
      inline def setCurrentNodeNull: Self = StObject.set(x, "currentNode", null)
      
      inline def setGetLabelTextColor(
        value: (InheritedColorConfigCustomFunction[SankeyNodeDatum[N, L]]) | (js.Function1[/* d */ SankeyNodeDatum[N, L], Any])
      ): Self = StObject.set(x, "getLabelTextColor", value.asInstanceOf[js.Any])
      
      inline def setGetLabelTextColorFunction1(value: /* d */ SankeyNodeDatum[N, L] => Any): Self = StObject.set(x, "getLabelTextColor", js.Any.fromFunction1(value))
      
      inline def setGetNodeBorderColor(
        value: (InheritedColorConfigCustomFunction[SankeyNodeDatum[N, L]]) | (js.Function1[/* d */ SankeyNodeDatum[N, L], Any])
      ): Self = StObject.set(x, "getNodeBorderColor", value.asInstanceOf[js.Any])
      
      inline def setGetNodeBorderColorFunction1(value: /* d */ SankeyNodeDatum[N, L] => Any): Self = StObject.set(x, "getNodeBorderColor", js.Any.fromFunction1(value))
      
      inline def setLegendData(value: js.Array[Color]): Self = StObject.set(x, "legendData", value.asInstanceOf[js.Any])
      
      inline def setLegendDataVarargs(value: Color*): Self = StObject.set(x, "legendData", js.Array(value*))
      
      inline def setLinks(value: js.Array[SankeyLinkDatum[N, L]]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: (SankeyLinkDatum[N, L])*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[SankeyNodeDatum[N, L]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: (SankeyNodeDatum[N, L])*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setSetCurrentLink(value: SetStateAction[(SankeyLinkDatum[N, L]) | Null] => Unit): Self = StObject.set(x, "setCurrentLink", js.Any.fromFunction1(value))
      
      inline def setSetCurrentNode(value: SetStateAction[(SankeyNodeDatum[N, L]) | Null] => Unit): Self = StObject.set(x, "setCurrentNode", js.Any.fromFunction1(value))
    }
  }
  
  trait Depth[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var color: String
    
    var depth: Double
    
    var formattedValue: String
    
    var height: Double
    
    var index: Double
    
    var label: String
    
    var layer: Double
    
    var sourceLinks: js.Array[SankeyLinkDatum[N, L]]
    
    var targetLinks: js.Array[SankeyLinkDatum[N, L]]
    
    var value: Double
    
    var width: Double
    
    var x: Double
    
    var x0: Double
    
    var x1: Double
    
    var y: Double
    
    var y0: Double
    
    var y1: Double
  }
  object Depth {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
      color: String,
      depth: Double,
      formattedValue: String,
      height: Double,
      index: Double,
      label: String,
      layer: Double,
      sourceLinks: js.Array[SankeyLinkDatum[N, L]],
      targetLinks: js.Array[SankeyLinkDatum[N, L]],
      value: Double,
      width: Double,
      x: Double,
      x0: Double,
      x1: Double,
      y: Double,
      y0: Double,
      y1: Double
    ): Depth[N, L] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], sourceLinks = sourceLinks.asInstanceOf[js.Any], targetLinks = targetLinks.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.asInstanceOf[Depth[N, L]]
    }
    
    extension [Self <: Depth[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (Depth[N, L])) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: Double): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setSourceLinks(value: js.Array[SankeyLinkDatum[N, L]]): Self = StObject.set(x, "sourceLinks", value.asInstanceOf[js.Any])
      
      inline def setSourceLinksVarargs(value: (SankeyLinkDatum[N, L])*): Self = StObject.set(x, "sourceLinks", js.Array(value*))
      
      inline def setTargetLinks(value: js.Array[SankeyLinkDatum[N, L]]): Self = StObject.set(x, "targetLinks", value.asInstanceOf[js.Any])
      
      inline def setTargetLinksVarargs(value: (SankeyLinkDatum[N, L])*): Self = StObject.set(x, "targetLinks", js.Array(value*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndColor[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var color: String
    
    var endColor: js.UndefOr[String] = js.undefined
    
    var formattedValue: String
    
    var index: Double
    
    var pos0: Double
    
    var pos1: Double
    
    var source: SankeyNodeDatum[N, L]
    
    var startColor: js.UndefOr[String] = js.undefined
    
    var target: SankeyNodeDatum[N, L]
    
    var thickness: Double
    
    var value: Double
  }
  object EndColor {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
      color: String,
      formattedValue: String,
      index: Double,
      pos0: Double,
      pos1: Double,
      source: SankeyNodeDatum[N, L],
      target: SankeyNodeDatum[N, L],
      thickness: Double,
      value: Double
    ): EndColor[N, L] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pos0 = pos0.asInstanceOf[js.Any], pos1 = pos1.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndColor[N, L]]
    }
    
    extension [Self <: EndColor[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (EndColor[N, L])) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
      
      inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
      
      inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPos0(value: Double): Self = StObject.set(x, "pos0", value.asInstanceOf[js.Any])
      
      inline def setPos1(value: Double): Self = StObject.set(x, "pos1", value.asInstanceOf[js.Any])
      
      inline def setSource(value: SankeyNodeDatum[N, L]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
      
      inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
      
      inline def setTarget(value: SankeyNodeDatum[N, L]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Link[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var link: SankeyLinkDatum[N, L]
  }
  object Link {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](link: SankeyLinkDatum[N, L]): Link[N, L] = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link[N, L]]
    }
    
    extension [Self <: Link[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (Link[N, L])) {
      
      inline def setLink(value: SankeyLinkDatum[N, L]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  trait Links[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var links: js.Array[L]
    
    var nodes: js.Array[N]
  }
  object Links {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](links: js.Array[L], nodes: js.Array[N]): Links[N, L] = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Links[N, L]]
    }
    
    extension [Self <: Links[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (Links[N, L])) {
      
      inline def setLinks(value: js.Array[L]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: L*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[N]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: N*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait Node[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var node: SankeyNodeDatum[N, L]
  }
  object Node {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](node: SankeyNodeDatum[N, L]): Node[N, L] = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[N, L]]
    }
    
    extension [Self <: Node[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (Node[N, L])) {
      
      inline def setNode(value: SankeyNodeDatum[N, L]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nodes[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var links: js.Array[SankeyLinkDatum[N, L]]
    
    var nodes: js.Array[SankeyNodeDatum[N, L]]
  }
  object Nodes {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](links: js.Array[SankeyLinkDatum[N, L]], nodes: js.Array[SankeyNodeDatum[N, L]]): Nodes[N, L] = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nodes[N, L]]
    }
    
    extension [Self <: Nodes[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (Nodes[N, L])) {
      
      inline def setLinks(value: js.Array[SankeyLinkDatum[N, L]]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: (SankeyLinkDatum[N, L])*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[SankeyNodeDatum[N, L]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: (SankeyNodeDatum[N, L])*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait Scheme extends StObject {
    
    var scheme: nivo
  }
  object Scheme {
    
    inline def apply(): Scheme = {
      val __obj = js.Dynamic.literal(scheme = "nivo")
      __obj.asInstanceOf[Scheme]
    }
    
    extension [Self <: Scheme](x: Self) {
      
      inline def setScheme(value: nivo): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
}

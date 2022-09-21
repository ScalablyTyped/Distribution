package typings.nivoTreemap

import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoColors.ordinalColorScaleMod.DatumIdentityAccessor
import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.ModernMotionProps
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoTreemap.anon.Color
import typings.nivoTreemap.nivoTreemapStrings.bottom
import typings.nivoTreemap.nivoTreemapStrings.children
import typings.nivoTreemap.nivoTreemapStrings.label
import typings.nivoTreemap.nivoTreemapStrings.left
import typings.nivoTreemap.nivoTreemapStrings.nodes
import typings.nivoTreemap.nivoTreemapStrings.parentLabel
import typings.nivoTreemap.nivoTreemapStrings.right
import typings.nivoTreemap.nivoTreemapStrings.top
import typings.nivoTreemap.tilingMod.TileType
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ComputedNode[Datum /* <: js.Object */] extends StObject {
    
    var borderColor: String
    
    var color: String
    
    var data: Omit[Datum, children]
    
    var fill: js.UndefOr[String] = js.undefined
    
    var formattedValue: Double | String
    
    var height: Double
    
    var id: String
    
    var isLeaf: Boolean
    
    var isParent: Boolean
    
    var label: String | Double
    
    var labelRotation: Double
    
    var labelTextColor: String
    
    var opacity: Double
    
    var parentLabel: String | Double
    
    var parentLabelRotation: Double
    
    var parentLabelTextColor: String
    
    var parentLabelX: Double
    
    var parentLabelY: Double
    
    var path: String
    
    var pathComponents: js.Array[String]
    
    var treeDepth: Double
    
    var treeHeight: Double
    
    var value: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object ComputedNode {
    
    inline def apply[Datum /* <: js.Object */](
      borderColor: String,
      color: String,
      data: Omit[Datum, children],
      formattedValue: Double | String,
      height: Double,
      id: String,
      isLeaf: Boolean,
      isParent: Boolean,
      label: String | Double,
      labelRotation: Double,
      labelTextColor: String,
      opacity: Double,
      parentLabel: String | Double,
      parentLabelRotation: Double,
      parentLabelTextColor: String,
      parentLabelX: Double,
      parentLabelY: Double,
      path: String,
      pathComponents: js.Array[String],
      treeDepth: Double,
      treeHeight: Double,
      value: Double,
      width: Double,
      x: Double,
      y: Double
    ): ComputedNode[Datum] = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], parentLabel = parentLabel.asInstanceOf[js.Any], parentLabelRotation = parentLabelRotation.asInstanceOf[js.Any], parentLabelTextColor = parentLabelTextColor.asInstanceOf[js.Any], parentLabelX = parentLabelX.asInstanceOf[js.Any], parentLabelY = parentLabelY.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathComponents = pathComponents.asInstanceOf[js.Any], treeDepth = treeDepth.asInstanceOf[js.Any], treeHeight = treeHeight.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedNode[Datum]]
    }
    
    extension [Self <: ComputedNode[?], Datum /* <: js.Object */](x: Self & ComputedNode[Datum]) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: Omit[Datum, children]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormattedValue(value: Double | String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColor(value: String): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setParentLabel(value: String | Double): Self = StObject.set(x, "parentLabel", value.asInstanceOf[js.Any])
      
      inline def setParentLabelRotation(value: Double): Self = StObject.set(x, "parentLabelRotation", value.asInstanceOf[js.Any])
      
      inline def setParentLabelTextColor(value: String): Self = StObject.set(x, "parentLabelTextColor", value.asInstanceOf[js.Any])
      
      inline def setParentLabelX(value: Double): Self = StObject.set(x, "parentLabelX", value.asInstanceOf[js.Any])
      
      inline def setParentLabelY(value: Double): Self = StObject.set(x, "parentLabelY", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathComponents(value: js.Array[String]): Self = StObject.set(x, "pathComponents", value.asInstanceOf[js.Any])
      
      inline def setPathComponentsVarargs(value: String*): Self = StObject.set(x, "pathComponents", js.Array(value*))
      
      inline def setTreeDepth(value: Double): Self = StObject.set(x, "treeDepth", value.asInstanceOf[js.Any])
      
      inline def setTreeHeight(value: Double): Self = StObject.set(x, "treeHeight", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputedNodeWithHandlers[Datum /* <: js.Object */]
    extends StObject
       with ComputedNode[Datum] {
    
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  }
  object ComputedNodeWithHandlers {
    
    inline def apply[Datum /* <: js.Object */](
      borderColor: String,
      color: String,
      data: Omit[Datum, children],
      formattedValue: Double | String,
      height: Double,
      id: String,
      isLeaf: Boolean,
      isParent: Boolean,
      label: String | Double,
      labelRotation: Double,
      labelTextColor: String,
      opacity: Double,
      parentLabel: String | Double,
      parentLabelRotation: Double,
      parentLabelTextColor: String,
      parentLabelX: Double,
      parentLabelY: Double,
      path: String,
      pathComponents: js.Array[String],
      treeDepth: Double,
      treeHeight: Double,
      value: Double,
      width: Double,
      x: Double,
      y: Double
    ): ComputedNodeWithHandlers[Datum] = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], parentLabel = parentLabel.asInstanceOf[js.Any], parentLabelRotation = parentLabelRotation.asInstanceOf[js.Any], parentLabelTextColor = parentLabelTextColor.asInstanceOf[js.Any], parentLabelX = parentLabelX.asInstanceOf[js.Any], parentLabelY = parentLabelY.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathComponents = pathComponents.asInstanceOf[js.Any], treeDepth = treeDepth.asInstanceOf[js.Any], treeHeight = treeHeight.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedNodeWithHandlers[Datum]]
    }
    
    extension [Self <: ComputedNodeWithHandlers[?], Datum /* <: js.Object */](x: Self & ComputedNodeWithHandlers[Datum]) {
      
      inline def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@nivo/treemap.@nivo/treemap/dist/types/types.ComputedNode<Datum>, 'color' | 'opacity' | 'borderColor' | 'labelTextColor' | 'parentLabelTextColor'> */
  trait ComputedNodeWithoutStyles[Datum /* <: js.Object */] extends StObject {
    
    var data: Omit[Datum, children]
    
    var fill: js.UndefOr[String] = js.undefined
    
    var formattedValue: Double | String
    
    var height: Double
    
    var id: String
    
    var isLeaf: Boolean
    
    var isParent: Boolean
    
    var label: String | Double
    
    var labelRotation: Double
    
    var parentLabel: String | Double
    
    var parentLabelRotation: Double
    
    var parentLabelX: Double
    
    var parentLabelY: Double
    
    var path: String
    
    var pathComponents: js.Array[String]
    
    var treeDepth: Double
    
    var treeHeight: Double
    
    var value: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object ComputedNodeWithoutStyles {
    
    inline def apply[Datum /* <: js.Object */](
      data: Omit[Datum, children],
      formattedValue: Double | String,
      height: Double,
      id: String,
      isLeaf: Boolean,
      isParent: Boolean,
      label: String | Double,
      labelRotation: Double,
      parentLabel: String | Double,
      parentLabelRotation: Double,
      parentLabelX: Double,
      parentLabelY: Double,
      path: String,
      pathComponents: js.Array[String],
      treeDepth: Double,
      treeHeight: Double,
      value: Double,
      width: Double,
      x: Double,
      y: Double
    ): ComputedNodeWithoutStyles[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], parentLabel = parentLabel.asInstanceOf[js.Any], parentLabelRotation = parentLabelRotation.asInstanceOf[js.Any], parentLabelX = parentLabelX.asInstanceOf[js.Any], parentLabelY = parentLabelY.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathComponents = pathComponents.asInstanceOf[js.Any], treeDepth = treeDepth.asInstanceOf[js.Any], treeHeight = treeHeight.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedNodeWithoutStyles[Datum]]
    }
    
    extension [Self <: ComputedNodeWithoutStyles[?], Datum /* <: js.Object */](x: Self & ComputedNodeWithoutStyles[Datum]) {
      
      inline def setData(value: Omit[Datum, children]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormattedValue(value: Double | String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setParentLabel(value: String | Double): Self = StObject.set(x, "parentLabel", value.asInstanceOf[js.Any])
      
      inline def setParentLabelRotation(value: Double): Self = StObject.set(x, "parentLabelRotation", value.asInstanceOf[js.Any])
      
      inline def setParentLabelX(value: Double): Self = StObject.set(x, "parentLabelX", value.asInstanceOf[js.Any])
      
      inline def setParentLabelY(value: Double): Self = StObject.set(x, "parentLabelY", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathComponents(value: js.Array[String]): Self = StObject.set(x, "pathComponents", value.asInstanceOf[js.Any])
      
      inline def setPathComponentsVarargs(value: String*): Self = StObject.set(x, "pathComponents", js.Array(value*))
      
      inline def setTreeDepth(value: Double): Self = StObject.set(x, "treeDepth", value.asInstanceOf[js.Any])
      
      inline def setTreeHeight(value: Double): Self = StObject.set(x, "treeHeight", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomCanvasLayer[Datum /* <: js.Object */] = js.Function2[/* ctx */ CanvasRenderingContext2D, /* props */ CustomLayerProps[Datum], Unit]
  
  type CustomHtmlLayer[Datum /* <: js.Object */] = FunctionComponent[CustomLayerProps[Datum]]
  
  trait CustomLayerProps[Datum /* <: js.Object */] extends StObject {
    
    var nodes: js.Array[ComputedNode[Datum]]
  }
  object CustomLayerProps {
    
    inline def apply[Datum /* <: js.Object */](nodes: js.Array[ComputedNode[Datum]]): CustomLayerProps[Datum] = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomLayerProps[Datum]]
    }
    
    extension [Self <: CustomLayerProps[?], Datum /* <: js.Object */](x: Self & CustomLayerProps[Datum]) {
      
      inline def setNodes(value: js.Array[ComputedNode[Datum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedNode[Datum]*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  type CustomSvgLayer[Datum /* <: js.Object */] = FunctionComponent[CustomLayerProps[Datum]]
  
  trait DefaultTreeMapDatum extends StObject {
    
    var children: js.UndefOr[js.Array[DefaultTreeMapDatum]] = js.undefined
    
    var id: String
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object DefaultTreeMapDatum {
    
    inline def apply(id: String): DefaultTreeMapDatum = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultTreeMapDatum]
    }
    
    extension [Self <: DefaultTreeMapDatum](x: Self) {
      
      inline def setChildren(value: js.Array[DefaultTreeMapDatum]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DefaultTreeMapDatum*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type LayerId = nodes
  
  trait NodeAnimatedProps extends StObject {
    
    var color: String
    
    var height: Double
    
    var labelOpacity: Double
    
    var labelRotation: Double
    
    var labelX: Double
    
    var labelY: Double
    
    var parentLabelOpacity: Double
    
    var parentLabelRotation: Double
    
    var parentLabelX: Double
    
    var parentLabelY: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object NodeAnimatedProps {
    
    inline def apply(
      color: String,
      height: Double,
      labelOpacity: Double,
      labelRotation: Double,
      labelX: Double,
      labelY: Double,
      parentLabelOpacity: Double,
      parentLabelRotation: Double,
      parentLabelX: Double,
      parentLabelY: Double,
      width: Double,
      x: Double,
      y: Double
    ): NodeAnimatedProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], labelOpacity = labelOpacity.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], labelX = labelX.asInstanceOf[js.Any], labelY = labelY.asInstanceOf[js.Any], parentLabelOpacity = parentLabelOpacity.asInstanceOf[js.Any], parentLabelRotation = parentLabelRotation.asInstanceOf[js.Any], parentLabelX = parentLabelX.asInstanceOf[js.Any], parentLabelY = parentLabelY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeAnimatedProps]
    }
    
    extension [Self <: NodeAnimatedProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLabelOpacity(value: Double): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setLabelX(value: Double): Self = StObject.set(x, "labelX", value.asInstanceOf[js.Any])
      
      inline def setLabelY(value: Double): Self = StObject.set(x, "labelY", value.asInstanceOf[js.Any])
      
      inline def setParentLabelOpacity(value: Double): Self = StObject.set(x, "parentLabelOpacity", value.asInstanceOf[js.Any])
      
      inline def setParentLabelRotation(value: Double): Self = StObject.set(x, "parentLabelRotation", value.asInstanceOf[js.Any])
      
      inline def setParentLabelX(value: Double): Self = StObject.set(x, "parentLabelX", value.asInstanceOf[js.Any])
      
      inline def setParentLabelY(value: Double): Self = StObject.set(x, "parentLabelY", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeComponent[Datum /* <: js.Object */] = FunctionComponent[NodeProps[Datum]]
  
  type NodeMouseEventHandler[Datum /* <: js.Object */] = js.Function2[
    /* node */ ComputedNode[Datum], 
    /* event */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
  
  trait NodeProps[Datum /* <: js.Object */] extends StObject {
    
    var animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<NodeAnimatedProps> */ Any
    
    var borderWidth: Double
    
    var enableLabel: Boolean
    
    var enableParentLabel: Boolean
    
    var labelSkipSize: Double
    
    var node: ComputedNodeWithHandlers[Datum]
  }
  object NodeProps {
    
    inline def apply[Datum /* <: js.Object */](
      animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<NodeAnimatedProps> */ Any,
      borderWidth: Double,
      enableLabel: Boolean,
      enableParentLabel: Boolean,
      labelSkipSize: Double,
      node: ComputedNodeWithHandlers[Datum]
    ): NodeProps[Datum] = {
      val __obj = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], enableParentLabel = enableParentLabel.asInstanceOf[js.Any], labelSkipSize = labelSkipSize.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeProps[Datum]]
    }
    
    extension [Self <: NodeProps[?], Datum /* <: js.Object */](x: Self & NodeProps[Datum]) {
      
      inline def setAnimatedProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<NodeAnimatedProps> */ Any
      ): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableParentLabel(value: Boolean): Self = StObject.set(x, "enableParentLabel", value.asInstanceOf[js.Any])
      
      inline def setLabelSkipSize(value: Double): Self = StObject.set(x, "labelSkipSize", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ComputedNodeWithHandlers[Datum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type TooltipComponent[Datum /* <: js.Object */] = FunctionComponent[TooltipProps[Datum]]
  
  trait TooltipProps[Datum /* <: js.Object */] extends StObject {
    
    var node: ComputedNode[Datum]
  }
  object TooltipProps {
    
    inline def apply[Datum /* <: js.Object */](node: ComputedNode[Datum]): TooltipProps[Datum] = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps[Datum]]
    }
    
    extension [Self <: TooltipProps[?], Datum /* <: js.Object */](x: Self & TooltipProps[Datum]) {
      
      inline def setNode(value: ComputedNode[Datum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Omit<@nivo/treemap.@nivo/treemap/dist/types/types.TreeMapCommonProps<Datum>, 'enableParentLabel' | 'parentLabel' | 'parentLabelSize' | 'parentLabelPosition' | 'parentLabelPadding' | 'parentLabelTextColor' | 'onMouseEnter' | 'onMouseLeave'>> & @nivo/treemap.@nivo/treemap/dist/types/types.TreeMapDataProps<Datum> & @nivo/core.@nivo/core.Dimensions & {  layers :std.Array<@nivo/treemap.@nivo/treemap/dist/types/types.LayerId | @nivo/treemap.@nivo/treemap/dist/types/types.CustomCanvasLayer<Datum>> | undefined,   pixelRatio :number | undefined} */
  trait TreeMapCanvasProps[Datum /* <: js.Object */] extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var colorBy: js.UndefOr[String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]]] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]]] = js.undefined
    
    var data: Datum
    
    var enableLabel: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var identity: js.UndefOr[PropertyAccessor[Datum, String]] = js.undefined
    
    var innerPadding: js.UndefOr[Double] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[
        PropertyAccessor[
          Omit[
            ComputedNodeWithoutStyles[Datum], 
            typings.nivoTreemap.nivoTreemapStrings.label | parentLabel
          ], 
          String
        ]
      ] = js.undefined
    
    var labelFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var labelSkipSize: js.UndefOr[Double] = js.undefined
    
    var labelTextColor: js.UndefOr[InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]] = js.undefined
    
    var layers: js.UndefOr[js.Array[LayerId | CustomCanvasLayer[Datum]]] = js.undefined
    
    var leavesOnly: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var nodeOpacity: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseMove: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var orientLabel: js.UndefOr[Boolean] = js.undefined
    
    var outerPadding: js.UndefOr[Double] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tile: js.UndefOr[TileType] = js.undefined
    
    var tooltip: js.UndefOr[TooltipComponent[Datum]] = js.undefined
    
    var value: js.UndefOr[PropertyAccessor[Datum, Double]] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object TreeMapCanvasProps {
    
    inline def apply[Datum /* <: js.Object */](data: Datum, height: Double, width: Double): TreeMapCanvasProps[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeMapCanvasProps[Datum]]
    }
    
    extension [Self <: TreeMapCanvasProps[?], Datum /* <: js.Object */](x: Self & TreeMapCanvasProps[Datum]) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColorBy(value: String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]]): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByFunction1(value: ComputedNodeWithoutStyles[Datum] => String | Double): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: ComputedNodeWithoutStyles[Datum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelUndefined: Self = StObject.set(x, "enableLabel", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityFunction1(value: Datum => String): Self = StObject.set(x, "identity", js.Any.fromFunction1(value))
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
      
      inline def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setLabel(value: PropertyAccessor[Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      inline def setLabelFormatFunction1(value: Double => String): Self = StObject.set(x, "labelFormat", js.Any.fromFunction1(value))
      
      inline def setLabelFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "labelFormat", js.Any.fromFunction2(value))
      
      inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      inline def setLabelFunction1(value: Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelSkipSize(value: Double): Self = StObject.set(x, "labelSkipSize", value.asInstanceOf[js.Any])
      
      inline def setLabelSkipSizeUndefined: Self = StObject.set(x, "labelSkipSize", js.undefined)
      
      inline def setLabelTextColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayers(value: js.Array[LayerId | CustomCanvasLayer[Datum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (LayerId | CustomCanvasLayer[Datum])*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setLeavesOnlyUndefined: Self = StObject.set(x, "leavesOnly", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setNodeOpacity(value: Double): Self = StObject.set(x, "nodeOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeOpacityUndefined: Self = StObject.set(x, "nodeOpacity", js.undefined)
      
      inline def setOnClick(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseMove(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOrientLabel(value: Boolean): Self = StObject.set(x, "orientLabel", value.asInstanceOf[js.Any])
      
      inline def setOrientLabelUndefined: Self = StObject.set(x, "orientLabel", js.undefined)
      
      inline def setOuterPadding(value: Double): Self = StObject.set(x, "outerPadding", value.asInstanceOf[js.Any])
      
      inline def setOuterPaddingUndefined: Self = StObject.set(x, "outerPadding", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTile(value: TileType): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
      
      inline def setTooltip(value: TooltipComponent[Datum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: PropertyAccessor[Datum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: Datum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeMapCommonProps[Datum /* <: js.Object */]
    extends StObject
       with ModernMotionProps {
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var borderColor: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]
    
    var borderWidth: Double
    
    var colorBy: String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]]
    
    var colors: OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]]
    
    var enableLabel: Boolean
    
    var enableParentLabel: Boolean
    
    var identity: PropertyAccessor[Datum, String]
    
    var innerPadding: Double
    
    var isInteractive: Boolean
    
    var label: PropertyAccessor[
        Omit[
          ComputedNodeWithoutStyles[Datum], 
          typings.nivoTreemap.nivoTreemapStrings.label | parentLabel
        ], 
        String
      ]
    
    var labelFormat: ValueFormat[Double, Unit]
    
    var labelSkipSize: Double
    
    var labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]
    
    var leavesOnly: Boolean
    
    var margin: Box
    
    var nodeOpacity: Double
    
    var onClick: NodeMouseEventHandler[Datum]
    
    var onMouseEnter: NodeMouseEventHandler[Datum]
    
    var onMouseLeave: NodeMouseEventHandler[Datum]
    
    var onMouseMove: NodeMouseEventHandler[Datum]
    
    var orientLabel: Boolean
    
    var outerPadding: Double
    
    var parentLabel: PropertyAccessor[
        Omit[
          ComputedNodeWithoutStyles[Datum], 
          typings.nivoTreemap.nivoTreemapStrings.parentLabel
        ], 
        String
      ]
    
    var parentLabelPadding: Double
    
    var parentLabelPosition: top | right | bottom | left
    
    var parentLabelSize: Double
    
    var parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]
    
    var renderWrapper: Boolean
    
    var role: String
    
    var theme: Theme
    
    var tile: TileType
    
    var tooltip: TooltipComponent[Datum]
    
    var value: PropertyAccessor[Datum, Double]
    
    var valueFormat: ValueFormat[Double, Unit]
  }
  object TreeMapCommonProps {
    
    inline def apply[Datum /* <: js.Object */](
      borderColor: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color],
      borderWidth: Double,
      colorBy: String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]],
      colors: OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]],
      enableLabel: Boolean,
      enableParentLabel: Boolean,
      identity: PropertyAccessor[Datum, String],
      innerPadding: Double,
      isInteractive: Boolean,
      label: PropertyAccessor[Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel], String],
      labelFormat: ValueFormat[Double, Unit],
      labelSkipSize: Double,
      labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color],
      leavesOnly: Boolean,
      margin: Box,
      nodeOpacity: Double,
      onClick: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
      onMouseEnter: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
      onMouseLeave: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
      onMouseMove: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
      orientLabel: Boolean,
      outerPadding: Double,
      parentLabel: PropertyAccessor[Omit[ComputedNodeWithoutStyles[Datum], parentLabel], String],
      parentLabelPadding: Double,
      parentLabelPosition: top | right | bottom | left,
      parentLabelSize: Double,
      parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color],
      renderWrapper: Boolean,
      role: String,
      theme: Theme,
      tile: TileType,
      tooltip: TooltipComponent[Datum],
      value: PropertyAccessor[Datum, Double],
      valueFormat: ValueFormat[Double, Unit]
    ): TreeMapCommonProps[Datum] = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], enableParentLabel = enableParentLabel.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], innerPadding = innerPadding.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelFormat = labelFormat.asInstanceOf[js.Any], labelSkipSize = labelSkipSize.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], leavesOnly = leavesOnly.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], nodeOpacity = nodeOpacity.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), onMouseEnter = js.Any.fromFunction2(onMouseEnter), onMouseLeave = js.Any.fromFunction2(onMouseLeave), onMouseMove = js.Any.fromFunction2(onMouseMove), orientLabel = orientLabel.asInstanceOf[js.Any], outerPadding = outerPadding.asInstanceOf[js.Any], parentLabel = parentLabel.asInstanceOf[js.Any], parentLabelPadding = parentLabelPadding.asInstanceOf[js.Any], parentLabelPosition = parentLabelPosition.asInstanceOf[js.Any], parentLabelSize = parentLabelSize.asInstanceOf[js.Any], parentLabelTextColor = parentLabelTextColor.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueFormat = valueFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeMapCommonProps[Datum]]
    }
    
    extension [Self <: TreeMapCommonProps[?], Datum /* <: js.Object */](x: Self & TreeMapCommonProps[Datum]) {
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setColorBy(value: String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]]): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByFunction1(value: ComputedNodeWithoutStyles[Datum] => String | Double): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
      
      inline def setColors(value: OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: ComputedNodeWithoutStyles[Datum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableParentLabel(value: Boolean): Self = StObject.set(x, "enableParentLabel", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityFunction1(value: Datum => String): Self = StObject.set(x, "identity", js.Any.fromFunction1(value))
      
      inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: PropertyAccessor[Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      inline def setLabelFormatFunction1(value: Double => String): Self = StObject.set(x, "labelFormat", js.Any.fromFunction1(value))
      
      inline def setLabelFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "labelFormat", js.Any.fromFunction2(value))
      
      inline def setLabelFunction1(value: Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelSkipSize(value: Double): Self = StObject.set(x, "labelSkipSize", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setNodeOpacity(value: Double): Self = StObject.set(x, "nodeOpacity", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnter(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeave(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseMove(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOrientLabel(value: Boolean): Self = StObject.set(x, "orientLabel", value.asInstanceOf[js.Any])
      
      inline def setOuterPadding(value: Double): Self = StObject.set(x, "outerPadding", value.asInstanceOf[js.Any])
      
      inline def setParentLabel(value: PropertyAccessor[Omit[ComputedNodeWithoutStyles[Datum], parentLabel], String]): Self = StObject.set(x, "parentLabel", value.asInstanceOf[js.Any])
      
      inline def setParentLabelFunction1(value: Omit[ComputedNodeWithoutStyles[Datum], parentLabel] => String): Self = StObject.set(x, "parentLabel", js.Any.fromFunction1(value))
      
      inline def setParentLabelPadding(value: Double): Self = StObject.set(x, "parentLabelPadding", value.asInstanceOf[js.Any])
      
      inline def setParentLabelPosition(value: top | right | bottom | left): Self = StObject.set(x, "parentLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setParentLabelSize(value: Double): Self = StObject.set(x, "parentLabelSize", value.asInstanceOf[js.Any])
      
      inline def setParentLabelTextColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "parentLabelTextColor", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTile(value: TileType): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: TooltipComponent[Datum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropertyAccessor[Datum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
      
      inline def setValueFunction1(value: Datum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  trait TreeMapDataProps[Datum /* <: js.Object */] extends StObject {
    
    var data: Datum
  }
  object TreeMapDataProps {
    
    inline def apply[Datum /* <: js.Object */](data: Datum): TreeMapDataProps[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeMapDataProps[Datum]]
    }
    
    extension [Self <: TreeMapDataProps[?], Datum /* <: js.Object */](x: Self & TreeMapDataProps[Datum]) {
      
      inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@nivo/treemap.@nivo/treemap/dist/types/types.TreeMapCommonProps<Datum>> & @nivo/treemap.@nivo/treemap/dist/types/types.TreeMapDataProps<Datum> & @nivo/core.@nivo/core.Dimensions & {  nodeComponent :@nivo/treemap.@nivo/treemap/dist/types/types.NodeComponent<Datum> | undefined,   layers :std.Array<@nivo/treemap.@nivo/treemap/dist/types/types.LayerId | @nivo/treemap.@nivo/treemap/dist/types/types.CustomHtmlLayer<Datum>> | undefined} */
  trait TreeMapHtmlProps[Datum /* <: js.Object */] extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var colorBy: js.UndefOr[String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]]] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]]] = js.undefined
    
    var data: Datum
    
    var enableLabel: js.UndefOr[Boolean] = js.undefined
    
    var enableParentLabel: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var identity: js.UndefOr[PropertyAccessor[Datum, String]] = js.undefined
    
    var innerPadding: js.UndefOr[Double] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[
        PropertyAccessor[
          Omit[
            ComputedNodeWithoutStyles[Datum], 
            typings.nivoTreemap.nivoTreemapStrings.label | parentLabel
          ], 
          String
        ]
      ] = js.undefined
    
    var labelFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var labelSkipSize: js.UndefOr[Double] = js.undefined
    
    var labelTextColor: js.UndefOr[InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]] = js.undefined
    
    var layers: js.UndefOr[js.Array[LayerId | CustomHtmlLayer[Datum]]] = js.undefined
    
    var leavesOnly: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var nodeComponent: js.UndefOr[NodeComponent[Datum]] = js.undefined
    
    var nodeOpacity: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseMove: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var orientLabel: js.UndefOr[Boolean] = js.undefined
    
    var outerPadding: js.UndefOr[Double] = js.undefined
    
    var parentLabel: js.UndefOr[
        PropertyAccessor[
          Omit[
            ComputedNodeWithoutStyles[Datum], 
            typings.nivoTreemap.nivoTreemapStrings.parentLabel
          ], 
          String
        ]
      ] = js.undefined
    
    var parentLabelPadding: js.UndefOr[Double] = js.undefined
    
    var parentLabelPosition: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var parentLabelSize: js.UndefOr[Double] = js.undefined
    
    var parentLabelTextColor: js.UndefOr[InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tile: js.UndefOr[TileType] = js.undefined
    
    var tooltip: js.UndefOr[TooltipComponent[Datum]] = js.undefined
    
    var value: js.UndefOr[PropertyAccessor[Datum, Double]] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object TreeMapHtmlProps {
    
    inline def apply[Datum /* <: js.Object */](data: Datum, height: Double, width: Double): TreeMapHtmlProps[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeMapHtmlProps[Datum]]
    }
    
    extension [Self <: TreeMapHtmlProps[?], Datum /* <: js.Object */](x: Self & TreeMapHtmlProps[Datum]) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColorBy(value: String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]]): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByFunction1(value: ComputedNodeWithoutStyles[Datum] => String | Double): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: ComputedNodeWithoutStyles[Datum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelUndefined: Self = StObject.set(x, "enableLabel", js.undefined)
      
      inline def setEnableParentLabel(value: Boolean): Self = StObject.set(x, "enableParentLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableParentLabelUndefined: Self = StObject.set(x, "enableParentLabel", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityFunction1(value: Datum => String): Self = StObject.set(x, "identity", js.Any.fromFunction1(value))
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
      
      inline def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setLabel(value: PropertyAccessor[Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      inline def setLabelFormatFunction1(value: Double => String): Self = StObject.set(x, "labelFormat", js.Any.fromFunction1(value))
      
      inline def setLabelFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "labelFormat", js.Any.fromFunction2(value))
      
      inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      inline def setLabelFunction1(value: Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelSkipSize(value: Double): Self = StObject.set(x, "labelSkipSize", value.asInstanceOf[js.Any])
      
      inline def setLabelSkipSizeUndefined: Self = StObject.set(x, "labelSkipSize", js.undefined)
      
      inline def setLabelTextColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayers(value: js.Array[LayerId | CustomHtmlLayer[Datum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (LayerId | CustomHtmlLayer[Datum])*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setLeavesOnlyUndefined: Self = StObject.set(x, "leavesOnly", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setNodeComponent(value: NodeComponent[Datum]): Self = StObject.set(x, "nodeComponent", value.asInstanceOf[js.Any])
      
      inline def setNodeComponentUndefined: Self = StObject.set(x, "nodeComponent", js.undefined)
      
      inline def setNodeOpacity(value: Double): Self = StObject.set(x, "nodeOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeOpacityUndefined: Self = StObject.set(x, "nodeOpacity", js.undefined)
      
      inline def setOnClick(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOrientLabel(value: Boolean): Self = StObject.set(x, "orientLabel", value.asInstanceOf[js.Any])
      
      inline def setOrientLabelUndefined: Self = StObject.set(x, "orientLabel", js.undefined)
      
      inline def setOuterPadding(value: Double): Self = StObject.set(x, "outerPadding", value.asInstanceOf[js.Any])
      
      inline def setOuterPaddingUndefined: Self = StObject.set(x, "outerPadding", js.undefined)
      
      inline def setParentLabel(value: PropertyAccessor[Omit[ComputedNodeWithoutStyles[Datum], parentLabel], String]): Self = StObject.set(x, "parentLabel", value.asInstanceOf[js.Any])
      
      inline def setParentLabelFunction1(value: Omit[ComputedNodeWithoutStyles[Datum], parentLabel] => String): Self = StObject.set(x, "parentLabel", js.Any.fromFunction1(value))
      
      inline def setParentLabelPadding(value: Double): Self = StObject.set(x, "parentLabelPadding", value.asInstanceOf[js.Any])
      
      inline def setParentLabelPaddingUndefined: Self = StObject.set(x, "parentLabelPadding", js.undefined)
      
      inline def setParentLabelPosition(value: top | right | bottom | left): Self = StObject.set(x, "parentLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setParentLabelPositionUndefined: Self = StObject.set(x, "parentLabelPosition", js.undefined)
      
      inline def setParentLabelSize(value: Double): Self = StObject.set(x, "parentLabelSize", value.asInstanceOf[js.Any])
      
      inline def setParentLabelSizeUndefined: Self = StObject.set(x, "parentLabelSize", js.undefined)
      
      inline def setParentLabelTextColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "parentLabelTextColor", value.asInstanceOf[js.Any])
      
      inline def setParentLabelTextColorUndefined: Self = StObject.set(x, "parentLabelTextColor", js.undefined)
      
      inline def setParentLabelUndefined: Self = StObject.set(x, "parentLabel", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTile(value: TileType): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
      
      inline def setTooltip(value: TooltipComponent[Datum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: PropertyAccessor[Datum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: Datum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@nivo/treemap.@nivo/treemap/dist/types/types.TreeMapCommonProps<Datum>> & @nivo/treemap.@nivo/treemap/dist/types/types.TreeMapDataProps<Datum> & @nivo/core.@nivo/core.Dimensions & @nivo/core.@nivo/core.SvgDefsAndFill<@nivo/treemap.@nivo/treemap/dist/types/types.ComputedNode<Datum>> & {  nodeComponent :@nivo/treemap.@nivo/treemap/dist/types/types.NodeComponent<Datum> | undefined,   layers :std.Array<@nivo/treemap.@nivo/treemap/dist/types/types.LayerId | @nivo/treemap.@nivo/treemap/dist/types/types.CustomSvgLayer<Datum>> | undefined} */
  trait TreeMapSvgProps[Datum /* <: js.Object */] extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var colorBy: js.UndefOr[String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]]] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]]] = js.undefined
    
    var data: Datum
    
    var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
    
    var enableLabel: js.UndefOr[Boolean] = js.undefined
    
    var enableParentLabel: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[js.Array[Id[ComputedNode[Datum]]]] = js.undefined
    
    var height: Double
    
    var identity: js.UndefOr[PropertyAccessor[Datum, String]] = js.undefined
    
    var innerPadding: js.UndefOr[Double] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[
        PropertyAccessor[
          Omit[
            ComputedNodeWithoutStyles[Datum], 
            typings.nivoTreemap.nivoTreemapStrings.label | parentLabel
          ], 
          String
        ]
      ] = js.undefined
    
    var labelFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var labelSkipSize: js.UndefOr[Double] = js.undefined
    
    var labelTextColor: js.UndefOr[InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]] = js.undefined
    
    var layers: js.UndefOr[js.Array[LayerId | CustomSvgLayer[Datum]]] = js.undefined
    
    var leavesOnly: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var nodeComponent: js.UndefOr[NodeComponent[Datum]] = js.undefined
    
    var nodeOpacity: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseMove: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var orientLabel: js.UndefOr[Boolean] = js.undefined
    
    var outerPadding: js.UndefOr[Double] = js.undefined
    
    var parentLabel: js.UndefOr[
        PropertyAccessor[
          Omit[
            ComputedNodeWithoutStyles[Datum], 
            typings.nivoTreemap.nivoTreemapStrings.parentLabel
          ], 
          String
        ]
      ] = js.undefined
    
    var parentLabelPadding: js.UndefOr[Double] = js.undefined
    
    var parentLabelPosition: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var parentLabelSize: js.UndefOr[Double] = js.undefined
    
    var parentLabelTextColor: js.UndefOr[InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tile: js.UndefOr[TileType] = js.undefined
    
    var tooltip: js.UndefOr[TooltipComponent[Datum]] = js.undefined
    
    var value: js.UndefOr[PropertyAccessor[Datum, Double]] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object TreeMapSvgProps {
    
    inline def apply[Datum /* <: js.Object */](data: Datum, height: Double, width: Double): TreeMapSvgProps[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeMapSvgProps[Datum]]
    }
    
    extension [Self <: TreeMapSvgProps[?], Datum /* <: js.Object */](x: Self & TreeMapSvgProps[Datum]) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColorBy(value: String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]]): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByFunction1(value: ComputedNodeWithoutStyles[Datum] => String | Double): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: ComputedNodeWithoutStyles[Datum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelUndefined: Self = StObject.set(x, "enableLabel", js.undefined)
      
      inline def setEnableParentLabel(value: Boolean): Self = StObject.set(x, "enableParentLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableParentLabelUndefined: Self = StObject.set(x, "enableParentLabel", js.undefined)
      
      inline def setFill(value: js.Array[Id[ComputedNode[Datum]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: Id[ComputedNode[Datum]]*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityFunction1(value: Datum => String): Self = StObject.set(x, "identity", js.Any.fromFunction1(value))
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
      
      inline def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setLabel(value: PropertyAccessor[Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      inline def setLabelFormatFunction1(value: Double => String): Self = StObject.set(x, "labelFormat", js.Any.fromFunction1(value))
      
      inline def setLabelFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "labelFormat", js.Any.fromFunction2(value))
      
      inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      inline def setLabelFunction1(value: Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelSkipSize(value: Double): Self = StObject.set(x, "labelSkipSize", value.asInstanceOf[js.Any])
      
      inline def setLabelSkipSizeUndefined: Self = StObject.set(x, "labelSkipSize", js.undefined)
      
      inline def setLabelTextColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayers(value: js.Array[LayerId | CustomSvgLayer[Datum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (LayerId | CustomSvgLayer[Datum])*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setLeavesOnlyUndefined: Self = StObject.set(x, "leavesOnly", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setNodeComponent(value: NodeComponent[Datum]): Self = StObject.set(x, "nodeComponent", value.asInstanceOf[js.Any])
      
      inline def setNodeComponentUndefined: Self = StObject.set(x, "nodeComponent", js.undefined)
      
      inline def setNodeOpacity(value: Double): Self = StObject.set(x, "nodeOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeOpacityUndefined: Self = StObject.set(x, "nodeOpacity", js.undefined)
      
      inline def setOnClick(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOrientLabel(value: Boolean): Self = StObject.set(x, "orientLabel", value.asInstanceOf[js.Any])
      
      inline def setOrientLabelUndefined: Self = StObject.set(x, "orientLabel", js.undefined)
      
      inline def setOuterPadding(value: Double): Self = StObject.set(x, "outerPadding", value.asInstanceOf[js.Any])
      
      inline def setOuterPaddingUndefined: Self = StObject.set(x, "outerPadding", js.undefined)
      
      inline def setParentLabel(value: PropertyAccessor[Omit[ComputedNodeWithoutStyles[Datum], parentLabel], String]): Self = StObject.set(x, "parentLabel", value.asInstanceOf[js.Any])
      
      inline def setParentLabelFunction1(value: Omit[ComputedNodeWithoutStyles[Datum], parentLabel] => String): Self = StObject.set(x, "parentLabel", js.Any.fromFunction1(value))
      
      inline def setParentLabelPadding(value: Double): Self = StObject.set(x, "parentLabelPadding", value.asInstanceOf[js.Any])
      
      inline def setParentLabelPaddingUndefined: Self = StObject.set(x, "parentLabelPadding", js.undefined)
      
      inline def setParentLabelPosition(value: top | right | bottom | left): Self = StObject.set(x, "parentLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setParentLabelPositionUndefined: Self = StObject.set(x, "parentLabelPosition", js.undefined)
      
      inline def setParentLabelSize(value: Double): Self = StObject.set(x, "parentLabelSize", value.asInstanceOf[js.Any])
      
      inline def setParentLabelSizeUndefined: Self = StObject.set(x, "parentLabelSize", js.undefined)
      
      inline def setParentLabelTextColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): Self = StObject.set(x, "parentLabelTextColor", value.asInstanceOf[js.Any])
      
      inline def setParentLabelTextColorUndefined: Self = StObject.set(x, "parentLabelTextColor", js.undefined)
      
      inline def setParentLabelUndefined: Self = StObject.set(x, "parentLabel", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTile(value: TileType): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
      
      inline def setTooltip(value: TooltipComponent[Datum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: PropertyAccessor[Datum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: Datum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

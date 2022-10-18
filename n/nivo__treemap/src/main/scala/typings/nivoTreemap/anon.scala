package typings.nivoTreemap

import typings.d3Hierarchy.mod.HierarchyNode
import typings.d3Hierarchy.mod.RatioSquarifyTilingFactory
import typings.d3Hierarchy.mod.TreemapLayout
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.DatumIdentityAccessor
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.ValueFormat
import typings.nivoTreemap.distTypesTypesMod.ComputedNode
import typings.nivoTreemap.distTypesTypesMod.NodeMouseEventHandler
import typings.nivoTreemap.distTypesTypesMod.TooltipComponent
import typings.nivoTreemap.nivoTreemapStrings.binary
import typings.nivoTreemap.nivoTreemapStrings.bottom
import typings.nivoTreemap.nivoTreemapStrings.dice
import typings.nivoTreemap.nivoTreemapStrings.label
import typings.nivoTreemap.nivoTreemapStrings.left
import typings.nivoTreemap.nivoTreemapStrings.parentLabel
import typings.nivoTreemap.nivoTreemapStrings.right
import typings.nivoTreemap.nivoTreemapStrings.slice
import typings.nivoTreemap.nivoTreemapStrings.sliceDice
import typings.nivoTreemap.nivoTreemapStrings.squarify
import typings.nivoTreemap.nivoTreemapStrings.top
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactSpringTypes.interpolationMod.EasingFunction
import typings.std.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Binary extends StObject {
    
    val squarify: RatioSquarifyTilingFactory
  }
  object Binary {
    
    inline def apply(squarify: RatioSquarifyTilingFactory): Binary = {
      val __obj = js.Dynamic.literal(squarify = squarify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Binary]
    }
    
    extension [Self <: Binary](x: Self) {
      
      inline def setSquarify(value: RatioSquarifyTilingFactory): Self = StObject.set(x, "squarify", value.asInstanceOf[js.Any])
    }
  }
  
  trait BorderColor[Datum /* <: js.Object */] extends StObject {
    
    var borderColor: js.UndefOr[
        InheritedColorConfig[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum] & Color]
      ] = js.undefined
    
    var colorBy: js.UndefOr[
        String | DatumIdentityAccessor[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum]]
      ] = js.undefined
    
    var colors: js.UndefOr[
        OrdinalColorScaleConfig[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum]]
      ] = js.undefined
    
    var data: Datum
    
    var enableParentLabel: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var identity: js.UndefOr[PropertyAccessor[Datum, String]] = js.undefined
    
    var innerPadding: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[
        PropertyAccessor[
          Omit[
            typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum], 
            typings.nivoTreemap.nivoTreemapStrings.label | parentLabel
          ], 
          String
        ]
      ] = js.undefined
    
    var labelTextColor: js.UndefOr[
        InheritedColorConfig[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum] & Color]
      ] = js.undefined
    
    var leavesOnly: js.UndefOr[Boolean] = js.undefined
    
    var nodeOpacity: js.UndefOr[Double] = js.undefined
    
    var orientLabel: js.UndefOr[Boolean] = js.undefined
    
    var outerPadding: js.UndefOr[Double] = js.undefined
    
    var parentLabel: js.UndefOr[
        PropertyAccessor[
          Omit[
            typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum], 
            typings.nivoTreemap.nivoTreemapStrings.parentLabel
          ], 
          String
        ]
      ] = js.undefined
    
    var parentLabelPadding: js.UndefOr[Double] = js.undefined
    
    var parentLabelPosition: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var parentLabelSize: js.UndefOr[Double] = js.undefined
    
    var parentLabelTextColor: js.UndefOr[
        InheritedColorConfig[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum] & Color]
      ] = js.undefined
    
    var tile: js.UndefOr[binary | dice | slice | sliceDice | squarify] = js.undefined
    
    var value: js.UndefOr[PropertyAccessor[Datum, Double]] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object BorderColor {
    
    inline def apply[Datum /* <: js.Object */](data: Datum, height: Double, width: Double): BorderColor[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderColor[Datum]]
    }
    
    extension [Self <: BorderColor[?], Datum /* <: js.Object */](x: Self & BorderColor[Datum]) {
      
      inline def setBorderColor(
        value: InheritedColorConfig[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum] & Color]
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setColorBy(
        value: String | DatumIdentityAccessor[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum]]
      ): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByFunction1(value: typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum] => String | Double): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(
        value: OrdinalColorScaleConfig[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum]]
      ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnableParentLabel(value: Boolean): Self = StObject.set(x, "enableParentLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableParentLabelUndefined: Self = StObject.set(x, "enableParentLabel", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityFunction1(value: Datum => String): Self = StObject.set(x, "identity", js.Any.fromFunction1(value))
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
      
      inline def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
      
      inline def setLabel(
        value: PropertyAccessor[
              Omit[
                typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum], 
                label | parentLabel
              ], 
              String
            ]
      ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(
        value: Omit[
              typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum], 
              label | parentLabel
            ] => String
      ): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelTextColor(
        value: InheritedColorConfig[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum] & Color]
      ): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setLeavesOnlyUndefined: Self = StObject.set(x, "leavesOnly", js.undefined)
      
      inline def setNodeOpacity(value: Double): Self = StObject.set(x, "nodeOpacity", value.asInstanceOf[js.Any])
      
      inline def setNodeOpacityUndefined: Self = StObject.set(x, "nodeOpacity", js.undefined)
      
      inline def setOrientLabel(value: Boolean): Self = StObject.set(x, "orientLabel", value.asInstanceOf[js.Any])
      
      inline def setOrientLabelUndefined: Self = StObject.set(x, "orientLabel", js.undefined)
      
      inline def setOuterPadding(value: Double): Self = StObject.set(x, "outerPadding", value.asInstanceOf[js.Any])
      
      inline def setOuterPaddingUndefined: Self = StObject.set(x, "outerPadding", js.undefined)
      
      inline def setParentLabel(
        value: PropertyAccessor[
              Omit[
                typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum], 
                parentLabel
              ], 
              String
            ]
      ): Self = StObject.set(x, "parentLabel", value.asInstanceOf[js.Any])
      
      inline def setParentLabelFunction1(
        value: Omit[
              typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum], 
              parentLabel
            ] => String
      ): Self = StObject.set(x, "parentLabel", js.Any.fromFunction1(value))
      
      inline def setParentLabelPadding(value: Double): Self = StObject.set(x, "parentLabelPadding", value.asInstanceOf[js.Any])
      
      inline def setParentLabelPaddingUndefined: Self = StObject.set(x, "parentLabelPadding", js.undefined)
      
      inline def setParentLabelPosition(value: top | right | bottom | left): Self = StObject.set(x, "parentLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setParentLabelPositionUndefined: Self = StObject.set(x, "parentLabelPosition", js.undefined)
      
      inline def setParentLabelSize(value: Double): Self = StObject.set(x, "parentLabelSize", value.asInstanceOf[js.Any])
      
      inline def setParentLabelSizeUndefined: Self = StObject.set(x, "parentLabelSize", js.undefined)
      
      inline def setParentLabelTextColor(
        value: InheritedColorConfig[typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[Datum] & Color]
      ): Self = StObject.set(x, "parentLabelTextColor", value.asInstanceOf[js.Any])
      
      inline def setParentLabelTextColorUndefined: Self = StObject.set(x, "parentLabelTextColor", js.undefined)
      
      inline def setParentLabelUndefined: Self = StObject.set(x, "parentLabel", js.undefined)
      
      inline def setTile(value: binary | dice | slice | sliceDice | squarify): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
      
      inline def setValue(value: PropertyAccessor[Datum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: Datum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: String
  }
  object Color {
    
    inline def apply(color: String): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @nivo/treemap.@nivo/treemap/dist/types/types.ComputedNodeWithoutStyles<@nivo/treemap.@nivo/treemap/dist/types/types.DefaultTreeMapDatum> & {  color :string} */
  trait ComputedNodeWithoutStyles extends StObject {
    
    var color: String
    
    var data: OmitDefaultTreeMapDatumch
    
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
    
    inline def apply(
      color: String,
      data: OmitDefaultTreeMapDatumch,
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
    ): ComputedNodeWithoutStyles = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], parentLabel = parentLabel.asInstanceOf[js.Any], parentLabelRotation = parentLabelRotation.asInstanceOf[js.Any], parentLabelX = parentLabelX.asInstanceOf[js.Any], parentLabelY = parentLabelY.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathComponents = pathComponents.asInstanceOf[js.Any], treeDepth = treeDepth.asInstanceOf[js.Any], treeHeight = treeHeight.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedNodeWithoutStyles]
    }
    
    extension [Self <: ComputedNodeWithoutStyles](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: OmitDefaultTreeMapDatumch): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
  
  trait EnableParentLabel extends StObject {
    
    var enableParentLabel: Boolean
    
    var height: Double
    
    var innerPadding: Double
    
    var leavesOnly: Boolean
    
    var outerPadding: Double
    
    var parentLabelPosition: top | right | bottom | left
    
    var parentLabelSize: Double
    
    var tile: binary | dice | slice | sliceDice | squarify
    
    var width: Double
  }
  object EnableParentLabel {
    
    inline def apply(
      enableParentLabel: Boolean,
      height: Double,
      innerPadding: Double,
      leavesOnly: Boolean,
      outerPadding: Double,
      parentLabelPosition: top | right | bottom | left,
      parentLabelSize: Double,
      tile: binary | dice | slice | sliceDice | squarify,
      width: Double
    ): EnableParentLabel = {
      val __obj = js.Dynamic.literal(enableParentLabel = enableParentLabel.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], innerPadding = innerPadding.asInstanceOf[js.Any], leavesOnly = leavesOnly.asInstanceOf[js.Any], outerPadding = outerPadding.asInstanceOf[js.Any], parentLabelPosition = parentLabelPosition.asInstanceOf[js.Any], parentLabelSize = parentLabelSize.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableParentLabel]
    }
    
    extension [Self <: EnableParentLabel](x: Self) {
      
      inline def setEnableParentLabel(value: Boolean): Self = StObject.set(x, "enableParentLabel", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setOuterPadding(value: Double): Self = StObject.set(x, "outerPadding", value.asInstanceOf[js.Any])
      
      inline def setParentLabelPosition(value: top | right | bottom | left): Self = StObject.set(x, "parentLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setParentLabelSize(value: Double): Self = StObject.set(x, "parentLabelSize", value.asInstanceOf[js.Any])
      
      inline def setTile(value: binary | dice | slice | sliceDice | squarify): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetValue[Datum /* <: js.Object */] extends StObject {
    
    def getValue(datum: Datum): Double
    
    var root: Datum
  }
  object GetValue {
    
    inline def apply[Datum /* <: js.Object */](getValue: Datum => Double, root: Datum): GetValue[Datum] = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetValue[Datum]]
    }
    
    extension [Self <: GetValue[?], Datum /* <: js.Object */](x: Self & GetValue[Datum]) {
      
      inline def setGetValue(value: Datum => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setRoot(value: Datum): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hierarchy[Datum /* <: js.Object */] extends StObject {
    
    var hierarchy: HierarchyNode[Datum]
    
    var layout: TreemapLayout[Datum]
    
    var nodes: js.Array[ComputedNode[Datum]]
  }
  object Hierarchy {
    
    inline def apply[Datum /* <: js.Object */](
      hierarchy: HierarchyNode[Datum],
      layout: TreemapLayout[Datum],
      nodes: js.Array[ComputedNode[Datum]]
    ): Hierarchy[Datum] = {
      val __obj = js.Dynamic.literal(hierarchy = hierarchy.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hierarchy[Datum]]
    }
    
    extension [Self <: Hierarchy[?], Datum /* <: js.Object */](x: Self & Hierarchy[Datum]) {
      
      inline def setHierarchy(value: HierarchyNode[Datum]): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: TreemapLayout[Datum]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ComputedNode[Datum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedNode[Datum]*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait IsInteractive[Datum /* <: js.Object */] extends StObject {
    
    var isInteractive: Boolean
    
    var onClick: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseMove: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var tooltip: TooltipComponent[Datum]
  }
  object IsInteractive {
    
    inline def apply[Datum /* <: js.Object */](isInteractive: Boolean, tooltip: TooltipComponent[Datum]): IsInteractive[Datum] = {
      val __obj = js.Dynamic.literal(isInteractive = isInteractive.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsInteractive[Datum]]
    }
    
    extension [Self <: IsInteractive[?], Datum /* <: js.Object */](x: Self & IsInteractive[Datum]) {
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: (/* node */ ComputedNode[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTooltip(value: TooltipComponent[Datum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@nivo/treemap.@nivo/treemap/dist/types/types.ComputedNodeWithoutStyles<@nivo/treemap.@nivo/treemap/dist/types/types.DefaultTreeMapDatum>, 'label' | 'parentLabel'> */
  trait OmitComputedNodeWithoutSt extends StObject {
    
    var data: OmitDefaultTreeMapDatumch
    
    var fill: js.UndefOr[String] = js.undefined
    
    var formattedValue: Double | String
    
    var height: Double
    
    var id: String
    
    var isLeaf: Boolean
    
    var isParent: Boolean
    
    var labelRotation: Double
    
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
  object OmitComputedNodeWithoutSt {
    
    inline def apply(
      data: OmitDefaultTreeMapDatumch,
      formattedValue: Double | String,
      height: Double,
      id: String,
      isLeaf: Boolean,
      isParent: Boolean,
      labelRotation: Double,
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
    ): OmitComputedNodeWithoutSt = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], parentLabelRotation = parentLabelRotation.asInstanceOf[js.Any], parentLabelX = parentLabelX.asInstanceOf[js.Any], parentLabelY = parentLabelY.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathComponents = pathComponents.asInstanceOf[js.Any], treeDepth = treeDepth.asInstanceOf[js.Any], treeHeight = treeHeight.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitComputedNodeWithoutSt]
    }
    
    extension [Self <: OmitComputedNodeWithoutSt](x: Self) {
      
      inline def setData(value: OmitDefaultTreeMapDatumch): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormattedValue(value: Double | String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined std.Omit<@nivo/treemap.@nivo/treemap/dist/types/types.ComputedNodeWithoutStyles<@nivo/treemap.@nivo/treemap/dist/types/types.DefaultTreeMapDatum>, 'parentLabel'> */
  trait OmitComputedNodeWithoutStData extends StObject {
    
    var data: OmitDefaultTreeMapDatumch
    
    var fill: js.UndefOr[String] = js.undefined
    
    var formattedValue: Double | String
    
    var height: Double
    
    var id: String
    
    var isLeaf: Boolean
    
    var isParent: Boolean
    
    var label: String | Double
    
    var labelRotation: Double
    
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
  object OmitComputedNodeWithoutStData {
    
    inline def apply(
      data: OmitDefaultTreeMapDatumch,
      formattedValue: Double | String,
      height: Double,
      id: String,
      isLeaf: Boolean,
      isParent: Boolean,
      label: String | Double,
      labelRotation: Double,
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
    ): OmitComputedNodeWithoutStData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], parentLabelRotation = parentLabelRotation.asInstanceOf[js.Any], parentLabelX = parentLabelX.asInstanceOf[js.Any], parentLabelY = parentLabelY.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathComponents = pathComponents.asInstanceOf[js.Any], treeDepth = treeDepth.asInstanceOf[js.Any], treeHeight = treeHeight.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitComputedNodeWithoutStData]
    }
    
    extension [Self <: OmitComputedNodeWithoutStData](x: Self) {
      
      inline def setData(value: OmitDefaultTreeMapDatumch): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormattedValue(value: Double | String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined std.Omit<@nivo/treemap.@nivo/treemap/dist/types/types.DefaultTreeMapDatum, 'children'> */
  trait OmitDefaultTreeMapDatumch extends StObject {
    
    var id: String
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object OmitDefaultTreeMapDatumch {
    
    inline def apply(id: String): OmitDefaultTreeMapDatumch = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitDefaultTreeMapDatumch]
    }
    
    extension [Self <: OmitDefaultTreeMapDatumch](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@react-spring/core.@react-spring/core/dist/declarations/src/AnimationConfig.AnimationConfig> */
  trait PartialAnimationConfig extends StObject {
    
    var bounce: js.UndefOr[Double] = js.undefined
    
    var clamp: js.UndefOr[Boolean] = js.undefined
    
    var constructor: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var decay: js.UndefOr[Boolean | Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    var frequency: js.UndefOr[Double] = js.undefined
    
    var friction: js.UndefOr[Double] = js.undefined
    
    var mass: js.UndefOr[Double] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var progress: js.UndefOr[Double] = js.undefined
    
    var restVelocity: js.UndefOr[Double] = js.undefined
    
    var round: js.UndefOr[Double] = js.undefined
    
    var tension: js.UndefOr[Double] = js.undefined
    
    var velocity: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object PartialAnimationConfig {
    
    inline def apply(): PartialAnimationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAnimationConfig]
    }
    
    extension [Self <: PartialAnimationConfig](x: Self) {
      
      inline def setBounce(value: Double): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      inline def setConstructor(value: () => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setDecay(value: Boolean | Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      inline def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRestVelocity(value: Double): Self = StObject.set(x, "restVelocity", value.asInstanceOf[js.Any])
      
      inline def setRestVelocityUndefined: Self = StObject.set(x, "restVelocity", js.undefined)
      
      inline def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
      
      inline def setVelocity(value: Double | js.Array[Double]): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
      
      inline def setVelocityVarargs(value: Double*): Self = StObject.set(x, "velocity", js.Array(value*))
    }
  }
}

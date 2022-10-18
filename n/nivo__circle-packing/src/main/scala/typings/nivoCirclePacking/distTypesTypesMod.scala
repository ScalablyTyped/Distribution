package typings.nivoCirclePacking

import typings.nivoCirclePacking.anon.BorderColor
import typings.nivoCirclePacking.anon.Opacity
import typings.nivoCirclePacking.nivoCirclePackingStrings.color
import typings.nivoCirclePacking.nivoCirclePackingStrings.depth
import typings.nivoCirclePacking.nivoCirclePackingStrings.fill
import typings.nivoCirclePacking.nivoCirclePackingStrings.id
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.SvgDefsAndFill
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  type CircleComponent[RawDatum] = js.Function1[/* props */ CircleProps[RawDatum], Element]
  
  /* Inlined @nivo/circle-packing.@nivo/circle-packing/dist/types/types.CirclePackingCommonProps<RawDatum> & std.Pick<@nivo/circle-packing.@nivo/circle-packing/dist/types/types.MouseHandlers<RawDatum>, 'onMouseMove' | 'onClick'> & {  pixelRatio :number} */
  trait CirclePackingCanvasProps[RawDatum] extends StObject {
    
    var animate: Boolean
    
    var borderColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var borderWidth: Double
    
    var childColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var circleComponent: CircleComponent[RawDatum]
    
    var colorBy: id | depth
    
    var colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]
    
    var data: RawDatum
    
    var enableLabels: Boolean
    
    var height: Double
    
    var id: PropertyAccessor[RawDatum, String]
    
    var inheritColorFromParent: Boolean
    
    var isInteractive: Boolean
    
    var label: PropertyAccessor[ComputedDatum[RawDatum], String]
    
    var labelComponent: LabelComponent[RawDatum]
    
    var labelTextColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var labelsFilter: js.UndefOr[js.Function1[/* label */ ComputedLabel[RawDatum], Boolean]] = js.undefined
    
    var labelsSkipRadius: Double
    
    var layers: js.Array[CirclePackingLayer[RawDatum]]
    
    var leavesOnly: Boolean
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var padding: Double
    
    var pixelRatio: Double
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: String
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    def tooltip(props: ComputedDatum[RawDatum]): Element
    
    var value: PropertyAccessor[RawDatum, Double]
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
    
    var zoomedId: js.UndefOr[String | Null] = js.undefined
  }
  object CirclePackingCanvasProps {
    
    inline def apply[RawDatum](
      animate: Boolean,
      borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderWidth: Double,
      childColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      circleComponent: /* props */ CircleProps[RawDatum] => Element,
      colorBy: id | depth,
      colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]],
      data: RawDatum,
      enableLabels: Boolean,
      height: Double,
      id: PropertyAccessor[RawDatum, String],
      inheritColorFromParent: Boolean,
      isInteractive: Boolean,
      label: PropertyAccessor[ComputedDatum[RawDatum], String],
      labelComponent: /* props */ LabelProps[RawDatum] => Element,
      labelTextColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      labelsSkipRadius: Double,
      layers: js.Array[CirclePackingLayer[RawDatum]],
      leavesOnly: Boolean,
      padding: Double,
      pixelRatio: Double,
      role: String,
      tooltip: ComputedDatum[RawDatum] => Element,
      value: PropertyAccessor[RawDatum, Double],
      width: Double
    ): CirclePackingCanvasProps[RawDatum] = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], childColor = childColor.asInstanceOf[js.Any], circleComponent = js.Any.fromFunction1(circleComponent), colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritColorFromParent = inheritColorFromParent.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelComponent = js.Any.fromFunction1(labelComponent), labelTextColor = labelTextColor.asInstanceOf[js.Any], labelsSkipRadius = labelsSkipRadius.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], leavesOnly = leavesOnly.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirclePackingCanvasProps[RawDatum]]
    }
    
    extension [Self <: CirclePackingCanvasProps[?], RawDatum](x: Self & CirclePackingCanvasProps[RawDatum]) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setChildColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "childColor", value.asInstanceOf[js.Any])
      
      inline def setCircleComponent(value: /* props */ CircleProps[RawDatum] => Element): Self = StObject.set(x, "circleComponent", js.Any.fromFunction1(value))
      
      inline def setColorBy(value: id | depth): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: PropertyAccessor[RawDatum, String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction1(value: RawDatum => String): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setInheritColorFromParent(value: Boolean): Self = StObject.set(x, "inheritColorFromParent", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelComponent(value: /* props */ LabelProps[RawDatum] => Element): Self = StObject.set(x, "labelComponent", js.Any.fromFunction1(value))
      
      inline def setLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelsFilter(value: /* label */ ComputedLabel[RawDatum] => Boolean): Self = StObject.set(x, "labelsFilter", js.Any.fromFunction1(value))
      
      inline def setLabelsFilterUndefined: Self = StObject.set(x, "labelsFilter", js.undefined)
      
      inline def setLabelsSkipRadius(value: Double): Self = StObject.set(x, "labelsSkipRadius", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[CirclePackingLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: CirclePackingLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setOnClick(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: ComputedDatum[RawDatum] => Element): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setZoomedId(value: String): Self = StObject.set(x, "zoomedId", value.asInstanceOf[js.Any])
      
      inline def setZoomedIdNull: Self = StObject.set(x, "zoomedId", null)
      
      inline def setZoomedIdUndefined: Self = StObject.set(x, "zoomedId", js.undefined)
    }
  }
  
  trait CirclePackingCommonProps[RawDatum] extends StObject {
    
    var animate: Boolean
    
    var borderColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var borderWidth: Double
    
    var childColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var circleComponent: CircleComponent[RawDatum]
    
    var colorBy: id | depth
    
    var colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]
    
    var data: RawDatum
    
    var enableLabels: Boolean
    
    var height: Double
    
    var id: PropertyAccessor[RawDatum, String]
    
    var inheritColorFromParent: Boolean
    
    var isInteractive: Boolean
    
    var label: PropertyAccessor[ComputedDatum[RawDatum], String]
    
    var labelComponent: LabelComponent[RawDatum]
    
    var labelTextColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var labelsFilter: js.UndefOr[js.Function1[/* label */ ComputedLabel[RawDatum], Boolean]] = js.undefined
    
    var labelsSkipRadius: Double
    
    var layers: js.Array[CirclePackingLayer[RawDatum]]
    
    var leavesOnly: Boolean
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var padding: Double
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: String
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    def tooltip(props: ComputedDatum[RawDatum]): Element
    
    var value: PropertyAccessor[RawDatum, Double]
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
    
    var zoomedId: js.UndefOr[String | Null] = js.undefined
  }
  object CirclePackingCommonProps {
    
    inline def apply[RawDatum](
      animate: Boolean,
      borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderWidth: Double,
      childColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      circleComponent: /* props */ CircleProps[RawDatum] => Element,
      colorBy: id | depth,
      colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]],
      data: RawDatum,
      enableLabels: Boolean,
      height: Double,
      id: PropertyAccessor[RawDatum, String],
      inheritColorFromParent: Boolean,
      isInteractive: Boolean,
      label: PropertyAccessor[ComputedDatum[RawDatum], String],
      labelComponent: /* props */ LabelProps[RawDatum] => Element,
      labelTextColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      labelsSkipRadius: Double,
      layers: js.Array[CirclePackingLayer[RawDatum]],
      leavesOnly: Boolean,
      padding: Double,
      role: String,
      tooltip: ComputedDatum[RawDatum] => Element,
      value: PropertyAccessor[RawDatum, Double],
      width: Double
    ): CirclePackingCommonProps[RawDatum] = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], childColor = childColor.asInstanceOf[js.Any], circleComponent = js.Any.fromFunction1(circleComponent), colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritColorFromParent = inheritColorFromParent.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelComponent = js.Any.fromFunction1(labelComponent), labelTextColor = labelTextColor.asInstanceOf[js.Any], labelsSkipRadius = labelsSkipRadius.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], leavesOnly = leavesOnly.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirclePackingCommonProps[RawDatum]]
    }
    
    extension [Self <: CirclePackingCommonProps[?], RawDatum](x: Self & CirclePackingCommonProps[RawDatum]) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setChildColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "childColor", value.asInstanceOf[js.Any])
      
      inline def setCircleComponent(value: /* props */ CircleProps[RawDatum] => Element): Self = StObject.set(x, "circleComponent", js.Any.fromFunction1(value))
      
      inline def setColorBy(value: id | depth): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: PropertyAccessor[RawDatum, String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction1(value: RawDatum => String): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setInheritColorFromParent(value: Boolean): Self = StObject.set(x, "inheritColorFromParent", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelComponent(value: /* props */ LabelProps[RawDatum] => Element): Self = StObject.set(x, "labelComponent", js.Any.fromFunction1(value))
      
      inline def setLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelsFilter(value: /* label */ ComputedLabel[RawDatum] => Boolean): Self = StObject.set(x, "labelsFilter", js.Any.fromFunction1(value))
      
      inline def setLabelsFilterUndefined: Self = StObject.set(x, "labelsFilter", js.undefined)
      
      inline def setLabelsSkipRadius(value: Double): Self = StObject.set(x, "labelsSkipRadius", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[CirclePackingLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: CirclePackingLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: ComputedDatum[RawDatum] => Element): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setZoomedId(value: String): Self = StObject.set(x, "zoomedId", value.asInstanceOf[js.Any])
      
      inline def setZoomedIdNull: Self = StObject.set(x, "zoomedId", null)
      
      inline def setZoomedIdUndefined: Self = StObject.set(x, "zoomedId", js.undefined)
    }
  }
  
  type CirclePackingCustomLayer[RawDatum] = FC[CirclePackingCustomLayerProps[RawDatum]]
  
  trait CirclePackingCustomLayerProps[RawDatum] extends StObject {
    
    var nodes: js.Array[ComputedDatum[RawDatum]]
  }
  object CirclePackingCustomLayerProps {
    
    inline def apply[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]]): CirclePackingCustomLayerProps[RawDatum] = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirclePackingCustomLayerProps[RawDatum]]
    }
    
    extension [Self <: CirclePackingCustomLayerProps[?], RawDatum](x: Self & CirclePackingCustomLayerProps[RawDatum]) {
      
      inline def setNodes(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait CirclePackingHtmlProps[RawDatum]
    extends StObject
       with CirclePackingCommonProps[RawDatum]
       with MouseHandlers[RawDatum]
  object CirclePackingHtmlProps {
    
    inline def apply[RawDatum](
      animate: Boolean,
      borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderWidth: Double,
      childColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      circleComponent: /* props */ CircleProps[RawDatum] => Element,
      colorBy: id | depth,
      colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]],
      data: RawDatum,
      enableLabels: Boolean,
      height: Double,
      id: PropertyAccessor[RawDatum, String],
      inheritColorFromParent: Boolean,
      isInteractive: Boolean,
      label: PropertyAccessor[ComputedDatum[RawDatum], String],
      labelComponent: /* props */ LabelProps[RawDatum] => Element,
      labelTextColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      labelsSkipRadius: Double,
      layers: js.Array[CirclePackingLayer[RawDatum]],
      leavesOnly: Boolean,
      padding: Double,
      role: String,
      tooltip: ComputedDatum[RawDatum] => Element,
      value: PropertyAccessor[RawDatum, Double],
      width: Double
    ): CirclePackingHtmlProps[RawDatum] = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], childColor = childColor.asInstanceOf[js.Any], circleComponent = js.Any.fromFunction1(circleComponent), colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritColorFromParent = inheritColorFromParent.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelComponent = js.Any.fromFunction1(labelComponent), labelTextColor = labelTextColor.asInstanceOf[js.Any], labelsSkipRadius = labelsSkipRadius.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], leavesOnly = leavesOnly.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirclePackingHtmlProps[RawDatum]]
    }
  }
  
  type CirclePackingLayer[RawDatum] = CirclePackingLayerId | CirclePackingCustomLayer[RawDatum]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoCirclePacking.nivoCirclePackingStrings.circles
    - typings.nivoCirclePacking.nivoCirclePackingStrings.labels
  */
  trait CirclePackingLayerId extends StObject
  object CirclePackingLayerId {
    
    inline def circles: typings.nivoCirclePacking.nivoCirclePackingStrings.circles = "circles".asInstanceOf[typings.nivoCirclePacking.nivoCirclePackingStrings.circles]
    
    inline def labels: typings.nivoCirclePacking.nivoCirclePackingStrings.labels = "labels".asInstanceOf[typings.nivoCirclePacking.nivoCirclePackingStrings.labels]
  }
  
  trait CirclePackingSvgProps[RawDatum]
    extends StObject
       with CirclePackingCommonProps[RawDatum]
       with MouseHandlers[RawDatum]
       with SvgDefsAndFill[ComputedDatum[RawDatum]]
  object CirclePackingSvgProps {
    
    inline def apply[RawDatum](
      animate: Boolean,
      borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderWidth: Double,
      childColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      circleComponent: /* props */ CircleProps[RawDatum] => Element,
      colorBy: id | depth,
      colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]],
      data: RawDatum,
      enableLabels: Boolean,
      height: Double,
      id: PropertyAccessor[RawDatum, String],
      inheritColorFromParent: Boolean,
      isInteractive: Boolean,
      label: PropertyAccessor[ComputedDatum[RawDatum], String],
      labelComponent: /* props */ LabelProps[RawDatum] => Element,
      labelTextColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      labelsSkipRadius: Double,
      layers: js.Array[CirclePackingLayer[RawDatum]],
      leavesOnly: Boolean,
      padding: Double,
      role: String,
      tooltip: ComputedDatum[RawDatum] => Element,
      value: PropertyAccessor[RawDatum, Double],
      width: Double
    ): CirclePackingSvgProps[RawDatum] = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], childColor = childColor.asInstanceOf[js.Any], circleComponent = js.Any.fromFunction1(circleComponent), colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritColorFromParent = inheritColorFromParent.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelComponent = js.Any.fromFunction1(labelComponent), labelTextColor = labelTextColor.asInstanceOf[js.Any], labelsSkipRadius = labelsSkipRadius.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], leavesOnly = leavesOnly.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirclePackingSvgProps[RawDatum]]
    }
  }
  
  trait CircleProps[RawDatum]
    extends StObject
       with MouseHandlers[RawDatum] {
    
    var node: ComputedDatum[RawDatum]
    
    var style: BorderColor
  }
  object CircleProps {
    
    inline def apply[RawDatum](node: ComputedDatum[RawDatum], style: BorderColor): CircleProps[RawDatum] = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleProps[RawDatum]]
    }
    
    extension [Self <: CircleProps[?], RawDatum](x: Self & CircleProps[RawDatum]) {
      
      inline def setNode(value: ComputedDatum[RawDatum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: BorderColor): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputedDatum[RawDatum] extends StObject {
    
    var color: String
    
    var data: RawDatum
    
    var depth: Double
    
    var fill: js.UndefOr[String] = js.undefined
    
    var formattedValue: String
    
    var height: Double
    
    var id: String
    
    var parent: js.UndefOr[ComputedDatum[RawDatum]] = js.undefined
    
    var path: js.Array[String]
    
    var percentage: Double
    
    var radius: Double
    
    var value: Double
    
    var x: Double
    
    var y: Double
  }
  object ComputedDatum {
    
    inline def apply[RawDatum](
      color: String,
      data: RawDatum,
      depth: Double,
      formattedValue: String,
      height: Double,
      id: String,
      path: js.Array[String],
      percentage: Double,
      radius: Double,
      value: Double,
      x: Double,
      y: Double
    ): ComputedDatum[RawDatum] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedDatum[RawDatum]]
    }
    
    extension [Self <: ComputedDatum[?], RawDatum](x: Self & ComputedDatum[RawDatum]) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ComputedDatum[RawDatum]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputedLabel[RawDatum] extends StObject {
    
    var label: String | Double
    
    var node: ComputedDatum[RawDatum]
    
    var textColor: String
  }
  object ComputedLabel {
    
    inline def apply[RawDatum](label: String | Double, node: ComputedDatum[RawDatum], textColor: String): ComputedLabel[RawDatum] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedLabel[RawDatum]]
    }
    
    extension [Self <: ComputedLabel[?], RawDatum](x: Self & ComputedLabel[RawDatum]) {
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ComputedDatum[RawDatum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    }
  }
  
  type LabelComponent[RawDatum] = js.Function1[/* props */ LabelProps[RawDatum], Element]
  
  trait LabelProps[RawDatum] extends StObject {
    
    var label: String | Double
    
    var node: ComputedDatum[RawDatum]
    
    var style: Opacity
  }
  object LabelProps {
    
    inline def apply[RawDatum](label: String | Double, node: ComputedDatum[RawDatum], style: Opacity): LabelProps[RawDatum] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelProps[RawDatum]]
    }
    
    extension [Self <: LabelProps[?], RawDatum](x: Self & LabelProps[RawDatum]) {
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ComputedDatum[RawDatum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Opacity): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type MouseHandler[RawDatum] = js.Function2[
    /* datum */ ComputedDatum[RawDatum], 
    /* event */ MouseEvent[typings.std.Element, NativeMouseEvent], 
    Unit
  ]
  
  trait MouseHandlers[RawDatum] extends StObject {
    
    var onClick: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
  }
  object MouseHandlers {
    
    inline def apply[RawDatum](): MouseHandlers[RawDatum] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseHandlers[RawDatum]]
    }
    
    extension [Self <: MouseHandlers[?], RawDatum](x: Self & MouseHandlers[RawDatum]) {
      
      inline def setOnClick(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    }
  }
}

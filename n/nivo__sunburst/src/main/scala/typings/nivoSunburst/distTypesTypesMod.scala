package typings.nivoSunburst

import typings.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typings.nivoArcs.distTypesArcLabelsArcLabelsLayerMod.ArcLabelComponent
import typings.nivoArcs.distTypesArcLabelsPropsMod.ArcLabelsProps
import typings.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.distTypesTypesMod.Arc
import typings.nivoArcs.distTypesTypesMod.ArcGenerator
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoSunburst.nivoSunburstStrings.color
import typings.nivoSunburst.nivoSunburstStrings.depth
import typings.nivoSunburst.nivoSunburstStrings.fill
import typings.nivoSunburst.nivoSunburstStrings.id
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait ChildrenDatum[RawDatum] extends StObject {
    
    var children: js.UndefOr[js.Array[RawDatum & ChildrenDatum[RawDatum]]] = js.undefined
  }
  object ChildrenDatum {
    
    inline def apply[RawDatum](): ChildrenDatum[RawDatum] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildrenDatum[RawDatum]]
    }
    
    extension [Self <: ChildrenDatum[?], RawDatum](x: Self & ChildrenDatum[RawDatum]) {
      
      inline def setChildren(value: js.Array[RawDatum & ChildrenDatum[RawDatum]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (RawDatum & ChildrenDatum[RawDatum])*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait ComputedDatum[RawDatum] extends StObject {
    
    var arc: Arc
    
    var color: String
    
    var data: RawDatum
    
    var depth: Double
    
    var fill: js.UndefOr[String] = js.undefined
    
    var formattedValue: String
    
    var height: Double
    
    var id: DatumId
    
    var parent: js.UndefOr[ComputedDatum[RawDatum]] = js.undefined
    
    var path: js.Array[DatumId]
    
    var percentage: Double
    
    var value: Double
  }
  object ComputedDatum {
    
    inline def apply[RawDatum](
      arc: Arc,
      color: String,
      data: RawDatum,
      depth: Double,
      formattedValue: String,
      height: Double,
      id: DatumId,
      path: js.Array[DatumId],
      percentage: Double,
      value: Double
    ): ComputedDatum[RawDatum] = {
      val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedDatum[RawDatum]]
    }
    
    extension [Self <: ComputedDatum[?], RawDatum](x: Self & ComputedDatum[RawDatum]) {
      
      inline def setArc(value: Arc): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ComputedDatum[RawDatum]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: js.Array[DatumId]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: DatumId*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataProps[RawDatum] extends StObject {
    
    var data: RawDatum
    
    var id: js.UndefOr[PropertyAccessor[RawDatum, DatumId]] = js.undefined
    
    var value: js.UndefOr[PropertyAccessor[RawDatum, Double]] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  }
  object DataProps {
    
    inline def apply[RawDatum](data: RawDatum): DataProps[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataProps[RawDatum]]
    }
    
    extension [Self <: DataProps[?], RawDatum](x: Self & DataProps[RawDatum]) {
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: PropertyAccessor[RawDatum, DatumId]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction1(value: RawDatum => DatumId): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type DatumId = String | Double
  
  type MouseHandler[RawDatum] = js.Function2[
    /* datum */ ComputedDatum[RawDatum], 
    /* event */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
  
  /* Inlined std.Partial<{  onClick :@nivo/sunburst.@nivo/sunburst/dist/types/types.MouseHandler<RawDatum>,   onMouseEnter :@nivo/sunburst.@nivo/sunburst/dist/types/types.MouseHandler<RawDatum>,   onMouseLeave :@nivo/sunburst.@nivo/sunburst/dist/types/types.MouseHandler<RawDatum>,   onMouseMove :@nivo/sunburst.@nivo/sunburst/dist/types/types.MouseHandler<RawDatum>}> */
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
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    }
  }
  
  trait SunburstCommonProps[RawDatum]
    extends StObject
       with ArcLabelsProps[ComputedDatum[RawDatum]] {
    
    var animate: Boolean
    
    var borderColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var borderWidth: Double
    
    var childColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var colorBy: id | depth
    
    var colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]
    
    var cornerRadius: Double
    
    var data: RawDatum
    
    var enableArcLabels: Boolean
    
    var height: Double
    
    var id: PropertyAccessor[RawDatum, DatumId]
    
    var inheritColorFromParent: Boolean
    
    var isInteractive: Boolean
    
    var layers: js.Array[SunburstLayer[RawDatum]]
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var renderWrapper: Boolean
    
    var role: String
    
    var theme: Theme
    
    def tooltip(props: ComputedDatum[RawDatum]): typings.react.mod.global.JSX.Element
    
    var transitionMode: ArcTransitionMode
    
    var value: PropertyAccessor[RawDatum, Double]
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object SunburstCommonProps {
    
    inline def apply[RawDatum](
      animate: Boolean,
      arcLabel: PropertyAccessor[ComputedDatum[RawDatum], String],
      arcLabelsComponent: /* props */ ArcLabelProps[ComputedDatum[RawDatum]] => typings.react.mod.global.JSX.Element,
      arcLabelsRadiusOffset: Double,
      arcLabelsSkipAngle: Double,
      arcLabelsTextColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderWidth: Double,
      childColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      colorBy: id | depth,
      colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]],
      cornerRadius: Double,
      data: RawDatum,
      enableArcLabels: Boolean,
      height: Double,
      id: PropertyAccessor[RawDatum, DatumId],
      inheritColorFromParent: Boolean,
      isInteractive: Boolean,
      layers: js.Array[SunburstLayer[RawDatum]],
      renderWrapper: Boolean,
      role: String,
      theme: Theme,
      tooltip: ComputedDatum[RawDatum] => typings.react.mod.global.JSX.Element,
      transitionMode: ArcTransitionMode,
      value: PropertyAccessor[RawDatum, Double],
      width: Double
    ): SunburstCommonProps[RawDatum] = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], arcLabel = arcLabel.asInstanceOf[js.Any], arcLabelsComponent = js.Any.fromFunction1(arcLabelsComponent), arcLabelsRadiusOffset = arcLabelsRadiusOffset.asInstanceOf[js.Any], arcLabelsSkipAngle = arcLabelsSkipAngle.asInstanceOf[js.Any], arcLabelsTextColor = arcLabelsTextColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], childColor = childColor.asInstanceOf[js.Any], colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableArcLabels = enableArcLabels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritColorFromParent = inheritColorFromParent.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), transitionMode = transitionMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SunburstCommonProps[RawDatum]]
    }
    
    extension [Self <: SunburstCommonProps[?], RawDatum](x: Self & SunburstCommonProps[RawDatum]) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setChildColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "childColor", value.asInstanceOf[js.Any])
      
      inline def setColorBy(value: id | depth): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnableArcLabels(value: Boolean): Self = StObject.set(x, "enableArcLabels", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: PropertyAccessor[RawDatum, DatumId]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction1(value: RawDatum => DatumId): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setInheritColorFromParent(value: Boolean): Self = StObject.set(x, "inheritColorFromParent", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[SunburstLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: SunburstLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: ComputedDatum[RawDatum] => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      inline def setTransitionMode(value: ArcTransitionMode): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type SunburstCustomLayer[RawDatum] = FC[SunburstCustomLayerProps[RawDatum]]
  
  trait SunburstCustomLayerProps[RawDatum] extends StObject {
    
    var arcGenerator: ArcGenerator
    
    var centerX: Double
    
    var centerY: Double
    
    var nodes: js.Array[ComputedDatum[RawDatum]]
    
    var radius: Double
  }
  object SunburstCustomLayerProps {
    
    inline def apply[RawDatum](
      arcGenerator: ArcGenerator,
      centerX: Double,
      centerY: Double,
      nodes: js.Array[ComputedDatum[RawDatum]],
      radius: Double
    ): SunburstCustomLayerProps[RawDatum] = {
      val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[SunburstCustomLayerProps[RawDatum]]
    }
    
    extension [Self <: SunburstCustomLayerProps[?], RawDatum](x: Self & SunburstCustomLayerProps[RawDatum]) {
      
      inline def setArcGenerator(value: ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
  
  type SunburstLayer[RawDatum] = SunburstLayerId | SunburstCustomLayer[RawDatum]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoSunburst.nivoSunburstStrings.arcs
    - typings.nivoSunburst.nivoSunburstStrings.arcLabels
  */
  trait SunburstLayerId extends StObject
  object SunburstLayerId {
    
    inline def arcLabels: typings.nivoSunburst.nivoSunburstStrings.arcLabels = "arcLabels".asInstanceOf[typings.nivoSunburst.nivoSunburstStrings.arcLabels]
    
    inline def arcs: typings.nivoSunburst.nivoSunburstStrings.arcs = "arcs".asInstanceOf[typings.nivoSunburst.nivoSunburstStrings.arcs]
  }
  
  /* Inlined @nivo/sunburst.@nivo/sunburst/dist/types/types.SunburstCommonProps<RawDatum> & @nivo/core.@nivo/core.SvgDefsAndFill<RawDatum> & @nivo/sunburst.@nivo/sunburst/dist/types/types.MouseHandlers<RawDatum> */
  trait SunburstSvgProps[RawDatum] extends StObject {
    
    var animate: Boolean
    
    var arcLabel: PropertyAccessor[ComputedDatum[RawDatum], String]
    
    var arcLabelsComponent: ArcLabelComponent[ComputedDatum[RawDatum]]
    
    var arcLabelsRadiusOffset: Double
    
    var arcLabelsSkipAngle: Double
    
    var arcLabelsTextColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var borderColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var borderWidth: Double
    
    var childColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var colorBy: id | depth
    
    var colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]
    
    var cornerRadius: Double
    
    var data: RawDatum
    
    var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
    
    var enableArcLabels: Boolean
    
    var fill: js.UndefOr[js.Array[Id[RawDatum]]] = js.undefined
    
    var height: Double
    
    var id: PropertyAccessor[RawDatum, DatumId]
    
    var inheritColorFromParent: Boolean
    
    var isInteractive: Boolean
    
    var layers: js.Array[SunburstLayer[RawDatum]]
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var renderWrapper: Boolean
    
    var role: String
    
    var theme: Theme
    
    def tooltip(props: ComputedDatum[RawDatum]): typings.react.mod.global.JSX.Element
    
    var transitionMode: ArcTransitionMode
    
    var value: PropertyAccessor[RawDatum, Double]
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object SunburstSvgProps {
    
    inline def apply[RawDatum](
      animate: Boolean,
      arcLabel: PropertyAccessor[ComputedDatum[RawDatum], String],
      arcLabelsComponent: /* props */ ArcLabelProps[ComputedDatum[RawDatum]] => typings.react.mod.global.JSX.Element,
      arcLabelsRadiusOffset: Double,
      arcLabelsSkipAngle: Double,
      arcLabelsTextColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderWidth: Double,
      childColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      colorBy: id | depth,
      colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]],
      cornerRadius: Double,
      data: RawDatum,
      enableArcLabels: Boolean,
      height: Double,
      id: PropertyAccessor[RawDatum, DatumId],
      inheritColorFromParent: Boolean,
      isInteractive: Boolean,
      layers: js.Array[SunburstLayer[RawDatum]],
      renderWrapper: Boolean,
      role: String,
      theme: Theme,
      tooltip: ComputedDatum[RawDatum] => typings.react.mod.global.JSX.Element,
      transitionMode: ArcTransitionMode,
      value: PropertyAccessor[RawDatum, Double],
      width: Double
    ): SunburstSvgProps[RawDatum] = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], arcLabel = arcLabel.asInstanceOf[js.Any], arcLabelsComponent = js.Any.fromFunction1(arcLabelsComponent), arcLabelsRadiusOffset = arcLabelsRadiusOffset.asInstanceOf[js.Any], arcLabelsSkipAngle = arcLabelsSkipAngle.asInstanceOf[js.Any], arcLabelsTextColor = arcLabelsTextColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], childColor = childColor.asInstanceOf[js.Any], colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableArcLabels = enableArcLabels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritColorFromParent = inheritColorFromParent.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), transitionMode = transitionMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SunburstSvgProps[RawDatum]]
    }
    
    extension [Self <: SunburstSvgProps[?], RawDatum](x: Self & SunburstSvgProps[RawDatum]) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setArcLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "arcLabel", value.asInstanceOf[js.Any])
      
      inline def setArcLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "arcLabel", js.Any.fromFunction1(value))
      
      inline def setArcLabelsComponent(value: /* props */ ArcLabelProps[ComputedDatum[RawDatum]] => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "arcLabelsComponent", js.Any.fromFunction1(value))
      
      inline def setArcLabelsRadiusOffset(value: Double): Self = StObject.set(x, "arcLabelsRadiusOffset", value.asInstanceOf[js.Any])
      
      inline def setArcLabelsSkipAngle(value: Double): Self = StObject.set(x, "arcLabelsSkipAngle", value.asInstanceOf[js.Any])
      
      inline def setArcLabelsTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "arcLabelsTextColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setChildColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "childColor", value.asInstanceOf[js.Any])
      
      inline def setColorBy(value: id | depth): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
      
      inline def setEnableArcLabels(value: Boolean): Self = StObject.set(x, "enableArcLabels", value.asInstanceOf[js.Any])
      
      inline def setFill(value: js.Array[Id[RawDatum]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: Id[RawDatum]*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: PropertyAccessor[RawDatum, DatumId]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction1(value: RawDatum => DatumId): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setInheritColorFromParent(value: Boolean): Self = StObject.set(x, "inheritColorFromParent", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[SunburstLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: SunburstLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setOnClick(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: ComputedDatum[RawDatum] => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      inline def setTransitionMode(value: ArcTransitionMode): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

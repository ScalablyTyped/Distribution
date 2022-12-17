package typings.nivoChord

import typings.d3Shape.mod.Arc_
import typings.nivoChord.anon.OmitArcDatumlabelcolor
import typings.nivoChord.anon.Source
import typings.nivoChord.anon.StartAngle
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.distTypesTypesMod.LegendProps
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait ArcAnimatedProps extends StObject {
    
    var borderColor: String
    
    var color: String
    
    var endAngle: Double
    
    var opacity: Double
    
    var startAngle: Double
  }
  object ArcAnimatedProps {
    
    inline def apply(borderColor: String, color: String, endAngle: Double, opacity: Double, startAngle: Double): ArcAnimatedProps = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcAnimatedProps]
    }
    
    extension [Self <: ArcAnimatedProps](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArcDatum extends StObject {
    
    var color: String
    
    var endAngle: Double
    
    var formattedValue: Double | String
    
    var id: String
    
    var index: Double
    
    var label: String
    
    var startAngle: Double
    
    var value: Double
  }
  object ArcDatum {
    
    inline def apply(
      color: String,
      endAngle: Double,
      formattedValue: Double | String,
      id: String,
      index: Double,
      label: String,
      startAngle: Double,
      value: Double
    ): ArcDatum = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcDatum]
    }
    
    extension [Self <: ArcDatum](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setFormattedValue(value: Double | String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ArcGenerator = Arc_[Any, ArcDatum | StartAngle]
  
  type ArcTooltipComponent = FunctionComponent[ArcTooltipComponentProps]
  
  trait ArcTooltipComponentProps extends StObject {
    
    var arc: ArcDatum
  }
  object ArcTooltipComponentProps {
    
    inline def apply(arc: ArcDatum): ArcTooltipComponentProps = {
      val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcTooltipComponentProps]
    }
    
    extension [Self <: ArcTooltipComponentProps](x: Self) {
      
      inline def setArc(value: ArcDatum): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    }
  }
  
  type ChordArcMouseHandler = js.Function2[/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent], Unit]
  
  /* Inlined std.Partial<@nivo/chord.@nivo/chord/dist/types/types.ChordCommonProps> & @nivo/chord.@nivo/chord/dist/types/types.ChordDataProps & @nivo/core.@nivo/core.Dimensions & {  layers :std.Array<@nivo/chord.@nivo/chord/dist/types/types.LayerId | @nivo/chord.@nivo/chord/dist/types/types.CustomCanvasLayer> | undefined,   pixelRatio :number | undefined} */
  trait ChordCanvasProps extends StObject {
    
    var activeArcOpacity: js.UndefOr[Double] = js.undefined
    
    var activeRibbonOpacity: js.UndefOr[Double] = js.undefined
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var arcBorderColor: js.UndefOr[InheritedColorConfig[ArcDatum]] = js.undefined
    
    var arcBorderWidth: js.UndefOr[Double] = js.undefined
    
    var arcOpacity: js.UndefOr[Double] = js.undefined
    
    var arcTooltip: js.UndefOr[ArcTooltipComponent] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[OmitArcDatumlabelcolor]] = js.undefined
    
    var data: js.Array[js.Array[Double]]
    
    var enableLabel: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var inactiveArcOpacity: js.UndefOr[Double] = js.undefined
    
    var inactiveRibbonOpacity: js.UndefOr[Double] = js.undefined
    
    var innerRadiusOffset: js.UndefOr[Double] = js.undefined
    
    var innerRadiusRatio: js.UndefOr[Double] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.Array[String]
    
    var label: js.UndefOr[PropertyAccessor[OmitArcDatumlabelcolor, String]] = js.undefined
    
    var labelOffset: js.UndefOr[Double] = js.undefined
    
    var labelRotation: js.UndefOr[Double] = js.undefined
    
    var labelTextColor: js.UndefOr[InheritedColorConfig[ArcDatum]] = js.undefined
    
    var layers: js.UndefOr[js.Array[LayerId | CustomCanvasLayer]] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var onArcClick: js.UndefOr[ChordArcMouseHandler] = js.undefined
    
    var onArcMouseEnter: js.UndefOr[ChordArcMouseHandler] = js.undefined
    
    var onArcMouseLeave: js.UndefOr[ChordArcMouseHandler] = js.undefined
    
    var onArcMouseMove: js.UndefOr[ChordArcMouseHandler] = js.undefined
    
    var padAngle: js.UndefOr[Double] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var ribbonBlendMode: js.UndefOr[CssMixBlendMode] = js.undefined
    
    var ribbonBorderColor: js.UndefOr[InheritedColorConfig[ArcDatum]] = js.undefined
    
    var ribbonBorderWidth: js.UndefOr[Double] = js.undefined
    
    var ribbonOpacity: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object ChordCanvasProps {
    
    inline def apply(data: js.Array[js.Array[Double]], height: Double, keys: js.Array[String], width: Double): ChordCanvasProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChordCanvasProps]
    }
    
    extension [Self <: ChordCanvasProps](x: Self) {
      
      inline def setActiveArcOpacity(value: Double): Self = StObject.set(x, "activeArcOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveArcOpacityUndefined: Self = StObject.set(x, "activeArcOpacity", js.undefined)
      
      inline def setActiveRibbonOpacity(value: Double): Self = StObject.set(x, "activeRibbonOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveRibbonOpacityUndefined: Self = StObject.set(x, "activeRibbonOpacity", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setArcBorderColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "arcBorderColor", value.asInstanceOf[js.Any])
      
      inline def setArcBorderColorUndefined: Self = StObject.set(x, "arcBorderColor", js.undefined)
      
      inline def setArcBorderWidth(value: Double): Self = StObject.set(x, "arcBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setArcBorderWidthUndefined: Self = StObject.set(x, "arcBorderWidth", js.undefined)
      
      inline def setArcOpacity(value: Double): Self = StObject.set(x, "arcOpacity", value.asInstanceOf[js.Any])
      
      inline def setArcOpacityUndefined: Self = StObject.set(x, "arcOpacity", js.undefined)
      
      inline def setArcTooltip(value: ArcTooltipComponent): Self = StObject.set(x, "arcTooltip", value.asInstanceOf[js.Any])
      
      inline def setArcTooltipUndefined: Self = StObject.set(x, "arcTooltip", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[OmitArcDatumlabelcolor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[Double]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelUndefined: Self = StObject.set(x, "enableLabel", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInactiveArcOpacity(value: Double): Self = StObject.set(x, "inactiveArcOpacity", value.asInstanceOf[js.Any])
      
      inline def setInactiveArcOpacityUndefined: Self = StObject.set(x, "inactiveArcOpacity", js.undefined)
      
      inline def setInactiveRibbonOpacity(value: Double): Self = StObject.set(x, "inactiveRibbonOpacity", value.asInstanceOf[js.Any])
      
      inline def setInactiveRibbonOpacityUndefined: Self = StObject.set(x, "inactiveRibbonOpacity", js.undefined)
      
      inline def setInnerRadiusOffset(value: Double): Self = StObject.set(x, "innerRadiusOffset", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusOffsetUndefined: Self = StObject.set(x, "innerRadiusOffset", js.undefined)
      
      inline def setInnerRadiusRatio(value: Double): Self = StObject.set(x, "innerRadiusRatio", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusRatioUndefined: Self = StObject.set(x, "innerRadiusRatio", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setLabel(value: PropertyAccessor[OmitArcDatumlabelcolor, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setLabelRotationUndefined: Self = StObject.set(x, "labelRotation", js.undefined)
      
      inline def setLabelTextColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayers(value: js.Array[LayerId | CustomCanvasLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (LayerId | CustomCanvasLayer)*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setOnArcClick(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcClick", js.Any.fromFunction2(value))
      
      inline def setOnArcClickUndefined: Self = StObject.set(x, "onArcClick", js.undefined)
      
      inline def setOnArcMouseEnter(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnArcMouseEnterUndefined: Self = StObject.set(x, "onArcMouseEnter", js.undefined)
      
      inline def setOnArcMouseLeave(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnArcMouseLeaveUndefined: Self = StObject.set(x, "onArcMouseLeave", js.undefined)
      
      inline def setOnArcMouseMove(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnArcMouseMoveUndefined: Self = StObject.set(x, "onArcMouseMove", js.undefined)
      
      inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRibbonBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "ribbonBlendMode", value.asInstanceOf[js.Any])
      
      inline def setRibbonBlendModeUndefined: Self = StObject.set(x, "ribbonBlendMode", js.undefined)
      
      inline def setRibbonBorderColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "ribbonBorderColor", value.asInstanceOf[js.Any])
      
      inline def setRibbonBorderColorUndefined: Self = StObject.set(x, "ribbonBorderColor", js.undefined)
      
      inline def setRibbonBorderWidth(value: Double): Self = StObject.set(x, "ribbonBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setRibbonBorderWidthUndefined: Self = StObject.set(x, "ribbonBorderWidth", js.undefined)
      
      inline def setRibbonOpacity(value: Double): Self = StObject.set(x, "ribbonOpacity", value.asInstanceOf[js.Any])
      
      inline def setRibbonOpacityUndefined: Self = StObject.set(x, "ribbonOpacity", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  margin :@nivo/core.@nivo/core.Box,   label :@nivo/core.@nivo/core.PropertyAccessor<std.Omit<@nivo/chord.@nivo/chord/dist/types/types.ArcDatum, 'label' | 'color'>, string>,   valueFormat :@nivo/core.@nivo/core.ValueFormat<number, void>,   padAngle :number,   innerRadiusRatio :number,   innerRadiusOffset :number,   theme :@nivo/core.@nivo/core.Theme,   colors :@nivo/colors.@nivo/colors.OrdinalColorScaleConfig<std.Omit<@nivo/chord.@nivo/chord/dist/types/types.ArcDatum, 'label' | 'color'>>,   arcOpacity :number,   activeArcOpacity :number,   inactiveArcOpacity :number,   arcBorderWidth :number,   arcBorderColor :@nivo/colors.@nivo/colors.InheritedColorConfig<@nivo/chord.@nivo/chord/dist/types/types.ArcDatum>,   onArcMouseEnter :@nivo/chord.@nivo/chord/dist/types/types.ChordArcMouseHandler,   onArcMouseMove :@nivo/chord.@nivo/chord/dist/types/types.ChordArcMouseHandler,   onArcMouseLeave :@nivo/chord.@nivo/chord/dist/types/types.ChordArcMouseHandler,   onArcClick :@nivo/chord.@nivo/chord/dist/types/types.ChordArcMouseHandler,   arcTooltip :@nivo/chord.@nivo/chord/dist/types/types.ArcTooltipComponent,   ribbonBlendMode :@nivo/core.@nivo/core.CssMixBlendMode,   ribbonOpacity :number,   activeRibbonOpacity :number,   inactiveRibbonOpacity :number,   ribbonBorderWidth :number,   ribbonBorderColor :@nivo/colors.@nivo/colors.InheritedColorConfig<@nivo/chord.@nivo/chord/dist/types/types.ArcDatum>,   enableLabel :boolean,   labelOffset :number,   labelRotation :number,   labelTextColor :@nivo/colors.@nivo/colors.InheritedColorConfig<@nivo/chord.@nivo/chord/dist/types/types.ArcDatum>,   isInteractive :boolean,   legends :std.Array<@nivo/legends.@nivo/legends.LegendProps>,   renderWrapper :boolean,   role :string,   ariaLabel :react.react.AriaAttributes['aria-label'],   ariaLabelledBy :react.react.AriaAttributes['aria-labelledby'],   ariaDescribedBy :react.react.AriaAttributes['aria-describedby']} & std.Required<@nivo/core.@nivo/core.ModernMotionProps> */
  trait ChordCommonProps extends StObject {
    
    var activeArcOpacity: Double
    
    var activeRibbonOpacity: Double
    
    var animate: Boolean
    
    var arcBorderColor: InheritedColorConfig[ArcDatum]
    
    var arcBorderWidth: Double
    
    var arcOpacity: Double
    
    var arcTooltip: ArcTooltipComponent
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var colors: OrdinalColorScaleConfig[OmitArcDatumlabelcolor]
    
    var enableLabel: Boolean
    
    var inactiveArcOpacity: Double
    
    var inactiveRibbonOpacity: Double
    
    var innerRadiusOffset: Double
    
    var innerRadiusRatio: Double
    
    var isInteractive: Boolean
    
    var label: PropertyAccessor[OmitArcDatumlabelcolor, String]
    
    var labelOffset: Double
    
    var labelRotation: Double
    
    var labelTextColor: InheritedColorConfig[ArcDatum]
    
    var legends: js.Array[LegendProps]
    
    var margin: Box
    
    var motionConfig: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    
    var onArcClick: ChordArcMouseHandler
    
    var onArcMouseEnter: ChordArcMouseHandler
    
    var onArcMouseLeave: ChordArcMouseHandler
    
    var onArcMouseMove: ChordArcMouseHandler
    
    var padAngle: Double
    
    var renderWrapper: Boolean
    
    var ribbonBlendMode: CssMixBlendMode
    
    var ribbonBorderColor: InheritedColorConfig[ArcDatum]
    
    var ribbonBorderWidth: Double
    
    var ribbonOpacity: Double
    
    var role: String
    
    var theme: Theme
    
    var valueFormat: ValueFormat[Double, Unit]
  }
  object ChordCommonProps {
    
    inline def apply(
      activeArcOpacity: Double,
      activeRibbonOpacity: Double,
      animate: Boolean,
      arcBorderColor: InheritedColorConfig[ArcDatum],
      arcBorderWidth: Double,
      arcOpacity: Double,
      arcTooltip: ArcTooltipComponent,
      colors: OrdinalColorScaleConfig[OmitArcDatumlabelcolor],
      enableLabel: Boolean,
      inactiveArcOpacity: Double,
      inactiveRibbonOpacity: Double,
      innerRadiusOffset: Double,
      innerRadiusRatio: Double,
      isInteractive: Boolean,
      label: PropertyAccessor[OmitArcDatumlabelcolor, String],
      labelOffset: Double,
      labelRotation: Double,
      labelTextColor: InheritedColorConfig[ArcDatum],
      legends: js.Array[LegendProps],
      margin: Box,
      motionConfig: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any),
      onArcClick: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
      onArcMouseEnter: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
      onArcMouseLeave: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
      onArcMouseMove: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
      padAngle: Double,
      renderWrapper: Boolean,
      ribbonBlendMode: CssMixBlendMode,
      ribbonBorderColor: InheritedColorConfig[ArcDatum],
      ribbonBorderWidth: Double,
      ribbonOpacity: Double,
      role: String,
      theme: Theme,
      valueFormat: ValueFormat[Double, Unit]
    ): ChordCommonProps = {
      val __obj = js.Dynamic.literal(activeArcOpacity = activeArcOpacity.asInstanceOf[js.Any], activeRibbonOpacity = activeRibbonOpacity.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], arcBorderColor = arcBorderColor.asInstanceOf[js.Any], arcBorderWidth = arcBorderWidth.asInstanceOf[js.Any], arcOpacity = arcOpacity.asInstanceOf[js.Any], arcTooltip = arcTooltip.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], inactiveArcOpacity = inactiveArcOpacity.asInstanceOf[js.Any], inactiveRibbonOpacity = inactiveRibbonOpacity.asInstanceOf[js.Any], innerRadiusOffset = innerRadiusOffset.asInstanceOf[js.Any], innerRadiusRatio = innerRadiusRatio.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelOffset = labelOffset.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], motionConfig = motionConfig.asInstanceOf[js.Any], onArcClick = js.Any.fromFunction2(onArcClick), onArcMouseEnter = js.Any.fromFunction2(onArcMouseEnter), onArcMouseLeave = js.Any.fromFunction2(onArcMouseLeave), onArcMouseMove = js.Any.fromFunction2(onArcMouseMove), padAngle = padAngle.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], ribbonBlendMode = ribbonBlendMode.asInstanceOf[js.Any], ribbonBorderColor = ribbonBorderColor.asInstanceOf[js.Any], ribbonBorderWidth = ribbonBorderWidth.asInstanceOf[js.Any], ribbonOpacity = ribbonOpacity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], valueFormat = valueFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChordCommonProps]
    }
    
    extension [Self <: ChordCommonProps](x: Self) {
      
      inline def setActiveArcOpacity(value: Double): Self = StObject.set(x, "activeArcOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveRibbonOpacity(value: Double): Self = StObject.set(x, "activeRibbonOpacity", value.asInstanceOf[js.Any])
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setArcBorderColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "arcBorderColor", value.asInstanceOf[js.Any])
      
      inline def setArcBorderWidth(value: Double): Self = StObject.set(x, "arcBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setArcOpacity(value: Double): Self = StObject.set(x, "arcOpacity", value.asInstanceOf[js.Any])
      
      inline def setArcTooltip(value: ArcTooltipComponent): Self = StObject.set(x, "arcTooltip", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[OmitArcDatumlabelcolor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setInactiveArcOpacity(value: Double): Self = StObject.set(x, "inactiveArcOpacity", value.asInstanceOf[js.Any])
      
      inline def setInactiveRibbonOpacity(value: Double): Self = StObject.set(x, "inactiveRibbonOpacity", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusOffset(value: Double): Self = StObject.set(x, "innerRadiusOffset", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusRatio(value: Double): Self = StObject.set(x, "innerRadiusRatio", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: PropertyAccessor[OmitArcDatumlabelcolor, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setOnArcClick(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcClick", js.Any.fromFunction2(value))
      
      inline def setOnArcMouseEnter(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnArcMouseLeave(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnArcMouseMove(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcMouseMove", js.Any.fromFunction2(value))
      
      inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRibbonBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "ribbonBlendMode", value.asInstanceOf[js.Any])
      
      inline def setRibbonBorderColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "ribbonBorderColor", value.asInstanceOf[js.Any])
      
      inline def setRibbonBorderWidth(value: Double): Self = StObject.set(x, "ribbonBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setRibbonOpacity(value: Double): Self = StObject.set(x, "ribbonOpacity", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChordDataProps extends StObject {
    
    var data: js.Array[js.Array[Double]]
    
    var keys: js.Array[String]
  }
  object ChordDataProps {
    
    inline def apply(data: js.Array[js.Array[Double]], keys: js.Array[String]): ChordDataProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChordDataProps]
    }
    
    extension [Self <: ChordDataProps](x: Self) {
      
      inline def setData(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[Double]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
  
  type ChordRibbonMouseHandler = js.Function2[/* ribbon */ Any, /* event */ MouseEvent[Element, NativeMouseEvent], Unit]
  
  /* Inlined std.Partial<@nivo/chord.@nivo/chord/dist/types/types.ChordCommonProps> & @nivo/chord.@nivo/chord/dist/types/types.ChordDataProps & @nivo/core.@nivo/core.Dimensions & {  onRibbonMouseEnter :@nivo/chord.@nivo/chord/dist/types/types.ChordRibbonMouseHandler | undefined,   onRibbonMouseMove :@nivo/chord.@nivo/chord/dist/types/types.ChordRibbonMouseHandler | undefined,   onRibbonMouseLeave :@nivo/chord.@nivo/chord/dist/types/types.ChordRibbonMouseHandler | undefined,   onRibbonClick :@nivo/chord.@nivo/chord/dist/types/types.ChordRibbonMouseHandler | undefined,   ribbonTooltip :@nivo/chord.@nivo/chord/dist/types/types.RibbonTooltipComponent | undefined,   layers :std.Array<@nivo/chord.@nivo/chord/dist/types/types.LayerId | @nivo/chord.@nivo/chord/dist/types/types.CustomLayer> | undefined} */
  trait ChordSvgProps extends StObject {
    
    var activeArcOpacity: js.UndefOr[Double] = js.undefined
    
    var activeRibbonOpacity: js.UndefOr[Double] = js.undefined
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var arcBorderColor: js.UndefOr[InheritedColorConfig[ArcDatum]] = js.undefined
    
    var arcBorderWidth: js.UndefOr[Double] = js.undefined
    
    var arcOpacity: js.UndefOr[Double] = js.undefined
    
    var arcTooltip: js.UndefOr[ArcTooltipComponent] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[OmitArcDatumlabelcolor]] = js.undefined
    
    var data: js.Array[js.Array[Double]]
    
    var enableLabel: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var inactiveArcOpacity: js.UndefOr[Double] = js.undefined
    
    var inactiveRibbonOpacity: js.UndefOr[Double] = js.undefined
    
    var innerRadiusOffset: js.UndefOr[Double] = js.undefined
    
    var innerRadiusRatio: js.UndefOr[Double] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.Array[String]
    
    var label: js.UndefOr[PropertyAccessor[OmitArcDatumlabelcolor, String]] = js.undefined
    
    var labelOffset: js.UndefOr[Double] = js.undefined
    
    var labelRotation: js.UndefOr[Double] = js.undefined
    
    var labelTextColor: js.UndefOr[InheritedColorConfig[ArcDatum]] = js.undefined
    
    var layers: js.UndefOr[js.Array[LayerId | CustomLayer]] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var onArcClick: js.UndefOr[ChordArcMouseHandler] = js.undefined
    
    var onArcMouseEnter: js.UndefOr[ChordArcMouseHandler] = js.undefined
    
    var onArcMouseLeave: js.UndefOr[ChordArcMouseHandler] = js.undefined
    
    var onArcMouseMove: js.UndefOr[ChordArcMouseHandler] = js.undefined
    
    var onRibbonClick: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
    
    var onRibbonMouseEnter: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
    
    var onRibbonMouseLeave: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
    
    var onRibbonMouseMove: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
    
    var padAngle: js.UndefOr[Double] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var ribbonBlendMode: js.UndefOr[CssMixBlendMode] = js.undefined
    
    var ribbonBorderColor: js.UndefOr[InheritedColorConfig[ArcDatum]] = js.undefined
    
    var ribbonBorderWidth: js.UndefOr[Double] = js.undefined
    
    var ribbonOpacity: js.UndefOr[Double] = js.undefined
    
    var ribbonTooltip: js.UndefOr[RibbonTooltipComponent] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object ChordSvgProps {
    
    inline def apply(data: js.Array[js.Array[Double]], height: Double, keys: js.Array[String], width: Double): ChordSvgProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChordSvgProps]
    }
    
    extension [Self <: ChordSvgProps](x: Self) {
      
      inline def setActiveArcOpacity(value: Double): Self = StObject.set(x, "activeArcOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveArcOpacityUndefined: Self = StObject.set(x, "activeArcOpacity", js.undefined)
      
      inline def setActiveRibbonOpacity(value: Double): Self = StObject.set(x, "activeRibbonOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveRibbonOpacityUndefined: Self = StObject.set(x, "activeRibbonOpacity", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setArcBorderColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "arcBorderColor", value.asInstanceOf[js.Any])
      
      inline def setArcBorderColorUndefined: Self = StObject.set(x, "arcBorderColor", js.undefined)
      
      inline def setArcBorderWidth(value: Double): Self = StObject.set(x, "arcBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setArcBorderWidthUndefined: Self = StObject.set(x, "arcBorderWidth", js.undefined)
      
      inline def setArcOpacity(value: Double): Self = StObject.set(x, "arcOpacity", value.asInstanceOf[js.Any])
      
      inline def setArcOpacityUndefined: Self = StObject.set(x, "arcOpacity", js.undefined)
      
      inline def setArcTooltip(value: ArcTooltipComponent): Self = StObject.set(x, "arcTooltip", value.asInstanceOf[js.Any])
      
      inline def setArcTooltipUndefined: Self = StObject.set(x, "arcTooltip", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[OmitArcDatumlabelcolor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[Double]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelUndefined: Self = StObject.set(x, "enableLabel", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInactiveArcOpacity(value: Double): Self = StObject.set(x, "inactiveArcOpacity", value.asInstanceOf[js.Any])
      
      inline def setInactiveArcOpacityUndefined: Self = StObject.set(x, "inactiveArcOpacity", js.undefined)
      
      inline def setInactiveRibbonOpacity(value: Double): Self = StObject.set(x, "inactiveRibbonOpacity", value.asInstanceOf[js.Any])
      
      inline def setInactiveRibbonOpacityUndefined: Self = StObject.set(x, "inactiveRibbonOpacity", js.undefined)
      
      inline def setInnerRadiusOffset(value: Double): Self = StObject.set(x, "innerRadiusOffset", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusOffsetUndefined: Self = StObject.set(x, "innerRadiusOffset", js.undefined)
      
      inline def setInnerRadiusRatio(value: Double): Self = StObject.set(x, "innerRadiusRatio", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusRatioUndefined: Self = StObject.set(x, "innerRadiusRatio", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setLabel(value: PropertyAccessor[OmitArcDatumlabelcolor, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setLabelRotationUndefined: Self = StObject.set(x, "labelRotation", js.undefined)
      
      inline def setLabelTextColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayers(value: js.Array[LayerId | CustomLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (LayerId | CustomLayer)*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setOnArcClick(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcClick", js.Any.fromFunction2(value))
      
      inline def setOnArcClickUndefined: Self = StObject.set(x, "onArcClick", js.undefined)
      
      inline def setOnArcMouseEnter(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnArcMouseEnterUndefined: Self = StObject.set(x, "onArcMouseEnter", js.undefined)
      
      inline def setOnArcMouseLeave(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnArcMouseLeaveUndefined: Self = StObject.set(x, "onArcMouseLeave", js.undefined)
      
      inline def setOnArcMouseMove(value: (/* arc */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onArcMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnArcMouseMoveUndefined: Self = StObject.set(x, "onArcMouseMove", js.undefined)
      
      inline def setOnRibbonClick(value: (/* ribbon */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onRibbonClick", js.Any.fromFunction2(value))
      
      inline def setOnRibbonClickUndefined: Self = StObject.set(x, "onRibbonClick", js.undefined)
      
      inline def setOnRibbonMouseEnter(value: (/* ribbon */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onRibbonMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnRibbonMouseEnterUndefined: Self = StObject.set(x, "onRibbonMouseEnter", js.undefined)
      
      inline def setOnRibbonMouseLeave(value: (/* ribbon */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onRibbonMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnRibbonMouseLeaveUndefined: Self = StObject.set(x, "onRibbonMouseLeave", js.undefined)
      
      inline def setOnRibbonMouseMove(value: (/* ribbon */ Any, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onRibbonMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnRibbonMouseMoveUndefined: Self = StObject.set(x, "onRibbonMouseMove", js.undefined)
      
      inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRibbonBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "ribbonBlendMode", value.asInstanceOf[js.Any])
      
      inline def setRibbonBlendModeUndefined: Self = StObject.set(x, "ribbonBlendMode", js.undefined)
      
      inline def setRibbonBorderColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "ribbonBorderColor", value.asInstanceOf[js.Any])
      
      inline def setRibbonBorderColorUndefined: Self = StObject.set(x, "ribbonBorderColor", js.undefined)
      
      inline def setRibbonBorderWidth(value: Double): Self = StObject.set(x, "ribbonBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setRibbonBorderWidthUndefined: Self = StObject.set(x, "ribbonBorderWidth", js.undefined)
      
      inline def setRibbonOpacity(value: Double): Self = StObject.set(x, "ribbonOpacity", value.asInstanceOf[js.Any])
      
      inline def setRibbonOpacityUndefined: Self = StObject.set(x, "ribbonOpacity", js.undefined)
      
      inline def setRibbonTooltip(value: RibbonTooltipComponent): Self = StObject.set(x, "ribbonTooltip", value.asInstanceOf[js.Any])
      
      inline def setRibbonTooltipUndefined: Self = StObject.set(x, "ribbonTooltip", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomCanvasLayer = js.Function2[/* ctx */ CanvasRenderingContext2D, /* props */ CustomLayerProps, Unit]
  
  type CustomLayer = FunctionComponent[CustomLayerProps]
  
  trait CustomLayerProps extends StObject {
    
    var arcGenerator: ArcGenerator
    
    var arcs: js.Array[ArcDatum]
    
    var center: js.Tuple2[Double, Double]
    
    var radius: Double
    
    var ribbonGenerator: RibbonGenerator
    
    var ribbons: js.Array[RibbonDatum]
  }
  object CustomLayerProps {
    
    inline def apply(
      arcGenerator: ArcGenerator,
      arcs: js.Array[ArcDatum],
      center: js.Tuple2[Double, Double],
      radius: Double,
      ribbonGenerator: RibbonGenerator,
      ribbons: js.Array[RibbonDatum]
    ): CustomLayerProps = {
      val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], arcs = arcs.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ribbonGenerator = ribbonGenerator.asInstanceOf[js.Any], ribbons = ribbons.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomLayerProps]
    }
    
    extension [Self <: CustomLayerProps](x: Self) {
      
      inline def setArcGenerator(value: ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
      
      inline def setArcs(value: js.Array[ArcDatum]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      inline def setArcsVarargs(value: ArcDatum*): Self = StObject.set(x, "arcs", js.Array(value*))
      
      inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRibbonGenerator(value: RibbonGenerator): Self = StObject.set(x, "ribbonGenerator", value.asInstanceOf[js.Any])
      
      inline def setRibbons(value: js.Array[RibbonDatum]): Self = StObject.set(x, "ribbons", value.asInstanceOf[js.Any])
      
      inline def setRibbonsVarargs(value: RibbonDatum*): Self = StObject.set(x, "ribbons", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoChord.nivoChordStrings.ribbons
    - typings.nivoChord.nivoChordStrings.arcs
    - typings.nivoChord.nivoChordStrings.labels
    - typings.nivoChord.nivoChordStrings.legends
  */
  trait LayerId extends StObject
  object LayerId {
    
    inline def arcs: typings.nivoChord.nivoChordStrings.arcs = "arcs".asInstanceOf[typings.nivoChord.nivoChordStrings.arcs]
    
    inline def labels: typings.nivoChord.nivoChordStrings.labels = "labels".asInstanceOf[typings.nivoChord.nivoChordStrings.labels]
    
    inline def legends: typings.nivoChord.nivoChordStrings.legends = "legends".asInstanceOf[typings.nivoChord.nivoChordStrings.legends]
    
    inline def ribbons: typings.nivoChord.nivoChordStrings.ribbons = "ribbons".asInstanceOf[typings.nivoChord.nivoChordStrings.ribbons]
  }
  
  trait RibbonAnimatedProps extends StObject {
    
    var borderColor: String
    
    var color: String
    
    var opacity: Double
    
    var sourceEndAngle: Double
    
    var sourceStartAngle: Double
    
    var targetEndAngle: Double
    
    var targetStartAngle: Double
  }
  object RibbonAnimatedProps {
    
    inline def apply(
      borderColor: String,
      color: String,
      opacity: Double,
      sourceEndAngle: Double,
      sourceStartAngle: Double,
      targetEndAngle: Double,
      targetStartAngle: Double
    ): RibbonAnimatedProps = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], sourceEndAngle = sourceEndAngle.asInstanceOf[js.Any], sourceStartAngle = sourceStartAngle.asInstanceOf[js.Any], targetEndAngle = targetEndAngle.asInstanceOf[js.Any], targetStartAngle = targetStartAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[RibbonAnimatedProps]
    }
    
    extension [Self <: RibbonAnimatedProps](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setSourceEndAngle(value: Double): Self = StObject.set(x, "sourceEndAngle", value.asInstanceOf[js.Any])
      
      inline def setSourceStartAngle(value: Double): Self = StObject.set(x, "sourceStartAngle", value.asInstanceOf[js.Any])
      
      inline def setTargetEndAngle(value: Double): Self = StObject.set(x, "targetEndAngle", value.asInstanceOf[js.Any])
      
      inline def setTargetStartAngle(value: Double): Self = StObject.set(x, "targetStartAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait RibbonDatum extends StObject {
    
    var id: String
    
    var source: ArcDatum
    
    var target: ArcDatum
  }
  object RibbonDatum {
    
    inline def apply(id: String, source: ArcDatum, target: ArcDatum): RibbonDatum = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[RibbonDatum]
    }
    
    extension [Self <: RibbonDatum](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSource(value: ArcDatum): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: ArcDatum): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type RibbonGenerator = typings.d3Chord.mod.RibbonGenerator[Any, RibbonDatum | Source, RibbonDatum]
  
  type RibbonTooltipComponent = FunctionComponent[RibbonTooltipComponentProps]
  
  trait RibbonTooltipComponentProps extends StObject {
    
    var ribbon: RibbonDatum
  }
  object RibbonTooltipComponentProps {
    
    inline def apply(ribbon: RibbonDatum): RibbonTooltipComponentProps = {
      val __obj = js.Dynamic.literal(ribbon = ribbon.asInstanceOf[js.Any])
      __obj.asInstanceOf[RibbonTooltipComponentProps]
    }
    
    extension [Self <: RibbonTooltipComponentProps](x: Self) {
      
      inline def setRibbon(value: RibbonDatum): Self = StObject.set(x, "ribbon", value.asInstanceOf[js.Any])
    }
  }
}

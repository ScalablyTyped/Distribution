package typings.nivoChord.anon

import typings.nivoChord.distTypesTypesMod.ArcDatum
import typings.nivoChord.distTypesTypesMod.ArcTooltipComponent
import typings.nivoChord.distTypesTypesMod.ChordArcMouseHandler
import typings.nivoChord.distTypesTypesMod.ChordRibbonMouseHandler
import typings.nivoChord.distTypesTypesMod.CustomLayer
import typings.nivoChord.distTypesTypesMod.LayerId
import typings.nivoChord.distTypesTypesMod.RibbonTooltipComponent
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.distTypesTypesMod.LegendProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/chord.@nivo/chord/dist/types/types.ChordSvgProps, 'width' | 'height'> */
trait OmitChordSvgPropswidthhei extends StObject {
  
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
}
object OmitChordSvgPropswidthhei {
  
  inline def apply(data: js.Array[js.Array[Double]], keys: js.Array[String]): OmitChordSvgPropswidthhei = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitChordSvgPropswidthhei]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitChordSvgPropswidthhei] (val x: Self) extends AnyVal {
    
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
  }
}

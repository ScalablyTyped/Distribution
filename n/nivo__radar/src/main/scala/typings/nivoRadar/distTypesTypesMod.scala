package typings.nivoRadar

import typings.d3Scale.mod.ScaleLinear_
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.ClosedCurveFactoryId
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.DotsItemSymbolComponent
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.anon.PartialRecordtoprightbott
import typings.nivoLegends.distTypesSvgSymbolsTypesMod.SymbolProps
import typings.nivoLegends.distTypesTypesMod.Datum
import typings.nivoLegends.distTypesTypesMod.EffectProps
import typings.nivoLegends.distTypesTypesMod.LegendAnchor
import typings.nivoLegends.distTypesTypesMod.LegendDirection
import typings.nivoLegends.distTypesTypesMod.LegendItemDirection
import typings.nivoLegends.distTypesTypesMod.LegendProps
import typings.nivoLegends.distTypesTypesMod.SymbolShape
import typings.nivoRadar.anon.Color
import typings.nivoRadar.anon.Fill
import typings.nivoRadar.anon.Index
import typings.nivoRadar.nivoRadarStrings.auto
import typings.nivoRadar.nivoRadarStrings.circular
import typings.nivoRadar.nivoRadarStrings.end
import typings.nivoRadar.nivoRadarStrings.linear
import typings.nivoRadar.nivoRadarStrings.middle
import typings.nivoRadar.nivoRadarStrings.start
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Record
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  /* Inlined std.Required<std.Pick<@nivo/legends.@nivo/legends.LegendProps, 'data'>> & std.Omit<@nivo/legends.@nivo/legends.LegendProps, 'data'> */
  trait BoundLegendProps extends StObject {
    
    var anchor: LegendAnchor
    
    var data: js.Array[Datum]
    
    var direction: LegendDirection
    
    var effects: js.UndefOr[js.Array[EffectProps]] = js.undefined
    
    var itemBackground: js.UndefOr[String] = js.undefined
    
    var itemDirection: js.UndefOr[LegendItemDirection] = js.undefined
    
    var itemHeight: Double
    
    var itemOpacity: js.UndefOr[Double] = js.undefined
    
    var itemTextColor: js.UndefOr[String] = js.undefined
    
    var itemWidth: Double
    
    var itemsSpacing: js.UndefOr[Double] = js.undefined
    
    var justify: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onMouseEnter: js.UndefOr[
        js.Function2[/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onMouseLeave: js.UndefOr[
        js.Function2[/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var padding: js.UndefOr[Double | PartialRecordtoprightbott] = js.undefined
    
    var symbolBorderColor: js.UndefOr[String] = js.undefined
    
    var symbolBorderWidth: js.UndefOr[Double] = js.undefined
    
    var symbolShape: js.UndefOr[SymbolShape | FC[SymbolProps]] = js.undefined
    
    var symbolSize: js.UndefOr[Double] = js.undefined
    
    var symbolSpacing: js.UndefOr[Double] = js.undefined
    
    var toggleSerie: js.UndefOr[Boolean] = js.undefined
    
    var translateX: js.UndefOr[Double] = js.undefined
    
    var translateY: js.UndefOr[Double] = js.undefined
  }
  object BoundLegendProps {
    
    inline def apply(
      anchor: LegendAnchor,
      data: js.Array[Datum],
      direction: LegendDirection,
      itemHeight: Double,
      itemWidth: Double
    ): BoundLegendProps = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundLegendProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoundLegendProps] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: LegendAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDirection(value: LegendDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEffects(value: js.Array[EffectProps]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      inline def setEffectsVarargs(value: EffectProps*): Self = StObject.set(x, "effects", js.Array(value*))
      
      inline def setItemBackground(value: String): Self = StObject.set(x, "itemBackground", value.asInstanceOf[js.Any])
      
      inline def setItemBackgroundUndefined: Self = StObject.set(x, "itemBackground", js.undefined)
      
      inline def setItemDirection(value: LegendItemDirection): Self = StObject.set(x, "itemDirection", value.asInstanceOf[js.Any])
      
      inline def setItemDirectionUndefined: Self = StObject.set(x, "itemDirection", js.undefined)
      
      inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemOpacity(value: Double): Self = StObject.set(x, "itemOpacity", value.asInstanceOf[js.Any])
      
      inline def setItemOpacityUndefined: Self = StObject.set(x, "itemOpacity", js.undefined)
      
      inline def setItemTextColor(value: String): Self = StObject.set(x, "itemTextColor", value.asInstanceOf[js.Any])
      
      inline def setItemTextColorUndefined: Self = StObject.set(x, "itemTextColor", js.undefined)
      
      inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemsSpacing(value: Double): Self = StObject.set(x, "itemsSpacing", value.asInstanceOf[js.Any])
      
      inline def setItemsSpacingUndefined: Self = StObject.set(x, "itemsSpacing", js.undefined)
      
      inline def setJustify(value: Boolean): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      inline def setOnClick(value: (/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: (/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setPadding(value: Double | PartialRecordtoprightbott): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSymbolBorderColor(value: String): Self = StObject.set(x, "symbolBorderColor", value.asInstanceOf[js.Any])
      
      inline def setSymbolBorderColorUndefined: Self = StObject.set(x, "symbolBorderColor", js.undefined)
      
      inline def setSymbolBorderWidth(value: Double): Self = StObject.set(x, "symbolBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setSymbolBorderWidthUndefined: Self = StObject.set(x, "symbolBorderWidth", js.undefined)
      
      inline def setSymbolShape(value: SymbolShape | FC[SymbolProps]): Self = StObject.set(x, "symbolShape", value.asInstanceOf[js.Any])
      
      inline def setSymbolShapeUndefined: Self = StObject.set(x, "symbolShape", js.undefined)
      
      inline def setSymbolSize(value: Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
      
      inline def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
      
      inline def setSymbolSpacing(value: Double): Self = StObject.set(x, "symbolSpacing", value.asInstanceOf[js.Any])
      
      inline def setSymbolSpacingUndefined: Self = StObject.set(x, "symbolSpacing", js.undefined)
      
      inline def setToggleSerie(value: Boolean): Self = StObject.set(x, "toggleSerie", value.asInstanceOf[js.Any])
      
      inline def setToggleSerieUndefined: Self = StObject.set(x, "toggleSerie", js.undefined)
      
      inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    }
  }
  
  type GridLabelComponent = FunctionComponent[GridLabelProps]
  
  trait GridLabelProps extends StObject {
    
    var anchor: start | middle | end
    
    var angle: Double
    
    var animated: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<{  transform :string}> */ Any
    
    var id: String
    
    var x: Double
    
    var y: Double
  }
  object GridLabelProps {
    
    inline def apply(
      anchor: start | middle | end,
      angle: Double,
      animated: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<{  transform :string}> */ Any,
      id: String,
      x: Double,
      y: Double
    ): GridLabelProps = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridLabelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridLabelProps] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: start | middle | end): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAnimated(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<{  transform :string}> */ Any
      ): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointData extends StObject {
    
    var color: String
    
    var formattedValue: String
    
    var index: String
    
    var key: String
    
    var value: Double
  }
  object PointData {
    
    inline def apply(color: String, formattedValue: String, index: String, key: String, value: Double): PointData = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointData] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointProps extends StObject {
    
    var data: PointData
    
    var key: String
    
    var label: js.UndefOr[String | Double] = js.undefined
    
    var style: Fill
  }
  object PointProps {
    
    inline def apply(data: PointData, key: String, style: Fill): PointProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointProps] (val x: Self) extends AnyVal {
      
      inline def setData(value: PointData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setStyle(value: Fill): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type RadarColorMapping = Record[String, String]
  
  trait RadarCommonProps[D /* <: Record[String, Any] */] extends StObject {
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var blendMode: CssMixBlendMode
    
    var borderColor: InheritedColorConfig[Color]
    
    var borderWidth: Double
    
    var colors: OrdinalColorScaleConfig[Index]
    
    var curve: ClosedCurveFactoryId
    
    var dotBorderColor: InheritedColorConfig[PointData]
    
    var dotBorderWidth: Double
    
    var dotColor: InheritedColorConfig[PointData]
    
    var dotLabel: PropertyAccessor[PointData, String | Double]
    
    var dotLabelFormat: ValueFormat[Double, Unit]
    
    var dotLabelYOffset: Double
    
    var dotSize: Double
    
    var dotSymbol: DotsItemSymbolComponent
    
    var enableDotLabel: Boolean
    
    var enableDots: Boolean
    
    var fillOpacity: Double
    
    var gridLabel: GridLabelComponent
    
    var gridLabelOffset: Double
    
    var gridLevels: Double
    
    var gridShape: circular | linear
    
    var isInteractive: Boolean
    
    var layers: js.Array[RadarLayerId | RadarCustomLayer[D]]
    
    var legends: js.Array[LegendProps]
    
    var margin: Box
    
    var maxValue: Double | auto
    
    var renderWrapper: Boolean
    
    var role: String
    
    var rotation: Double
    
    var sliceTooltip: RadarSliceTooltipComponent
    
    var theme: Theme
    
    var valueFormat: ValueFormat[Double, String]
  }
  object RadarCommonProps {
    
    inline def apply[D /* <: Record[String, Any] */](
      blendMode: CssMixBlendMode,
      borderColor: InheritedColorConfig[Color],
      borderWidth: Double,
      colors: OrdinalColorScaleConfig[Index],
      curve: ClosedCurveFactoryId,
      dotBorderColor: InheritedColorConfig[PointData],
      dotBorderWidth: Double,
      dotColor: InheritedColorConfig[PointData],
      dotLabel: PropertyAccessor[PointData, String | Double],
      dotLabelFormat: ValueFormat[Double, Unit],
      dotLabelYOffset: Double,
      dotSize: Double,
      dotSymbol: DotsItemSymbolComponent,
      enableDotLabel: Boolean,
      enableDots: Boolean,
      fillOpacity: Double,
      gridLabel: GridLabelComponent,
      gridLabelOffset: Double,
      gridLevels: Double,
      gridShape: circular | linear,
      isInteractive: Boolean,
      layers: js.Array[RadarLayerId | RadarCustomLayer[D]],
      legends: js.Array[LegendProps],
      margin: Box,
      maxValue: Double | auto,
      renderWrapper: Boolean,
      role: String,
      rotation: Double,
      sliceTooltip: RadarSliceTooltipComponent,
      theme: Theme,
      valueFormat: ValueFormat[Double, String]
    ): RadarCommonProps[D] = {
      val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], dotBorderColor = dotBorderColor.asInstanceOf[js.Any], dotBorderWidth = dotBorderWidth.asInstanceOf[js.Any], dotColor = dotColor.asInstanceOf[js.Any], dotLabel = dotLabel.asInstanceOf[js.Any], dotLabelFormat = dotLabelFormat.asInstanceOf[js.Any], dotLabelYOffset = dotLabelYOffset.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], dotSymbol = dotSymbol.asInstanceOf[js.Any], enableDotLabel = enableDotLabel.asInstanceOf[js.Any], enableDots = enableDots.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], gridLabel = gridLabel.asInstanceOf[js.Any], gridLabelOffset = gridLabelOffset.asInstanceOf[js.Any], gridLevels = gridLevels.asInstanceOf[js.Any], gridShape = gridShape.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], sliceTooltip = sliceTooltip.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], valueFormat = valueFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarCommonProps[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadarCommonProps[?], D /* <: Record[String, Any] */] (val x: Self & RadarCommonProps[D]) extends AnyVal {
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[Color]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setColors(value: OrdinalColorScaleConfig[Index]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Index => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCurve(value: ClosedCurveFactoryId): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setDotBorderColor(value: InheritedColorConfig[PointData]): Self = StObject.set(x, "dotBorderColor", value.asInstanceOf[js.Any])
      
      inline def setDotBorderWidth(value: Double): Self = StObject.set(x, "dotBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setDotColor(value: InheritedColorConfig[PointData]): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
      
      inline def setDotLabel(value: PropertyAccessor[PointData, String | Double]): Self = StObject.set(x, "dotLabel", value.asInstanceOf[js.Any])
      
      inline def setDotLabelFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "dotLabelFormat", value.asInstanceOf[js.Any])
      
      inline def setDotLabelFunction1(value: PointData => String | Double): Self = StObject.set(x, "dotLabel", js.Any.fromFunction1(value))
      
      inline def setDotLabelYOffset(value: Double): Self = StObject.set(x, "dotLabelYOffset", value.asInstanceOf[js.Any])
      
      inline def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      inline def setDotSymbol(value: DotsItemSymbolComponent): Self = StObject.set(x, "dotSymbol", value.asInstanceOf[js.Any])
      
      inline def setEnableDotLabel(value: Boolean): Self = StObject.set(x, "enableDotLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableDots(value: Boolean): Self = StObject.set(x, "enableDots", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setGridLabel(value: GridLabelComponent): Self = StObject.set(x, "gridLabel", value.asInstanceOf[js.Any])
      
      inline def setGridLabelOffset(value: Double): Self = StObject.set(x, "gridLabelOffset", value.asInstanceOf[js.Any])
      
      inline def setGridLevels(value: Double): Self = StObject.set(x, "gridLevels", value.asInstanceOf[js.Any])
      
      inline def setGridShape(value: circular | linear): Self = StObject.set(x, "gridShape", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[RadarLayerId | RadarCustomLayer[D]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: (RadarLayerId | RadarCustomLayer[D])*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMaxValue(value: Double | auto): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setSliceTooltip(value: RadarSliceTooltipComponent): Self = StObject.set(x, "sliceTooltip", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, String]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    }
  }
  
  type RadarCustomLayer[D /* <: Record[String, Any] */] = FunctionComponent[RadarCustomLayerProps[D]]
  
  trait RadarCustomLayerProps[D /* <: Record[String, Any] */] extends StObject {
    
    var angleStep: Double
    
    var centerX: Double
    
    var centerY: Double
    
    var colorByKey: RadarColorMapping
    
    var data: js.Array[D]
    
    var indices: js.Array[Double | String]
    
    var keys: js.Array[String]
    
    var radiusScale: ScaleLinear_[Double, Double, scala.Nothing]
  }
  object RadarCustomLayerProps {
    
    inline def apply[D /* <: Record[String, Any] */](
      angleStep: Double,
      centerX: Double,
      centerY: Double,
      colorByKey: RadarColorMapping,
      data: js.Array[D],
      indices: js.Array[Double | String],
      keys: js.Array[String],
      radiusScale: ScaleLinear_[Double, Double, scala.Nothing]
    ): RadarCustomLayerProps[D] = {
      val __obj = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarCustomLayerProps[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadarCustomLayerProps[?], D /* <: Record[String, Any] */] (val x: Self & RadarCustomLayerProps[D]) extends AnyVal {
      
      inline def setAngleStep(value: Double): Self = StObject.set(x, "angleStep", value.asInstanceOf[js.Any])
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setColorByKey(value: RadarColorMapping): Self = StObject.set(x, "colorByKey", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIndices(value: js.Array[Double | String]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesVarargs(value: (Double | String)*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setRadiusScale(value: ScaleLinear_[Double, Double, scala.Nothing]): Self = StObject.set(x, "radiusScale", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadarDataProps[D /* <: Record[String, Any] */] extends StObject {
    
    var data: js.Array[D]
    
    var indexBy: PropertyAccessor[D, String]
    
    var keys: js.Array[String]
  }
  object RadarDataProps {
    
    inline def apply[D /* <: Record[String, Any] */](data: js.Array[D], indexBy: PropertyAccessor[D, String], keys: js.Array[String]): RadarDataProps[D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarDataProps[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadarDataProps[?], D /* <: Record[String, Any] */] (val x: Self & RadarDataProps[D]) extends AnyVal {
      
      inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIndexBy(value: PropertyAccessor[D, String]): Self = StObject.set(x, "indexBy", value.asInstanceOf[js.Any])
      
      inline def setIndexByFunction1(value: D => String): Self = StObject.set(x, "indexBy", js.Any.fromFunction1(value))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoRadar.nivoRadarStrings.grid
    - typings.nivoRadar.nivoRadarStrings.layers
    - typings.nivoRadar.nivoRadarStrings.slices
    - typings.nivoRadar.nivoRadarStrings.dots
    - typings.nivoRadar.nivoRadarStrings.legends
  */
  trait RadarLayerId extends StObject
  object RadarLayerId {
    
    inline def dots: typings.nivoRadar.nivoRadarStrings.dots = "dots".asInstanceOf[typings.nivoRadar.nivoRadarStrings.dots]
    
    inline def grid: typings.nivoRadar.nivoRadarStrings.grid = "grid".asInstanceOf[typings.nivoRadar.nivoRadarStrings.grid]
    
    inline def layers: typings.nivoRadar.nivoRadarStrings.layers = "layers".asInstanceOf[typings.nivoRadar.nivoRadarStrings.layers]
    
    inline def legends: typings.nivoRadar.nivoRadarStrings.legends = "legends".asInstanceOf[typings.nivoRadar.nivoRadarStrings.legends]
    
    inline def slices: typings.nivoRadar.nivoRadarStrings.slices = "slices".asInstanceOf[typings.nivoRadar.nivoRadarStrings.slices]
  }
  
  type RadarSliceTooltipComponent = FunctionComponent[RadarSliceTooltipProps]
  
  trait RadarSliceTooltipDatum extends StObject {
    
    var color: String
    
    var formattedValue: String
    
    var id: String
    
    var value: Double
  }
  object RadarSliceTooltipDatum {
    
    inline def apply(color: String, formattedValue: String, id: String, value: Double): RadarSliceTooltipDatum = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarSliceTooltipDatum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadarSliceTooltipDatum] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadarSliceTooltipProps extends StObject {
    
    var data: js.Array[RadarSliceTooltipDatum]
    
    var index: String | Double
  }
  object RadarSliceTooltipProps {
    
    inline def apply(data: js.Array[RadarSliceTooltipDatum], index: String | Double): RadarSliceTooltipProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarSliceTooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadarSliceTooltipProps] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[RadarSliceTooltipDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RadarSliceTooltipDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIndex(value: String | Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadarSvgFillMatcherDatum[D /* <: Record[String, Any] */] extends StObject {
    
    var color: String
    
    var data: js.Array[D]
    
    var key: String
  }
  object RadarSvgFillMatcherDatum {
    
    inline def apply[D /* <: Record[String, Any] */](color: String, data: js.Array[D], key: String): RadarSvgFillMatcherDatum[D] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarSvgFillMatcherDatum[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadarSvgFillMatcherDatum[?], D /* <: Record[String, Any] */] (val x: Self & RadarSvgFillMatcherDatum[D]) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@nivo/radar.@nivo/radar/dist/types/types.RadarCommonProps<D>> & @nivo/radar.@nivo/radar/dist/types/types.RadarDataProps<D> & @nivo/core.@nivo/core.Dimensions & @nivo/core.@nivo/core.ModernMotionProps & @nivo/core.@nivo/core.SvgDefsAndFill<@nivo/radar.@nivo/radar/dist/types/types.RadarSvgFillMatcherDatum<D>> */
  trait RadarSvgProps[D /* <: Record[String, Any] */] extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var blendMode: js.UndefOr[CssMixBlendMode] = js.undefined
    
    var borderColor: js.UndefOr[InheritedColorConfig[Color]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[Index]] = js.undefined
    
    var curve: js.UndefOr[ClosedCurveFactoryId] = js.undefined
    
    var data: js.Array[D]
    
    var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
    
    var dotBorderColor: js.UndefOr[InheritedColorConfig[PointData]] = js.undefined
    
    var dotBorderWidth: js.UndefOr[Double] = js.undefined
    
    var dotColor: js.UndefOr[InheritedColorConfig[PointData]] = js.undefined
    
    var dotLabel: js.UndefOr[PropertyAccessor[PointData, String | Double]] = js.undefined
    
    var dotLabelFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var dotLabelYOffset: js.UndefOr[Double] = js.undefined
    
    var dotSize: js.UndefOr[Double] = js.undefined
    
    var dotSymbol: js.UndefOr[DotsItemSymbolComponent] = js.undefined
    
    var enableDotLabel: js.UndefOr[Boolean] = js.undefined
    
    var enableDots: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[js.Array[Id[RadarSvgFillMatcherDatum[D]]]] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var gridLabel: js.UndefOr[GridLabelComponent] = js.undefined
    
    var gridLabelOffset: js.UndefOr[Double] = js.undefined
    
    var gridLevels: js.UndefOr[Double] = js.undefined
    
    var gridShape: js.UndefOr[circular | linear] = js.undefined
    
    var height: Double
    
    var indexBy: PropertyAccessor[D, String]
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.Array[String]
    
    var layers: js.UndefOr[js.Array[RadarLayerId | RadarCustomLayer[D]]] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var maxValue: js.UndefOr[Double | auto] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var sliceTooltip: js.UndefOr[RadarSliceTooltipComponent] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, String]] = js.undefined
    
    var width: Double
  }
  object RadarSvgProps {
    
    inline def apply[D /* <: Record[String, Any] */](
      data: js.Array[D],
      height: Double,
      indexBy: PropertyAccessor[D, String],
      keys: js.Array[String],
      width: Double
    ): RadarSvgProps[D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarSvgProps[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadarSvgProps[?], D /* <: Record[String, Any] */] (val x: Self & RadarSvgProps[D]) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
      
      inline def setBorderColor(value: InheritedColorConfig[Color]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[Index]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Index => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCurve(value: ClosedCurveFactoryId): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
      
      inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
      
      inline def setDotBorderColor(value: InheritedColorConfig[PointData]): Self = StObject.set(x, "dotBorderColor", value.asInstanceOf[js.Any])
      
      inline def setDotBorderColorUndefined: Self = StObject.set(x, "dotBorderColor", js.undefined)
      
      inline def setDotBorderWidth(value: Double): Self = StObject.set(x, "dotBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setDotBorderWidthUndefined: Self = StObject.set(x, "dotBorderWidth", js.undefined)
      
      inline def setDotColor(value: InheritedColorConfig[PointData]): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
      
      inline def setDotColorUndefined: Self = StObject.set(x, "dotColor", js.undefined)
      
      inline def setDotLabel(value: PropertyAccessor[PointData, String | Double]): Self = StObject.set(x, "dotLabel", value.asInstanceOf[js.Any])
      
      inline def setDotLabelFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "dotLabelFormat", value.asInstanceOf[js.Any])
      
      inline def setDotLabelFormatUndefined: Self = StObject.set(x, "dotLabelFormat", js.undefined)
      
      inline def setDotLabelFunction1(value: PointData => String | Double): Self = StObject.set(x, "dotLabel", js.Any.fromFunction1(value))
      
      inline def setDotLabelUndefined: Self = StObject.set(x, "dotLabel", js.undefined)
      
      inline def setDotLabelYOffset(value: Double): Self = StObject.set(x, "dotLabelYOffset", value.asInstanceOf[js.Any])
      
      inline def setDotLabelYOffsetUndefined: Self = StObject.set(x, "dotLabelYOffset", js.undefined)
      
      inline def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      inline def setDotSizeUndefined: Self = StObject.set(x, "dotSize", js.undefined)
      
      inline def setDotSymbol(value: DotsItemSymbolComponent): Self = StObject.set(x, "dotSymbol", value.asInstanceOf[js.Any])
      
      inline def setDotSymbolUndefined: Self = StObject.set(x, "dotSymbol", js.undefined)
      
      inline def setEnableDotLabel(value: Boolean): Self = StObject.set(x, "enableDotLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableDotLabelUndefined: Self = StObject.set(x, "enableDotLabel", js.undefined)
      
      inline def setEnableDots(value: Boolean): Self = StObject.set(x, "enableDots", value.asInstanceOf[js.Any])
      
      inline def setEnableDotsUndefined: Self = StObject.set(x, "enableDots", js.undefined)
      
      inline def setFill(value: js.Array[Id[RadarSvgFillMatcherDatum[D]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: Id[RadarSvgFillMatcherDatum[D]]*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setGridLabel(value: GridLabelComponent): Self = StObject.set(x, "gridLabel", value.asInstanceOf[js.Any])
      
      inline def setGridLabelOffset(value: Double): Self = StObject.set(x, "gridLabelOffset", value.asInstanceOf[js.Any])
      
      inline def setGridLabelOffsetUndefined: Self = StObject.set(x, "gridLabelOffset", js.undefined)
      
      inline def setGridLabelUndefined: Self = StObject.set(x, "gridLabel", js.undefined)
      
      inline def setGridLevels(value: Double): Self = StObject.set(x, "gridLevels", value.asInstanceOf[js.Any])
      
      inline def setGridLevelsUndefined: Self = StObject.set(x, "gridLevels", js.undefined)
      
      inline def setGridShape(value: circular | linear): Self = StObject.set(x, "gridShape", value.asInstanceOf[js.Any])
      
      inline def setGridShapeUndefined: Self = StObject.set(x, "gridShape", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIndexBy(value: PropertyAccessor[D, String]): Self = StObject.set(x, "indexBy", value.asInstanceOf[js.Any])
      
      inline def setIndexByFunction1(value: D => String): Self = StObject.set(x, "indexBy", js.Any.fromFunction1(value))
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setLayers(value: js.Array[RadarLayerId | RadarCustomLayer[D]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (RadarLayerId | RadarCustomLayer[D])*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMaxValue(value: Double | auto): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setSliceTooltip(value: RadarSliceTooltipComponent): Self = StObject.set(x, "sliceTooltip", value.asInstanceOf[js.Any])
      
      inline def setSliceTooltipUndefined: Self = StObject.set(x, "sliceTooltip", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValueFormat(value: ValueFormat[Double, String]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

package typings.nivoBullet

import typings.nivoBullet.distTypesTypesMod.BulletMarkersItemProps
import typings.nivoBullet.distTypesTypesMod.BulletRectsItemProps
import typings.nivoBullet.distTypesTypesMod.BulletTooltipProps
import typings.nivoBullet.distTypesTypesMod.ComputedRangeDatum
import typings.nivoBullet.distTypesTypesMod.Datum
import typings.nivoBullet.distTypesTypesMod.DatumId
import typings.nivoBullet.distTypesTypesMod.MouseEventHandler
import typings.nivoBullet.nivoBulletStrings.after
import typings.nivoBullet.nivoBulletStrings.auto
import typings.nivoBullet.nivoBulletStrings.before
import typings.nivoBullet.nivoBulletStrings.color
import typings.nivoBullet.nivoBulletStrings.end
import typings.nivoBullet.nivoBulletStrings.horizontal
import typings.nivoBullet.nivoBulletStrings.middle
import typings.nivoBullet.nivoBulletStrings.start
import typings.nivoBullet.nivoBulletStrings.vertical
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Colors
import typings.nivoCore.mod.Theme
import typings.nivoScales.distTypesTypesMod.ScaleLinear
import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.SVGLineElement
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Color extends StObject {
    
    var color: String
    
    var index: Double
    
    var value: Double
  }
  object Color {
    
    inline def apply(color: String, index: Double, value: Double): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: ComputedRangeDatum
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Data {
    
    inline def apply(data: ComputedRangeDatum, height: Double, width: Double, x: Double, y: Double): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: ComputedRangeDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    val from: color
  }
  object From {
    
    inline def apply(): From = {
      val __obj = js.Dynamic.literal(from = "color")
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: color): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: DatumId
    
    var markers: js.UndefOr[js.Array[Double]] = js.undefined
    
    var measures: js.Array[Double]
    
    var ranges: js.Array[Double]
    
    var scale: ScaleLinear[Double]
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object Id {
    
    inline def apply(id: DatumId, measures: js.Array[Double], ranges: js.Array[Double], scale: ScaleLinear[Double]): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMarkers(value: js.Array[Double]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: Double*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setMeasures(value: js.Array[Double]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
      
      inline def setMeasuresVarargs(value: Double*): Self = StObject.set(x, "measures", js.Array(value*))
      
      inline def setRanges(value: js.Array[Double]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesVarargs(value: Double*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setScale(value: ScaleLinear[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IdDatumId extends StObject {
    
    var id: DatumId
  }
  object IdDatumId {
    
    inline def apply(id: DatumId): IdDatumId = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdDatumId]
    }
    
    extension [Self <: IdDatumId](x: Self) {
      
      inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@nivo/bullet.@nivo/bullet/dist/types/types.BulletSvgProps, 'height' | 'width'> */
  trait OmitBulletSvgPropsheightw extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var axisPosition: js.UndefOr[before | after] = js.undefined
    
    var data: js.Array[Datum]
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var layout: js.UndefOr[horizontal | vertical] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var markerColors: js.UndefOr[Colors] = js.undefined
    
    var markerComponent: js.UndefOr[ComponentType[BulletMarkersItemProps]] = js.undefined
    
    var markerSize: js.UndefOr[Double] = js.undefined
    
    var maxValue: js.UndefOr[auto | Double] = js.undefined
    
    var measureBorderColor: js.UndefOr[InheritedColorConfig[ComputedRangeDatum]] = js.undefined
    
    var measureBorderWidth: js.UndefOr[Double] = js.undefined
    
    var measureColors: js.UndefOr[Colors] = js.undefined
    
    var measureComponent: js.UndefOr[ComponentType[BulletRectsItemProps]] = js.undefined
    
    var measureSize: js.UndefOr[Double] = js.undefined
    
    var minValue: js.UndefOr[auto | Double] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var onMarkerClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedMarker, SVGLineElement]] = js.undefined
    
    var onMeasureClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
    
    var onRangeClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
    
    var rangeBorderColor: js.UndefOr[InheritedColorConfig[ComputedRangeDatum]] = js.undefined
    
    var rangeBorderWidth: js.UndefOr[Double] = js.undefined
    
    var rangeColors: js.UndefOr[Colors] = js.undefined
    
    var rangeComponent: js.UndefOr[ComponentType[BulletRectsItemProps]] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var spacing: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var titleAlign: js.UndefOr[start | middle | end] = js.undefined
    
    var titleOffsetX: js.UndefOr[Double] = js.undefined
    
    var titleOffsetY: js.UndefOr[Double] = js.undefined
    
    var titlePosition: js.UndefOr[before | after] = js.undefined
    
    var titleRotation: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[ComponentType[BulletTooltipProps]] = js.undefined
  }
  object OmitBulletSvgPropsheightw {
    
    inline def apply(data: js.Array[Datum]): OmitBulletSvgPropsheightw = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitBulletSvgPropsheightw]
    }
    
    extension [Self <: OmitBulletSvgPropsheightw](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAxisPosition(value: before | after): Self = StObject.set(x, "axisPosition", value.asInstanceOf[js.Any])
      
      inline def setAxisPositionUndefined: Self = StObject.set(x, "axisPosition", js.undefined)
      
      inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkerColors(value: Colors): Self = StObject.set(x, "markerColors", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorsUndefined: Self = StObject.set(x, "markerColors", js.undefined)
      
      inline def setMarkerColorsVarargs(value: String*): Self = StObject.set(x, "markerColors", js.Array(value*))
      
      inline def setMarkerComponent(value: ComponentType[BulletMarkersItemProps]): Self = StObject.set(x, "markerComponent", value.asInstanceOf[js.Any])
      
      inline def setMarkerComponentUndefined: Self = StObject.set(x, "markerComponent", js.undefined)
      
      inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
      
      inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
      
      inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMeasureBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): Self = StObject.set(x, "measureBorderColor", value.asInstanceOf[js.Any])
      
      inline def setMeasureBorderColorUndefined: Self = StObject.set(x, "measureBorderColor", js.undefined)
      
      inline def setMeasureBorderWidth(value: Double): Self = StObject.set(x, "measureBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setMeasureBorderWidthUndefined: Self = StObject.set(x, "measureBorderWidth", js.undefined)
      
      inline def setMeasureColors(value: Colors): Self = StObject.set(x, "measureColors", value.asInstanceOf[js.Any])
      
      inline def setMeasureColorsUndefined: Self = StObject.set(x, "measureColors", js.undefined)
      
      inline def setMeasureColorsVarargs(value: String*): Self = StObject.set(x, "measureColors", js.Array(value*))
      
      inline def setMeasureComponent(value: ComponentType[BulletRectsItemProps]): Self = StObject.set(x, "measureComponent", value.asInstanceOf[js.Any])
      
      inline def setMeasureComponentUndefined: Self = StObject.set(x, "measureComponent", js.undefined)
      
      inline def setMeasureSize(value: Double): Self = StObject.set(x, "measureSize", value.asInstanceOf[js.Any])
      
      inline def setMeasureSizeUndefined: Self = StObject.set(x, "measureSize", js.undefined)
      
      inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setOnMarkerClick(
        value: (WithDatumIdComputedMarker, /* event */ MouseEvent[SVGLineElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMarkerClick", js.Any.fromFunction2(value))
      
      inline def setOnMarkerClickUndefined: Self = StObject.set(x, "onMarkerClick", js.undefined)
      
      inline def setOnMeasureClick(
        value: (WithDatumIdComputedRangeD, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMeasureClick", js.Any.fromFunction2(value))
      
      inline def setOnMeasureClickUndefined: Self = StObject.set(x, "onMeasureClick", js.undefined)
      
      inline def setOnRangeClick(
        value: (WithDatumIdComputedRangeD, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onRangeClick", js.Any.fromFunction2(value))
      
      inline def setOnRangeClickUndefined: Self = StObject.set(x, "onRangeClick", js.undefined)
      
      inline def setRangeBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): Self = StObject.set(x, "rangeBorderColor", value.asInstanceOf[js.Any])
      
      inline def setRangeBorderColorUndefined: Self = StObject.set(x, "rangeBorderColor", js.undefined)
      
      inline def setRangeBorderWidth(value: Double): Self = StObject.set(x, "rangeBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setRangeBorderWidthUndefined: Self = StObject.set(x, "rangeBorderWidth", js.undefined)
      
      inline def setRangeColors(value: Colors): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
      
      inline def setRangeColorsUndefined: Self = StObject.set(x, "rangeColors", js.undefined)
      
      inline def setRangeColorsVarargs(value: String*): Self = StObject.set(x, "rangeColors", js.Array(value*))
      
      inline def setRangeComponent(value: ComponentType[BulletRectsItemProps]): Self = StObject.set(x, "rangeComponent", value.asInstanceOf[js.Any])
      
      inline def setRangeComponentUndefined: Self = StObject.set(x, "rangeComponent", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitleAlign(value: start | middle | end): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      inline def setTitleOffsetX(value: Double): Self = StObject.set(x, "titleOffsetX", value.asInstanceOf[js.Any])
      
      inline def setTitleOffsetXUndefined: Self = StObject.set(x, "titleOffsetX", js.undefined)
      
      inline def setTitleOffsetY(value: Double): Self = StObject.set(x, "titleOffsetY", value.asInstanceOf[js.Any])
      
      inline def setTitleOffsetYUndefined: Self = StObject.set(x, "titleOffsetY", js.undefined)
      
      inline def setTitlePosition(value: before | after): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
      
      inline def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
      
      inline def setTitleRotation(value: Double): Self = StObject.set(x, "titleRotation", value.asInstanceOf[js.Any])
      
      inline def setTitleRotationUndefined: Self = StObject.set(x, "titleRotation", js.undefined)
      
      inline def setTooltip(value: ComponentType[BulletTooltipProps]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@nivo/bullet.@nivo/bullet/dist/types/types.BulletRectsProps, 'data'> & @nivo/bullet.@nivo/bullet/dist/types/compute.ComputeRect */
  trait PickBulletRectsPropsdataC extends StObject {
    
    var data: js.Array[ComputedRangeDatum]
    
    var height: Double
    
    var layout: horizontal | vertical
    
    var reverse: Boolean
    
    var scale: ScaleLinear[Double]
  }
  object PickBulletRectsPropsdataC {
    
    inline def apply(
      data: js.Array[ComputedRangeDatum],
      height: Double,
      layout: horizontal | vertical,
      reverse: Boolean,
      scale: ScaleLinear[Double]
    ): PickBulletRectsPropsdataC = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickBulletRectsPropsdataC]
    }
    
    extension [Self <: PickBulletRectsPropsdataC](x: Self) {
      
      inline def setData(value: js.Array[ComputedRangeDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ComputedRangeDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setScale(value: ScaleLinear[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@nivo/bullet.@nivo/bullet/dist/types/types.CommonBulletProps, 'layout' | 'reverse' | 'height' | 'width'> & std.Record<'maxValue' | 'minValue', number | undefined> */
  trait PickCommonBulletPropslayo extends StObject {
    
    var height: Double
    
    var layout: horizontal | vertical
    
    var maxValue: js.UndefOr[Double] = js.undefined
    
    var minValue: js.UndefOr[Double] = js.undefined
    
    var reverse: Boolean
    
    var width: Double
  }
  object PickCommonBulletPropslayo {
    
    inline def apply(height: Double, layout: horizontal | vertical, reverse: Boolean, width: Double): PickCommonBulletPropslayo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickCommonBulletPropslayo]
    }
    
    extension [Self <: PickCommonBulletPropslayo](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @nivo/bullet.@nivo/bullet/dist/types/types.WithDatumId<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedMarkersDatum> */
  trait WithDatumIdComputedMarker extends StObject {
    
    var color: String
    
    var id: DatumId
    
    var index: Double
    
    var value: Double
  }
  object WithDatumIdComputedMarker {
    
    inline def apply(color: String, id: DatumId, index: Double, value: Double): WithDatumIdComputedMarker = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithDatumIdComputedMarker]
    }
    
    extension [Self <: WithDatumIdComputedMarker](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @nivo/bullet.@nivo/bullet/dist/types/types.WithDatumId<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedRangeDatum> */
  trait WithDatumIdComputedRangeD extends StObject {
    
    var color: String
    
    var id: DatumId
    
    var index: Double
    
    var v0: Double
    
    var v1: Double
  }
  object WithDatumIdComputedRangeD {
    
    inline def apply(color: String, id: DatumId, index: Double, v0: Double, v1: Double): WithDatumIdComputedRangeD = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], v0 = v0.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithDatumIdComputedRangeD]
    }
    
    extension [Self <: WithDatumIdComputedRangeD](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setV0(value: Double): Self = StObject.set(x, "v0", value.asInstanceOf[js.Any])
      
      inline def setV1(value: Double): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
    }
  }
}

package typings.nivoBullet.typesMod

import typings.nivoBullet.anon.WithDatumIdComputedMarker
import typings.nivoBullet.anon.WithDatumIdComputedRangeD
import typings.nivoBullet.nivoBulletStrings.after
import typings.nivoBullet.nivoBulletStrings.before
import typings.nivoBullet.nivoBulletStrings.end
import typings.nivoBullet.nivoBulletStrings.horizontal
import typings.nivoBullet.nivoBulletStrings.middle
import typings.nivoBullet.nivoBulletStrings.start
import typings.nivoBullet.nivoBulletStrings.vertical
import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.Colors
import typings.nivoScales.typesMod.ScaleLinear
import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.SVGLineElement
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/bullet.@nivo/bullet/dist/types/types.CommonBulletProps, 'outerWidth' | 'outerHeight' | 'margin' | 'spacing' | 'role' | 'minValue' | 'maxValue' | 'measureSize' | 'markerSize' | 'theme' | 'isInteractive'> & @nivo/bullet.@nivo/bullet/dist/types/types.BulletHandlers & @nivo/bullet.@nivo/bullet/dist/types/types.EnhancedDatum & @nivo/core.@nivo/core.ModernMotionProps & @nivo/bullet.@nivo/bullet/dist/types/types.Point & {  measureHeight :number,   markerHeight :number} */
trait BulletItemProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var axisPosition: before | after
  
  var height: Double
  
  var id: DatumId
  
  var layout: horizontal | vertical
  
  var markerColors: Colors
  
  var markerComponent: ComponentType[BulletMarkersItemProps]
  
  var markerHeight: Double
  
  var markers: js.UndefOr[js.Array[Double]] = js.undefined
  
  var measureBorderColor: InheritedColorConfig[ComputedRangeDatum]
  
  var measureBorderWidth: Double
  
  var measureColors: Colors
  
  var measureComponent: ComponentType[BulletRectsItemProps]
  
  var measureHeight: Double
  
  var measures: js.Array[Double]
  
  var motionConfig: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
  ] = js.undefined
  
  var onMarkerClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedMarker, SVGLineElement]] = js.undefined
  
  var onMeasureClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
  
  var onRangeClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
  
  var rangeBorderColor: InheritedColorConfig[ComputedRangeDatum]
  
  var rangeBorderWidth: Double
  
  var rangeColors: Colors
  
  var rangeComponent: ComponentType[BulletRectsItemProps]
  
  var ranges: js.Array[Double]
  
  var reverse: Boolean
  
  var scale: ScaleLinear[Double]
  
  var title: js.UndefOr[ReactNode] = js.undefined
  
  var titleAlign: start | middle | end
  
  var titleOffsetX: Double
  
  var titleOffsetY: Double
  
  var titlePosition: before | after
  
  var titleRotation: Double
  
  var tooltip: ComponentType[BulletTooltipProps]
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object BulletItemProps {
  
  inline def apply(
    axisPosition: before | after,
    height: Double,
    id: DatumId,
    layout: horizontal | vertical,
    markerColors: Colors,
    markerComponent: ComponentType[BulletMarkersItemProps],
    markerHeight: Double,
    measureBorderColor: InheritedColorConfig[ComputedRangeDatum],
    measureBorderWidth: Double,
    measureColors: Colors,
    measureComponent: ComponentType[BulletRectsItemProps],
    measureHeight: Double,
    measures: js.Array[Double],
    rangeBorderColor: InheritedColorConfig[ComputedRangeDatum],
    rangeBorderWidth: Double,
    rangeColors: Colors,
    rangeComponent: ComponentType[BulletRectsItemProps],
    ranges: js.Array[Double],
    reverse: Boolean,
    scale: ScaleLinear[Double],
    titleAlign: start | middle | end,
    titleOffsetX: Double,
    titleOffsetY: Double,
    titlePosition: before | after,
    titleRotation: Double,
    tooltip: ComponentType[BulletTooltipProps],
    width: Double,
    x: Double,
    y: Double
  ): BulletItemProps = {
    val __obj = js.Dynamic.literal(axisPosition = axisPosition.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], markerColors = markerColors.asInstanceOf[js.Any], markerComponent = markerComponent.asInstanceOf[js.Any], markerHeight = markerHeight.asInstanceOf[js.Any], measureBorderColor = measureBorderColor.asInstanceOf[js.Any], measureBorderWidth = measureBorderWidth.asInstanceOf[js.Any], measureColors = measureColors.asInstanceOf[js.Any], measureComponent = measureComponent.asInstanceOf[js.Any], measureHeight = measureHeight.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any], rangeBorderColor = rangeBorderColor.asInstanceOf[js.Any], rangeBorderWidth = rangeBorderWidth.asInstanceOf[js.Any], rangeColors = rangeColors.asInstanceOf[js.Any], rangeComponent = rangeComponent.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], titleAlign = titleAlign.asInstanceOf[js.Any], titleOffsetX = titleOffsetX.asInstanceOf[js.Any], titleOffsetY = titleOffsetY.asInstanceOf[js.Any], titlePosition = titlePosition.asInstanceOf[js.Any], titleRotation = titleRotation.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletItemProps]
  }
  
  extension [Self <: BulletItemProps](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAxisPosition(value: before | after): Self = StObject.set(x, "axisPosition", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setMarkerColors(value: Colors): Self = StObject.set(x, "markerColors", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorsVarargs(value: String*): Self = StObject.set(x, "markerColors", js.Array(value*))
    
    inline def setMarkerComponent(value: ComponentType[BulletMarkersItemProps]): Self = StObject.set(x, "markerComponent", value.asInstanceOf[js.Any])
    
    inline def setMarkerHeight(value: Double): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    inline def setMarkers(value: js.Array[Double]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMarkersVarargs(value: Double*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setMeasureBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): Self = StObject.set(x, "measureBorderColor", value.asInstanceOf[js.Any])
    
    inline def setMeasureBorderWidth(value: Double): Self = StObject.set(x, "measureBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setMeasureColors(value: Colors): Self = StObject.set(x, "measureColors", value.asInstanceOf[js.Any])
    
    inline def setMeasureColorsVarargs(value: String*): Self = StObject.set(x, "measureColors", js.Array(value*))
    
    inline def setMeasureComponent(value: ComponentType[BulletRectsItemProps]): Self = StObject.set(x, "measureComponent", value.asInstanceOf[js.Any])
    
    inline def setMeasureHeight(value: Double): Self = StObject.set(x, "measureHeight", value.asInstanceOf[js.Any])
    
    inline def setMeasures(value: js.Array[Double]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresVarargs(value: Double*): Self = StObject.set(x, "measures", js.Array(value*))
    
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
    
    inline def setRangeBorderWidth(value: Double): Self = StObject.set(x, "rangeBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setRangeColors(value: Colors): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
    
    inline def setRangeColorsVarargs(value: String*): Self = StObject.set(x, "rangeColors", js.Array(value*))
    
    inline def setRangeComponent(value: ComponentType[BulletRectsItemProps]): Self = StObject.set(x, "rangeComponent", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: js.Array[Double]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: Double*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setScale(value: ScaleLinear[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAlign(value: start | middle | end): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleOffsetX(value: Double): Self = StObject.set(x, "titleOffsetX", value.asInstanceOf[js.Any])
    
    inline def setTitleOffsetY(value: Double): Self = StObject.set(x, "titleOffsetY", value.asInstanceOf[js.Any])
    
    inline def setTitlePosition(value: before | after): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
    
    inline def setTitleRotation(value: Double): Self = StObject.set(x, "titleRotation", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: ComponentType[BulletTooltipProps]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

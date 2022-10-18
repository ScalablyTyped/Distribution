package typings.nivoBullet.distTypesTypesMod

import typings.nivoBullet.nivoBulletStrings.after
import typings.nivoBullet.nivoBulletStrings.auto
import typings.nivoBullet.nivoBulletStrings.before
import typings.nivoBullet.nivoBulletStrings.end
import typings.nivoBullet.nivoBulletStrings.horizontal
import typings.nivoBullet.nivoBulletStrings.middle
import typings.nivoBullet.nivoBulletStrings.start
import typings.nivoBullet.nivoBulletStrings.vertical
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Colors
import typings.nivoCore.mod.Dimensions
import typings.nivoCore.mod.Theme
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonBulletProps
  extends StObject
     with Dimensions {
  
  var axisPosition: before | after
  
  var isInteractive: Boolean
  
  var layout: horizontal | vertical
  
  var margin: Box
  
  var markerColors: Colors
  
  var markerComponent: ComponentType[BulletMarkersItemProps]
  
  var markerSize: Double
  
  var maxValue: auto | Double
  
  var measureBorderColor: InheritedColorConfig[ComputedRangeDatum]
  
  var measureBorderWidth: Double
  
  var measureColors: Colors
  
  var measureComponent: ComponentType[BulletRectsItemProps]
  
  var measureSize: Double
  
  var minValue: auto | Double
  
  var rangeBorderColor: InheritedColorConfig[ComputedRangeDatum]
  
  var rangeBorderWidth: Double
  
  var rangeColors: Colors
  
  var rangeComponent: ComponentType[BulletRectsItemProps]
  
  var reverse: Boolean
  
  var role: String
  
  var spacing: Double
  
  var theme: Theme
  
  var titleAlign: start | middle | end
  
  var titleOffsetX: Double
  
  var titleOffsetY: Double
  
  var titlePosition: before | after
  
  var titleRotation: Double
  
  var tooltip: ComponentType[BulletTooltipProps]
}
object CommonBulletProps {
  
  inline def apply(
    axisPosition: before | after,
    height: Double,
    isInteractive: Boolean,
    layout: horizontal | vertical,
    margin: Box,
    markerColors: Colors,
    markerComponent: ComponentType[BulletMarkersItemProps],
    markerSize: Double,
    maxValue: auto | Double,
    measureBorderColor: InheritedColorConfig[ComputedRangeDatum],
    measureBorderWidth: Double,
    measureColors: Colors,
    measureComponent: ComponentType[BulletRectsItemProps],
    measureSize: Double,
    minValue: auto | Double,
    rangeBorderColor: InheritedColorConfig[ComputedRangeDatum],
    rangeBorderWidth: Double,
    rangeColors: Colors,
    rangeComponent: ComponentType[BulletRectsItemProps],
    reverse: Boolean,
    role: String,
    spacing: Double,
    theme: Theme,
    titleAlign: start | middle | end,
    titleOffsetX: Double,
    titleOffsetY: Double,
    titlePosition: before | after,
    titleRotation: Double,
    tooltip: ComponentType[BulletTooltipProps],
    width: Double
  ): CommonBulletProps = {
    val __obj = js.Dynamic.literal(axisPosition = axisPosition.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], markerColors = markerColors.asInstanceOf[js.Any], markerComponent = markerComponent.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], measureBorderColor = measureBorderColor.asInstanceOf[js.Any], measureBorderWidth = measureBorderWidth.asInstanceOf[js.Any], measureColors = measureColors.asInstanceOf[js.Any], measureComponent = measureComponent.asInstanceOf[js.Any], measureSize = measureSize.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], rangeBorderColor = rangeBorderColor.asInstanceOf[js.Any], rangeBorderWidth = rangeBorderWidth.asInstanceOf[js.Any], rangeColors = rangeColors.asInstanceOf[js.Any], rangeComponent = rangeComponent.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], titleAlign = titleAlign.asInstanceOf[js.Any], titleOffsetX = titleOffsetX.asInstanceOf[js.Any], titleOffsetY = titleOffsetY.asInstanceOf[js.Any], titlePosition = titlePosition.asInstanceOf[js.Any], titleRotation = titleRotation.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonBulletProps]
  }
  
  extension [Self <: CommonBulletProps](x: Self) {
    
    inline def setAxisPosition(value: before | after): Self = StObject.set(x, "axisPosition", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarkerColors(value: Colors): Self = StObject.set(x, "markerColors", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorsVarargs(value: String*): Self = StObject.set(x, "markerColors", js.Array(value*))
    
    inline def setMarkerComponent(value: ComponentType[BulletMarkersItemProps]): Self = StObject.set(x, "markerComponent", value.asInstanceOf[js.Any])
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMeasureBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): Self = StObject.set(x, "measureBorderColor", value.asInstanceOf[js.Any])
    
    inline def setMeasureBorderWidth(value: Double): Self = StObject.set(x, "measureBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setMeasureColors(value: Colors): Self = StObject.set(x, "measureColors", value.asInstanceOf[js.Any])
    
    inline def setMeasureColorsVarargs(value: String*): Self = StObject.set(x, "measureColors", js.Array(value*))
    
    inline def setMeasureComponent(value: ComponentType[BulletRectsItemProps]): Self = StObject.set(x, "measureComponent", value.asInstanceOf[js.Any])
    
    inline def setMeasureSize(value: Double): Self = StObject.set(x, "measureSize", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setRangeBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): Self = StObject.set(x, "rangeBorderColor", value.asInstanceOf[js.Any])
    
    inline def setRangeBorderWidth(value: Double): Self = StObject.set(x, "rangeBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setRangeColors(value: Colors): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
    
    inline def setRangeColorsVarargs(value: String*): Self = StObject.set(x, "rangeColors", js.Array(value*))
    
    inline def setRangeComponent(value: ComponentType[BulletRectsItemProps]): Self = StObject.set(x, "rangeComponent", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTitleAlign(value: start | middle | end): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleOffsetX(value: Double): Self = StObject.set(x, "titleOffsetX", value.asInstanceOf[js.Any])
    
    inline def setTitleOffsetY(value: Double): Self = StObject.set(x, "titleOffsetY", value.asInstanceOf[js.Any])
    
    inline def setTitlePosition(value: before | after): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
    
    inline def setTitleRotation(value: Double): Self = StObject.set(x, "titleRotation", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: ComponentType[BulletTooltipProps]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}

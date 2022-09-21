package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.linear
import typings.oracleOraclejet.oracleOraclejetStrings.log
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignTickMarks extends StObject {
  
  var alignTickMarks: off | on
  
  var axisLine: LineColorLineWidth
  
  var baselineScaling: min | zero
  
  var dataMax: Double
  
  var dataMin: Double
  
  var majorTick: BaselineColor
  
  var max: Double
  
  var maxSize: String
  
  var min: Double
  
  var minStep: Double
  
  var minorStep: Double
  
  var minorTick: LineStyle
  
  var position: start | end | top | bottom | auto
  
  var referenceObjects: js.Array[DisplayInLegend]
  
  var rendered: off | on
  
  var scale: log | linear
  
  var size: String
  
  var step: Double
  
  var tickLabel: Position
  
  var title: String
  
  var titleStyle: js.Object
}
object AlignTickMarks {
  
  inline def apply(
    alignTickMarks: off | on,
    axisLine: LineColorLineWidth,
    baselineScaling: min | zero,
    dataMax: Double,
    dataMin: Double,
    majorTick: BaselineColor,
    max: Double,
    maxSize: String,
    min: Double,
    minStep: Double,
    minorStep: Double,
    minorTick: LineStyle,
    position: start | end | top | bottom | auto,
    referenceObjects: js.Array[DisplayInLegend],
    rendered: off | on,
    scale: log | linear,
    size: String,
    step: Double,
    tickLabel: Position,
    title: String,
    titleStyle: js.Object
  ): AlignTickMarks = {
    val __obj = js.Dynamic.literal(alignTickMarks = alignTickMarks.asInstanceOf[js.Any], axisLine = axisLine.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], majorTick = majorTick.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minStep = minStep.asInstanceOf[js.Any], minorStep = minorStep.asInstanceOf[js.Any], minorTick = minorTick.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tickLabel = tickLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignTickMarks]
  }
  
  extension [Self <: AlignTickMarks](x: Self) {
    
    inline def setAlignTickMarks(value: off | on): Self = StObject.set(x, "alignTickMarks", value.asInstanceOf[js.Any])
    
    inline def setAxisLine(value: LineColorLineWidth): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
    
    inline def setBaselineScaling(value: min | zero): Self = StObject.set(x, "baselineScaling", value.asInstanceOf[js.Any])
    
    inline def setDataMax(value: Double): Self = StObject.set(x, "dataMax", value.asInstanceOf[js.Any])
    
    inline def setDataMin(value: Double): Self = StObject.set(x, "dataMin", value.asInstanceOf[js.Any])
    
    inline def setMajorTick(value: BaselineColor): Self = StObject.set(x, "majorTick", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: String): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinStep(value: Double): Self = StObject.set(x, "minStep", value.asInstanceOf[js.Any])
    
    inline def setMinorStep(value: Double): Self = StObject.set(x, "minorStep", value.asInstanceOf[js.Any])
    
    inline def setMinorTick(value: LineStyle): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: start | end | top | bottom | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReferenceObjects(value: js.Array[DisplayInLegend]): Self = StObject.set(x, "referenceObjects", value.asInstanceOf[js.Any])
    
    inline def setReferenceObjectsVarargs(value: DisplayInLegend*): Self = StObject.set(x, "referenceObjects", js.Array(value*))
    
    inline def setRendered(value: off | on): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setScale(value: log | linear): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setTickLabel(value: Position): Self = StObject.set(x, "tickLabel", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: js.Object): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
  }
}

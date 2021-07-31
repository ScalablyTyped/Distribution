package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SunburstPlotDatum extends StObject {
  
  var color: Double
  
  var curveNumber: Double
  
  var data: Data
  
  var entry: String
  
  var fullData: Data
  
  var hovertext: String
  
  var id: String
  
  var label: String
  
  var parent: String
  
  var percentEntry: Double
  
  var percentParent: Double
  
  var percentRoot: Double
  
  var pointNumber: Double
  
  var root: String
  
  var value: Double
}
object SunburstPlotDatum {
  
  @scala.inline
  def apply(
    color: Double,
    curveNumber: Double,
    data: Data,
    entry: String,
    fullData: Data,
    hovertext: String,
    id: String,
    label: String,
    parent: String,
    percentEntry: Double,
    percentParent: Double,
    percentRoot: Double,
    pointNumber: Double,
    root: String,
    value: Double
  ): SunburstPlotDatum = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], fullData = fullData.asInstanceOf[js.Any], hovertext = hovertext.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], percentEntry = percentEntry.asInstanceOf[js.Any], percentParent = percentParent.asInstanceOf[js.Any], percentRoot = percentRoot.asInstanceOf[js.Any], pointNumber = pointNumber.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunburstPlotDatum]
  }
  
  @scala.inline
  implicit class SunburstPlotDatumMutableBuilder[Self <: SunburstPlotDatum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveNumber(value: Double): Self = StObject.set(x, "curveNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullData(value: Data): Self = StObject.set(x, "fullData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovertext(value: String): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentEntry(value: Double): Self = StObject.set(x, "percentEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentParent(value: Double): Self = StObject.set(x, "percentParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentRoot(value: Double): Self = StObject.set(x, "percentRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointNumber(value: Double): Self = StObject.set(x, "pointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

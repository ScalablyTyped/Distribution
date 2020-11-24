package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SunburstPlotDatum extends js.Object {
  
  var color: Double = js.native
  
  var curveNumber: Double = js.native
  
  var data: Data = js.native
  
  var entry: String = js.native
  
  var fullData: Data = js.native
  
  var hovertext: String = js.native
  
  var id: String = js.native
  
  var label: String = js.native
  
  var parent: String = js.native
  
  var percentEntry: Double = js.native
  
  var percentParent: Double = js.native
  
  var percentRoot: Double = js.native
  
  var pointNumber: Double = js.native
  
  var root: String = js.native
  
  var value: Double = js.native
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
  implicit class SunburstPlotDatumOps[Self <: SunburstPlotDatum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveNumber(value: Double): Self = this.set("curveNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntry(value: String): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullData(value: Data): Self = this.set("fullData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovertext(value: String): Self = this.set("hovertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentEntry(value: Double): Self = this.set("percentEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentParent(value: Double): Self = this.set("percentParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentRoot(value: Double): Self = this.set("percentRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointNumber(value: Double): Self = this.set("pointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}

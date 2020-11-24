package typings.oracleOraclejet.ojchartMod.ojChart

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait DataLabelContext extends js.Object {
  
  var close: Double = js.native
  
  var componentElement: Element = js.native
  
  var data: js.Object | Null = js.native
  
  var group: String | js.Array[String] = js.native
  
  var groupData: js.Object | Null = js.native
  
  var high: Double = js.native
  
  var id: js.Any = js.native
  
  var itemData: js.Object | Null = js.native
  
  var label: String = js.native
  
  var low: Double = js.native
  
  var open: Double = js.native
  
  var series: String = js.native
  
  var seriesData: js.Object | Null = js.native
  
  var targetValue: Double = js.native
  
  var totalValue: Double = js.native
  
  var value: Double = js.native
  
  var volume: Double = js.native
  
  var x: Double | String = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
object DataLabelContext {
  
  @scala.inline
  def apply(
    close: Double,
    componentElement: Element,
    group: String | js.Array[String],
    high: Double,
    id: js.Any,
    label: String,
    low: Double,
    open: Double,
    series: String,
    targetValue: Double,
    totalValue: Double,
    value: Double,
    volume: Double,
    x: Double | String,
    y: Double,
    z: Double
  ): DataLabelContext = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], totalValue = totalValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLabelContext]
  }
  
  @scala.inline
  implicit class DataLabelContextOps[Self <: DataLabelContext] (val x: Self) extends AnyVal {
    
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
    def setClose(value: Double): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupVarargs(value: String*): Self = this.set("group", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: String | js.Array[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Double): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValue(value: Double): Self = this.set("targetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalValue(value: Double): Self = this.set("totalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setGroupData(value: js.Object): Self = this.set("groupData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDataNull: Self = this.set("groupData", null)
    
    @scala.inline
    def setItemData(value: js.Object): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataNull: Self = this.set("itemData", null)
    
    @scala.inline
    def setSeriesData(value: js.Object): Self = this.set("seriesData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesDataNull: Self = this.set("seriesData", null)
  }
}

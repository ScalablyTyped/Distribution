package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesData extends js.Object {
  
  /**
    * The values of the labels in the time series identifier, given in the same order as the label_descriptors field of the TimeSeriesDescriptor associated with this object. Each value
    * must have a value of the type given in the corresponding entry of label_descriptors.
    */
  var labelValues: js.UndefOr[js.Array[LabelValue]] = js.native
  
  /** The points in the time series. */
  var pointData: js.UndefOr[js.Array[PointData]] = js.native
}
object TimeSeriesData {
  
  @scala.inline
  def apply(): TimeSeriesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesData]
  }
  
  @scala.inline
  implicit class TimeSeriesDataOps[Self <: TimeSeriesData] (val x: Self) extends AnyVal {
    
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
    def setLabelValuesVarargs(value: LabelValue*): Self = this.set("labelValues", js.Array(value :_*))
    
    @scala.inline
    def setLabelValues(value: js.Array[LabelValue]): Self = this.set("labelValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelValues: Self = this.set("labelValues", js.undefined)
    
    @scala.inline
    def setPointDataVarargs(value: PointData*): Self = this.set("pointData", js.Array(value :_*))
    
    @scala.inline
    def setPointData(value: js.Array[PointData]): Self = this.set("pointData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointData: Self = this.set("pointData", js.undefined)
  }
}

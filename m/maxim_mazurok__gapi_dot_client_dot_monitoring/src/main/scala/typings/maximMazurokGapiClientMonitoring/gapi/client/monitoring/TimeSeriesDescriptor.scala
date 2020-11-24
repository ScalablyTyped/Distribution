package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesDescriptor extends js.Object {
  
  /** Descriptors for the labels. */
  var labelDescriptors: js.UndefOr[js.Array[LabelDescriptor]] = js.native
  
  /** Descriptors for the point data value columns. */
  var pointDescriptors: js.UndefOr[js.Array[ValueDescriptor]] = js.native
}
object TimeSeriesDescriptor {
  
  @scala.inline
  def apply(): TimeSeriesDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesDescriptor]
  }
  
  @scala.inline
  implicit class TimeSeriesDescriptorOps[Self <: TimeSeriesDescriptor] (val x: Self) extends AnyVal {
    
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
    def setLabelDescriptorsVarargs(value: LabelDescriptor*): Self = this.set("labelDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setLabelDescriptors(value: js.Array[LabelDescriptor]): Self = this.set("labelDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDescriptors: Self = this.set("labelDescriptors", js.undefined)
    
    @scala.inline
    def setPointDescriptorsVarargs(value: ValueDescriptor*): Self = this.set("pointDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setPointDescriptors(value: js.Array[ValueDescriptor]): Self = this.set("pointDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointDescriptors: Self = this.set("pointDescriptors", js.undefined)
  }
}

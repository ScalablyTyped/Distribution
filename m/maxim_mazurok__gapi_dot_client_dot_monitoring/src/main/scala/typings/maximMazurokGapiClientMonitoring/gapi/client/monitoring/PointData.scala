package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointData extends js.Object {
  
  /** The time interval associated with the point. */
  var timeInterval: js.UndefOr[TimeInterval] = js.native
  
  /** The values that make up the point. */
  var values: js.UndefOr[js.Array[TypedValue]] = js.native
}
object PointData {
  
  @scala.inline
  def apply(): PointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointData]
  }
  
  @scala.inline
  implicit class PointDataOps[Self <: PointData] (val x: Self) extends AnyVal {
    
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
    def setTimeInterval(value: TimeInterval): Self = this.set("timeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeInterval: Self = this.set("timeInterval", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: TypedValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[TypedValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}

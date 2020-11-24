package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelValue extends js.Object {
  
  /** A bool label value. */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /** An int64 label value. */
  var int64Value: js.UndefOr[String] = js.native
  
  /** A string label value. */
  var stringValue: js.UndefOr[String] = js.native
}
object LabelValue {
  
  @scala.inline
  def apply(): LabelValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelValue]
  }
  
  @scala.inline
  implicit class LabelValueOps[Self <: LabelValue] (val x: Self) extends AnyVal {
    
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    
    @scala.inline
    def setInt64Value(value: String): Self = this.set("int64Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInt64Value: Self = this.set("int64Value", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
}

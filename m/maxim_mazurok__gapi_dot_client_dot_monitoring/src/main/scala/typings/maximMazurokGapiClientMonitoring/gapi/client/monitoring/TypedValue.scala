package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedValue extends js.Object {
  
  /** A Boolean value: true or false. */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /** A distribution value. */
  var distributionValue: js.UndefOr[Distribution] = js.native
  
  /** A 64-bit double-precision floating-point number. Its magnitude is approximately ±10±300 and it has 16 significant digits of precision. */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /** A 64-bit integer. Its range is approximately ±9.2x1018. */
  var int64Value: js.UndefOr[String] = js.native
  
  /** A variable-length string value. */
  var stringValue: js.UndefOr[String] = js.native
}
object TypedValue {
  
  @scala.inline
  def apply(): TypedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedValue]
  }
  
  @scala.inline
  implicit class TypedValueOps[Self <: TypedValue] (val x: Self) extends AnyVal {
    
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
    def setDistributionValue(value: Distribution): Self = this.set("distributionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionValue: Self = this.set("distributionValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    
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

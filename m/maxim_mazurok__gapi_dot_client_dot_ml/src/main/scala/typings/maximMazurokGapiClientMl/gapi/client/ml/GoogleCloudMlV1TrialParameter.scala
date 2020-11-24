package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1TrialParameter extends js.Object {
  
  /** Must be set if ParameterType is DOUBLE or DISCRETE. */
  var floatValue: js.UndefOr[Double] = js.native
  
  /** Must be set if ParameterType is INTEGER */
  var intValue: js.UndefOr[String] = js.native
  
  /** The name of the parameter. */
  var parameter: js.UndefOr[String] = js.native
  
  /** Must be set if ParameterTypeis CATEGORICAL */
  var stringValue: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1TrialParameter {
  
  @scala.inline
  def apply(): GoogleCloudMlV1TrialParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1TrialParameter]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1TrialParameterOps[Self <: GoogleCloudMlV1TrialParameter] (val x: Self) extends AnyVal {
    
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
    def setFloatValue(value: Double): Self = this.set("floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatValue: Self = this.set("floatValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = this.set("intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntValue: Self = this.set("intValue", js.undefined)
    
    @scala.inline
    def setParameter(value: String): Self = this.set("parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
}

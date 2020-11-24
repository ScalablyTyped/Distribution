package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleRE2 extends js.Object {
  
  /**
    * This field controls the RE2 "program size" which is a rough estimate of how complex a compiled regex is to evaluate. A regex that has a program size greater than the configured
    * value will fail to compile. In this case, the configured max program size can be increased or the regex can be simplified. If not specified, the default is 100. This field is
    * deprecated; regexp validation should be performed on the management server instead of being done by each individual client.
    */
  var maxProgramSize: js.UndefOr[Double] = js.native
}
object GoogleRE2 {
  
  @scala.inline
  def apply(): GoogleRE2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleRE2]
  }
  
  @scala.inline
  implicit class GoogleRE2Ops[Self <: GoogleRE2] (val x: Self) extends AnyVal {
    
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
    def setMaxProgramSize(value: Double): Self = this.set("maxProgramSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxProgramSize: Self = this.set("maxProgramSize", js.undefined)
  }
}

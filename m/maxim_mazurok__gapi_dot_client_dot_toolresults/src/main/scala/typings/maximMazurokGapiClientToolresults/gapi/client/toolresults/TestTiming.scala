package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestTiming extends js.Object {
  
  /** How long it took to run the test process. - In response: present if previously set. - In create/update request: optional */
  var testProcessDuration: js.UndefOr[Duration] = js.native
}
object TestTiming {
  
  @scala.inline
  def apply(): TestTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestTiming]
  }
  
  @scala.inline
  implicit class TestTimingOps[Self <: TestTiming] (val x: Self) extends AnyVal {
    
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
    def setTestProcessDuration(value: Duration): Self = this.set("testProcessDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestProcessDuration: Self = this.set("testProcessDuration", js.undefined)
  }
}

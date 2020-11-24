package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystraceSetup extends js.Object {
  
  /** Systrace duration in seconds. Should be between 1 and 30 seconds. 0 disables systrace. */
  var durationSeconds: js.UndefOr[Double] = js.native
}
object SystraceSetup {
  
  @scala.inline
  def apply(): SystraceSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystraceSetup]
  }
  
  @scala.inline
  implicit class SystraceSetupOps[Self <: SystraceSetup] (val x: Self) extends AnyVal {
    
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
    def setDurationSeconds(value: Double): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationSeconds: Self = this.set("durationSeconds", js.undefined)
  }
}

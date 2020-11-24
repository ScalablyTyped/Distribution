package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneTimeSchedule extends js.Object {
  
  /** Required. The desired patch job execution time. */
  var executeTime: js.UndefOr[String] = js.native
}
object OneTimeSchedule {
  
  @scala.inline
  def apply(): OneTimeSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneTimeSchedule]
  }
  
  @scala.inline
  implicit class OneTimeScheduleOps[Self <: OneTimeSchedule] (val x: Self) extends AnyVal {
    
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
    def setExecuteTime(value: String): Self = this.set("executeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecuteTime: Self = this.set("executeTime", js.undefined)
  }
}

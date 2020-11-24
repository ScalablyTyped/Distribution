package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalProcessInfo extends js.Object {
  
  var listener: js.UndefOr[LaunchExternalProcessListener] = js.native
  
  var pid: Double = js.native
}
object ExternalProcessInfo {
  
  @scala.inline
  def apply(pid: Double): ExternalProcessInfo = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalProcessInfo]
  }
  
  @scala.inline
  implicit class ExternalProcessInfoOps[Self <: ExternalProcessInfo] (val x: Self) extends AnyVal {
    
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
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListener(value: /* code */ ExitCode => Unit): Self = this.set("listener", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteListener: Self = this.set("listener", js.undefined)
  }
}

package typings.openfin.crashReporterOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrashReporterOption extends js.Object {
  
  var diagnosticMode: Boolean = js.native
  
  var isRunning: js.UndefOr[Boolean] = js.native
}
object CrashReporterOption {
  
  @scala.inline
  def apply(diagnosticMode: Boolean): CrashReporterOption = {
    val __obj = js.Dynamic.literal(diagnosticMode = diagnosticMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashReporterOption]
  }
  
  @scala.inline
  implicit class CrashReporterOptionOps[Self <: CrashReporterOption] (val x: Self) extends AnyVal {
    
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
    def setDiagnosticMode(value: Boolean): Self = this.set("diagnosticMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRunning(value: Boolean): Self = this.set("isRunning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRunning: Self = this.set("isRunning", js.undefined)
  }
}

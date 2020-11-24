package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrashDialogError extends js.Object {
  
  /** The name of the package that caused the dialog. */
  var crashPackage: js.UndefOr[String] = js.native
}
object CrashDialogError {
  
  @scala.inline
  def apply(): CrashDialogError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrashDialogError]
  }
  
  @scala.inline
  implicit class CrashDialogErrorOps[Self <: CrashDialogError] (val x: Self) extends AnyVal {
    
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
    def setCrashPackage(value: String): Self = this.set("crashPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrashPackage: Self = this.set("crashPackage", js.undefined)
  }
}

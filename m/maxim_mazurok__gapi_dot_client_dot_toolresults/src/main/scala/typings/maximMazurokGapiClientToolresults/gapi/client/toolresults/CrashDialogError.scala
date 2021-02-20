package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrashDialogError extends StObject {
  
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
  implicit class CrashDialogErrorMutableBuilder[Self <: CrashDialogError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrashPackage(value: String): Self = StObject.set(x, "crashPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashPackageUndefined: Self = StObject.set(x, "crashPackage", js.undefined)
  }
}

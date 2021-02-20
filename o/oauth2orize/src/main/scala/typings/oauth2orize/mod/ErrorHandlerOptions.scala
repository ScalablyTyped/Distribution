package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorHandlerOptions extends StObject {
  
  var mode: js.UndefOr[String] = js.native
}
object ErrorHandlerOptions {
  
  @scala.inline
  def apply(): ErrorHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlerOptions]
  }
  
  @scala.inline
  implicit class ErrorHandlerOptionsMutableBuilder[Self <: ErrorHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}

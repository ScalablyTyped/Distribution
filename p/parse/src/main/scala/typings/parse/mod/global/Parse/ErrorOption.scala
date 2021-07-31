package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorOption extends StObject {
  
  var error: js.UndefOr[js.Function] = js.undefined
}
object ErrorOption {
  
  @scala.inline
  def apply(): ErrorOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorOption]
  }
  
  @scala.inline
  implicit class ErrorOptionMutableBuilder[Self <: ErrorOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}

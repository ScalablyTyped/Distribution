package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessOption extends StObject {
  
  var success: js.UndefOr[js.Function] = js.native
}
object SuccessOption {
  
  @scala.inline
  def apply(): SuccessOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessOption]
  }
  
  @scala.inline
  implicit class SuccessOptionMutableBuilder[Self <: SuccessOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}

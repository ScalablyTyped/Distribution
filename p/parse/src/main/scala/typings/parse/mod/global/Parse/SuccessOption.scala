package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessOption extends StObject {
  
  var success: js.UndefOr[js.Function] = js.undefined
}
object SuccessOption {
  
  inline def apply(): SuccessOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessOption]
  }
  
  extension [Self <: SuccessOption](x: Self) {
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}

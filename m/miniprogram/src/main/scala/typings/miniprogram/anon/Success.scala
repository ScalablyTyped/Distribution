package typings.miniprogram.anon

import typings.miniprogram.miniprogramBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success extends StObject {
  
  var success: `true`
}
object Success {
  
  @scala.inline
  def apply(): Success = {
    val __obj = js.Dynamic.literal(success = true)
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit class SuccessMutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}

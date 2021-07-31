package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactError extends StObject {
  
  var code: Double
}
object ContactError {
  
  @scala.inline
  def apply(code: Double): ContactError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactError]
  }
  
  @scala.inline
  implicit class ContactErrorMutableBuilder[Self <: ContactError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}

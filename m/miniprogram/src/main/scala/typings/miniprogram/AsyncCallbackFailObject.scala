package typings.miniprogram

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncCallbackFailObject
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var error: Double
  
  var errorMessage: js.UndefOr[String] = js.undefined
}
object AsyncCallbackFailObject {
  
  @scala.inline
  def apply(error: Double): AsyncCallbackFailObject = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncCallbackFailObject]
  }
  
  @scala.inline
  implicit class AsyncCallbackFailObjectMutableBuilder[Self <: AsyncCallbackFailObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}

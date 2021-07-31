package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError extends StObject {
  
  var onError: js.UndefOr[js.Function] = js.undefined
}
object OnError {
  
  @scala.inline
  def apply(): OnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnError]
  }
  
  @scala.inline
  implicit class OnErrorMutableBuilder[Self <: OnError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: js.Function): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}

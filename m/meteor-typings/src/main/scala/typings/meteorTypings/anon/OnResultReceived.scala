package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnResultReceived extends StObject {
  
  var onResultReceived: js.UndefOr[js.Function] = js.undefined
  
  @JSName("wait")
  var wait_FOnResultReceived: js.UndefOr[Boolean] = js.undefined
}
object OnResultReceived {
  
  @scala.inline
  def apply(): OnResultReceived = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnResultReceived]
  }
  
  @scala.inline
  implicit class OnResultReceivedMutableBuilder[Self <: OnResultReceived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnResultReceived(value: js.Function): Self = StObject.set(x, "onResultReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResultReceivedUndefined: Self = StObject.set(x, "onResultReceived", js.undefined)
    
    @scala.inline
    def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}

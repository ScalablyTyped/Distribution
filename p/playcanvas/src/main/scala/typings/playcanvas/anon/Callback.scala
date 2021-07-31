package typings.playcanvas.anon

import typings.playcanvas.pc.callbacks.XrError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: js.UndefOr[XrError] = js.undefined
  
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.undefined
}
object Callback {
  
  @scala.inline
  def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: /* err */ Error | Null => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setOptionalFeatures(value: js.Array[String]): Self = StObject.set(x, "optionalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalFeaturesUndefined: Self = StObject.set(x, "optionalFeatures", js.undefined)
    
    @scala.inline
    def setOptionalFeaturesVarargs(value: String*): Self = StObject.set(x, "optionalFeatures", js.Array(value :_*))
  }
}

package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnWindowResizeCallbackResult extends StObject {
  
  var size: Size
}
object OnWindowResizeCallbackResult {
  
  inline def apply(size: Size): OnWindowResizeCallbackResult = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnWindowResizeCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnWindowResizeCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

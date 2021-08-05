package typings.nodeSass.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncContext
  extends StObject
     with Context {
  
  @JSName("callback")
  def callback_MAsyncContext(err: SassError, result: Result): js.Any
  @JSName("callback")
  var callback_Original: SassRenderCallback
}
object AsyncContext {
  
  inline def apply(callback: (/* err */ SassError, /* result */ Result) => js.Any, options: Options): AsyncContext = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncContext]
  }
  
  extension [Self <: AsyncContext](x: Self) {
    
    inline def setCallback(value: (/* err */ SassError, /* result */ Result) => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
  }
}

package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebViewContext extends StObject {
  
  /**
    * `webViewContext` is bound with a `web-view` component via webviewId to
    * implement some functions. List of `webViewContext` object methods:
    */
  def postMessage(msg: Any): Unit
}
object WebViewContext {
  
  inline def apply(postMessage: Any => Unit): WebViewContext = {
    val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[WebViewContext]
  }
  
  extension [Self <: WebViewContext](x: Self) {
    
    inline def setPostMessage(value: Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
  }
}

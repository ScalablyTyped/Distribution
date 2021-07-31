package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebViewContext extends StObject {
  
  /**
    * `webViewContext` is bound with a `web-view` component via webviewId to
    * implement some functions. List of `webViewContext` object methods:
    */
  def postMessage(msg: js.Any): Unit
}
object WebViewContext {
  
  @scala.inline
  def apply(postMessage: js.Any => Unit): WebViewContext = {
    val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[WebViewContext]
  }
  
  @scala.inline
  implicit class WebViewContextMutableBuilder[Self <: WebViewContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostMessage(value: js.Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
  }
}

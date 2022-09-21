package typings.naverWhale.whale.runtime

import typings.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSender extends StObject {
  
  /**
    * The frame that opened the connection. 0 for top-level frames, positive for child frames. This will only be set when tab is set.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /** The ID of the extension or app that opened the connection, if any. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The name of the native application that opened the connection, if any.
    * @since Chrome 74
    */
  var nativeApplication: js.UndefOr[String] = js.undefined
  
  /**
    * The origin of the page or frame that opened the connection. It can vary from the url property (e.g., about:blank) or can be opaque (e.g., sandboxed iframes). This is useful for identifying if the origin can be trusted if we can't immediately tell from the URL.
    * @since Chrome 80.
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /** The tabs.Tab which opened the connection, if any. This property will only be present when the connection was opened from a tab (including content scripts), and only if the receiver is an extension, not an app. */
  var tab: js.UndefOr[Tab] = js.undefined
  
  /**
    * The TLS channel ID of the page or frame that opened the connection, if requested by the extension or app, and if available.
    * @since Chrome 32.
    */
  var tlsChannelId: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the page or frame that opened the connection. If the sender is in an iframe, it will be iframe's URL not the URL of the page which hosts it.
    * @since Chrome 28.
    */
  var url: js.UndefOr[String] = js.undefined
}
object MessageSender {
  
  inline def apply(): MessageSender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSender]
  }
  
  extension [Self <: MessageSender](x: Self) {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNativeApplication(value: String): Self = StObject.set(x, "nativeApplication", value.asInstanceOf[js.Any])
    
    inline def setNativeApplicationUndefined: Self = StObject.set(x, "nativeApplication", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    
    inline def setTlsChannelId(value: String): Self = StObject.set(x, "tlsChannelId", value.asInstanceOf[js.Any])
    
    inline def setTlsChannelIdUndefined: Self = StObject.set(x, "tlsChannelId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

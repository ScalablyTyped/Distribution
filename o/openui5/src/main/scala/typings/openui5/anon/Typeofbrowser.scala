package typings.openui5.anon

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofbrowser extends StObject {
  
  val BROWSER: TypeofBROWSER_
  
  val blink: Boolean
  
  val chrome: Boolean
  
  val firefox: Boolean
  
  val fullscreen: Boolean
  
  val mobile: Boolean
  
  val mozilla: Boolean
  
  val name: String
  
  val safari: Boolean
  
  val version: float
  
  val versionStr: String
  
  val webkit: Boolean
  
  val webview: Boolean
}
object Typeofbrowser {
  
  inline def apply(
    BROWSER: TypeofBROWSER_,
    blink: Boolean,
    chrome: Boolean,
    firefox: Boolean,
    fullscreen: Boolean,
    mobile: Boolean,
    mozilla: Boolean,
    name: String,
    safari: Boolean,
    version: float,
    versionStr: String,
    webkit: Boolean,
    webview: Boolean
  ): Typeofbrowser = {
    val __obj = js.Dynamic.literal(BROWSER = BROWSER.asInstanceOf[js.Any], blink = blink.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], mozilla = mozilla.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionStr = versionStr.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofbrowser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofbrowser] (val x: Self) extends AnyVal {
    
    inline def setBROWSER(value: TypeofBROWSER_): Self = StObject.set(x, "BROWSER", value.asInstanceOf[js.Any])
    
    inline def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
    
    inline def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
    
    inline def setFirefox(value: Boolean): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMozilla(value: Boolean): Self = StObject.set(x, "mozilla", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSafari(value: Boolean): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: float): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionStr(value: String): Self = StObject.set(x, "versionStr", value.asInstanceOf[js.Any])
    
    inline def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
    
    inline def setWebview(value: Boolean): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
  }
}

package typings.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Determines the browser type and version running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.browser` from within any Scene.
  */
@js.native
trait Browser extends js.Object {
  
  /**
    * Set to true if running in Chrome.
    */
  var chrome: Boolean = js.native
  
  /**
    * If running in Chrome this will contain the major version number.
    */
  var chromeVersion: Double = js.native
  
  /**
    * Set to true if running in Microsoft Edge browser.
    */
  var edge: Boolean = js.native
  
  /**
    * Set to true if running in Firefox.
    */
  var firefox: Boolean = js.native
  
  /**
    * If running in Firefox this will contain the major version number.
    */
  var firefoxVersion: Double = js.native
  
  /**
    * Set to true if running in Internet Explorer 11 or less (not Edge).
    */
  var ie: Boolean = js.native
  
  /**
    * If running in Internet Explorer this will contain the major version number. Beyond IE10 you should use Browser.trident and Browser.tridentVersion.
    */
  var ieVersion: Double = js.native
  
  /**
    * Set to true if running in Mobile Safari.
    */
  var mobileSafari: Boolean = js.native
  
  /**
    * Set to true if running in Opera.
    */
  var opera: Boolean = js.native
  
  /**
    * Set to true if running in Safari.
    */
  var safari: Boolean = js.native
  
  /**
    * If running in Safari this will contain the major version number.
    */
  var safariVersion: Double = js.native
  
  /**
    * Set to true if running in the Silk browser (as used on the Amazon Kindle)
    */
  var silk: Boolean = js.native
  
  /**
    * Set to true if running a Trident version of Internet Explorer (IE11+)
    */
  var trident: Boolean = js.native
  
  /**
    * If running in Internet Explorer 11 this will contain the major version number. See {@link http://msdn.microsoft.com/en-us/library/ie/ms537503(v=vs.85).aspx}
    */
  var tridentVersion: Double = js.native
}
object Browser {
  
  @scala.inline
  def apply(
    chrome: Boolean,
    chromeVersion: Double,
    edge: Boolean,
    firefox: Boolean,
    firefoxVersion: Double,
    ie: Boolean,
    ieVersion: Double,
    mobileSafari: Boolean,
    opera: Boolean,
    safari: Boolean,
    safariVersion: Double,
    silk: Boolean,
    trident: Boolean,
    tridentVersion: Double
  ): Browser = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], chromeVersion = chromeVersion.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], firefoxVersion = firefoxVersion.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], ieVersion = ieVersion.asInstanceOf[js.Any], mobileSafari = mobileSafari.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], safariVersion = safariVersion.asInstanceOf[js.Any], silk = silk.asInstanceOf[js.Any], trident = trident.asInstanceOf[js.Any], tridentVersion = tridentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromeVersion(value: Double): Self = this.set("chromeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdge(value: Boolean): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefox(value: Boolean): Self = this.set("firefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefoxVersion(value: Double): Self = this.set("firefoxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe(value: Boolean): Self = this.set("ie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIeVersion(value: Double): Self = this.set("ieVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileSafari(value: Boolean): Self = this.set("mobileSafari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpera(value: Boolean): Self = this.set("opera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafari(value: Boolean): Self = this.set("safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariVersion(value: Double): Self = this.set("safariVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilk(value: Boolean): Self = this.set("silk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrident(value: Boolean): Self = this.set("trident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTridentVersion(value: Double): Self = this.set("tridentVersion", value.asInstanceOf[js.Any])
  }
}

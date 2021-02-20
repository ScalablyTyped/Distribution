package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Utility methods to detect current platform
  */
object platform {
  
  /**
    * @description Returns whether the OS is Android
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isAndroid")
  @js.native
  def isAndroid(): Boolean = js.native
  
  @JSImport("onsenui", "platform.isAndroidPhone")
  @js.native
  def isAndroidPhone(): Boolean = js.native
  
  @JSImport("onsenui", "platform.isAndroidTablet")
  @js.native
  def isAndroidTablet(): Boolean = js.native
  
  /**
    * @description Returns whether the device is BlackBerry
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isBlackBerry")
  @js.native
  def isBlackBerry(): Boolean = js.native
  
  /**
    * @description Returns whether the browser is Chrome
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isChrome")
  @js.native
  def isChrome(): Boolean = js.native
  
  /**
    *
    */
  @JSImport("onsenui", "platform.isEdge")
  @js.native
  def isEdge(): Boolean = js.native
  
  /**
    * @description Returns whether the browser is Firefox
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isFirefox")
  @js.native
  def isFirefox(): Boolean = js.native
  
  /**
    * @description Returns whether the browser is Internet Explorer
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isIE")
  @js.native
  def isIE(): Boolean = js.native
  
  /**
    * @description Returns whether the OS is iOS
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isIOS")
  @js.native
  def isIOS(): Boolean = js.native
  
  /**
    * @description Returns whether the iOS version is 7 or above
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isIOS7above")
  @js.native
  def isIOS7above(): Boolean = js.native
  
  /**
    * @description Returns whether app is running in iOS Safari.
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isIOSSafari")
  @js.native
  def isIOSSafari(): Boolean = js.native
  
  /**
    * @description Returns whether the device is iPad
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isIPad")
  @js.native
  def isIPad(): Boolean = js.native
  
  /**
    * @description Returns whether the OS is iPadOS
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isIPadOS")
  @js.native
  def isIPadOS(): Boolean = js.native
  
  /**
    * @description Returns whether the device is iPhone
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isIPhone")
  @js.native
  def isIPhone(): Boolean = js.native
  
  /**
    * @description Returns whether the device is iPhone X
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isIPhoneX")
  @js.native
  def isIPhoneX(): Boolean = js.native
  
  /**
    * @description Returns whether the browser is Opera
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isOpera")
  @js.native
  def isOpera(): Boolean = js.native
  
  /**
    * @description Returns whether the browser is Safari
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isSafari")
  @js.native
  def isSafari(): Boolean = js.native
  
  /**
    * @description Returns whether app is running in WKWebView.
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isWKWebView")
  @js.native
  def isWKWebView(): Boolean = js.native
  
  /**
    * @description Returns whether device is Windows phone
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isWP")
  @js.native
  def isWP(): Boolean = js.native
  
  /**
    * @description Returns whether app is running in Cordova
    * @return {Boolean}
    */
  @JSImport("onsenui", "platform.isWebView")
  @js.native
  def isWebView(): Boolean = js.native
  
  /**
    * @param  {string} platform Name of the platform. Possible values are: "opera", "firefox", "safari", "chrome", "ie", "android", "blackberry", "ios" or "wp".
    * @description Sets the platform used to render the elements. Useful for testing.
    */
  @JSImport("onsenui", "platform.select")
  @js.native
  def select(platform: String): Unit = js.native
}

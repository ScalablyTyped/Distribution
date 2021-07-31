package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Utility methods to detect current platform
  */
object platform {
  
  @JSImport("onsenui", "platform")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @description Returns whether the OS is Android
    * @return {Boolean}
    */
  @scala.inline
  def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
  
  @scala.inline
  def isAndroidPhone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroidPhone")().asInstanceOf[Boolean]
  
  @scala.inline
  def isAndroidTablet(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroidTablet")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the device is BlackBerry
    * @return {Boolean}
    */
  @scala.inline
  def isBlackBerry(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlackBerry")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the browser is Chrome
    * @return {Boolean}
    */
  @scala.inline
  def isChrome(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrome")().asInstanceOf[Boolean]
  
  /**
    *
    */
  @scala.inline
  def isEdge(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdge")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the browser is Firefox
    * @return {Boolean}
    */
  @scala.inline
  def isFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefox")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the browser is Internet Explorer
    * @return {Boolean}
    */
  @scala.inline
  def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the OS is iOS
    * @return {Boolean}
    */
  @scala.inline
  def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the iOS version is 7 or above
    * @return {Boolean}
    */
  @scala.inline
  def isIOS7above(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS7above")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether app is running in iOS Safari.
    * @return {Boolean}
    */
  @scala.inline
  def isIOSSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOSSafari")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the device is iPad
    * @return {Boolean}
    */
  @scala.inline
  def isIPad(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPad")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the OS is iPadOS
    * @return {Boolean}
    */
  @scala.inline
  def isIPadOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPadOS")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the device is iPhone
    * @return {Boolean}
    */
  @scala.inline
  def isIPhone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhone")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the device is iPhone X
    * @return {Boolean}
    */
  @scala.inline
  def isIPhoneX(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhoneX")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the browser is Opera
    * @return {Boolean}
    */
  @scala.inline
  def isOpera(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpera")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether the browser is Safari
    * @return {Boolean}
    */
  @scala.inline
  def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether app is running in WKWebView.
    * @return {Boolean}
    */
  @scala.inline
  def isWKWebView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWKWebView")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether device is Windows phone
    * @return {Boolean}
    */
  @scala.inline
  def isWP(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWP")().asInstanceOf[Boolean]
  
  /**
    * @description Returns whether app is running in Cordova
    * @return {Boolean}
    */
  @scala.inline
  def isWebView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebView")().asInstanceOf[Boolean]
  
  /**
    * @param  {string} platform Name of the platform. Possible values are: "opera", "firefox", "safari", "chrome", "ie", "android", "blackberry", "ios" or "wp".
    * @description Sets the platform used to render the elements. Useful for testing.
    */
  @scala.inline
  def select(platform: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(platform.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

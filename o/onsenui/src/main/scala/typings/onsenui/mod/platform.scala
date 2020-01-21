package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description Utility methods to detect current platform
  */
@JSImport("onsenui", "platform")
@js.native
object platform extends js.Object {
  /**
    * @description Returns whether the OS is Android
    * @return {Boolean}
    */
  def isAndroid(): Boolean = js.native
  def isAndroidPhone(): Boolean = js.native
  def isAndroidTablet(): Boolean = js.native
  /**
    * @description Returns whether the device is BlackBerry
    * @return {Boolean}
    */
  def isBlackBerry(): Boolean = js.native
  /**
    * @description Returns whether the browser is Chrome
    * @return {Boolean}
    */
  def isChrome(): Boolean = js.native
  /**
    *
    */
  def isEdge(): Boolean = js.native
  /**
    * @description Returns whether the browser is Firefox
    * @return {Boolean}
    */
  def isFirefox(): Boolean = js.native
  /**
    * @description Returns whether the browser is Internet Explorer
    * @return {Boolean}
    */
  def isIE(): Boolean = js.native
  /**
    * @description Returns whether the OS is iOS
    * @return {Boolean}
    */
  def isIOS(): Boolean = js.native
  /**
    * @description Returns whether the iOS version is 7 or above
    * @return {Boolean}
    */
  def isIOS7above(): Boolean = js.native
  /**
    * @description Returns whether app is running in iOS Safari.
    * @return {Boolean}
    */
  def isIOSSafari(): Boolean = js.native
  /**
    * @description Returns whether the device is iPad
    * @return {Boolean}
    */
  def isIPad(): Boolean = js.native
  /**
    * @description Returns whether the device is iPhone
    * @return {Boolean}
    */
  def isIPhone(): Boolean = js.native
  /**
    * @description Returns whether the device is iPhone X
    * @return {Boolean}
    */
  def isIPhoneX(): Boolean = js.native
  /**
    * @description Returns whether the browser is Opera
    * @return {Boolean}
    */
  def isOpera(): Boolean = js.native
  /**
    * @description Returns whether the browser is Safari
    * @return {Boolean}
    */
  def isSafari(): Boolean = js.native
  /**
    * @description Returns whether app is running in UIWebView.
    * @return {Boolean}
    */
  def isUIWebView(): Boolean = js.native
  /**
    * @description Returns whether app is running in WKWebView.
    * @return {Boolean}
    */
  def isWKWebView(): Boolean = js.native
  /**
    * @description Returns whether device is Windows phone
    * @return {Boolean}
    */
  def isWP(): Boolean = js.native
  /**
    * @description Returns whether app is running in Cordova
    * @return {Boolean}
    */
  def isWebView(): Boolean = js.native
  /**
    * @param  {string} platform Name of the platform. Possible values are: "opera", "firefox", "safari", "chrome", "ie", "android", "blackberry", "ios" or "wp".
    * @description Sets the platform used to render the elements. Useful for testing.
    */
  def select(platform: String): Unit = js.native
}


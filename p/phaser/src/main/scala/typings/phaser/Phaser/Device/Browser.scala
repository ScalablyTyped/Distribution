package typings.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the browser type and version running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.browser` from within any Scene.
  */
trait Browser extends js.Object {
  /**
    * Set to true if running in Chrome.
    */
  var chrome: Boolean
  /**
    * If running in Chrome this will contain the major version number.
    */
  var chromeVersion: Double
  /**
    * Set to true if running in Microsoft Edge browser.
    */
  var edge: Boolean
  /**
    * Set to true if running in Firefox.
    */
  var firefox: Boolean
  /**
    * If running in Firefox this will contain the major version number.
    */
  var firefoxVersion: Double
  /**
    * Set to true if running in Internet Explorer 11 or less (not Edge).
    */
  var ie: Boolean
  /**
    * If running in Internet Explorer this will contain the major version number. Beyond IE10 you should use Browser.trident and Browser.tridentVersion.
    */
  var ieVersion: Double
  /**
    * Set to true if running in Mobile Safari.
    */
  var mobileSafari: Boolean
  /**
    * Set to true if running in Opera.
    */
  var opera: Boolean
  /**
    * Set to true if running in Safari.
    */
  var safari: Boolean
  /**
    * If running in Safari this will contain the major version number.
    */
  var safariVersion: Double
  /**
    * Set to true if running in the Silk browser (as used on the Amazon Kindle)
    */
  var silk: Boolean
  /**
    * Set to true if running a Trident version of Internet Explorer (IE11+)
    */
  var trident: Boolean
  /**
    * If running in Internet Explorer 11 this will contain the major version number. See {@link http://msdn.microsoft.com/en-us/library/ie/ms537503(v=vs.85).aspx}
    */
  var tridentVersion: Double
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
}


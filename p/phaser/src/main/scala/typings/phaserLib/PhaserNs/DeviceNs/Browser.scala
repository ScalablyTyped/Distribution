package typings
package phaserLib.PhaserNs.DeviceNs

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
  var chrome: scala.Boolean
  /**
    * If running in Chrome this will contain the major version number.
    */
  var chromeVersion: scala.Double
  /**
    * Set to true if running in Microsoft Edge browser.
    */
  var edge: scala.Boolean
  /**
    * Set to true if running in Firefox.
    */
  var firefox: scala.Boolean
  /**
    * If running in Firefox this will contain the major version number.
    */
  var firefoxVersion: scala.Double
  /**
    * Set to true if running in Internet Explorer 11 or less (not Edge).
    */
  var ie: scala.Boolean
  /**
    * If running in Internet Explorer this will contain the major version number. Beyond IE10 you should use Browser.trident and Browser.tridentVersion.
    */
  var ieVersion: scala.Double
  /**
    * Set to true if running in Mobile Safari.
    */
  var mobileSafari: scala.Boolean
  /**
    * Set to true if running in Opera.
    */
  var opera: scala.Boolean
  /**
    * Set to true if running in Safari.
    */
  var safari: scala.Boolean
  /**
    * If running in Safari this will contain the major version number.
    */
  var safariVersion: scala.Double
  /**
    * Set to true if running in the Silk browser (as used on the Amazon Kindle)
    */
  var silk: scala.Boolean
  /**
    * Set to true if running a Trident version of Internet Explorer (IE11+)
    */
  var trident: scala.Boolean
  /**
    * If running in Internet Explorer 11 this will contain the major version number. See {@link http://msdn.microsoft.com/en-us/library/ie/ms537503(v=vs.85).aspx}
    */
  var tridentVersion: scala.Double
}

object Browser {
  @scala.inline
  def apply(
    chrome: scala.Boolean,
    chromeVersion: scala.Double,
    edge: scala.Boolean,
    firefox: scala.Boolean,
    firefoxVersion: scala.Double,
    ie: scala.Boolean,
    ieVersion: scala.Double,
    mobileSafari: scala.Boolean,
    opera: scala.Boolean,
    safari: scala.Boolean,
    safariVersion: scala.Double,
    silk: scala.Boolean,
    trident: scala.Boolean,
    tridentVersion: scala.Double
  ): Browser = {
    val __obj = js.Dynamic.literal(chrome = chrome, chromeVersion = chromeVersion, edge = edge, firefox = firefox, firefoxVersion = firefoxVersion, ie = ie, ieVersion = ieVersion, mobileSafari = mobileSafari, opera = opera, safari = safari, safariVersion = safariVersion, silk = silk, trident = trident, tridentVersion = tridentVersion)
  
    __obj.asInstanceOf[Browser]
  }
}


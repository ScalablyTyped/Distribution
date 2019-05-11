package typings
package phaserLib.PhaserNs.DeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the operating system of the device running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.os` from within any Scene.
  */
trait OS extends js.Object {
  /**
    * Is running on android?
    */
  var android: scala.Boolean
  /**
    * Is running on chromeOS?
    */
  var chromeOS: scala.Boolean
  /**
    * Is the game running under Apache Cordova?
    */
  var cordova: scala.Boolean
  /**
    * Is the game running under the Intel Crosswalk XDK?
    */
  var crosswalk: scala.Boolean
  /**
    * Is running on a desktop?
    */
  var desktop: scala.Boolean
  /**
    * Is the game running under Ejecta?
    */
  var ejecta: scala.Boolean
  /**
    * Is the game running under GitHub Electron?
    */
  var electron: scala.Boolean
  /**
    * Is running on iOS?
    */
  var iOS: scala.Boolean
  /**
    * If running in iOS this will contain the major version number.
    */
  var iOSVersion: scala.Double
  /**
    * Is running on iPad?
    */
  var iPad: scala.Boolean
  /**
    * Is running on iPhone?
    */
  var iPhone: scala.Boolean
  /**
    * Is running on an Amazon Kindle?
    */
  var kindle: scala.Boolean
  /**
    * Is running on linux?
    */
  var linux: scala.Boolean
  /**
    * Is running on macOS?
    */
  var macOS: scala.Boolean
  /**
    * Is the game running under Node.js?
    */
  var node: scala.Boolean
  /**
    * Is the game running under Node-Webkit?
    */
  var nodeWebkit: scala.Boolean
  /**
    * PixelRatio of the host device?
    */
  var pixelRatio: scala.Double
  /**
    * Set to true if running as a WebApp, i.e. within a WebView
    */
  var webApp: scala.Boolean
  /**
    * Is running on windows?
    */
  var windows: scala.Boolean
  /**
    * Is running on a Windows Phone?
    */
  var windowsPhone: scala.Boolean
}

object OS {
  @scala.inline
  def apply(
    android: scala.Boolean,
    chromeOS: scala.Boolean,
    cordova: scala.Boolean,
    crosswalk: scala.Boolean,
    desktop: scala.Boolean,
    ejecta: scala.Boolean,
    electron: scala.Boolean,
    iOS: scala.Boolean,
    iOSVersion: scala.Double,
    iPad: scala.Boolean,
    iPhone: scala.Boolean,
    kindle: scala.Boolean,
    linux: scala.Boolean,
    macOS: scala.Boolean,
    node: scala.Boolean,
    nodeWebkit: scala.Boolean,
    pixelRatio: scala.Double,
    webApp: scala.Boolean,
    windows: scala.Boolean,
    windowsPhone: scala.Boolean
  ): OS = {
    val __obj = js.Dynamic.literal(android = android, chromeOS = chromeOS, cordova = cordova, crosswalk = crosswalk, desktop = desktop, ejecta = ejecta, electron = electron, iOS = iOS, iOSVersion = iOSVersion, iPad = iPad, iPhone = iPhone, kindle = kindle, linux = linux, macOS = macOS, node = node, nodeWebkit = nodeWebkit, pixelRatio = pixelRatio, webApp = webApp, windows = windows, windowsPhone = windowsPhone)
  
    __obj.asInstanceOf[OS]
  }
}


package typings.phaser.Phaser.Device

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
  var android: Boolean
  /**
    * Is running on chromeOS?
    */
  var chromeOS: Boolean
  /**
    * Is the game running under Apache Cordova?
    */
  var cordova: Boolean
  /**
    * Is the game running under the Intel Crosswalk XDK?
    */
  var crosswalk: Boolean
  /**
    * Is running on a desktop?
    */
  var desktop: Boolean
  /**
    * Is the game running under Ejecta?
    */
  var ejecta: Boolean
  /**
    * Is the game running under GitHub Electron?
    */
  var electron: Boolean
  /**
    * Is running on iOS?
    */
  var iOS: Boolean
  /**
    * If running in iOS this will contain the major version number.
    */
  var iOSVersion: Double
  /**
    * Is running on iPad?
    */
  var iPad: Boolean
  /**
    * Is running on iPhone?
    */
  var iPhone: Boolean
  /**
    * Is running on an Amazon Kindle?
    */
  var kindle: Boolean
  /**
    * Is running on linux?
    */
  var linux: Boolean
  /**
    * Is running on macOS?
    */
  var macOS: Boolean
  /**
    * Is the game running under Node.js?
    */
  var node: Boolean
  /**
    * Is the game running under Node-Webkit?
    */
  var nodeWebkit: Boolean
  /**
    * PixelRatio of the host device?
    */
  var pixelRatio: Double
  /**
    * Set to true if running as a WebApp, i.e. within a WebView
    */
  var webApp: Boolean
  /**
    * Is running on windows?
    */
  var windows: Boolean
  /**
    * Is running on a Windows Phone?
    */
  var windowsPhone: Boolean
}

object OS {
  @scala.inline
  def apply(
    android: Boolean,
    chromeOS: Boolean,
    cordova: Boolean,
    crosswalk: Boolean,
    desktop: Boolean,
    ejecta: Boolean,
    electron: Boolean,
    iOS: Boolean,
    iOSVersion: Double,
    iPad: Boolean,
    iPhone: Boolean,
    kindle: Boolean,
    linux: Boolean,
    macOS: Boolean,
    node: Boolean,
    nodeWebkit: Boolean,
    pixelRatio: Double,
    webApp: Boolean,
    windows: Boolean,
    windowsPhone: Boolean
  ): OS = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], chromeOS = chromeOS.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any], crosswalk = crosswalk.asInstanceOf[js.Any], desktop = desktop.asInstanceOf[js.Any], ejecta = ejecta.asInstanceOf[js.Any], electron = electron.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], iOSVersion = iOSVersion.asInstanceOf[js.Any], iPad = iPad.asInstanceOf[js.Any], iPhone = iPhone.asInstanceOf[js.Any], kindle = kindle.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any], macOS = macOS.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeWebkit = nodeWebkit.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], webApp = webApp.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any], windowsPhone = windowsPhone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OS]
  }
}


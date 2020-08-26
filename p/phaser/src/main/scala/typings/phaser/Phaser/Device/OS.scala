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
@js.native
trait OS extends js.Object {
  /**
    * Is running on android?
    */
  var android: Boolean = js.native
  /**
    * Is running on chromeOS?
    */
  var chromeOS: Boolean = js.native
  /**
    * Is the game running under Apache Cordova?
    */
  var cordova: Boolean = js.native
  /**
    * Is the game running under the Intel Crosswalk XDK?
    */
  var crosswalk: Boolean = js.native
  /**
    * Is running on a desktop?
    */
  var desktop: Boolean = js.native
  /**
    * Is the game running under Ejecta?
    */
  var ejecta: Boolean = js.native
  /**
    * Is the game running under GitHub Electron?
    */
  var electron: Boolean = js.native
  /**
    * Is running on iOS?
    */
  var iOS: Boolean = js.native
  /**
    * If running in iOS this will contain the major version number.
    */
  var iOSVersion: Double = js.native
  /**
    * Is running on iPad?
    */
  var iPad: Boolean = js.native
  /**
    * Is running on iPhone?
    */
  var iPhone: Boolean = js.native
  /**
    * Is running on an Amazon Kindle?
    */
  var kindle: Boolean = js.native
  /**
    * Is running on linux?
    */
  var linux: Boolean = js.native
  /**
    * Is running on macOS?
    */
  var macOS: Boolean = js.native
  /**
    * Is the game running under Node.js?
    */
  var node: Boolean = js.native
  /**
    * Is the game running under Node-Webkit?
    */
  var nodeWebkit: Boolean = js.native
  /**
    * PixelRatio of the host device?
    */
  var pixelRatio: Double = js.native
  /**
    * Set to true if running as a WebApp, i.e. within a WebView
    */
  var webApp: Boolean = js.native
  /**
    * Is running on windows?
    */
  var windows: Boolean = js.native
  /**
    * Is running on a Windows Phone?
    */
  var windowsPhone: Boolean = js.native
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
  @scala.inline
  implicit class OSOps[Self <: OS] (val x: Self) extends AnyVal {
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
    def setAndroid(value: Boolean): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def setChromeOS(value: Boolean): Self = this.set("chromeOS", value.asInstanceOf[js.Any])
    @scala.inline
    def setCordova(value: Boolean): Self = this.set("cordova", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrosswalk(value: Boolean): Self = this.set("crosswalk", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesktop(value: Boolean): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def setEjecta(value: Boolean): Self = this.set("ejecta", value.asInstanceOf[js.Any])
    @scala.inline
    def setElectron(value: Boolean): Self = this.set("electron", value.asInstanceOf[js.Any])
    @scala.inline
    def setIOS(value: Boolean): Self = this.set("iOS", value.asInstanceOf[js.Any])
    @scala.inline
    def setIOSVersion(value: Double): Self = this.set("iOSVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPad(value: Boolean): Self = this.set("iPad", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPhone(value: Boolean): Self = this.set("iPhone", value.asInstanceOf[js.Any])
    @scala.inline
    def setKindle(value: Boolean): Self = this.set("kindle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinux(value: Boolean): Self = this.set("linux", value.asInstanceOf[js.Any])
    @scala.inline
    def setMacOS(value: Boolean): Self = this.set("macOS", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Boolean): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeWebkit(value: Boolean): Self = this.set("nodeWebkit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebApp(value: Boolean): Self = this.set("webApp", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindows(value: Boolean): Self = this.set("windows", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowsPhone(value: Boolean): Self = this.set("windowsPhone", value.asInstanceOf[js.Any])
  }
  
}


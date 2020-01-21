package typings.peerDial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("peer-dial", "DialDevice")
@js.native
class DialDevice protected () extends js.Object {
  def this(deviceInfo: DeviceInfo) = this()
  def getAppInfo(appName: String): Unit = js.native
  def getAppInfo(appName: String, callback: js.Function2[/* data */ AppInfo, /* err */ js.Any, Unit]): Unit = js.native
  def getAppInfoXml(appName: String): Unit = js.native
  def getAppInfoXml(appName: String, callback: js.Function2[/* data */ String, /* err */ js.Any, Unit]): Unit = js.native
  def launchApp(appName: String, launchData: String, contentType: String): Unit = js.native
  def launchApp(
    appName: String,
    launchData: String,
    contentType: String,
    callback: js.Function2[/* data */ String, /* err */ js.Any, Unit]
  ): Unit = js.native
  def stopApp(appName: String, pid: String): Unit = js.native
  def stopApp(appName: String, pid: String, callback: js.Function2[/* data */ Double, /* err */ js.Any, Unit]): Unit = js.native
}


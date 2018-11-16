package typings
package peerDashDialLib.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("peer-dial", "DialDevice")
@js.native
class DialDevice protected () extends js.Object {
  def this(deviceInfo: DeviceInfo) = this()
  def getAppInfo(appName: java.lang.String): scala.Unit = js.native
  def getAppInfo(
    appName: java.lang.String,
    callback: js.Function2[/* data */ AppInfo, /* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getAppInfoXml(appName: java.lang.String): scala.Unit = js.native
  def getAppInfoXml(
    appName: java.lang.String,
    callback: js.Function2[/* data */ java.lang.String, /* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def launchApp(appName: java.lang.String, launchData: java.lang.String, contentType: java.lang.String): scala.Unit = js.native
  def launchApp(
    appName: java.lang.String,
    launchData: java.lang.String,
    contentType: java.lang.String,
    callback: js.Function2[/* data */ java.lang.String, /* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def stopApp(appName: java.lang.String, pid: java.lang.String): scala.Unit = js.native
  def stopApp(
    appName: java.lang.String,
    pid: java.lang.String,
    callback: js.Function2[/* data */ scala.Double, /* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}


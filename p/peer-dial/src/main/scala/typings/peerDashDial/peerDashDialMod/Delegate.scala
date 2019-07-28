package typings.peerDashDial.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  def getApp(appName: String): App
  def launchApp(appName: String, launchData: String, callback: js.Function1[/* data */ String, Unit]): Unit
  def stopApp(appName: String, pid: String, callback: js.Function1[/* data */ Boolean, Unit]): Unit
}

object Delegate {
  @scala.inline
  def apply(
    getApp: String => App,
    launchApp: (String, String, js.Function1[/* data */ String, Unit]) => Unit,
    stopApp: (String, String, js.Function1[/* data */ Boolean, Unit]) => Unit
  ): Delegate = {
    val __obj = js.Dynamic.literal(getApp = js.Any.fromFunction1(getApp), launchApp = js.Any.fromFunction3(launchApp), stopApp = js.Any.fromFunction3(stopApp))
  
    __obj.asInstanceOf[Delegate]
  }
}


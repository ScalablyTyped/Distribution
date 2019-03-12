package typings
package peerDashDialLib.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  def getApp(appName: java.lang.String): App
  def launchApp(
    appName: java.lang.String,
    launchData: java.lang.String,
    callback: js.Function1[/* data */ java.lang.String, scala.Unit]
  ): scala.Unit
  def stopApp(
    appName: java.lang.String,
    pid: java.lang.String,
    callback: js.Function1[/* data */ scala.Boolean, scala.Unit]
  ): scala.Unit
}

object Delegate {
  @scala.inline
  def apply(
    getApp: java.lang.String => App,
    launchApp: (java.lang.String, java.lang.String, js.Function1[/* data */ java.lang.String, scala.Unit]) => scala.Unit,
    stopApp: (java.lang.String, java.lang.String, js.Function1[/* data */ scala.Boolean, scala.Unit]) => scala.Unit
  ): Delegate = {
    val __obj = js.Dynamic.literal(getApp = js.Any.fromFunction1(getApp), launchApp = js.Any.fromFunction3(launchApp), stopApp = js.Any.fromFunction3(stopApp))
  
    __obj.asInstanceOf[Delegate]
  }
}


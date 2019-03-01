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
    getApp: js.Function1[java.lang.String, App],
    launchApp: js.Function3[
      java.lang.String, 
      java.lang.String, 
      js.Function1[/* data */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    stopApp: js.Function3[
      java.lang.String, 
      java.lang.String, 
      js.Function1[/* data */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ): Delegate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getApp")(getApp)
    __obj.updateDynamic("launchApp")(launchApp)
    __obj.updateDynamic("stopApp")(stopApp)
    __obj.asInstanceOf[Delegate]
  }
}


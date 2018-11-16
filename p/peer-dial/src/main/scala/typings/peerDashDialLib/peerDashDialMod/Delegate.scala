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


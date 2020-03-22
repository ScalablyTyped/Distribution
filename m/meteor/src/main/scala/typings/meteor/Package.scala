package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Package")
@js.native
object Package extends js.Object {
  def describe(options: AnonDebugOnly): Unit = js.native
  def onTest(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = js.native
  def onUse(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = js.native
  def registerBuildPlugin(): Unit = js.native
  def registerBuildPlugin(options: AnonName): Unit = js.native
}


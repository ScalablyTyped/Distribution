package typings
package meteorLib.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tools", "Package")
@js.native
object PackageNs extends js.Object {
  def describe(options: meteorLib.Anon_DebugOnly): scala.Unit = js.native
  def onTest(func: js.Function1[/* api */ meteorLib.toolsMod.PackageAPI, scala.Unit]): scala.Unit = js.native
  def onUse(func: js.Function1[/* api */ meteorLib.toolsMod.PackageAPI, scala.Unit]): scala.Unit = js.native
  def registerBuildPlugin(): scala.Unit = js.native
  def registerBuildPlugin(options: meteorLib.Anon_Name): scala.Unit = js.native
}


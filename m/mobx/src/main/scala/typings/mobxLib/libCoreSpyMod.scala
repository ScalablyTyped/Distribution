package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/spy", JSImport.Namespace)
@js.native
object libCoreSpyMod extends js.Object {
  def isSpyEnabled(): scala.Boolean = js.native
  def spy(listener: js.Function1[/* change */ js.Any, scala.Unit]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def spyReport(event: js.Any): scala.Unit = js.native
  def spyReportEnd(): scala.Unit = js.native
  def spyReportEnd(change: js.Any): scala.Unit = js.native
  def spyReportStart(event: js.Any): scala.Unit = js.native
}


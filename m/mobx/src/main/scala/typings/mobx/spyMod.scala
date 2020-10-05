package typings.mobx

import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/core/spy", JSImport.Namespace)
@js.native
object spyMod extends js.Object {
  def isSpyEnabled(): Boolean = js.native
  def spy(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = js.native
  def spyReport(event: js.Any): Unit = js.native
  def spyReportEnd(): Unit = js.native
  def spyReportEnd(change: js.Any): Unit = js.native
  def spyReportStart(event: js.Any): Unit = js.native
}


package typings.mobx

import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spyMod {
  
  @JSImport("mobx/lib/core/spy", "isSpyEnabled")
  @js.native
  def isSpyEnabled(): Boolean = js.native
  
  @JSImport("mobx/lib/core/spy", "spy")
  @js.native
  def spy(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = js.native
  
  @JSImport("mobx/lib/core/spy", "spyReport")
  @js.native
  def spyReport(event: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/core/spy", "spyReportEnd")
  @js.native
  def spyReportEnd(): Unit = js.native
  @JSImport("mobx/lib/core/spy", "spyReportEnd")
  @js.native
  def spyReportEnd(change: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/core/spy", "spyReportStart")
  @js.native
  def spyReportStart(event: js.Any): Unit = js.native
}

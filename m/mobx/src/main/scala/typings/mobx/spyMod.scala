package typings.mobx

import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spyMod {
  
  @JSImport("mobx/lib/core/spy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isSpyEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpyEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def spy(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(listener.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  @scala.inline
  def spyReport(event: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReport")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def spyReportEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportEnd")().asInstanceOf[Unit]
  @scala.inline
  def spyReportEnd(change: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportEnd")(change.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def spyReportStart(event: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportStart")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

package typings.mobx

import typings.mobx.anon.Arguments
import typings.mobx.anon.Error
import typings.mobx.anon.Name
import typings.mobx.anon.SpyReportEnd
import typings.mobx.anon.SpyReportStart
import typings.mobx.anon.Time
import typings.mobx.anon.Type
import typings.mobx.distCoreComputedvalueMod.IComputedDidChange
import typings.mobx.distTypesObservablearrayMod.IArrayDidChange
import typings.mobx.distTypesObservablemapMod.IMapDidChange
import typings.mobx.distTypesObservableobjectMod.IObjectDidChange
import typings.mobx.distTypesObservablesetMod.ISetDidChange
import typings.mobx.distTypesObservablevalueMod.IBoxDidChange
import typings.mobx.distTypesObservablevalueMod.IValueDidChange
import typings.mobx.distUtilsUtilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreSpyMod {
  
  @JSImport("mobx/dist/core/spy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSpyEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpyEnabled")().asInstanceOf[Boolean]
  
  inline def spy(listener: js.Function1[/* change */ SpyEvent, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(listener.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  inline def spyReport(event: SpyEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReport")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spyReportEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportEnd")().asInstanceOf[Unit]
  inline def spyReportEnd(change: Time): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportEnd")(change.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spyReportStart(event: PureSpyEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportStart")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type PureSpyEvent = Arguments | Name | Type | Error | IComputedDidChange[Any] | IObjectDidChange[Any] | IArrayDidChange[Any] | (IMapDidChange[Any, Any]) | ISetDidChange[Any] | IValueDidChange[Any] | IBoxDidChange[Any] | SpyReportEnd
  
  type SpyEvent = PureSpyEvent & SpyReportStart
}

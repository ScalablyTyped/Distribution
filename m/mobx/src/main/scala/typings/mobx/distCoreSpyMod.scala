package typings.mobx

import typings.mobx.anon.SpyReportStart
import typings.mobx.anon.Time
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.Arguments
    - typings.mobx.anon.Name
    - typings.mobx.anon.Type
    - typings.mobx.anon.Error
    - typings.mobx.distCoreComputedvalueMod.IComputedDidChange[scala.Any]
    - typings.mobx.distTypesObservableobjectMod.IObjectDidChange[scala.Any]
    - typings.mobx.distTypesObservablearrayMod.IArrayDidChange[scala.Any]
    - typings.mobx.distTypesObservablemapMod.IMapDidChange[scala.Any, scala.Any]
    - typings.mobx.distTypesObservablesetMod.ISetDidChange[scala.Any]
    - typings.mobx.distTypesObservablevalueMod.IValueDidChange[scala.Any]
    - typings.mobx.distTypesObservablevalueMod.IBoxDidChange[scala.Any]
    - typings.mobx.anon.SpyReportEnd
  */
  type PureSpyEvent = _PureSpyEvent | IComputedDidChange[Any] | IObjectDidChange[Any] | IArrayDidChange[Any] | (IMapDidChange[Any, Any]) | ISetDidChange[Any] | IValueDidChange[Any] | IBoxDidChange[Any]
  
  type SpyEvent = PureSpyEvent & SpyReportStart
  
  trait _PureSpyEvent extends StObject
  object _PureSpyEvent {
    
    inline def Arguments(arguments: js.Array[Any], name: String, `object`: Any): typings.mobx.anon.Arguments = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("action")
      __obj.asInstanceOf[typings.mobx.anon.Arguments]
    }
    
    inline def Error(error: String, message: String, name: String): typings.mobx.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[typings.mobx.anon.Error]
    }
    
    inline def Name(name: String): typings.mobx.anon.Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("scheduled-reaction")
      __obj.asInstanceOf[typings.mobx.anon.Name]
    }
    
    inline def SpyReportEnd(): typings.mobx.anon.SpyReportEnd = {
      val __obj = js.Dynamic.literal(spyReportEnd = true)
      __obj.updateDynamic("type")("report-end")
      __obj.asInstanceOf[typings.mobx.anon.SpyReportEnd]
    }
    
    inline def Type(name: String): typings.mobx.anon.Type = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("reaction")
      __obj.asInstanceOf[typings.mobx.anon.Type]
    }
  }
}

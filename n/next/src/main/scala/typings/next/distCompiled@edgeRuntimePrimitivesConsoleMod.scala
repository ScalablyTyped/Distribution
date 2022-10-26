package typings.next

import typings.next.anon.FnCallConditionData
import typings.next.anon.FnCallItemOptions
import typings.next.anon.FnCallLabel
import typings.next.anon.FnCallLabelData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesConsoleMod` {
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/console", "console")
  @js.native
  val console: IConsole = js.native
  
  trait IConsole extends StObject {
    
    var assert: FnCallConditionData
    
    var count: FnCallLabel
    
    var debug: js.Function1[/* repeated */ Any, Unit]
    
    var dir: FnCallItemOptions
    
    var error: js.Function1[/* repeated */ Any, Unit]
    
    var info: js.Function1[/* repeated */ Any, Unit]
    
    var log: js.Function1[/* repeated */ Any, Unit]
    
    var time: FnCallLabel
    
    var timeEnd: FnCallLabel
    
    var timeLog: FnCallLabelData
    
    var trace: js.Function1[/* repeated */ Any, Unit]
    
    var warn: js.Function1[/* repeated */ Any, Unit]
  }
  object IConsole {
    
    inline def apply(
      assert: FnCallConditionData,
      count: FnCallLabel,
      debug: /* repeated */ Any => Unit,
      dir: FnCallItemOptions,
      error: /* repeated */ Any => Unit,
      info: /* repeated */ Any => Unit,
      log: /* repeated */ Any => Unit,
      time: FnCallLabel,
      timeEnd: FnCallLabel,
      timeLog: FnCallLabelData,
      trace: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): IConsole = {
      val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], debug = js.Any.fromFunction1(debug), dir = dir.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), time = time.asInstanceOf[js.Any], timeEnd = timeEnd.asInstanceOf[js.Any], timeLog = timeLog.asInstanceOf[js.Any], trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[IConsole]
    }
    
    extension [Self <: IConsole](x: Self) {
      
      inline def setAssert(value: FnCallConditionData): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
      
      inline def setCount(value: FnCallLabel): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setDir(value: FnCallItemOptions): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setTime(value: FnCallLabel): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeEnd(value: FnCallLabel): Self = StObject.set(x, "timeEnd", value.asInstanceOf[js.Any])
      
      inline def setTimeLog(value: FnCallLabelData): Self = StObject.set(x, "timeLog", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: /* repeated */ Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
}

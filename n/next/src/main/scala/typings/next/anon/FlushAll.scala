package typings.next.anon

import typings.next.distTraceReportToJsonMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushAll extends StObject {
  
  def flushAll(): js.Promise[Unit]
  
  def report(event: Event): Unit
}
object FlushAll {
  
  inline def apply(flushAll: () => js.Promise[Unit], report: Event => Unit): FlushAll = {
    val __obj = js.Dynamic.literal(flushAll = js.Any.fromFunction0(flushAll), report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[FlushAll]
  }
  
  extension [Self <: FlushAll](x: Self) {
    
    inline def setFlushAll(value: () => js.Promise[Unit]): Self = StObject.set(x, "flushAll", js.Any.fromFunction0(value))
    
    inline def setReport(value: Event => Unit): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
  }
}

package typings.next

import typings.next.distTraceSharedMod.SpanId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTraceReportMod {
  
  @JSImport("next/dist/trace/report", "reporter")
  @js.native
  val reporter: MultiReporter = js.native
  
  @js.native
  trait MultiReporter
    extends StObject
       with Reporter_ {
    
    /* private */ var reporters: Any = js.native
  }
  
  @js.native
  trait Reporter_ extends StObject {
    
    def flushAll(): js.Promise[Unit] | Unit = js.native
    
    def report(spanName: String, duration: Double, timestamp: Double, id: SpanId): Unit = js.native
    def report(
      spanName: String,
      duration: Double,
      timestamp: Double,
      id: SpanId,
      parentId: Unit,
      attrs: js.Object
    ): Unit = js.native
    def report(
      spanName: String,
      duration: Double,
      timestamp: Double,
      id: SpanId,
      parentId: Unit,
      attrs: js.Object,
      startTime: Double
    ): Unit = js.native
    def report(
      spanName: String,
      duration: Double,
      timestamp: Double,
      id: SpanId,
      parentId: Unit,
      attrs: Unit,
      startTime: Double
    ): Unit = js.native
    def report(spanName: String, duration: Double, timestamp: Double, id: SpanId, parentId: SpanId): Unit = js.native
    def report(
      spanName: String,
      duration: Double,
      timestamp: Double,
      id: SpanId,
      parentId: SpanId,
      attrs: js.Object
    ): Unit = js.native
    def report(
      spanName: String,
      duration: Double,
      timestamp: Double,
      id: SpanId,
      parentId: SpanId,
      attrs: js.Object,
      startTime: Double
    ): Unit = js.native
    def report(
      spanName: String,
      duration: Double,
      timestamp: Double,
      id: SpanId,
      parentId: SpanId,
      attrs: Unit,
      startTime: Double
    ): Unit = js.native
  }
}

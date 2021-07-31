package typings.opentracing

import typings.opentracing.mockSpanMod.MockSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockReportMod {
  
  @JSImport("opentracing/lib/mock_tracer/mock_report", JSImport.Default)
  @js.native
  class default protected () extends MockReport {
    def this(spans: js.Array[MockSpan]) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer/mock_report", "MockReport")
  @js.native
  class MockReport protected () extends StObject {
    def this(spans: js.Array[MockSpan]) = this()
    
    var debugSpans: js.Any = js.native
    
    def firstSpanWithTagValue(key: String, `val`: js.Any): MockSpan | Null = js.native
    
    var spans: js.Array[MockSpan] = js.native
    
    var spansByTag: js.Any = js.native
    
    var spansByUUID: js.Any = js.native
    
    var unfinishedSpans: js.Any = js.native
  }
}

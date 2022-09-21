package typings.opentracing

import typings.opentracing.mockSpanMod.MockSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockReportMod {
  
  @JSImport("opentracing/lib/mock_tracer/mock_report", JSImport.Default)
  @js.native
  open class default protected () extends MockReport {
    def this(spans: js.Array[MockSpan]) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer/mock_report", "MockReport")
  @js.native
  open class MockReport protected () extends StObject {
    def this(spans: js.Array[MockSpan]) = this()
    
    /* private */ var debugSpans: Any = js.native
    
    def firstSpanWithTagValue(key: String, `val`: Any): MockSpan | Null = js.native
    
    var spans: js.Array[MockSpan] = js.native
    
    /* private */ var spansByTag: Any = js.native
    
    /* private */ var spansByUUID: Any = js.native
    
    /* private */ var unfinishedSpans: Any = js.native
  }
}

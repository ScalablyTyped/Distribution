package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpanContext extends StObject {
  
  /**
    * The resource name of the span. The format is: projects/[PROJECT_ID_OR_NUMBER]/traces/[TRACE_ID]/spans/[SPAN_ID] `[TRACE_ID]` is a unique identifier for a trace within a project; it
    * is a 32-character hexadecimal encoding of a 16-byte array. `[SPAN_ID]` is a unique identifier for a span within a trace; it is a 16-character hexadecimal encoding of an 8-byte
    * array.
    */
  var spanName: js.UndefOr[String] = js.undefined
}
object SpanContext {
  
  inline def apply(): SpanContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpanContext] (val x: Self) extends AnyVal {
    
    inline def setSpanName(value: String): Self = StObject.set(x, "spanName", value.asInstanceOf[js.Any])
    
    inline def setSpanNameUndefined: Self = StObject.set(x, "spanName", js.undefined)
  }
}

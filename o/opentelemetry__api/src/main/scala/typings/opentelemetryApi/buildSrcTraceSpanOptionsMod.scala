package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcCommonTimeMod.TimeInput
import typings.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typings.opentelemetryApi.buildSrcTraceLinkMod.Link
import typings.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceSpanOptionsMod {
  
  trait SpanOptions extends StObject {
    
    /** A span's attributes */
    var attributes: js.UndefOr[SpanAttributes] = js.undefined
    
    /**
      * The SpanKind of a span
      * @default {@link SpanKind.INTERNAL}
      */
    var kind: js.UndefOr[SpanKind] = js.undefined
    
    /** {@link Link}s span to other spans */
    var links: js.UndefOr[js.Array[Link]] = js.undefined
    
    /** The new span should be a root span. (Ignore parent from context). */
    var root: js.UndefOr[Boolean] = js.undefined
    
    /** A manually specified start time for the created `Span` object. */
    var startTime: js.UndefOr[TimeInput] = js.undefined
  }
  object SpanOptions {
    
    inline def apply(): SpanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpanOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpanOptions] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: SpanAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setKind(value: SpanKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setStartTime(value: TimeInput): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
}

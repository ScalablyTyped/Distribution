package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.buildSrcCommonTimeMod.HrTime
import typings.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typings.opentelemetryApi.buildSrcTraceLinkMod.Link
import typings.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typings.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind
import typings.opentelemetryApi.buildSrcTraceStatusMod.SpanStatus
import typings.opentelemetryCore.buildSrcCommonTypesMod.InstrumentationLibrary
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetrySdkTraceBase.buildSrcTimedEventMod.TimedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcExportReadableSpanMod {
  
  trait ReadableSpan extends StObject {
    
    val attributes: SpanAttributes
    
    val duration: HrTime
    
    val endTime: HrTime
    
    val ended: Boolean
    
    val events: js.Array[TimedEvent]
    
    val instrumentationLibrary: InstrumentationLibrary
    
    val kind: SpanKind
    
    val links: js.Array[Link]
    
    val name: String
    
    val parentSpanId: js.UndefOr[String] = js.undefined
    
    val resource: Resource
    
    def spanContext(): SpanContext
    
    val startTime: HrTime
    
    val status: SpanStatus
  }
  object ReadableSpan {
    
    inline def apply(
      attributes: SpanAttributes,
      duration: HrTime,
      endTime: HrTime,
      ended: Boolean,
      events: js.Array[TimedEvent],
      instrumentationLibrary: InstrumentationLibrary,
      kind: SpanKind,
      links: js.Array[Link],
      name: String,
      resource: Resource,
      spanContext: () => SpanContext,
      startTime: HrTime,
      status: SpanStatus
    ): ReadableSpan = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], instrumentationLibrary = instrumentationLibrary.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], spanContext = js.Any.fromFunction0(spanContext), startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadableSpan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadableSpan] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: SpanAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: HrTime): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEndTime(value: HrTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: js.Array[TimedEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: TimedEvent*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setInstrumentationLibrary(value: InstrumentationLibrary): Self = StObject.set(x, "instrumentationLibrary", value.asInstanceOf[js.Any])
      
      inline def setKind(value: SpanKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
      
      inline def setParentSpanIdUndefined: Self = StObject.set(x, "parentSpanId", js.undefined)
      
      inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSpanContext(value: () => SpanContext): Self = StObject.set(x, "spanContext", js.Any.fromFunction0(value))
      
      inline def setStartTime(value: HrTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SpanStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}

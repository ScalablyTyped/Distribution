package typings.opentelemetryTracing.readableSpanMod

import typings.opentelemetryApi.attributesMod.Attributes
import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanKindMod.SpanKind
import typings.opentelemetryApi.statusMod.Status
import typings.opentelemetryApi.timeMod.HrTime
import typings.opentelemetryApi.timedEventMod.TimedEvent
import typings.opentelemetryCore.typesMod.InstrumentationLibrary
import typings.opentelemetryResources.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableSpan extends js.Object {
  
  val attributes: Attributes = js.native
  
  val duration: HrTime = js.native
  
  val endTime: HrTime = js.native
  
  val ended: Boolean = js.native
  
  val events: js.Array[TimedEvent] = js.native
  
  val instrumentationLibrary: InstrumentationLibrary = js.native
  
  val kind: SpanKind = js.native
  
  val links: js.Array[Link] = js.native
  
  val name: String = js.native
  
  val parentSpanId: js.UndefOr[String] = js.native
  
  val resource: Resource = js.native
  
  val spanContext: SpanContext = js.native
  
  val startTime: HrTime = js.native
  
  val status: Status = js.native
}
object ReadableSpan {
  
  @scala.inline
  def apply(
    attributes: Attributes,
    duration: HrTime,
    endTime: HrTime,
    ended: Boolean,
    events: js.Array[TimedEvent],
    instrumentationLibrary: InstrumentationLibrary,
    kind: SpanKind,
    links: js.Array[Link],
    name: String,
    resource: Resource,
    spanContext: SpanContext,
    startTime: HrTime,
    status: Status
  ): ReadableSpan = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], instrumentationLibrary = instrumentationLibrary.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], spanContext = spanContext.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableSpan]
  }
  
  @scala.inline
  implicit class ReadableSpanOps[Self <: ReadableSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: HrTime): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: HrTime): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnded(value: Boolean): Self = this.set("ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: TimedEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[TimedEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentationLibrary(value: InstrumentationLibrary): Self = this.set("instrumentationLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: SpanKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanContext(value: SpanContext): Self = this.set("spanContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: HrTime): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSpanId(value: String): Self = this.set("parentSpanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSpanId: Self = this.set("parentSpanId", js.undefined)
  }
}

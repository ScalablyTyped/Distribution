package typings.opentelemetryApi

import typings.opentelemetryApi.attributesMod.Attributes
import typings.opentelemetryApi.exceptionMod.Exception
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.statusMod.Status
import typings.opentelemetryApi.timeMod.TimeInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanMod {
  
  @js.native
  trait Span extends StObject {
    
    /**
      * Adds an event to the Span.
      *
      * @param name the name of the event.
      * @param [attributesOrStartTime] the attributes that will be added; these are
      *     associated with this event. Can be also a start time
      *     if type is {@type TimeInput} and 3rd param is undefined
      * @param [startTime] start time of the event.
      */
    def addEvent(name: String): this.type = js.native
    def addEvent(name: String, attributesOrStartTime: js.UndefOr[TimeInput], startTime: TimeInput): this.type = js.native
    def addEvent(name: String, attributesOrStartTime: Attributes): this.type = js.native
    def addEvent(name: String, attributesOrStartTime: Attributes, startTime: TimeInput): this.type = js.native
    def addEvent(name: String, attributesOrStartTime: TimeInput): this.type = js.native
    
    /**
      * Returns the {@link SpanContext} object associated with this Span.
      *
      * Get an immutable, serializable identifier for this span that can be used
      * to create new child spans. Returned SpanContext is usable even after the
      * span ends.
      *
      * @returns the SpanContext object associated with this Span.
      */
    def context(): SpanContext = js.native
    
    /**
      * Marks the end of Span execution.
      *
      * Call to End of a Span MUST not have any effects on child spans. Those may
      * still be running and can be ended later.
      *
      * Do not return `this`. The Span generally should not be used after it
      * is ended so chaining is not desired in this context.
      *
      * @param [endTime] the time to set as Span's end time. If not provided,
      *     use the current time as the span's end time.
      */
    def end(): Unit = js.native
    def end(endTime: TimeInput): Unit = js.native
    
    /**
      * Returns the flag whether this span will be recorded.
      *
      * @returns true if this Span is active and recording information like events
      *     with the `AddEvent` operation and attributes using `setAttributes`.
      */
    def isRecording(): Boolean = js.native
    
    /**
      * Sets exception as a span event
      * @param exception the exception the only accepted values are string or Error
      * @param [time] the time to set as Span's event time. If not provided,
      *     use the current time.
      */
    def recordException(exception: Exception): Unit = js.native
    def recordException(exception: Exception, time: TimeInput): Unit = js.native
    
    /**
      * Sets an attribute to the span.
      *
      * Sets a single Attribute with the key and value passed as arguments.
      *
      * @param key the key for this attribute.
      * @param value the value for this attribute.
      */
    def setAttribute(key: String, value: js.Any): this.type = js.native
    
    /**
      * Sets attributes to the span.
      *
      * @param attributes the attributes that will be added.
      */
    def setAttributes(attributes: Attributes): this.type = js.native
    
    /**
      * Sets a status to the span. If used, this will override the default Span
      * status. Default is {@link CanonicalCode.OK}. SetStatus overrides the value
      * of previous calls to SetStatus on the Span.
      *
      * @param status the Status to set.
      */
    def setStatus(status: Status): this.type = js.native
    
    /**
      * Updates the Span name.
      *
      * This will override the name provided via {@link Tracer.startSpan}.
      *
      * Upon this update, any sampling behavior based on Span name will depend on
      * the implementation.
      *
      * @param name the Span name.
      */
    def updateName(name: String): this.type = js.native
  }
}

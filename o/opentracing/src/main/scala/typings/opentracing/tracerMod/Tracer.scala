package typings.opentracing.tracerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/tracer", "Tracer")
@js.native
class Tracer () extends js.Object {
  /* protected */ def _extract(format: String, carrier: js.Any): typings.opentracing.spanContextMod.default | Null = js.native
  /* protected */ def _inject(spanContext: typings.opentracing.spanContextMod.default, format: String, carrier: js.Any): Unit = js.native
  /* protected */ def _startSpan(name: String, fields: SpanOptions): typings.opentracing.spanMod.default = js.native
  /**
    * Returns a SpanContext instance extracted from `carrier` in the given
    * `format`.
    *
    * OpenTracing defines a common set of `format` values (see
    * FORMAT_TEXT_MAP, FORMAT_HTTP_HEADERS, and FORMAT_BINARY), and each has
    * an expected carrier type.
    *
    * Consider this pseudocode example:
    *
    *     // Use the inbound HTTP request's headers as a text map carrier.
    *     var headersCarrier = inboundHTTPReq.headers;
    *     var wireCtx = Tracer.extract(Tracer.FORMAT_HTTP_HEADERS, headersCarrier);
    *     var serverSpan = Tracer.startSpan('...', { childOf : wireCtx });
    *
    * @param  {string} format - the format of the carrier.
    * @param  {any} carrier - the type of the carrier object is determined by
    *         the format.
    * @return {SpanContext}
    *         The extracted SpanContext, or null if no such SpanContext could
    *         be found in `carrier`
    */
  def extract(format: String, carrier: js.Any): typings.opentracing.spanContextMod.default | Null = js.native
  /**
    * Injects the given SpanContext instance for cross-process propagation
    * within `carrier`. The expected type of `carrier` depends on the value of
    * `format.
    *
    * OpenTracing defines a common set of `format` values (see
    * FORMAT_TEXT_MAP, FORMAT_HTTP_HEADERS, and FORMAT_BINARY), and each has
    * an expected carrier type.
    *
    * Consider this pseudocode example:
    *
    *     var clientSpan = ...;
    *     ...
    *     // Inject clientSpan into a text carrier.
    *     var headersCarrier = {};
    *     Tracer.inject(clientSpan.context(), Tracer.FORMAT_HTTP_HEADERS, headersCarrier);
    *     // Incorporate the textCarrier into the outbound HTTP request header
    *     // map.
    *     Object.assign(outboundHTTPReq.headers, headersCarrier);
    *     // ... send the httpReq
    *
    * @param  {SpanContext} spanContext - the SpanContext to inject into the
    *         carrier object. As a convenience, a Span instance may be passed
    *         in instead (in which case its .context() is used for the
    *         inject()).
    * @param  {string} format - the format of the carrier.
    * @param  {any} carrier - see the documentation for the chosen `format`
    *         for a description of the carrier object.
    */
  def inject(spanContext: typings.opentracing.spanContextMod.default, format: String, carrier: js.Any): Unit = js.native
  def inject(spanContext: typings.opentracing.spanMod.default, format: String, carrier: js.Any): Unit = js.native
  /**
    * Starts and returns a new Span representing a logical unit of work.
    *
    * For example:
    *
    *     // Start a new (parentless) root Span:
    *     var parent = Tracer.startSpan('DoWork');
    *
    *     // Start a new (child) Span:
    *     var child = Tracer.startSpan('load-from-db', {
    *         childOf: parent.context(),
    *     });
    *
    *     // Start a new async (FollowsFrom) Span:
    *     var child = Tracer.startSpan('async-cache-write', {
    *         references: [
    *             opentracing.followsFrom(parent.context())
    *         ],
    *     });
    *
    * @param {string} name - the name of the operation (REQUIRED).
    * @param {SpanOptions} [options] - options for the newly created span.
    * @return {Span} - a new Span object.
    */
  def startSpan(name: String): typings.opentracing.spanMod.default = js.native
  def startSpan(name: String, options: SpanOptions): typings.opentracing.spanMod.default = js.native
}


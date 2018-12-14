package typings
package opentracingLib.libSpanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/span", "Span")
@js.native
class Span () extends js.Object {
  /* protected */ def _addTags(keyValuePairs: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /* protected */ def _context(): opentracingLib.libSpanUnderscoreContextMod.default = js.native
  /* protected */ def _finish(): scala.Unit = js.native
  /* protected */ def _finish(finishTime: scala.Double): scala.Unit = js.native
  /* protected */ def _getBaggageItem(key: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /* protected */ def _log(keyValuePairs: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /* protected */ def _log(keyValuePairs: org.scalablytyped.runtime.StringDictionary[js.Any], timestamp: scala.Double): scala.Unit = js.native
  /* protected */ def _setBaggageItem(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /* protected */ def _setOperationName(name: java.lang.String): scala.Unit = js.native
  /* protected */ def _tracer(): opentracingLib.libTracerMod.default = js.native
  /**
       * Adds the given key value pairs to the set of span tags.
       *
       * Multiple calls to addTags() results in the tags being the superset of
       * all calls.
       *
       * The behavior of setting the same key multiple times on the same span
       * is undefined.
       *
       * The supported type of the values is implementation-dependent.
       * Implementations are expected to safely handle all types of values but
       * may choose to ignore unrecognized / unhandle-able values (e.g. objects
       * with cyclic references, function objects).
       *
       * @return {[type]} [description]
       */
  def addTags(keyValueMap: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
       * Returns the SpanContext object associated with this Span.
       *
       * @return {SpanContext}
       */
  def context(): opentracingLib.libSpanUnderscoreContextMod.default = js.native
  /**
       * Sets the end timestamp and finalizes Span state.
       *
       * With the exception of calls to Span.context() (which are always allowed),
       * finish() must be the last call made to any span instance, and to do
       * otherwise leads to undefined behavior.
       *
       * @param  {number} finishTime
       *         Optional finish time in milliseconds as a Unix timestamp. Decimal
       *         values are supported for timestamps with sub-millisecond accuracy.
       *         If not specified, the current time (as defined by the
       *         implementation) will be used.
       */
  def finish(): scala.Unit = js.native
  /**
       * Sets the end timestamp and finalizes Span state.
       *
       * With the exception of calls to Span.context() (which are always allowed),
       * finish() must be the last call made to any span instance, and to do
       * otherwise leads to undefined behavior.
       *
       * @param  {number} finishTime
       *         Optional finish time in milliseconds as a Unix timestamp. Decimal
       *         values are supported for timestamps with sub-millisecond accuracy.
       *         If not specified, the current time (as defined by the
       *         implementation) will be used.
       */
  def finish(finishTime: scala.Double): scala.Unit = js.native
  /**
       * Returns the value for a baggage item given its key.
       *
       * @param  {string} key
       *         The key for the given trace attribute.
       * @return {string}
       *         String value for the given key, or undefined if the key does not
       *         correspond to a set trace attribute.
       */
  def getBaggageItem(key: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
       * Add a log record to this Span, optionally at a user-provided timestamp.
       *
       * For example:
       *
       *     span.log({
       *         size: rpc.size(),  // numeric value
       *         URI: rpc.URI(),  // string value
       *         payload: rpc.payload(),  // Object value
       *         "keys can be arbitrary strings": rpc.foo(),
       *     });
       *
       *     span.log({
       *         "error.description": someError.description(),
       *     }, someError.timestampMillis());
       *
       * @param {object} keyValuePairs
       *        An object mapping string keys to arbitrary value types. All
       *        Tracer implementations should support bool, string, and numeric
       *        value types, and some may also support Object values.
       * @param {number} timestamp
       *        An optional parameter specifying the timestamp in milliseconds
       *        since the Unix epoch. Fractional values are allowed so that
       *        timestamps with sub-millisecond accuracy can be represented. If
       *        not specified, the implementation is expected to use its notion
       *        of the current time of the call.
       */
  def log(keyValuePairs: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
       * Add a log record to this Span, optionally at a user-provided timestamp.
       *
       * For example:
       *
       *     span.log({
       *         size: rpc.size(),  // numeric value
       *         URI: rpc.URI(),  // string value
       *         payload: rpc.payload(),  // Object value
       *         "keys can be arbitrary strings": rpc.foo(),
       *     });
       *
       *     span.log({
       *         "error.description": someError.description(),
       *     }, someError.timestampMillis());
       *
       * @param {object} keyValuePairs
       *        An object mapping string keys to arbitrary value types. All
       *        Tracer implementations should support bool, string, and numeric
       *        value types, and some may also support Object values.
       * @param {number} timestamp
       *        An optional parameter specifying the timestamp in milliseconds
       *        since the Unix epoch. Fractional values are allowed so that
       *        timestamps with sub-millisecond accuracy can be represented. If
       *        not specified, the implementation is expected to use its notion
       *        of the current time of the call.
       */
  def log(keyValuePairs: org.scalablytyped.runtime.StringDictionary[js.Any], timestamp: scala.Double): this.type = js.native
  /**
       * DEPRECATED
       */
  def logEvent(eventName: java.lang.String, payload: js.Any): scala.Unit = js.native
  /**
       * Sets a key:value pair on this Span that also propagates to future
       * children of the associated Span.
       *
       * setBaggageItem() enables powerful functionality given a full-stack
       * opentracing integration (e.g., arbitrary application data from a web
       * client can make it, transparently, all the way into the depths of a
       * storage system), and with it some powerful costs: use this feature with
       * care.
       *
       * IMPORTANT NOTE #1: setBaggageItem() will only propagate baggage items to
       * *future* causal descendants of the associated Span.
       *
       * IMPORTANT NOTE #2: Use this thoughtfully and with care. Every key and
       * value is copied into every local *and remote* child of the associated
       * Span, and that can add up to a lot of network and cpu overhead.
       *
       * @param {string} key
       * @param {string} value
       */
  def setBaggageItem(key: java.lang.String, value: java.lang.String): this.type = js.native
  /**
       * Sets the string name for the logical operation this span represents.
       *
       * @param {string} name
       */
  def setOperationName(name: java.lang.String): this.type = js.native
  /**
       * Adds a single tag to the span.  See `addTags()` for details.
       *
       * @param {string} key
       * @param {any} value
       */
  def setTag(key: java.lang.String, value: js.Any): this.type = js.native
  /**
       * Returns the Tracer object used to create this Span.
       *
       * @return {Tracer}
       */
  def tracer(): opentracingLib.libTracerMod.default = js.native
}


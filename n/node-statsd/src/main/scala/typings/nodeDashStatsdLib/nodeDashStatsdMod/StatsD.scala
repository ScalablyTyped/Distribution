package typings
package nodeDashStatsdLib.nodeDashStatsdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-statsd", "StatsD")
@js.native
class StatsD protected () extends js.Object {
  /**
     * The UDP Client for StatsD
     *   @option {string} host         The host to connect to default: localhost
     *   @option port        {String|Integer} The port to connect to default: 8125
     *   @option {string} prefix       An optional prefix to assign to each stat name sent
     *   @option {string} suffix       An optional suffix to assign to each stat name sent
     *   @option globalize   {boolean} An optional boolean to add "statsd" as an object in the global namespace
     *   @option cacheDns    {boolean} An optional option to only lookup the hostname -> ip address once
     *   @option mock        {boolean} An optional boolean indicating this Client is a mock object, no stats are sent.
     *   @option {string[]} global_tags Optional tags that will be added to every metric
     */
  def this(config: StatsDConfig) = this()
  def this(host: js.UndefOr[java.lang.String], port: js.UndefOr[scala.Double], prefix: js.UndefOr[java.lang.String], suffix: js.UndefOr[java.lang.String], globalize: js.UndefOr[scala.Boolean], cacheDns: js.UndefOr[scala.Boolean], mock: js.UndefOr[scala.Boolean], global_tags: js.UndefOr[js.Array[java.lang.String]]) = this()
  var cacheDns: scala.Boolean = js.native
  var global_tags: js.Array[java.lang.String] = js.native
  var host: java.lang.String = js.native
  var mock: scala.Boolean = js.native
  var port: scala.Double = js.native
  var prefix: java.lang.String = js.native
  var socket: nodeLib.dgramMod.Socket = js.native
  var suffix: java.lang.String = js.native
  /**
     * Close the underlying socket and stop listening for data on it.
     */
  def close(): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(stat: java.lang.String): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(stat: java.lang.String, value: scala.Double): scala.Unit = js.native
  def decrement(stat: java.lang.String, value: scala.Double, callback: Callback): scala.Unit = js.native
  def decrement(stat: java.lang.String, value: scala.Double, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def decrement(
    stat: java.lang.String,
    value: scala.Double,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def decrement(stat: java.lang.String, value: scala.Double, sampleRateOrTags: scala.Double, callback: Callback): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(stat: java.lang.String, value: scala.Double, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(
    stat: java.lang.String,
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(
    stat: java.lang.String,
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(stat: js.Array[java.lang.String]): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(stat: js.Array[java.lang.String], value: scala.Double): scala.Unit = js.native
  def decrement(stat: js.Array[java.lang.String], value: scala.Double, callback: Callback): scala.Unit = js.native
  def decrement(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRateOrTags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def decrement(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def decrement(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(stat: js.Array[java.lang.String], value: scala.Double, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Decrements a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def decrement(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Gauges a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def gauge(stat: java.lang.String, value: scala.Double): scala.Unit = js.native
  def gauge(stat: java.lang.String, value: scala.Double, callback: Callback): scala.Unit = js.native
  def gauge(stat: java.lang.String, value: scala.Double, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def gauge(
    stat: java.lang.String,
    value: scala.Double,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def gauge(stat: java.lang.String, value: scala.Double, sampleRateOrTags: scala.Double, callback: Callback): scala.Unit = js.native
  /**
     * Gauges a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def gauge(stat: java.lang.String, value: scala.Double, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Gauges a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def gauge(
    stat: java.lang.String,
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Gauges a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def gauge(
    stat: java.lang.String,
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Gauges a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def gauge(stat: js.Array[java.lang.String], value: scala.Double): scala.Unit = js.native
  def gauge(stat: js.Array[java.lang.String], value: scala.Double, callback: Callback): scala.Unit = js.native
  def gauge(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRateOrTags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def gauge(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def gauge(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Gauges a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def gauge(stat: js.Array[java.lang.String], value: scala.Double, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Gauges a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def gauge(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Gauges a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def gauge(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Represents the histogram stat
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def histogram(stat: java.lang.String, value: js.Any): scala.Unit = js.native
  def histogram(stat: java.lang.String, value: js.Any, callback: Callback): scala.Unit = js.native
  def histogram(stat: java.lang.String, value: js.Any, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def histogram(
    stat: java.lang.String,
    value: js.Any,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def histogram(stat: java.lang.String, value: js.Any, sampleRateOrTags: scala.Double, callback: Callback): scala.Unit = js.native
  /**
     * Represents the histogram stat
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def histogram(stat: java.lang.String, value: js.Any, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Represents the histogram stat
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def histogram(stat: java.lang.String, value: js.Any, sampleRate: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  /**
     * Represents the histogram stat
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def histogram(
    stat: java.lang.String,
    value: js.Any,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Represents the histogram stat
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def histogram(stat: js.Array[java.lang.String], value: js.Any): scala.Unit = js.native
  def histogram(stat: js.Array[java.lang.String], value: js.Any, callback: Callback): scala.Unit = js.native
  def histogram(stat: js.Array[java.lang.String], value: js.Any, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def histogram(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def histogram(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Represents the histogram stat
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def histogram(stat: js.Array[java.lang.String], value: js.Any, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Represents the histogram stat
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def histogram(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Represents the histogram stat
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def histogram(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(stat: java.lang.String): scala.Unit = js.native
  def increment(stat: java.lang.String, value: js.Any): scala.Unit = js.native
  def increment(stat: java.lang.String, value: js.Any, callback: Callback): scala.Unit = js.native
  def increment(stat: java.lang.String, value: js.Any, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def increment(
    stat: java.lang.String,
    value: js.Any,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def increment(stat: java.lang.String, value: js.Any, sampleRateOrTags: scala.Double): scala.Unit = js.native
  def increment(stat: java.lang.String, value: js.Any, sampleRateOrTags: scala.Double, callback: Callback): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(stat: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(stat: java.lang.String, value: scala.Double, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(
    stat: java.lang.String,
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(
    stat: java.lang.String,
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(stat: js.Array[java.lang.String]): scala.Unit = js.native
  def increment(stat: js.Array[java.lang.String], value: js.Any): scala.Unit = js.native
  def increment(stat: js.Array[java.lang.String], value: js.Any, callback: Callback): scala.Unit = js.native
  def increment(stat: js.Array[java.lang.String], value: js.Any, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def increment(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def increment(stat: js.Array[java.lang.String], value: js.Any, sampleRateOrTags: scala.Double): scala.Unit = js.native
  def increment(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(stat: js.Array[java.lang.String], value: scala.Double): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(stat: js.Array[java.lang.String], value: scala.Double, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Increments a stat by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def increment(
    stat: js.Array[java.lang.String],
    value: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Sends a stat across the wire
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of message to send to statsd
     * @param sampleRate The Number of times to sample (0 to 1)
     * @param tags The Array of tags to add to metrics
     * @param callback Callback when message is done being delivered. Optional.
     */
  def send(stat: java.lang.String, value: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def send(stat: java.lang.String, value: js.Any, `type`: java.lang.String, callback: Callback): scala.Unit = js.native
  def send(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def send(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def send(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Sends a stat across the wire
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of message to send to statsd
     * @param sampleRate The Number of times to sample (0 to 1)
     * @param tags The Array of tags to add to metrics
     * @param callback Callback when message is done being delivered. Optional.
     */
  def send(stat: java.lang.String, value: js.Any, `type`: java.lang.String, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Sends a stat across the wire
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of message to send to statsd
     * @param sampleRate The Number of times to sample (0 to 1)
     * @param tags The Array of tags to add to metrics
     * @param callback Callback when message is done being delivered. Optional.
     */
  def send(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Sends a stat across the wire
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of message to send to statsd
     * @param sampleRate The Number of times to sample (0 to 1)
     * @param tags The Array of tags to add to metrics
     * @param callback Callback when message is done being delivered. Optional.
     */
  def send(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Sends a stat across the wire
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of message to send to statsd
     * @param sampleRate The Number of times to sample (0 to 1)
     * @param tags The Array of tags to add to metrics
     * @param callback Callback when message is done being delivered. Optional.
     */
  def send(stat: js.Array[java.lang.String], value: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def send(stat: js.Array[java.lang.String], value: js.Any, `type`: java.lang.String, callback: Callback): scala.Unit = js.native
  def send(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def send(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def send(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Sends a stat across the wire
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of message to send to statsd
     * @param sampleRate The Number of times to sample (0 to 1)
     * @param tags The Array of tags to add to metrics
     * @param callback Callback when message is done being delivered. Optional.
     */
  def send(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double
  ): scala.Unit = js.native
  /**
     * Sends a stat across the wire
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of message to send to statsd
     * @param sampleRate The Number of times to sample (0 to 1)
     * @param tags The Array of tags to add to metrics
     * @param callback Callback when message is done being delivered. Optional.
     */
  def send(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Sends a stat across the wire
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of message to send to statsd
     * @param sampleRate The Number of times to sample (0 to 1)
     * @param tags The Array of tags to add to metrics
     * @param callback Callback when message is done being delivered. Optional.
     */
  def send(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Checks if stats is an array and sends all stats calling back once all have sent
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of metric to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def sendAll(stat: java.lang.String, value: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def sendAll(stat: java.lang.String, value: js.Any, `type`: java.lang.String, callback: Callback): scala.Unit = js.native
  def sendAll(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def sendAll(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def sendAll(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Checks if stats is an array and sends all stats calling back once all have sent
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of metric to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def sendAll(stat: java.lang.String, value: js.Any, `type`: java.lang.String, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Checks if stats is an array and sends all stats calling back once all have sent
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of metric to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def sendAll(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Checks if stats is an array and sends all stats calling back once all have sent
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of metric to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def sendAll(
    stat: java.lang.String,
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Checks if stats is an array and sends all stats calling back once all have sent
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of metric to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def sendAll(stat: js.Array[java.lang.String], value: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def sendAll(stat: js.Array[java.lang.String], value: js.Any, `type`: java.lang.String, callback: Callback): scala.Unit = js.native
  def sendAll(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def sendAll(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def sendAll(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Checks if stats is an array and sends all stats calling back once all have sent
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of metric to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def sendAll(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double
  ): scala.Unit = js.native
  /**
     * Checks if stats is an array and sends all stats calling back once all have sent
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of metric to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def sendAll(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Checks if stats is an array and sends all stats calling back once all have sent
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param type The type of metric to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def sendAll(
    stat: js.Array[java.lang.String],
    value: js.Any,
    `type`: java.lang.String,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * See StatsD.unique
     */
  def set(stat: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(stat: java.lang.String, value: js.Any, callback: Callback): scala.Unit = js.native
  def set(stat: java.lang.String, value: js.Any, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def set(
    stat: java.lang.String,
    value: js.Any,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def set(stat: java.lang.String, value: js.Any, sampleRateOrTags: scala.Double, callback: Callback): scala.Unit = js.native
  /**
     * See StatsD.unique
     */
  def set(stat: java.lang.String, value: js.Any, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * See StatsD.unique
     */
  def set(stat: java.lang.String, value: js.Any, sampleRate: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  /**
     * See StatsD.unique
     */
  def set(
    stat: java.lang.String,
    value: js.Any,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * See StatsD.unique
     */
  def set(stat: js.Array[java.lang.String], value: js.Any): scala.Unit = js.native
  def set(stat: js.Array[java.lang.String], value: js.Any, callback: Callback): scala.Unit = js.native
  def set(stat: js.Array[java.lang.String], value: js.Any, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def set(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def set(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * See StatsD.unique
     */
  def set(stat: js.Array[java.lang.String], value: js.Any, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * See StatsD.unique
     */
  def set(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * See StatsD.unique
     */
  def set(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Represents the timing stat
     * @param stat The stat(s) to send
     * @param time The time in milliseconds to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def timing(stat: java.lang.String, time: scala.Double): scala.Unit = js.native
  def timing(stat: java.lang.String, time: scala.Double, callback: Callback): scala.Unit = js.native
  def timing(stat: java.lang.String, time: scala.Double, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def timing(
    stat: java.lang.String,
    time: scala.Double,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def timing(stat: java.lang.String, time: scala.Double, sampleRateOrTags: scala.Double, callback: Callback): scala.Unit = js.native
  /**
     * Represents the timing stat
     * @param stat The stat(s) to send
     * @param time The time in milliseconds to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def timing(stat: java.lang.String, time: scala.Double, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Represents the timing stat
     * @param stat The stat(s) to send
     * @param time The time in milliseconds to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def timing(
    stat: java.lang.String,
    time: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Represents the timing stat
     * @param stat The stat(s) to send
     * @param time The time in milliseconds to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def timing(
    stat: java.lang.String,
    time: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Represents the timing stat
     * @param stat The stat(s) to send
     * @param time The time in milliseconds to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def timing(stat: js.Array[java.lang.String], time: scala.Double): scala.Unit = js.native
  def timing(stat: js.Array[java.lang.String], time: scala.Double, callback: Callback): scala.Unit = js.native
  def timing(stat: js.Array[java.lang.String], time: scala.Double, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def timing(
    stat: js.Array[java.lang.String],
    time: scala.Double,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def timing(
    stat: js.Array[java.lang.String],
    time: scala.Double,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Represents the timing stat
     * @param stat The stat(s) to send
     * @param time The time in milliseconds to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def timing(stat: js.Array[java.lang.String], time: scala.Double, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Represents the timing stat
     * @param stat The stat(s) to send
     * @param time The time in milliseconds to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def timing(
    stat: js.Array[java.lang.String],
    time: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Represents the timing stat
     * @param stat The stat(s) to send
     * @param time The time in milliseconds to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def timing(
    stat: js.Array[java.lang.String],
    time: scala.Double,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Counts unique values by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def unique(stat: java.lang.String, value: js.Any): scala.Unit = js.native
  def unique(stat: java.lang.String, value: js.Any, callback: Callback): scala.Unit = js.native
  def unique(stat: java.lang.String, value: js.Any, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def unique(
    stat: java.lang.String,
    value: js.Any,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def unique(stat: java.lang.String, value: js.Any, sampleRateOrTags: scala.Double, callback: Callback): scala.Unit = js.native
  /**
     * Counts unique values by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def unique(stat: java.lang.String, value: js.Any, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Counts unique values by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def unique(stat: java.lang.String, value: js.Any, sampleRate: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  /**
     * Counts unique values by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def unique(
    stat: java.lang.String,
    value: js.Any,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Counts unique values by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def unique(stat: js.Array[java.lang.String], value: js.Any): scala.Unit = js.native
  def unique(stat: js.Array[java.lang.String], value: js.Any, callback: Callback): scala.Unit = js.native
  def unique(stat: js.Array[java.lang.String], value: js.Any, sampleRateOrTags: js.Array[java.lang.String]): scala.Unit = js.native
  def unique(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRateOrTags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
  def unique(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRateOrTags: scala.Double,
    callback: Callback
  ): scala.Unit = js.native
  /**
     * Counts unique values by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def unique(stat: js.Array[java.lang.String], value: js.Any, sampleRate: scala.Double): scala.Unit = js.native
  /**
     * Counts unique values by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def unique(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
     * Counts unique values by a specified amount
     * @param stat The stat(s) to send
     * @param value The value to send
     * @param sampleRate The Number of times to sample (0 to 1). Optional.
     * @param tags The Array of tags to add to metrics. Optional.
     * @param callback Callback when message is done being delivered. Optional.
     */
  def unique(
    stat: js.Array[java.lang.String],
    value: js.Any,
    sampleRate: scala.Double,
    tags: js.Array[java.lang.String],
    callback: Callback
  ): scala.Unit = js.native
}


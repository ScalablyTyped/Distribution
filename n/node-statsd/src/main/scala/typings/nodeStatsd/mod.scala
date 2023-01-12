package typings.nodeStatsd

import typings.node.bufferMod.global.Buffer
import typings.node.dgramMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-statsd", "StatsD")
  @js.native
  open class StatsD protected () extends StObject {
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
    def this(
      host: js.UndefOr[String],
      port: js.UndefOr[Double],
      prefix: js.UndefOr[String],
      suffix: js.UndefOr[String],
      globalize: js.UndefOr[Boolean],
      cacheDns: js.UndefOr[Boolean],
      mock: js.UndefOr[Boolean],
      global_tags: js.UndefOr[js.Array[String]]
    ) = this()
    
    var cacheDns: Boolean = js.native
    
    /**
      * Close the underlying socket and stop listening for data on it.
      */
    def close(): Unit = js.native
    
    /**
      * Decrements a stat by a specified amount
      * @param stat The stat(s) to send
      * @param value The value to send
      * @param sampleRate The Number of times to sample (0 to 1). Optional.
      * @param tags The Array of tags to add to metrics. Optional.
      * @param callback Callback when message is done being delivered. Optional.
      */
    def decrement(stat: String): Unit = js.native
    def decrement(stat: String, value: Double): Unit = js.native
    def decrement(stat: String, value: Double, callback: Callback): Unit = js.native
    def decrement(stat: String, value: Double, sampleRateOrTags: js.Array[String]): Unit = js.native
    def decrement(stat: String, value: Double, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def decrement(stat: String, value: Double, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def decrement(stat: String, value: Double, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: String, value: Unit, callback: Callback): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRateOrTags: js.Array[String]): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRate: Double): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def decrement(stat: String, value: Unit, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String]): Unit = js.native
    def decrement(stat: js.Array[String], value: Double): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRateOrTags: js.Array[String]): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def decrement(
      stat: js.Array[String],
      value: Double,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def decrement(
      stat: js.Array[String],
      value: Double,
      sampleRate: Unit,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRateOrTags: js.Array[String]): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRate: Double): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def decrement(
      stat: js.Array[String],
      value: Unit,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def decrement(stat: js.Array[String], value: Unit, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    
    /**
      * Gauges a stat by a specified amount
      * @param stat The stat(s) to send
      * @param value The value to send
      * @param sampleRate The Number of times to sample (0 to 1). Optional.
      * @param tags The Array of tags to add to metrics. Optional.
      * @param callback Callback when message is done being delivered. Optional.
      */
    def gauge(stat: String, value: Double): Unit = js.native
    def gauge(stat: String, value: Double, callback: Callback): Unit = js.native
    def gauge(stat: String, value: Double, sampleRateOrTags: js.Array[String]): Unit = js.native
    def gauge(stat: String, value: Double, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def gauge(stat: String, value: Double, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def gauge(stat: String, value: Double, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def gauge(stat: js.Array[String], value: Double): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, callback: Callback): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRateOrTags: js.Array[String]): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def gauge(
      stat: js.Array[String],
      value: Double,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def gauge(
      stat: js.Array[String],
      value: Double,
      sampleRate: Unit,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    
    var global_tags: js.Array[String] = js.native
    
    /**
      * Represents the histogram stat
      * @param stat The stat(s) to send
      * @param value The value to send
      * @param sampleRate The Number of times to sample (0 to 1). Optional.
      * @param tags The Array of tags to add to metrics. Optional.
      * @param callback Callback when message is done being delivered. Optional.
      */
    def histogram(stat: String, value: Any): Unit = js.native
    def histogram(stat: String, value: Any, callback: Callback): Unit = js.native
    def histogram(stat: String, value: Any, sampleRateOrTags: js.Array[String]): Unit = js.native
    def histogram(stat: String, value: Any, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def histogram(stat: String, value: Any, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def histogram(stat: String, value: Any, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def histogram(stat: String, value: Any, sampleRate: Double): Unit = js.native
    def histogram(stat: String, value: Any, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def histogram(stat: String, value: Any, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def histogram(stat: String, value: Any, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def histogram(stat: String, value: Any, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def histogram(stat: String, value: Any, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def histogram(stat: String, value: Any, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def histogram(stat: js.Array[String], value: Any): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, callback: Callback): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRateOrTags: js.Array[String]): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRate: Double): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def histogram(stat: js.Array[String], value: Any, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    
    var host: String = js.native
    
    /**
      * Increments a stat by a specified amount
      * @param stat The stat(s) to send
      * @param value The value to send
      * @param sampleRate The Number of times to sample (0 to 1). Optional.
      * @param tags The Array of tags to add to metrics. Optional.
      * @param callback Callback when message is done being delivered. Optional.
      */
    def increment(stat: String): Unit = js.native
    def increment(stat: String, value: Any): Unit = js.native
    def increment(stat: String, value: Any, callback: Callback): Unit = js.native
    def increment(stat: String, value: Any, sampleRateOrTags: js.Array[String]): Unit = js.native
    def increment(stat: String, value: Any, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def increment(stat: String, value: Any, sampleRateOrTags: Double): Unit = js.native
    def increment(stat: String, value: Any, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def increment(stat: String, value: Any, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def increment(stat: String, value: Double): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def increment(stat: String, value: Unit, sampleRate: Double): Unit = js.native
    def increment(stat: String, value: Unit, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def increment(stat: String, value: Unit, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def increment(stat: String, value: Unit, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def increment(stat: String, value: Unit, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def increment(stat: String, value: Unit, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def increment(stat: String, value: Unit, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def increment(stat: js.Array[String]): Unit = js.native
    def increment(stat: js.Array[String], value: Any): Unit = js.native
    def increment(stat: js.Array[String], value: Any, callback: Callback): Unit = js.native
    def increment(stat: js.Array[String], value: Any, sampleRateOrTags: js.Array[String]): Unit = js.native
    def increment(stat: js.Array[String], value: Any, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def increment(stat: js.Array[String], value: Any, sampleRateOrTags: Double): Unit = js.native
    def increment(stat: js.Array[String], value: Any, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def increment(stat: js.Array[String], value: Any, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def increment(stat: js.Array[String], value: Double): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def increment(
      stat: js.Array[String],
      value: Double,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def increment(
      stat: js.Array[String],
      value: Double,
      sampleRate: Unit,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def increment(stat: js.Array[String], value: Unit, sampleRate: Double): Unit = js.native
    def increment(stat: js.Array[String], value: Unit, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def increment(
      stat: js.Array[String],
      value: Unit,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def increment(stat: js.Array[String], value: Unit, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def increment(stat: js.Array[String], value: Unit, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def increment(stat: js.Array[String], value: Unit, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def increment(stat: js.Array[String], value: Unit, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    
    var mock: Boolean = js.native
    
    var port: Double = js.native
    
    var prefix: String = js.native
    
    /**
      * Sends a stat across the wire
      * @param stat The stat(s) to send
      * @param value The value to send
      * @param type The type of message to send to statsd
      * @param sampleRate The Number of times to sample (0 to 1)
      * @param tags The Array of tags to add to metrics
      * @param callback Callback when message is done being delivered. Optional.
      */
    def send(stat: String, value: Any, `type`: String): Unit = js.native
    def send(stat: String, value: Any, `type`: String, callback: Callback): Unit = js.native
    def send(stat: String, value: Any, `type`: String, sampleRateOrTags: js.Array[String]): Unit = js.native
    def send(stat: String, value: Any, `type`: String, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def send(stat: String, value: Any, `type`: String, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def send(stat: String, value: Any, `type`: String, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def send(stat: String, value: Any, `type`: String, sampleRate: Double): Unit = js.native
    def send(stat: String, value: Any, `type`: String, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def send(
      stat: String,
      value: Any,
      `type`: String,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def send(stat: String, value: Any, `type`: String, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def send(stat: String, value: Any, `type`: String, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def send(
      stat: String,
      value: Any,
      `type`: String,
      sampleRate: Unit,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def send(stat: String, value: Any, `type`: String, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def send(stat: js.Array[String], value: Any, `type`: String): Unit = js.native
    def send(stat: js.Array[String], value: Any, `type`: String, callback: Callback): Unit = js.native
    def send(stat: js.Array[String], value: Any, `type`: String, sampleRateOrTags: js.Array[String]): Unit = js.native
    def send(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRateOrTags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def send(stat: js.Array[String], value: Any, `type`: String, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def send(stat: js.Array[String], value: Any, `type`: String, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def send(stat: js.Array[String], value: Any, `type`: String, sampleRate: Double): Unit = js.native
    def send(stat: js.Array[String], value: Any, `type`: String, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def send(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def send(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRate: Double,
      tags: Unit,
      callback: Callback
    ): Unit = js.native
    def send(stat: js.Array[String], value: Any, `type`: String, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def send(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRate: Unit,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def send(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRate: Unit,
      tags: Unit,
      callback: Callback
    ): Unit = js.native
    
    /**
      * Checks if stats is an array and sends all stats calling back once all have sent
      * @param stat The stat(s) to send
      * @param value The value to send
      * @param type The type of metric to send
      * @param sampleRate The Number of times to sample (0 to 1). Optional.
      * @param tags The Array of tags to add to metrics. Optional.
      * @param callback Callback when message is done being delivered. Optional.
      */
    def sendAll(stat: String, value: Any, `type`: String): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, callback: Callback): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, sampleRateOrTags: js.Array[String]): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, sampleRate: Double): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def sendAll(
      stat: String,
      value: Any,
      `type`: String,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def sendAll(
      stat: String,
      value: Any,
      `type`: String,
      sampleRate: Unit,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def sendAll(stat: String, value: Any, `type`: String, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def sendAll(stat: js.Array[String], value: Any, `type`: String): Unit = js.native
    def sendAll(stat: js.Array[String], value: Any, `type`: String, callback: Callback): Unit = js.native
    def sendAll(stat: js.Array[String], value: Any, `type`: String, sampleRateOrTags: js.Array[String]): Unit = js.native
    def sendAll(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRateOrTags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def sendAll(stat: js.Array[String], value: Any, `type`: String, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def sendAll(stat: js.Array[String], value: Any, `type`: String, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def sendAll(stat: js.Array[String], value: Any, `type`: String, sampleRate: Double): Unit = js.native
    def sendAll(stat: js.Array[String], value: Any, `type`: String, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def sendAll(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def sendAll(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRate: Double,
      tags: Unit,
      callback: Callback
    ): Unit = js.native
    def sendAll(stat: js.Array[String], value: Any, `type`: String, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def sendAll(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRate: Unit,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def sendAll(
      stat: js.Array[String],
      value: Any,
      `type`: String,
      sampleRate: Unit,
      tags: Unit,
      callback: Callback
    ): Unit = js.native
    
    /**
      * See StatsD.unique
      */
    def set(stat: String, value: Any): Unit = js.native
    def set(stat: String, value: Any, callback: Callback): Unit = js.native
    def set(stat: String, value: Any, sampleRateOrTags: js.Array[String]): Unit = js.native
    def set(stat: String, value: Any, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def set(stat: String, value: Any, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def set(stat: String, value: Any, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def set(stat: String, value: Any, sampleRate: Double): Unit = js.native
    def set(stat: String, value: Any, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def set(stat: String, value: Any, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def set(stat: String, value: Any, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def set(stat: String, value: Any, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def set(stat: String, value: Any, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def set(stat: String, value: Any, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def set(stat: js.Array[String], value: Any): Unit = js.native
    def set(stat: js.Array[String], value: Any, callback: Callback): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRateOrTags: js.Array[String]): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRate: Double): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def set(stat: js.Array[String], value: Any, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    
    var socket: Socket = js.native
    
    var suffix: String = js.native
    
    /**
      * Represents the timing stat
      * @param stat The stat(s) to send
      * @param time The time in milliseconds to send
      * @param sampleRate The Number of times to sample (0 to 1). Optional.
      * @param tags The Array of tags to add to metrics. Optional.
      * @param callback Callback when message is done being delivered. Optional.
      */
    def timing(stat: String, time: Double): Unit = js.native
    def timing(stat: String, time: Double, callback: Callback): Unit = js.native
    def timing(stat: String, time: Double, sampleRateOrTags: js.Array[String]): Unit = js.native
    def timing(stat: String, time: Double, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def timing(stat: String, time: Double, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def timing(stat: String, time: Double, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def timing(stat: String, time: Double, sampleRate: Double): Unit = js.native
    def timing(stat: String, time: Double, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def timing(stat: String, time: Double, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def timing(stat: String, time: Double, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def timing(stat: String, time: Double, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def timing(stat: String, time: Double, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def timing(stat: String, time: Double, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def timing(stat: js.Array[String], time: Double): Unit = js.native
    def timing(stat: js.Array[String], time: Double, callback: Callback): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRateOrTags: js.Array[String]): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRate: Double): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def timing(
      stat: js.Array[String],
      time: Double,
      sampleRate: Double,
      tags: js.Array[String],
      callback: Callback
    ): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def timing(stat: js.Array[String], time: Double, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    
    /**
      * Counts unique values by a specified amount
      * @param stat The stat(s) to send
      * @param value The value to send
      * @param sampleRate The Number of times to sample (0 to 1). Optional.
      * @param tags The Array of tags to add to metrics. Optional.
      * @param callback Callback when message is done being delivered. Optional.
      */
    def unique(stat: String, value: Any): Unit = js.native
    def unique(stat: String, value: Any, callback: Callback): Unit = js.native
    def unique(stat: String, value: Any, sampleRateOrTags: js.Array[String]): Unit = js.native
    def unique(stat: String, value: Any, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def unique(stat: String, value: Any, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def unique(stat: String, value: Any, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def unique(stat: String, value: Any, sampleRate: Double): Unit = js.native
    def unique(stat: String, value: Any, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def unique(stat: String, value: Any, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def unique(stat: String, value: Any, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def unique(stat: String, value: Any, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def unique(stat: String, value: Any, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def unique(stat: String, value: Any, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
    def unique(stat: js.Array[String], value: Any): Unit = js.native
    def unique(stat: js.Array[String], value: Any, callback: Callback): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRateOrTags: js.Array[String]): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRateOrTags: js.Array[String], callback: Callback): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRateOrTags: Double, callback: Callback): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRateOrTags: Unit, callback: Callback): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRate: Double): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRate: Double, tags: js.Array[String]): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRate: Double, tags: js.Array[String], callback: Callback): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRate: Double, tags: Unit, callback: Callback): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRate: Unit, tags: js.Array[String]): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRate: Unit, tags: js.Array[String], callback: Callback): Unit = js.native
    def unique(stat: js.Array[String], value: Any, sampleRate: Unit, tags: Unit, callback: Callback): Unit = js.native
  }
  
  type Callback = js.Function2[/* error */ js.UndefOr[js.Error], /* bytes */ js.UndefOr[Buffer], Unit]
  
  trait StatsDConfig extends StObject {
    
    var cacheDns: js.UndefOr[Boolean] = js.undefined
    
    var global_tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var globalize: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var mock: js.UndefOr[Boolean] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object StatsDConfig {
    
    inline def apply(): StatsDConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatsDConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatsDConfig] (val x: Self) extends AnyVal {
      
      inline def setCacheDns(value: Boolean): Self = StObject.set(x, "cacheDns", value.asInstanceOf[js.Any])
      
      inline def setCacheDnsUndefined: Self = StObject.set(x, "cacheDns", js.undefined)
      
      inline def setGlobal_tags(value: js.Array[String]): Self = StObject.set(x, "global_tags", value.asInstanceOf[js.Any])
      
      inline def setGlobal_tagsUndefined: Self = StObject.set(x, "global_tags", js.undefined)
      
      inline def setGlobal_tagsVarargs(value: String*): Self = StObject.set(x, "global_tags", js.Array(value*))
      
      inline def setGlobalize(value: Boolean): Self = StObject.set(x, "globalize", value.asInstanceOf[js.Any])
      
      inline def setGlobalizeUndefined: Self = StObject.set(x, "globalize", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMock(value: Boolean): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}

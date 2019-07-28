package typings.memcached.memcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  /**
    * md5, the hashing algorithm used to generate the hashRing values.
    */
  var algorithm: js.UndefOr[String] = js.undefined
  /**
    * undefined, an array of server_locations to replace servers that fail and that are removed from the consistent hashing scheme.
    */
  var failOverServers: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * 5, the number of failed-attempts to a server before it is regarded as 'dead'.
    */
  var failures: js.UndefOr[Double] = js.undefined
  /**
    * 5000, the idle timeout for the connections.
    */
  var idle: js.UndefOr[Double] = js.undefined
  /**
    * true, whether to use md5 as hashing scheme when keys exceed maxKeySize.
    */
  var keyCompression: js.UndefOr[Boolean] = js.undefined
  /**
    * 2592000, the maximum expiration time of keys (in seconds).
    */
  var maxExpiration: js.UndefOr[Double] = js.undefined
  /**
    * 250, the maximum key size allowed.
    */
  var maxKeySize: js.UndefOr[Double] = js.undefined
  /**
    * 1048576, the maximum size of a value.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * '', sentinel to prepend to all memcache keys for namespacing the entries.
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * 10, the maximum size of the connection pool.
    */
  var poolSize: js.UndefOr[Double] = js.undefined
  /**
    * 18000000, the time between reconnection attempts (in milliseconds).
    */
  var reconnect: js.UndefOr[Double] = js.undefined
  /**
    * false, if true, authorizes the automatic removal of dead servers from the pool.
    */
  var remove: js.UndefOr[Boolean] = js.undefined
  /**
    * 5, the number of socket allocation retries per request.
    */
  var retries: js.UndefOr[Double] = js.undefined
  /**
    * 30000, the time between a server failure and an attempt to set it up back in service.
    */
  var retry: js.UndefOr[Double] = js.undefined
  /**
    * 5000, the time after which Memcached sends a connection timeout (in milliseconds).
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object options {
  @scala.inline
  def apply(
    algorithm: String = null,
    failOverServers: String | js.Array[String] = null,
    failures: Int | Double = null,
    idle: Int | Double = null,
    keyCompression: js.UndefOr[Boolean] = js.undefined,
    maxExpiration: Int | Double = null,
    maxKeySize: Int | Double = null,
    maxValue: Int | Double = null,
    namespace: String = null,
    poolSize: Int | Double = null,
    reconnect: Int | Double = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    retries: Int | Double = null,
    retry: Int | Double = null,
    timeout: Int | Double = null
  ): options = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (failOverServers != null) __obj.updateDynamic("failOverServers")(failOverServers.asInstanceOf[js.Any])
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (idle != null) __obj.updateDynamic("idle")(idle.asInstanceOf[js.Any])
    if (!js.isUndefined(keyCompression)) __obj.updateDynamic("keyCompression")(keyCompression)
    if (maxExpiration != null) __obj.updateDynamic("maxExpiration")(maxExpiration.asInstanceOf[js.Any])
    if (maxKeySize != null) __obj.updateDynamic("maxKeySize")(maxKeySize.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
}


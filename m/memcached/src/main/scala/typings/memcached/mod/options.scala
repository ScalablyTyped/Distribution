package typings.memcached.mod

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
    failures: js.UndefOr[Double] = js.undefined,
    idle: js.UndefOr[Double] = js.undefined,
    keyCompression: js.UndefOr[Boolean] = js.undefined,
    maxExpiration: js.UndefOr[Double] = js.undefined,
    maxKeySize: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    namespace: String = null,
    poolSize: js.UndefOr[Double] = js.undefined,
    reconnect: js.UndefOr[Double] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined,
    retry: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): options = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (failOverServers != null) __obj.updateDynamic("failOverServers")(failOverServers.asInstanceOf[js.Any])
    if (!js.isUndefined(failures)) __obj.updateDynamic("failures")(failures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idle)) __obj.updateDynamic("idle")(idle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyCompression)) __obj.updateDynamic("keyCompression")(keyCompression.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxExpiration)) __obj.updateDynamic("maxExpiration")(maxExpiration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxKeySize)) __obj.updateDynamic("maxKeySize")(maxKeySize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (!js.isUndefined(poolSize)) __obj.updateDynamic("poolSize")(poolSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
}


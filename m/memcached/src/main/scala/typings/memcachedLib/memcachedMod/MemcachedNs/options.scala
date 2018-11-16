package typings
package memcachedLib.memcachedMod.MemcachedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait options extends js.Object {
  /**
           * md5, the hashing algorithm used to generate the hashRing values.
           */
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
           * undefined, an array of server_locations to replace servers that fail and that are removed from the consistent hashing scheme.
           */
  var failOverServers: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
           * 5, the number of failed-attempts to a server before it is regarded as 'dead'.
           */
  var failures: js.UndefOr[scala.Double] = js.undefined
  /**
           * 5000, the idle timeout for the connections.
           */
  var idle: js.UndefOr[scala.Double] = js.undefined
  /**
           * true, whether to use md5 as hashing scheme when keys exceed maxKeySize.
           */
  var keyCompression: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * 2592000, the maximum expiration time of keys (in seconds).
           */
  var maxExpiration: js.UndefOr[scala.Double] = js.undefined
  /**
           * 250, the maximum key size allowed.
           */
  var maxKeySize: js.UndefOr[scala.Double] = js.undefined
  /**
           * 1048576, the maximum size of a value.
           */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
           * '', sentinel to prepend to all memcache keys for namespacing the entries.
           */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 10, the maximum size of the connection pool.
           */
  var poolSize: js.UndefOr[scala.Double] = js.undefined
  /**
           * 18000000, the time between reconnection attempts (in milliseconds).
           */
  var reconnect: js.UndefOr[scala.Double] = js.undefined
  /**
           * false, if true, authorizes the automatic removal of dead servers from the pool.
           */
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * 5, the number of socket allocation retries per request.
           */
  var retries: js.UndefOr[scala.Double] = js.undefined
  /**
           * 30000, the time between a server failure and an attempt to set it up back in service.
           */
  var retry: js.UndefOr[scala.Double] = js.undefined
  /**
           * 5000, the time after which Memcached sends a connection timeout (in milliseconds).
           */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}


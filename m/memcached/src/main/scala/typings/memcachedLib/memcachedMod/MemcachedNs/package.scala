package typings
package memcachedLib.memcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MemcachedNs {
  /**
       * <ul>
       *     <li><b>issue</b> a issue occurred on a server, we are going to attempt a retry next.</li>
       *     <li><b>failure</b> a server has been marked as failure or dead.</li>
       *     <li><b>reconnecting</b> we are going to attempt to reconnect the to the failed server.</li>
       *     <li><b>reconnect</b> successfully reconnected to the memcached server.</li>
       *     <li><b>remove</b> removing the server from our consistent hashing.</li>
       * </ul>
       */
  type EventNames = memcachedLib.memcachedLibStrings.issue | memcachedLib.memcachedLibStrings.failure | memcachedLib.memcachedLibStrings.reconnecting | memcachedLib.memcachedLibStrings.reconnect | memcachedLib.memcachedLibStrings.remove
  /**
       * Declaration for single server or Memcached cluster location
       *
       * to connect to a single server use
       * "127.0.0.1:11211"
       *
       * to connect to a cluster of Memcached servers use
       * ["127.0.0.1:11211","127.0.0.1:11212"]
       *
       * to connect to servers with weight use
       * {"127.0.0.1:11211": 1,"127.0.0.1:11212": 2}
       */
  type Location = java.lang.String | js.Array[java.lang.String] | ScalablyTyped.runtime.StringDictionary[scala.Double]
}

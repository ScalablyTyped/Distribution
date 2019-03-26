package typings
package memcachedLib.memcachedMod.MemcachedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <ul>
  *     <li><b>issue</b> a issue occurred on a server, we are going to attempt a retry next.</li>
  *     <li><b>failure</b> a server has been marked as failure or dead.</li>
  *     <li><b>reconnecting</b> we are going to attempt to reconnect the to the failed server.</li>
  *     <li><b>reconnect</b> successfully reconnected to the memcached server.</li>
  *     <li><b>remove</b> removing the server from our consistent hashing.</li>
  * </ul>
  */
/* Rewritten from type alias, can be one of: 
  - memcachedLib.memcachedLibStrings.issue
  - memcachedLib.memcachedLibStrings.failure
  - memcachedLib.memcachedLibStrings.reconnecting
  - memcachedLib.memcachedLibStrings.reconnect
  - memcachedLib.memcachedLibStrings.remove
*/
trait EventNames extends js.Object


package typings.memcached.memcachedMod

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
  - typings.memcached.memcachedStrings.issue
  - typings.memcached.memcachedStrings.failure
  - typings.memcached.memcachedStrings.reconnecting
  - typings.memcached.memcachedStrings.reconnect
  - typings.memcached.memcachedStrings.remove
*/
trait EventNames extends js.Object

object EventNames {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.memcached.memcachedStrings.failure = this.cast("failure")
  @scala.inline
  def issue: typings.memcached.memcachedStrings.issue = this.cast("issue")
  @scala.inline
  def reconnect: typings.memcached.memcachedStrings.reconnect = this.cast("reconnect")
  @scala.inline
  def reconnecting: typings.memcached.memcachedStrings.reconnecting = this.cast("reconnecting")
  @scala.inline
  def remove: typings.memcached.memcachedStrings.remove = this.cast("remove")
}


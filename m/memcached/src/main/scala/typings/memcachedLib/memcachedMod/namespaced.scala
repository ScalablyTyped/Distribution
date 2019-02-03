package typings
package memcachedLib.memcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memcached", JSImport.Namespace)
@js.native
class namespaced protected () extends Memcached {
  /**
    * Connect to a single Memcached server or cluster
    * @param location Server locations
    * @param options options
    */
  def this(location: memcachedLib.memcachedMod.MemcachedNs.Location) = this()
  def this(location: memcachedLib.memcachedMod.MemcachedNs.Location, options: memcachedLib.memcachedMod.MemcachedNs.options) = this()
}

/* static members */
@JSImport("memcached", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var config: memcachedLib.memcachedMod.MemcachedNs.options = js.native
}


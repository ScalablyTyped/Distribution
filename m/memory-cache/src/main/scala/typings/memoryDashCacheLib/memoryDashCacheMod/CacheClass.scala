package typings
package memoryDashCacheLib.memoryDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memory-cache", "CacheClass")
@js.native
class CacheClass[K, V] () extends js.Object {
  def clear(): scala.Unit = js.native
  def debug(bool: scala.Boolean): scala.Unit = js.native
  def del(key: K): scala.Unit = js.native
  def get(key: K): V = js.native
  def hits(): scala.Double = js.native
  def keys(): js.Array[K] = js.native
  def memsize(): scala.Double = js.native
  def misses(): scala.Double = js.native
  def put(key: K, value: V): V = js.native
  def put(key: K, value: V, time: scala.Double): V = js.native
  def put(
    key: K,
    value: V,
    time: scala.Double,
    timeoutCallback: js.Function2[/* key */ K, /* value */ V, scala.Unit]
  ): V = js.native
  def size(): scala.Double = js.native
}


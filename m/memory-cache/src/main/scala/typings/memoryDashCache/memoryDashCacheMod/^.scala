package typings.memoryDashCache.memoryDashCacheMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memory-cache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Cache: Instantiable0[CacheClass[js.Object, js.Object]] = js.native
  def clear(): Unit = js.native
  def debug(bool: Boolean): Unit = js.native
  def del(key: js.Any): Unit = js.native
  def get(key: js.Any): js.Any = js.native
  def hits(): Double = js.native
  def keys(): js.Array[_] = js.native
  def memsize(): Double = js.native
  def misses(): Double = js.native
  def put[V](key: js.Any, value: V): V = js.native
  def put[V](key: js.Any, value: V, time: Double): V = js.native
  def put[V](
    key: js.Any,
    value: V,
    time: Double,
    timeoutCallback: js.Function2[/* key */ js.Any, /* value */ js.Any, Unit]
  ): V = js.native
  def size(): Double = js.native
}


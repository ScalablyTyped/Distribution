package typings
package memoryDashCacheLib.memoryDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memory-cache", JSImport.Namespace)
@js.native
object memoryDashCacheModMembers extends js.Object {
  val Cache: org.scalablytyped.runtime.Instantiable0[
    CacheClass[
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for K */ js.Any, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for V */ js.Any
    ]
  ] = js.native
  def clear(): scala.Unit = js.native
  def debug(bool: scala.Boolean): scala.Unit = js.native
  def del(key: js.Any): scala.Unit = js.native
  def get(key: js.Any): js.Any = js.native
  def hits(): scala.Double = js.native
  def keys(): js.Array[_] = js.native
  def memsize(): scala.Double = js.native
  def misses(): scala.Double = js.native
  def put[V](key: js.Any, value: V): V = js.native
  def put[V](key: js.Any, value: V, time: scala.Double): V = js.native
  def put[V](
    key: js.Any,
    value: V,
    time: scala.Double,
    timeoutCallback: js.Function2[/* key */ js.Any, /* value */ js.Any, scala.Unit]
  ): V = js.native
  def size(): scala.Double = js.native
}


package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: java.lang.String
  def delete(key: K): scala.Boolean
  def get(key: K): js.UndefOr[V]
  def has(key: K): scala.Boolean
  def set(key: K, value: V): this.type
}

object WeakMap {
  @scala.inline
  def apply[K /* <: js.Object */, V](
    delete: js.Function1[K, scala.Boolean],
    get: js.Function1[K, js.UndefOr[V]],
    has: js.Function1[K, scala.Boolean],
    set: js.Function2[K, V, WeakMap[K, V]],
    toStringTag: java.lang.String
  ): WeakMap[K, V] = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, has = has, set = set, toStringTag = toStringTag)
  
    __obj.asInstanceOf[WeakMap[K, V]]
  }
}


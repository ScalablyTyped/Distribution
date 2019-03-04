package typings
package nodeDashCacheLib.nodeDashCacheMod.NodeCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedValue[T] extends js.Object {
  // ttl
  var t: scala.Double
  // value
  var v: T
}

object WrappedValue {
  @scala.inline
  def apply[T](t: scala.Double, v: T): WrappedValue[T] = {
    val __obj = js.Dynamic.literal(t = t, v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WrappedValue[T]]
  }
}


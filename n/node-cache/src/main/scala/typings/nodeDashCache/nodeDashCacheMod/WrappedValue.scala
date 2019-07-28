package typings.nodeDashCache.nodeDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedValue[T] extends js.Object {
  // ttl
  var t: Double
  // value
  var v: T
}

object WrappedValue {
  @scala.inline
  def apply[T](t: Double, v: T): WrappedValue[T] = {
    val __obj = js.Dynamic.literal(t = t, v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WrappedValue[T]]
  }
}


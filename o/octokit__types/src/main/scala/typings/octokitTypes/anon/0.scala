package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[T] extends js.Object {
  var previews: Array[T | String]
}

object `0` {
  @scala.inline
  def apply[T](previews: Array[T | String]): `0`[T] = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[T]]
  }
}


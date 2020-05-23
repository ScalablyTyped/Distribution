package typings.nivoStream.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[T] extends js.Object {
  var `0`: Double
  var `1`: Double
  var data: T
}

object `0` {
  @scala.inline
  def apply[T](`0`: Double, `1`: Double, data: T): `0`[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[T]]
  }
}


package typings.monk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[U] extends js.Object {
  def each(record: U, cursor: Close): js.Any
}

object `0` {
  @scala.inline
  def apply[U](each: (U, Close) => js.Any): `0`[U] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction2(each))
    __obj.asInstanceOf[`0`[U]]
  }
}


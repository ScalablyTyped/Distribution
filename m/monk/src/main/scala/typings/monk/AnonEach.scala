package typings.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEach[U] extends js.Object {
  def each(record: U, cursor: AnonClose): js.Any
}

object AnonEach {
  @scala.inline
  def apply[U](each: (U, AnonClose) => js.Any): AnonEach[U] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction2(each))
  
    __obj.asInstanceOf[AnonEach[U]]
  }
}


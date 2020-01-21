package typings.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCursor[U] extends js.Object {
  def each(record: U, cursor: AnonClose): js.Any
}

object AnonCursor {
  @scala.inline
  def apply[U](each: (U, AnonClose) => js.Any): AnonCursor[U] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction2(each))
  
    __obj.asInstanceOf[AnonCursor[U]]
  }
}


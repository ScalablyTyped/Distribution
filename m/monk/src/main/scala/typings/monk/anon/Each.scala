package typings.monk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Each[U] extends js.Object {
  def each(listener: js.Function2[/* record */ U, /* cursor */ Close, _]): js.Any
}

object Each {
  @scala.inline
  def apply[U](each: js.Function2[/* record */ U, /* cursor */ Close, _] => js.Any): Each[U] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each))
    __obj.asInstanceOf[Each[U]]
  }
}


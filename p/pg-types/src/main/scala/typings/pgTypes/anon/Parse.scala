package typings.pgTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parse extends js.Object {
  def parse(): js.Array[_]
}

object Parse {
  @scala.inline
  def apply(parse: () => js.Array[_]): Parse = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
    __obj.asInstanceOf[Parse]
  }
}


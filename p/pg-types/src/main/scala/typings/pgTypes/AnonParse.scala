package typings.pgTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParse extends js.Object {
  def parse(): js.Array[_]
}

object AnonParse {
  @scala.inline
  def apply(parse: () => js.Array[_]): AnonParse = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
  
    __obj.asInstanceOf[AnonParse]
  }
}


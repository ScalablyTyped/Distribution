package typings.papaparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult[T] extends js.Object {
  var data: js.Array[T]
  var errors: js.Array[ParseError]
  var meta: ParseMeta
}

object ParseResult {
  @scala.inline
  def apply[T](data: js.Array[T], errors: js.Array[ParseError], meta: ParseMeta): ParseResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult[T]]
  }
}


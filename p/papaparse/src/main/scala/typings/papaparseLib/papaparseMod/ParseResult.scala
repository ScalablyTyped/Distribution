package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var data: js.Array[_]
  var errors: js.Array[ParseError]
  var meta: ParseMeta
}

object ParseResult {
  @scala.inline
  def apply(data: js.Array[_], errors: js.Array[ParseError], meta: ParseMeta): ParseResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[ParseResult]
  }
}


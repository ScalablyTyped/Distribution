package typings.numeral.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: RegExp
  var unformat: RegExp
}

object Format {
  @scala.inline
  def apply(format: RegExp, unformat: RegExp): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], unformat = unformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}


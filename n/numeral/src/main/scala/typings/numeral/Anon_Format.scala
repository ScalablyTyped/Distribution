package typings.numeral

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: RegExp
  var unformat: RegExp
}

object Anon_Format {
  @scala.inline
  def apply(format: RegExp, unformat: RegExp): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], unformat = unformat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Format]
  }
}


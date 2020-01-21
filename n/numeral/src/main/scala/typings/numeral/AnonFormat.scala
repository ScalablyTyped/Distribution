package typings.numeral

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: RegExp
  var unformat: RegExp
}

object AnonFormat {
  @scala.inline
  def apply(format: RegExp, unformat: RegExp): AnonFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], unformat = unformat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormat]
  }
}


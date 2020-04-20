package typings.numbro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: String
  var position: String
  var symbol: String
}

object AnonCode {
  @scala.inline
  def apply(code: String, position: String, symbol: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}


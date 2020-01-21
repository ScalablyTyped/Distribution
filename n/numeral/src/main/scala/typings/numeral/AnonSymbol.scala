package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSymbol extends js.Object {
  var symbol: String
}

object AnonSymbol {
  @scala.inline
  def apply(symbol: String): AnonSymbol = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSymbol]
  }
}


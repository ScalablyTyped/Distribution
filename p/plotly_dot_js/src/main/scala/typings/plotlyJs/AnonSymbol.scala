package typings.plotlyJs

import typings.plotlyJs.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSymbol extends js.Object {
  var color: Color
  var symbol: String
}

object AnonSymbol {
  @scala.inline
  def apply(color: Color, symbol: String): AnonSymbol = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSymbol]
  }
}


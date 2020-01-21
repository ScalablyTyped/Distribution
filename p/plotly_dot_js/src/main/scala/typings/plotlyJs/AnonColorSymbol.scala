package typings.plotlyJs

import typings.plotlyJs.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorSymbol extends js.Object {
  var color: Color
  var symbol: String
}

object AnonColorSymbol {
  @scala.inline
  def apply(color: Color, symbol: String): AnonColorSymbol = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColorSymbol]
  }
}


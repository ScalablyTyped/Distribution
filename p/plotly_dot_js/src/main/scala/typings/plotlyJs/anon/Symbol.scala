package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var color: typings.plotlyJs.mod.Color
  var symbol: String
}

object Symbol {
  @scala.inline
  def apply(color: typings.plotlyJs.mod.Color, symbol: String): Symbol = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}


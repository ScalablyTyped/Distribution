package typings.numbro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: String
  var position: String
  var symbol: String
}

object Anon_Code {
  @scala.inline
  def apply(code: String, position: String, symbol: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, position = position, symbol = symbol)
  
    __obj.asInstanceOf[Anon_Code]
  }
}


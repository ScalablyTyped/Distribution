package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: Color
  var symbol: String
}

object Anon_Color {
  @scala.inline
  def apply(color: Color, symbol: String): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], symbol = symbol)
  
    __obj.asInstanceOf[Anon_Color]
  }
}


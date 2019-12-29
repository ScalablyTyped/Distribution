package typings.parse.parseMod._Global_.Parse.Op

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Increment extends js.Object {
  var amount: Double
  def toJSON(): js.Any
}

object Increment {
  @scala.inline
  def apply(amount: Double, toJSON: () => js.Any): Increment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Increment]
  }
}


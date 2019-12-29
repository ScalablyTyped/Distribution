package typings.parse.parseMod._Global_.Parse.Op

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unset extends js.Object {
  def toJSON(): js.Any
}

object Unset {
  @scala.inline
  def apply(toJSON: () => js.Any): Unset = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Unset]
  }
}


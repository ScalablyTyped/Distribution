package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printer extends js.Object {
  def Print(node: Node): String
}

object Printer {
  @scala.inline
  def apply(Print: Node => String): Printer = {
    val __obj = js.Dynamic.literal(Print = js.Any.fromFunction1(Print))
    __obj.asInstanceOf[Printer]
  }
}


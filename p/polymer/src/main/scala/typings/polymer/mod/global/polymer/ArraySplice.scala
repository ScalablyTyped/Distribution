package typings.polymer.mod.global.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySplice extends js.Object {
  def calculateSplices[T](current: js.Array[T], previous: js.Array[T]): js.Array[PolymerSplice]
}

object ArraySplice {
  @scala.inline
  def apply(calculateSplices: (js.Array[js.Any], js.Array[js.Any]) => js.Array[PolymerSplice]): ArraySplice = {
    val __obj = js.Dynamic.literal(calculateSplices = js.Any.fromFunction2(calculateSplices))
    __obj.asInstanceOf[ArraySplice]
  }
}


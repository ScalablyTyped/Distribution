package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySplice extends js.Object {
  def calculateSplices[T](current: js.Array[T], previous: js.Array[T]): js.Array[PolymerSplice]
}

object ArraySplice {
  @scala.inline
  def apply(calculateSplices: js.Function2[js.Array[js.Any], js.Array[js.Any], js.Array[PolymerSplice]]): ArraySplice = {
    val __obj = js.Dynamic.literal(calculateSplices = calculateSplices)
  
    __obj.asInstanceOf[ArraySplice]
  }
}


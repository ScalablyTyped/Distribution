package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: scala.Double
  var stack: js.Array[pixiDotJsLib.PIXINs.FilterDataStackItem]
}

object Anon_Index {
  @scala.inline
  def apply(index: scala.Double, stack: js.Array[pixiDotJsLib.PIXINs.FilterDataStackItem]): Anon_Index = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Anon_Index]
  }
}


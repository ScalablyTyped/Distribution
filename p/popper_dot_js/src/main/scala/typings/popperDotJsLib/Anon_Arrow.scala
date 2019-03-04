package typings
package popperDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arrow extends js.Object {
  var arrow: Anon_Left
  var popper: popperDotJsLib.popperDotJsMod.PopperNs.Offset
  var reference: popperDotJsLib.popperDotJsMod.PopperNs.Offset
}

object Anon_Arrow {
  @scala.inline
  def apply(
    arrow: Anon_Left,
    popper: popperDotJsLib.popperDotJsMod.PopperNs.Offset,
    reference: popperDotJsLib.popperDotJsMod.PopperNs.Offset
  ): Anon_Arrow = {
    val __obj = js.Dynamic.literal(arrow = arrow, popper = popper, reference = reference)
  
    __obj.asInstanceOf[Anon_Arrow]
  }
}


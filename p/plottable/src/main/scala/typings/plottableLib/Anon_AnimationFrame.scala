package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationFrame extends js.Object {
  var animationFrame: plottableLib.plottableLibStrings.animationFrame
  var immediate: plottableLib.plottableLibStrings.immediate
  var timeout: plottableLib.plottableLibStrings.timeout
}

object Anon_AnimationFrame {
  @scala.inline
  def apply(
    animationFrame: plottableLib.plottableLibStrings.animationFrame,
    immediate: plottableLib.plottableLibStrings.immediate,
    timeout: plottableLib.plottableLibStrings.timeout
  ): Anon_AnimationFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationFrame")(animationFrame)
    __obj.updateDynamic("immediate")(immediate)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Anon_AnimationFrame]
  }
}


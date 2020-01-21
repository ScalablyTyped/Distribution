package typings.plottable

import typings.plottable.plottableStrings.animationFrame
import typings.plottable.plottableStrings.immediate
import typings.plottable.plottableStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationFrame extends js.Object {
  var animationFrame: typings.plottable.plottableStrings.animationFrame
  var immediate: typings.plottable.plottableStrings.immediate
  var timeout: typings.plottable.plottableStrings.timeout
}

object AnonAnimationFrame {
  @scala.inline
  def apply(animationFrame: animationFrame, immediate: immediate, timeout: timeout): AnonAnimationFrame = {
    val __obj = js.Dynamic.literal(animationFrame = animationFrame.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimationFrame]
  }
}


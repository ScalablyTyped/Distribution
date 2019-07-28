package typings.plottable.buildSrcCoreRenderPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderPolicy extends js.Object {
  def render(): js.Any
}

object IRenderPolicy {
  @scala.inline
  def apply(render: () => js.Any): IRenderPolicy = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[IRenderPolicy]
  }
}


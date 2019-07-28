package typings.plottable.buildSrcUtilsCallbackSetMod

import typings.plottable.buildSrcUtilsSetMod.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/callbackSet", "CallbackSet")
@js.native
class CallbackSet[CB /* <: js.Function */] () extends Set[CB] {
  def callCallbacks(args: js.Any*): this.type = js.native
}


package typings.node.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueToLocationParameterType extends js.Object {
  /**
    * Location to continue to.
    */
  var location: Location
  var targetCallFrames: js.UndefOr[java.lang.String] = js.undefined
}

object ContinueToLocationParameterType {
  @scala.inline
  def apply(location: Location, targetCallFrames: java.lang.String = null): ContinueToLocationParameterType = {
    val __obj = js.Dynamic.literal(location = location)
    if (targetCallFrames != null) __obj.updateDynamic("targetCallFrames")(targetCallFrames)
    __obj.asInstanceOf[ContinueToLocationParameterType]
  }
}


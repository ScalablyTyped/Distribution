package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueToLocationParameterType extends js.Object {
  /**
    * Location to continue to.
    */
  var location: Location
  var targetCallFrames: js.UndefOr[String] = js.undefined
}

object ContinueToLocationParameterType {
  @scala.inline
  def apply(location: Location, targetCallFrames: String = null): ContinueToLocationParameterType = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (targetCallFrames != null) __obj.updateDynamic("targetCallFrames")(targetCallFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueToLocationParameterType]
  }
}


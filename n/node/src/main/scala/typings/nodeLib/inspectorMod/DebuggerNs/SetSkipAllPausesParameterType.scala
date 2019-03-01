package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSkipAllPausesParameterType extends js.Object {
  /**
    * New value for skip pauses state.
    */
  var skip: scala.Boolean
}

object SetSkipAllPausesParameterType {
  @scala.inline
  def apply(skip: scala.Boolean): SetSkipAllPausesParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[SetSkipAllPausesParameterType]
  }
}


package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: nodeDashForgeLib.nodeDashForgeMod.tlsNs.ConnectionState
  var pending: nodeDashForgeLib.nodeDashForgeMod.tlsNs.ConnectionState | scala.Null
}

object Anon_Current {
  @scala.inline
  def apply(
    current: nodeDashForgeLib.nodeDashForgeMod.tlsNs.ConnectionState,
    pending: nodeDashForgeLib.nodeDashForgeMod.tlsNs.ConnectionState = null
  ): Anon_Current = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    if (pending != null) __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[Anon_Current]
  }
}


package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointReturnType extends js.Object {
  /**
    * Location this breakpoint resolved into.
    */
  var actualLocation: Location
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId
}


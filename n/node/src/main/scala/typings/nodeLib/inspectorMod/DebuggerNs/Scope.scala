package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scope description.
  */
trait Scope extends js.Object {
  /**
    * Location in the source code where scope ends
    */
  var endLocation: js.UndefOr[Location] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Object representing the scope. For `global` and `with` scopes it represents the actual
    * object; for the rest of the scopes, it is artificial transient object enumerating scope
    * variables as its properties.
    */
  var `object`: nodeLib.inspectorMod.RuntimeNs.RemoteObject
  /**
    * Location in the source code where scope starts
    */
  var startLocation: js.UndefOr[Location] = js.undefined
  /**
    * Scope type.
    */
  var `type`: java.lang.String
}


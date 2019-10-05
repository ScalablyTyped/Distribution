package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.RemoteObject
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
    * Object representing the scope. For <code>global</code> and <code>with</code> scopes it represents the actual object; for the rest of the scopes, it is artificial transient object enumerating scope variables as its properties.
    */
  var `object`: RemoteObject
  /**
    * Location in the source code where scope starts
    */
  var startLocation: js.UndefOr[Location] = js.undefined
  /**
    * Scope type.
    */
  var `type`: java.lang.String
}

object Scope {
  @scala.inline
  def apply(
    `object`: RemoteObject,
    `type`: java.lang.String,
    endLocation: Location = null,
    name: java.lang.String = null,
    startLocation: Location = null
  ): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (endLocation != null) __obj.updateDynamic("endLocation")(endLocation)
    if (name != null) __obj.updateDynamic("name")(name)
    if (startLocation != null) __obj.updateDynamic("startLocation")(startLocation)
    __obj.asInstanceOf[Scope]
  }
}


package typings.node.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object internal property descriptor. This property isn't normally visible in JavaScript code.
  */
trait InternalPropertyDescriptor extends js.Object {
  /**
    * Conventional property name.
    */
  var name: java.lang.String
  /**
    * The value associated with the property.
    */
  var value: js.UndefOr[RemoteObject] = js.undefined
}

object InternalPropertyDescriptor {
  @scala.inline
  def apply(name: java.lang.String, value: RemoteObject = null): InternalPropertyDescriptor = {
    val __obj = js.Dynamic.literal(name = name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InternalPropertyDescriptor]
  }
}


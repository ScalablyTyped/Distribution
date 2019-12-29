package typings.node.inspectorMod.Runtime

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
  var name: String
  /**
    * The value associated with the property.
    */
  var value: js.UndefOr[RemoteObject] = js.undefined
}

object InternalPropertyDescriptor {
  @scala.inline
  def apply(name: String, value: RemoteObject = null): InternalPropertyDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalPropertyDescriptor]
  }
}


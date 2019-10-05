package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents function call argument. Either remote object id <code>objectId</code>, primitive <code>value</code>, unserializable primitive value or neither of (for undefined) them should be specified.
  */
trait CallArgument extends js.Object {
  /**
    * Remote object handle.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  /**
    * Primitive value which can not be JSON-stringified.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.undefined
  /**
    * Primitive value or serializable javascript object.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object CallArgument {
  @scala.inline
  def apply(
    objectId: RemoteObjectId = null,
    unserializableValue: UnserializableValue = null,
    value: js.Any = null
  ): CallArgument = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (unserializableValue != null) __obj.updateDynamic("unserializableValue")(unserializableValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CallArgument]
  }
}


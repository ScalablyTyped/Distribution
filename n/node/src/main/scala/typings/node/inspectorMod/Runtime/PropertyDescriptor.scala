package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object property descriptor.
  */
trait PropertyDescriptor extends js.Object {
  /**
    * True if the type of this property descriptor may be changed and if the property may be deleted from the corresponding object.
    */
  var configurable: Boolean
  /**
    * True if this property shows up during enumeration of the properties on the corresponding object.
    */
  var enumerable: Boolean
  /**
    * A function which serves as a getter for the property, or <code>undefined</code> if there is no getter (accessor descriptors only).
    */
  var get: js.UndefOr[RemoteObject] = js.undefined
  /**
    * True if the property is owned for the object.
    */
  var isOwn: js.UndefOr[Boolean] = js.undefined
  /**
    * Property name or symbol description.
    */
  var name: String
  /**
    * A function which serves as a setter for the property, or <code>undefined</code> if there is no setter (accessor descriptors only).
    */
  var set: js.UndefOr[RemoteObject] = js.undefined
  /**
    * Property symbol object, if the property is of the <code>symbol</code> type.
    */
  var symbol: js.UndefOr[RemoteObject] = js.undefined
  /**
    * The value associated with the property.
    */
  var value: js.UndefOr[RemoteObject] = js.undefined
  /**
    * True if the result was thrown during the evaluation.
    */
  var wasThrown: js.UndefOr[Boolean] = js.undefined
  /**
    * True if the value associated with the property may be changed (data descriptors only).
    */
  var writable: js.UndefOr[Boolean] = js.undefined
}

object PropertyDescriptor {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    name: String,
    get: RemoteObject = null,
    isOwn: js.UndefOr[Boolean] = js.undefined,
    set: RemoteObject = null,
    symbol: RemoteObject = null,
    value: RemoteObject = null,
    wasThrown: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): PropertyDescriptor = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOwn)) __obj.updateDynamic("isOwn")(isOwn.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(wasThrown)) __obj.updateDynamic("wasThrown")(wasThrown.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDescriptor]
  }
}


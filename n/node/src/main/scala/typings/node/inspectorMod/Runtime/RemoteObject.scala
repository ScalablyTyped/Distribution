package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mirror object referencing original JavaScript object.
  */
trait RemoteObject extends js.Object {
  /**
    * Object class (constructor) name. Specified for <code>object</code> type values only.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @experimental
    */
  var customPreview: js.UndefOr[CustomPreview] = js.undefined
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique object identifier (for non-primitive values).
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  /**
    * Preview containing abbreviated property values. Specified for <code>object</code> type values only.
    * @experimental
    */
  var preview: js.UndefOr[ObjectPreview] = js.undefined
  /**
    * Object subtype hint. Specified for <code>object</code> type values only.
    */
  var subtype: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Object type.
    */
  var `type`: java.lang.String
  /**
    * Primitive value which can not be JSON-stringified does not have <code>value</code>, but gets this property.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.undefined
  /**
    * Remote object value in case of primitive values or JSON values (if it was requested).
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object RemoteObject {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    className: java.lang.String = null,
    customPreview: CustomPreview = null,
    description: java.lang.String = null,
    objectId: RemoteObjectId = null,
    preview: ObjectPreview = null,
    subtype: java.lang.String = null,
    unserializableValue: UnserializableValue = null,
    value: js.Any = null
  ): RemoteObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customPreview != null) __obj.updateDynamic("customPreview")(customPreview.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (unserializableValue != null) __obj.updateDynamic("unserializableValue")(unserializableValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteObject]
  }
}


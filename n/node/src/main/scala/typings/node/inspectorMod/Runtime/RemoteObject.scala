package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mirror object referencing original JavaScript object.
  */
@js.native
trait RemoteObject extends js.Object {
  /**
    * Object class (constructor) name. Specified for <code>object</code> type values only.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * @experimental
    */
  var customPreview: js.UndefOr[CustomPreview] = js.native
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Unique object identifier (for non-primitive values).
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  /**
    * Preview containing abbreviated property values. Specified for <code>object</code> type values only.
    * @experimental
    */
  var preview: js.UndefOr[ObjectPreview] = js.native
  /**
    * Object subtype hint. Specified for <code>object</code> type values only.
    */
  var subtype: js.UndefOr[String] = js.native
  /**
    * Object type.
    */
  var `type`: String = js.native
  /**
    * Primitive value which can not be JSON-stringified does not have <code>value</code>, but gets this property.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.native
  /**
    * Remote object value in case of primitive values or JSON values (if it was requested).
    */
  var value: js.UndefOr[js.Any] = js.native
}

object RemoteObject {
  @scala.inline
  def apply(`type`: String): RemoteObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteObject]
  }
  @scala.inline
  implicit class RemoteObjectOps[Self <: RemoteObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCustomPreview(value: CustomPreview): Self = this.set("customPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPreview: Self = this.set("customPreview", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setPreview(value: ObjectPreview): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    @scala.inline
    def setUnserializableValue(value: UnserializableValue): Self = this.set("unserializableValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnserializableValue: Self = this.set("unserializableValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


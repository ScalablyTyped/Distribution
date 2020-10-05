package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @experimental
  */
@js.native
trait PropertyPreview extends js.Object {
  /**
    * Property name.
    */
  var name: String = js.native
  /**
    * Object subtype hint. Specified for <code>object</code> type values only.
    */
  var subtype: js.UndefOr[String] = js.native
  /**
    * Object type. Accessor means that the property itself is an accessor property.
    */
  var `type`: String = js.native
  /**
    * User-friendly property value string.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Nested value preview.
    */
  var valuePreview: js.UndefOr[ObjectPreview] = js.native
}

object PropertyPreview {
  @scala.inline
  def apply(name: String, `type`: String): PropertyPreview = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPreview]
  }
  @scala.inline
  implicit class PropertyPreviewOps[Self <: PropertyPreview] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValuePreview(value: ObjectPreview): Self = this.set("valuePreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePreview: Self = this.set("valuePreview", js.undefined)
  }
  
}


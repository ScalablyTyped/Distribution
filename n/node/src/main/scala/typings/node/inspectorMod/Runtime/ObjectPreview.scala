package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing abbreviated remote object value.
  * @experimental
  */
@js.native
trait ObjectPreview extends js.Object {
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * List of the entries. Specified for <code>map</code> and <code>set</code> subtype values only.
    */
  var entries: js.UndefOr[js.Array[EntryPreview]] = js.native
  /**
    * True iff some of the properties or entries of the original object did not fit.
    */
  var overflow: Boolean = js.native
  /**
    * List of the properties.
    */
  var properties: js.Array[PropertyPreview] = js.native
  /**
    * Object subtype hint. Specified for <code>object</code> type values only.
    */
  var subtype: js.UndefOr[String] = js.native
  /**
    * Object type.
    */
  var `type`: String = js.native
}

object ObjectPreview {
  @scala.inline
  def apply(overflow: Boolean, properties: js.Array[PropertyPreview], `type`: String): ObjectPreview = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPreview]
  }
  @scala.inline
  implicit class ObjectPreviewOps[Self <: ObjectPreview] (val x: Self) extends AnyVal {
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
    def setOverflow(value: Boolean): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesVarargs(value: PropertyPreview*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[PropertyPreview]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEntriesVarargs(value: EntryPreview*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[EntryPreview]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
  }
  
}


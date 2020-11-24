package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentType extends Entity {
  
  // The collection of columns that are required by this content type
  var columnLinks: js.UndefOr[NullableOption[js.Array[ColumnLink]]] = js.native
  
  // The descriptive text for the item.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // The name of the group this content type belongs to. Helps organize related content types.
  var group: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether the content type is hidden in the list's 'New' menu.
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * If this content type is inherited from another scope (like a site), provides a reference to the item where the content
    * type is defined.
    */
  var inheritedFrom: js.UndefOr[NullableOption[ItemReference]] = js.native
  
  // The name of the content type.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies the order in which the content type appears in the selection UI.
  var order: js.UndefOr[NullableOption[ContentTypeOrder]] = js.native
  
  // The unique identifier of the content type.
  var parentId: js.UndefOr[NullableOption[String]] = js.native
  
  // If true, the content type cannot be modified unless this value is first set to false.
  var readOnly: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * If true, the content type cannot be modified by users or through push-down operations. Only site collection
    * administrators can seal or unseal content types.
    */
  var `sealed`: js.UndefOr[NullableOption[Boolean]] = js.native
}
object ContentType {
  
  @scala.inline
  def apply(): ContentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentType]
  }
  
  @scala.inline
  implicit class ContentTypeOps[Self <: ContentType] (val x: Self) extends AnyVal {
    
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
    def setColumnLinksVarargs(value: ColumnLink*): Self = this.set("columnLinks", js.Array(value :_*))
    
    @scala.inline
    def setColumnLinks(value: NullableOption[js.Array[ColumnLink]]): Self = this.set("columnLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnLinks: Self = this.set("columnLinks", js.undefined)
    
    @scala.inline
    def setColumnLinksNull: Self = this.set("columnLinks", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setGroup(value: NullableOption[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
    
    @scala.inline
    def setHidden(value: NullableOption[Boolean]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHiddenNull: Self = this.set("hidden", null)
    
    @scala.inline
    def setInheritedFrom(value: NullableOption[ItemReference]): Self = this.set("inheritedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritedFrom: Self = this.set("inheritedFrom", js.undefined)
    
    @scala.inline
    def setInheritedFromNull: Self = this.set("inheritedFrom", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setOrder(value: NullableOption[ContentTypeOrder]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
    
    @scala.inline
    def setParentId(value: NullableOption[String]): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setParentIdNull: Self = this.set("parentId", null)
    
    @scala.inline
    def setReadOnly(value: NullableOption[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setReadOnlyNull: Self = this.set("readOnly", null)
    
    @scala.inline
    def setSealed(value: NullableOption[Boolean]): Self = this.set("sealed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSealed: Self = this.set("sealed", js.undefined)
    
    @scala.inline
    def setSealedNull: Self = this.set("sealed", null)
  }
}

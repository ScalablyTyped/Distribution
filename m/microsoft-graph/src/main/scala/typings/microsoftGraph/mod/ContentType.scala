package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnLinks(value: NullableOption[js.Array[ColumnLink]]): Self = StObject.set(x, "columnLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnLinksNull: Self = StObject.set(x, "columnLinks", null)
    
    @scala.inline
    def setColumnLinksUndefined: Self = StObject.set(x, "columnLinks", js.undefined)
    
    @scala.inline
    def setColumnLinksVarargs(value: ColumnLink*): Self = StObject.set(x, "columnLinks", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGroup(value: NullableOption[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = StObject.set(x, "group", null)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setInheritedFrom(value: NullableOption[ItemReference]): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedFromNull: Self = StObject.set(x, "inheritedFrom", null)
    
    @scala.inline
    def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrder(value: NullableOption[ContentTypeOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setParentId(value: NullableOption[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdNull: Self = StObject.set(x, "parentId", null)
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setReadOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSealed(value: NullableOption[Boolean]): Self = StObject.set(x, "sealed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSealedNull: Self = StObject.set(x, "sealed", null)
    
    @scala.inline
    def setSealedUndefined: Self = StObject.set(x, "sealed", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentType
  extends StObject
     with Entity {
  
  // The collection of columns that are required by this content type
  var columnLinks: js.UndefOr[NullableOption[js.Array[ColumnLink]]] = js.undefined
  
  // The descriptive text for the item.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the group this content type belongs to. Helps organize related content types.
  var group: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the content type is hidden in the list's 'New' menu.
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * If this content type is inherited from another scope (like a site), provides a reference to the item where the content
    * type is defined.
    */
  var inheritedFrom: js.UndefOr[NullableOption[ItemReference]] = js.undefined
  
  // The name of the content type.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the order in which the content type appears in the selection UI.
  var order: js.UndefOr[NullableOption[ContentTypeOrder]] = js.undefined
  
  // The unique identifier of the content type.
  var parentId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // If true, the content type cannot be modified unless this value is first set to false.
  var readOnly: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * If true, the content type cannot be modified by users or through push-down operations. Only site collection
    * administrators can seal or unseal content types.
    */
  var `sealed`: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object ContentType {
  
  inline def apply(): ContentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentType]
  }
  
  extension [Self <: ContentType](x: Self) {
    
    inline def setColumnLinks(value: NullableOption[js.Array[ColumnLink]]): Self = StObject.set(x, "columnLinks", value.asInstanceOf[js.Any])
    
    inline def setColumnLinksNull: Self = StObject.set(x, "columnLinks", null)
    
    inline def setColumnLinksUndefined: Self = StObject.set(x, "columnLinks", js.undefined)
    
    inline def setColumnLinksVarargs(value: ColumnLink*): Self = StObject.set(x, "columnLinks", js.Array(value :_*))
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroup(value: NullableOption[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setInheritedFrom(value: NullableOption[ItemReference]): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    inline def setInheritedFromNull: Self = StObject.set(x, "inheritedFrom", null)
    
    inline def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrder(value: NullableOption[ContentTypeOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setParentId(value: NullableOption[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdNull: Self = StObject.set(x, "parentId", null)
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setReadOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSealed(value: NullableOption[Boolean]): Self = StObject.set(x, "sealed", value.asInstanceOf[js.Any])
    
    inline def setSealedNull: Self = StObject.set(x, "sealed", null)
    
    inline def setSealedUndefined: Self = StObject.set(x, "sealed", js.undefined)
  }
}

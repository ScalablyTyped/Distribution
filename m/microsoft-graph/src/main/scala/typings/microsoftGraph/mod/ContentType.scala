package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentType
  extends StObject
     with Entity {
  
  /**
    * List of canonical URLs for hub sites with which this content type is associated to. This will contain all hub sites
    * where this content type is queued to be enforced or is already enforced. Enforcing a content type means that the
    * content type will be applied to the lists in the enforced sites.
    */
  var associatedHubsUrls: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Parent contentType from which this content type is derived.
  var base: js.UndefOr[NullableOption[ContentType]] = js.undefined
  
  // The collection of content types that are ancestors of this content type.
  var baseTypes: js.UndefOr[NullableOption[js.Array[ContentType]]] = js.undefined
  
  // The collection of columns that are required by this content type.
  var columnLinks: js.UndefOr[NullableOption[js.Array[ColumnLink]]] = js.undefined
  
  // Column order information in a content type.
  var columnPositions: js.UndefOr[NullableOption[js.Array[ColumnDefinition]]] = js.undefined
  
  // The collection of column definitions for this contentType.
  var columns: js.UndefOr[NullableOption[js.Array[ColumnDefinition]]] = js.undefined
  
  // The descriptive text for the item.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Document Set metadata.
  var documentSet: js.UndefOr[NullableOption[DocumentSet]] = js.undefined
  
  /**
    * Document template metadata. To make sure that documents have consistent content across a site and its subsites, you can
    * associate a Word, Excel, or PowerPoint template with a site content type.
    */
  var documentTemplate: js.UndefOr[NullableOption[DocumentSetContent]] = js.undefined
  
  // The name of the group this content type belongs to. Helps organize related content types.
  var group: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the content type is hidden in the list's 'New' menu.
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * If this content type is inherited from another scope (like a site), provides a reference to the item where the content
    * type is defined.
    */
  var inheritedFrom: js.UndefOr[NullableOption[ItemReference]] = js.undefined
  
  // Specifies if a content type is a built-in content type.
  var isBuiltIn: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The name of the content type.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the order in which the content type appears in the selection UI.
  var order: js.UndefOr[NullableOption[ContentTypeOrder]] = js.undefined
  
  // The unique identifier of the content type.
  var parentId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * If true, any changes made to the content type will be pushed to inherited content types and lists that implement the
    * content type.
    */
  var propagateChanges: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If true, the content type can't be modified unless this value is first set to false.
  var readOnly: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * If true, the content type can't be modified by users or through push-down operations. Only site collection
    * administrators can seal or unseal content types.
    */
  var `sealed`: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object ContentType {
  
  inline def apply(): ContentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
    
    inline def setAssociatedHubsUrls(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "associatedHubsUrls", value.asInstanceOf[js.Any])
    
    inline def setAssociatedHubsUrlsNull: Self = StObject.set(x, "associatedHubsUrls", null)
    
    inline def setAssociatedHubsUrlsUndefined: Self = StObject.set(x, "associatedHubsUrls", js.undefined)
    
    inline def setAssociatedHubsUrlsVarargs(value: String*): Self = StObject.set(x, "associatedHubsUrls", js.Array(value*))
    
    inline def setBase(value: NullableOption[ContentType]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseNull: Self = StObject.set(x, "base", null)
    
    inline def setBaseTypes(value: NullableOption[js.Array[ContentType]]): Self = StObject.set(x, "baseTypes", value.asInstanceOf[js.Any])
    
    inline def setBaseTypesNull: Self = StObject.set(x, "baseTypes", null)
    
    inline def setBaseTypesUndefined: Self = StObject.set(x, "baseTypes", js.undefined)
    
    inline def setBaseTypesVarargs(value: ContentType*): Self = StObject.set(x, "baseTypes", js.Array(value*))
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setColumnLinks(value: NullableOption[js.Array[ColumnLink]]): Self = StObject.set(x, "columnLinks", value.asInstanceOf[js.Any])
    
    inline def setColumnLinksNull: Self = StObject.set(x, "columnLinks", null)
    
    inline def setColumnLinksUndefined: Self = StObject.set(x, "columnLinks", js.undefined)
    
    inline def setColumnLinksVarargs(value: ColumnLink*): Self = StObject.set(x, "columnLinks", js.Array(value*))
    
    inline def setColumnPositions(value: NullableOption[js.Array[ColumnDefinition]]): Self = StObject.set(x, "columnPositions", value.asInstanceOf[js.Any])
    
    inline def setColumnPositionsNull: Self = StObject.set(x, "columnPositions", null)
    
    inline def setColumnPositionsUndefined: Self = StObject.set(x, "columnPositions", js.undefined)
    
    inline def setColumnPositionsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columnPositions", js.Array(value*))
    
    inline def setColumns(value: NullableOption[js.Array[ColumnDefinition]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocumentSet(value: NullableOption[DocumentSet]): Self = StObject.set(x, "documentSet", value.asInstanceOf[js.Any])
    
    inline def setDocumentSetNull: Self = StObject.set(x, "documentSet", null)
    
    inline def setDocumentSetUndefined: Self = StObject.set(x, "documentSet", js.undefined)
    
    inline def setDocumentTemplate(value: NullableOption[DocumentSetContent]): Self = StObject.set(x, "documentTemplate", value.asInstanceOf[js.Any])
    
    inline def setDocumentTemplateNull: Self = StObject.set(x, "documentTemplate", null)
    
    inline def setDocumentTemplateUndefined: Self = StObject.set(x, "documentTemplate", js.undefined)
    
    inline def setGroup(value: NullableOption[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setInheritedFrom(value: NullableOption[ItemReference]): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    inline def setInheritedFromNull: Self = StObject.set(x, "inheritedFrom", null)
    
    inline def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    inline def setIsBuiltIn(value: NullableOption[Boolean]): Self = StObject.set(x, "isBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setIsBuiltInNull: Self = StObject.set(x, "isBuiltIn", null)
    
    inline def setIsBuiltInUndefined: Self = StObject.set(x, "isBuiltIn", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrder(value: NullableOption[ContentTypeOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setParentId(value: NullableOption[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdNull: Self = StObject.set(x, "parentId", null)
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setPropagateChanges(value: NullableOption[Boolean]): Self = StObject.set(x, "propagateChanges", value.asInstanceOf[js.Any])
    
    inline def setPropagateChangesNull: Self = StObject.set(x, "propagateChanges", null)
    
    inline def setPropagateChangesUndefined: Self = StObject.set(x, "propagateChanges", js.undefined)
    
    inline def setReadOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSealed(value: NullableOption[Boolean]): Self = StObject.set(x, "sealed", value.asInstanceOf[js.Any])
    
    inline def setSealedNull: Self = StObject.set(x, "sealed", null)
    
    inline def setSealedUndefined: Self = StObject.set(x, "sealed", js.undefined)
  }
}

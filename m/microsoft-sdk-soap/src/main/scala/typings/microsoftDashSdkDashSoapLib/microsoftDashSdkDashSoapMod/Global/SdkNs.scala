package typings
package microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk")
@js.native
object SdkNs extends js.Object {
  @js.native
  class AttributeBase () extends js.Object {
    /**
      * Gets whether the value of the attribute has changed.
      */
    def getIsChanged(): scala.Boolean = js.native
    /**
      * Gets the logical name of the attribute.
      */
    def getName(): java.lang.String = js.native
    /**
      * Gets the value type of the attribute.
      */
    def getType(): ValueType = js.native
    /**
      * Gets the value of the attribute.
      * The type of value depends on the type of attribute.
      */
    def getValue(): js.Any = js.native
    /**
      * Whether the value of the attribute is set.
      */
    def isValueSet(): scala.Boolean = js.native
    /**
      * Sets whether the value of the attribute has changed.
      * @param isChanged Whether the value of the attribute has changed.
      */
    def setIsChanged(isChanged: scala.Boolean): scala.Unit = js.native
    /**
      * Sets the name of the attribute
      * @param name The name of the attribute.
      */
    def setName(name: java.lang.String): scala.Unit = js.native
    /**
      * For internal use only.
      * @param type The type of the attribute.
      */
    def setType(`type`: ValueType): scala.Unit = js.native
    /**
      * Sets the general value of the attribute
      * @param name The value of the attribute.
      */
    def setValue(value: js.Any): scala.Unit = js.native
    /// prototype methods
    /**
      * XML node for Attribute.
      */
    def toXml(action: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  class AttributeCollection () extends Collection[AttributeBase] {
    def add(attribute: AttributeBase, isChanged: scala.Boolean): scala.Unit = js.native
    /**
      * Returns all attributes in the collection.
      */
    def get(): Collection[AttributeBase] = js.native
    /**
      * Returns the attribute with matching name.
      * @param attribuetName
      */
    def get(attribuetName: java.lang.String): AttributeBase = js.native
    /**
      * Returns the attribute with matching index.
      * @param attribuetName
      */
    def get(index: scala.Double): AttributeBase = js.native
    /**
      * Gets an attribute at a given index.
      * @param index The index.
      */
    def getAttributeByIndex(index: scala.Double): AttributeBase = js.native
    /**
      * Gets an attribute with a given name.
      * @param name The Logical name of the attribute.
      */
    def getAttributeByName(name: java.lang.String): AttributeBase = js.native
    /**
      * Gets the attributes in the collection.
      */
    def getAttributes(): Collection[AttributeBase] = js.native
    /**
      * Gets an array of the names of attributes in a collection.
      */
    def getNames(): js.Array[java.lang.String] = js.native
    /**
      * The XML for an attribute collection.
      */
    def toXml(action: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  class Boolean protected () extends AttributeBase {
    /**
      * A Boolean Attribute.
      * @param name The logical name of the attribute .
      * @param value The value of the managed property.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: scala.Boolean) = this()
    /**
      * Sets the value of a Boolean attribute.
      * @param value
      */
    def setValue(value: scala.Boolean): scala.Unit = js.native
  }
  
  @js.native
  class Collection[T] protected () extends js.Object {
    /**
      * A Collection for a specified type.
      * @param type The function that specifies the type.
      * @param items An array of items to add to the collection.
      */
    def this(`type`: T) = this()
    def this(`type`: T, items: js.Array[T]) = this()
    /**
      * Adds an item to the collection.
      * @param item An item to add to the collection.
      */
    def add(item: T): scala.Unit = js.native
    /**
      * Adds an array of objects to the collection.
      * @param items An array of items to add to the collection.
      */
    def addRange(items: js.Array[_]): scala.Unit = js.native
    /**
      * Removes all items from the collection.
      */
    def clear(): scala.Unit = js.native
    /**
      * Returns whether an object exists within the collection.
      * @param item The item to search in the collection.
      */
    def contains(item: T): scala.Boolean = js.native
    /**
      * Returns whether an object exists within the collection.
      * @param predicate A comparer function which is invoked for each item of the collection.
      */
    def contains(predicate: js.Function1[/* item */ T, scala.Boolean]): scala.Boolean = js.native
    /**
      * Applies the action contained within a delegate function.
      * @param fn Delegate function with parameters for item and index.
      */
    def forEach(fn: js.Function2[/* item */ T, /* index */ scala.Double, _]): scala.Unit = js.native
    /**
      * Gets the item in the collection at the specified index.
      * @param index The index of the item to return.
      */
    def getByIndex(index: scala.Double): T = js.native
    /**
      * Returns the number of items in the collection.
      */
    def getCount(): scala.Double = js.native
    /**
      * Gets the type defined for the collection.
      */
    def getType(): T = js.native
    /**
      * Removes an item from the collection.
      * @param item A reference to the item to be removed.
      */
    def remove(item: T): scala.Unit = js.native
    /**
      * Returns an Sdk.Collection that contains all the items of this collection that satisfy the specified predicate function.
      * @param predicate A predicate function that takes a collection item as argument and returns a boolean.
      */
    def select(predicate: js.Function1[/* item */ T, scala.Boolean]): Collection[T] = js.native
    /**
      * Gets a copy of the array of items in the collection.
      */
    def toArray(): js.Array[T] = js.native
  }
  
  @js.native
  class ColumnSet protected () extends js.Object {
    /**
      * Specifies the attributes for which non- null values are returned from a query.
      * @param allColumns If Boolean true value is passed as the first parameter all columns will be included. (Not recommended for production code).
      */
    def this(allColumns: scala.Boolean) = this()
    /**
      * Specifies the attributes for which non- null values are returned from a query.
      * @param columns Comma separated string values for attribute logical names.
      */
    def this(columns: java.lang.String*) = this()
    /**
      * Specifies the attributes for which non- null values are returned from a query.
      * @param columns An array of string values.
      */
    def this(columns: js.Array[java.lang.String]) = this()
    /**
      * Adds a column to the collection.
      * @param column The logical name of the attribute to add.
      */
    def addColumn(column: java.lang.String): scala.Unit = js.native
    /**
      * Adds a string array of column names.
      * @param columns A string array of column names.
      */
    def addColumns(columns: js.Array[java.lang.String]): scala.Unit = js.native
    /**
      * Whether all columns will be returned.
      */
    def getAllColumns(): scala.Boolean = js.native
    /**
      * Gets the collection of column names.
      * @returns The collection of column names.
      */
    def getColumns(): Collection[java.lang.String] = js.native
    /**
      * Gets the number of columns.
      */
    def getCount(): scala.Double = js.native
    /// prototype methods
    /**
      * Removes a column from the ColumnSet.
      * @param columnName The logical name of an attribute to be removed from the ColumnSet.
      * @param errorIfNotFound Whether to throw an error when the column to remove is not found. The default is false
      */
    def removeColumn(columnName: java.lang.String): scala.Unit = js.native
    def removeColumn(columnName: java.lang.String, errorIfNotFound: scala.Boolean): scala.Unit = js.native
    /**
      * Sets the AllColumns property.
      * @params allColumns A boolean value.
      */
    def setAllColumns(allColumns: scala.Boolean): scala.Unit = js.native
    /**
      * XML nodes for columnSet properties.
      */
    def toValueXml(): java.lang.String = js.native
    /**
      * The XML node with "<d:columnSet>" as the root element.
      */
    def toXml(): java.lang.String = js.native
  }
  
  @js.native
  class DateTime protected () extends AttributeBase {
    /**
      * A DateTime Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: stdLib.Date) = this()
    /**
      * Sets the value of a DateTime attribute.
      * @param value The value to set.
      */
    def setValue(value: stdLib.Date): scala.Unit = js.native
  }
  
  @js.native
  class Decimal protected () extends AttributeBase {
    /**
      * A Decimal Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: scala.Double) = this()
    /**
      * Sets the value of a Decimal attribute.
      * @param value The value to set.
      */
    def setValue(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  class Double protected () extends js.Object {
    /**
      * A Double Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: scala.Double) = this()
    /**
      * Gets the value of a Double attribute.
      */
    def getValue(): scala.Double = js.native
    /**
      * Sets the value of a Double attribute.
      * @param value The value to set.
      */
    def setValue(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  class Entity protected () extends js.Object {
    /**
      * Represents an instance of an entity (a record).
      * @param type The logical name of the entity.
      */
    def this(`type`: java.lang.String) = this()
    /**
      * Adds an attribute with an optional value to a newly instantiated Sdk.Entity
      * @param attribute The attribute to add
      * @param isChanged Whether the attribute should be considered changed, the default is true.
      */
    def addAttribute(attribute: AttributeBase): scala.Unit = js.native
    def addAttribute(attribute: AttributeBase, isChanged: scala.Boolean): scala.Unit = js.native
    /**
      * Adds an entity to the related entities.
      * @param relationshipSchemaName The relationship SchemaName.
      * @param entity The entity to add.
      */
    def addRelatedEntity(relationshipSchemaName: java.lang.String, entity: Entity): scala.Unit = js.native
    /**
      * Checks whether the entity has an attribute with the specified name.
      * @param The name of the attribute.
      */
    def containsAttribute(name: java.lang.String): scala.Boolean = js.native
    /**
      * Checks whether the entity has an attribute that satisfies the specified predicate.
      * @param A comparer function that takes an Sdk.AttributeBase as argument and returns a boolean.
      */
    def containsAttribute(predicate: js.Function1[/* attribute */ AttributeBase, scala.Boolean]): scala.Boolean = js.native
    /**
      * Gets the collection of attributes for the entity.
      */
    def getAttributes(): AttributeCollection = js.native
    /**
      * Gets the collection of attributes for the entity.
      * @param attributeName The attribute with matching name is returned.
      */
    def getAttributes(attributeName: java.lang.String): AttributeBase = js.native
    /**
      * Gets the collection of attributes for the entity.
      * @param index The attribute with matching index is returned.
      */
    def getAttributes(index: scala.Double): AttributeBase = js.native
    /**
      * Gets the state of the entity.
      */
    def getEntityState(): EntityState = js.native
    /**
      * Gets the collection of formatted values for the entity attributes.
      */
    def getFormattedValues(): FormattedValueCollection = js.native
    /**
      * Gets the Id of the record represented by this entity instance.
      */
    def getId(): java.lang.String = js.native
    /**
      * Gets the value to indicate whether data for the entity has changed.
      */
    def getIsChanged(): scala.Boolean = js.native
    /**
      * Gets a collection of related entities.
      */
    def getRelatedEntities(): RelatedEntitiesCollection = js.native
    /**
      * Gets the logical name of the entity.
      */
    def getType(): java.lang.String = js.native
    /**
      * Gets the value of the specified attribute.
      * @param logicalName The logical name of the attribute.
      */
    def getValue(logicalName: java.lang.String): js.Any = js.native
    /**
      * Generates properties for the entity based on metadata.
      */
    def initializeSubClass(
      metadata: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.IEntityMetadata
    ): scala.Unit = js.native
    /**
      * Sets the collection of attributes for the entity.
      * @param attributes The collection of attributes for the entity.
      */
    def setAttributes(attributes: AttributeCollection): scala.Unit = js.native
    /**
      * Sets the state of the entity.
      * @param state The state of the entity.
      */
    def setEntityState(state: EntityState): scala.Unit = js.native
    /**
      * Sets the collection of formatted values for the entity attributes.
      * @param values" The collection of formatted values for the entity attributes.
      */
    def setFormattedValues(values: FormattedValueCollection): scala.Unit = js.native
    /**
      * Sets the Id of the record represented by this entity instance.
      * @param id The Id of the record represented by this entity instance.
      * @param override Allow setting the Id property, for example when creating a new record from an existing one.
      */
    def setId(id: java.lang.String): scala.Unit = js.native
    def setId(id: java.lang.String, `override`: scala.Boolean): scala.Unit = js.native
    /**
      * Sets the value to indicate whether data for the entity has changed.
      * @param isChanged The value to indicate whether data for the entity has changed.
      */
    def setIsChanged(isChanged: scala.Boolean): scala.Unit = js.native
    /**
      * Sets a collection of related entities.
      * @param relatedEntities A collection of related entities.
      */
    def setRelatedEntities(relatedEntities: RelatedEntitiesCollection): scala.Unit = js.native
    /**
      * Sets the logical name of the entity.
      * @param type The logical name of the entity.
      */
    def setType(`type`: java.lang.String): scala.Unit = js.native
    /**
      * Sets the value of the specified attribute.
      * @param logicalName The logical name of the attribute.
      * @param value The value for the attribute. Simple JavaScript types may be used for most attribute types. Sdk.EntityReference, Sdk.EntityCollection, and Sdk.BooleanManagedPropertyValue cannot use simple JavaScript types.
      */
    def setValue(logicalName: java.lang.String, value: js.Object): scala.Unit = js.native
    /**
      * Generates an entity reference.
      */
    def toEntityReference(): EntityReference = js.native
    /**
      * XML definition of an the child nodes of an entity.
      * @param action
      */
    def toValueXml(action: java.lang.String): java.lang.String = js.native
    /**
      * XML definition of an entity where the root node is <entity>.
      */
    def toXml(action: java.lang.String): java.lang.String = js.native
    /**
      * Returns a view of the data in an entity instance
      */
    def view(): IEntityView = js.native
  }
  
  @js.native
  class EntityCollection protected () extends js.Object {
    /**
      * Contains a collection of entity instances.
      * @param entities Initializes a new instance of the EntityCollection class setting the Sdk.Collection of Sdk.Entity objects.
      */
    def this(entities: Collection[Entity]) = this()
    /**
      * Adds an entity to the collection.
      * @param entity
      */
    def addEntity(entity: Entity): scala.Unit = js.native
    /**
      * Gets the collection of entities.
      */
    def getEntities(): Collection[Entity] = js.native
    /**
      * Gets an entity in the collection.
      * @param id The id of the entity in the collection.
      */
    def getEntity(id: Guid): Entity = js.native
    /**
      * Gets an entity in the collection.
      * @param index The index of the entity in the collection.
      */
    def getEntity(index: scala.Double): Entity = js.native
    /**
      * Gets the logical name of the entity.
      */
    def getEntityName(): java.lang.String = js.native
    /**
      * Gets the lowest active row version value.
      */
    def getMinActiveRowVersion(): java.lang.String = js.native
    /**
      * Gets whether there are more records available.
      */
    def getMoreRecords(): scala.Boolean = js.native
    /**
      * Gets the current paging information.
      */
    def getPagingCookie(): java.lang.String = js.native
    /**
      * Gets the total number of records in the collection if ReturnTotalRecordCount was true when the query was executed.
      */
    def getTotalRecordCount(): scala.Double = js.native
    /**
      * Gets whether the results of the query exceeds the total record count.
      */
    def getTotalRecordCountLimitExceeded(): scala.Boolean = js.native
    /**
      * Sets an item in the collection.
      * @param id The Sdk.Guid id of the entity in the collection.
      * @param value The Sdk.Entity value to set.
      */
    def setEntity(id: Guid, value: Entity): scala.Unit = js.native
    /**
      * Sets an item in the collection.
      * @param index The index of the entity in the collection.
      * @param value The Sdk.Entity value to set.
      */
    def setEntity(index: scala.Double, value: Entity): scala.Unit = js.native
    /**
      * Sets the logical name of the entity.
      * @param name The logical name of the entity.
      */
    def setEntityName(name: java.lang.String): scala.Unit = js.native
    /**
      * Sets the lowest active row version value.
      * @param minActiveRowVersion The lowest active row version value.
      */
    def setMinActiveRowVersion(minActiveRowVersion: java.lang.String): scala.Unit = js.native
    /**
      * Sets whether there are more records available.
      * @param moreRecords Whether there are more records available.
      */
    def setMoreRecords(moreRecords: scala.Boolean): scala.Unit = js.native
    /**
      * Sets the current paging information.
      * @param pagingCookie The current paging information.
      */
    def setPagingCookie(pagingCookie: java.lang.String): scala.Unit = js.native
    /**
      * Sets the total number of records in the collection if ReturnTotalRecordCount was true when the query was executed.
      * @param totalRecordCount The total number of records in the collection if ReturnTotalRecordCount was true when the query was executed.
      */
    def setTotalRecordCount(totalRecordCount: scala.Double): scala.Unit = js.native
    /**
      * Sets whether the results of the query exceeds the total record count.
      * @param totalRecordCountLimitExceeded Whether the results of the query exceeds the total record count.
      */
    def setTotalRecordCountLimitExceeded(totalRecordCountLimitExceeded: scala.Boolean): scala.Unit = js.native
    /**
      * XML definition of an the child nodes of an entity.
      */
    def toValueXml(): java.lang.String = js.native
    /**
      * Returns a view of the entity collection
      */
    def view(): IEntityCollectionView = js.native
  }
  
  @js.native
  class EntityReference protected () extends js.Object {
    /**
      * Identifies a record.
      * @param logicalName The logical name of the entity.
      * @param id The id of the record.
      * @param name The value of the primary attribute of the entity instance. This property can contain a value or null. This property is not automatically populated unless the EntityReference object has been retrieved from the server.
      */
    def this(logicalName: java.lang.String, id: java.lang.String) = this()
    def this(logicalName: java.lang.String, id: java.lang.String, name: java.lang.String) = this()
    /**
      * Gets the Id value of the referenced entity.
      */
    def getId(): java.lang.String = js.native
    /**
      * Gets the primary attribute value of the referenced entity.
      */
    def getName(): java.lang.String = js.native
    /**
      * Gets the logicalName representing the type of referenced entity.
      */
    def getType(): java.lang.String = js.native
    /**
      * Sets the Id value of the entity.
      * @param id The Id value of the entity.
      */
    def setId(id: java.lang.String): scala.Unit = js.native
    /**
      * Sets the primary attribute value of the referenced entity.
      * @param name The primary attribute value of the referenced entity.
      */
    def setName(name: java.lang.String): scala.Unit = js.native
    /**
      * Sets the logicalName representing the type of referenced entity.
      * @param type The logicalName representing the type of referenced entity.
      */
    def setType(`type`: java.lang.String): scala.Unit = js.native
    /**
      * Returns the values of serialized entity reference as XML nodes.
      */
    def toValueXml(): java.lang.String = js.native
    /// prototype methods
    /**
      * Returns a serialized entity reference where the root element is <a:EntityReference>.
      */
    def toXml(): java.lang.String = js.native
    /**
      * Returns a view of the data in an EntityReference
      */
    def view(): IEntityReferenceView = js.native
  }
  
  @js.native
  /**
    * Contains a collection of EntityReference instances.
    * @param entityReferences Initializes a new instance of the EntityReferenceCollection class setting the Sdk.Collection of Sdk.EntityReference objects.
    */
  class EntityReferenceCollection () extends js.Object {
    def this(entityReferences: Collection[EntityReference]) = this()
    /**
      * Gets the collection of entity references.
      */
    def getEntityReferences(): Collection[EntityReference] = js.native
    /// prototype methods
    /**
      * Removes an entity reference to the collection.
      * @param entityReference The entity reference to remove.
      */
    def remove(entityReference: EntityReference): scala.Unit = js.native
    /**
      * Sets the collection of entity references.
      * @param entityReferences The entity references
      */
    def setEntityReferences(entityReferences: Collection[EntityReference]): scala.Unit = js.native
    /**
      * Returns the values of serialized entity reference collection as XML nodes.
      */
    def toValueXml(): java.lang.String = js.native
    /**
      * Returns a view of the data in an entity reference collection instance.
      */
    def view(): IEntityReferenceCollectionView = js.native
  }
  
  @js.native
  class EntityState () extends js.Object
  
  /**
    * Contains the data that is needed to convert a query in FetchXML to a QueryExpression.
    * @param fetchXml Sets the query to convert.
    */
  @js.native
  class FetchXmlToQueryExpressionRequest protected () extends OrganizationRequest {
    def this(fetchXml: java.lang.String) = this()
    /**
      * Sets the query to convert.
      * @param The query to convert.
      */
    def setFetchXml(value: java.lang.String): scala.Unit = js.native
  }
  
  /**
    * Response to FetchXmlToQueryExpressionRequest.
    * @param responseXml The response XML to the FetchXmlToQueryExpressionRequest.
    */
  @js.native
  class FetchXmlToQueryExpressionResponse protected () extends OrganizationResponse {
    def this(responseXml: java.lang.String) = this()
    /**
      * Gets the results of the query conversion.
      */
    def getQuery(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.QueryExpression = js.native
  }
  
  @js.native
  class FormattedValueCollection () extends js.Object
  
  @js.native
  class Guid protected () extends AttributeBase {
    /**
      * A Guid Attribute.
      * @param name The logical name of the attribute.
      * @param value" The value of the attribute
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: java.lang.String) = this()
    /**
      * Sets the value of a Guid attribute.
      * @param value The value to set.
      */
    def setValue(value: java.lang.String): scala.Unit = js.native
  }
  
  trait IEntityCollectionView extends js.Object {
    var entities: js.Array[IEntityView]
    var entityName: java.lang.String
    var minActiveRowVersion: java.lang.String
    var moreRecords: scala.Boolean
    var pagingCookie: java.lang.String
    var totalRecordCount: scala.Double
    var totalRecordCountLimitExceeded: scala.Boolean
  }
  
  trait IEntityReferenceView extends js.Object {
    var Id: java.lang.String
    var Name: java.lang.String
    var Type: java.lang.String
  }
  
  trait IEntityView extends js.Object {
    var attributes: AttributeCollection
    var entityState: EntityState
    var id: java.lang.String
    var logicalName: java.lang.String
    var relatedEntities: RelatedEntityCollection
  }
  
  @js.native
  class Int protected () extends AttributeBase {
    /**
      * An Integer Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: scala.Double) = this()
    /**
      * Sets the value of an Integer attribute.
      * @param value The value to set.
      */
    def setValue(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  class Long protected () extends AttributeBase {
    /**
      * A Long Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: scala.Double) = this()
    /**
      * Sets the value of a Long attribute.
      * @param value The value to set.
      */
    def setValue(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  class Lookup protected () extends AttributeBase {
    /**
      * A Lookup Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: EntityReference) = this()
    /**
      * Sets the value of a Lookup attribute.
      * @param value The value to set.
      */
    def setValue(value: EntityReference): scala.Unit = js.native
  }
  
  @js.native
  class Money protected () extends AttributeBase {
    /**
      * A Money Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: scala.Double) = this()
    /**
      * Sets the value of a Money attribute.
      * @param value The value to set.
      */
    def setValue(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  class OptionSet protected () extends AttributeBase {
    /**
      * An OptionSet Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: scala.Double) = this()
    /**
      * Sets the value of an OptionSet attribute.
      * @param value The value to set.
      */
    def setValue(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  class OrganizationRequest () extends js.Object {
    /**
      * Gets the request XML.
      */
    def getRequestXml(): java.lang.String = js.native
    /**
      * Gets the response type.
      */
    def getResponseType(): OrganizationResponse = js.native
    /**
      * Sets the request XML.
      * @param xml The request XML.
      */
    def setRequestXml(xml: java.lang.String): scala.Unit = js.native
    /**
      * Sets the response type.
      * @param type A class that inherits from Sdk.OrganizationResponse.
      */
    def setResponseType(`type`: OrganizationResponse): scala.Unit = js.native
  }
  
  @js.native
  class OrganizationResponse () extends js.Object
  
  @js.native
  class PartyList protected () extends AttributeBase {
    /**
      * A PartyList Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: EntityCollection) = this()
    /**
      * Sets the value of a PartyList attribute.
      * @param value The value to set.
      */
    def setValue(value: EntityCollection): scala.Unit = js.native
  }
  
  @js.native
  class Q () extends js.Object
  
  /**
    * Contains the data that is needed to  convert a query, which is represented as a QueryExpression class, to its equivalent query, which is represented as FetchXML.
    * @param query The query.
    */
  @js.native
  class QueryExpressionToFetchXmlRequest protected () extends OrganizationRequest {
    def this(query: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.QueryBase) = this()
    /**
      * Sets the query to convert.
      * @param query The query.
      * @param query
      */
    def setQuery(query: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.QueryBase): scala.Unit = js.native
  }
  
  /**
    * Response to QueryExpressionToFetchXmlRequest.
    */
  @js.native
  class QueryExpressionToFetchXmlResponse protected () extends OrganizationResponse {
    def this(responseXml: java.lang.String) = this()
    /**
      * Gets the results of the query conversion.
      */
    def getFetchXml(): java.lang.String = js.native
  }
  
  @js.native
  class RelatedEntitiesCollection () extends js.Object
  
  @js.native
  class RelatedEntityCollection () extends EntityCollection
  
  /**
    * Request to retrieve metadata and metadata changes.
    * @param query The Sdk.Mdq.EntityQueryExpression that defines the query.
    * @param clientVersionStamp The Sdk.Mdq.RetrieveMetadataChangesResponse.ServerVersionStamp value from a previous request. When included only the metadata changes since the previous request will be returned.
    * @param deletedMetadataFilters An Sdk.Mdq.DeletedMetadataFilters enumeration value. When included the deleted metadata changes will be limited to the types defined by the enumeration.
    */
  @js.native
  class RetrieveMetadataChangesRequest protected () extends OrganizationRequest {
    def this(query: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityQueryExpression) = this()
    def this(query: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityQueryExpression, clientVersionStamp: java.lang.String) = this()
    def this(query: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityQueryExpression, clientVersionStamp: java.lang.String, deletedMetadataFilters: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.DeletedMetadataFilters) = this()
    def getDeletedMetadata(): js.Object = js.native
    def getEntityMetadata(): js.Array[
        microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.IEntityMetadata
      ] = js.native
    def getServerVersionStamp(): java.lang.String = js.native
  }
  
  /**
    * Response to RetrieveMetadataChangesRequest.
    * @param resopnseXml The response XML.
    */
  @js.native
  class RetrieveMetadataChangesResponse protected () extends js.Object {
    def this(responseXml: java.lang.String) = this()
    /***
      *
      */
    def getDeletedMetadata(): js.Any = js.native
    /***
      *
      */
    def getEntityMetadata(): js.Array[
        microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.IEntityMetadata
      ] = js.native
    /***
      *
      */
    def getServerVersionStamp(): java.lang.String = js.native
  }
  
  /**
    * Contains the data that is needed to set the state of an entity record.
    * @param entityMoniker Sets the entity.
    * @param state Sets the state of the entity record.
    * @param status Sets the status that corresponds to the State property.
    */
  @js.native
  class SetStateRequest protected () extends OrganizationRequest {
    def this(entityMoniker: EntityReference, state: scala.Double, status: scala.Double) = this()
    /**
      * Sets the entity.
      * @param value The entity.
      */
    def setEntityMoniker(value: EntityReference): scala.Unit = js.native
    /**
      * Sets the state of the entity record.
      * @param value The state of the entity record.
      */
    def setState(value: scala.Double): scala.Unit = js.native
    /**
      * Sets the status that corresponds to the State property.
      * @param value The status that corresponds to the State property.
      */
    def setStatus(value: scala.Double): scala.Unit = js.native
  }
  
  /**
    * Response to SetStateRequest.
    */
  @js.native
  class SetStateResponse protected () extends js.Object {
    def this(responseXml: java.lang.String) = this()
  }
  
  @js.native
  class String protected () extends AttributeBase {
    /**
      * A String Attribute.
      * @param name The logical name of the attribute.
      * @param value The value of the attribute.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, value: java.lang.String) = this()
    /**
      * Sets the value of a String attribute.
      * @param value The value to set.
      */
    def setValue(value: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class ValueType () extends js.Object
  
  @JSName("Mdq")
  @js.native
  object MdqNs extends js.Object {
    /* Rewritten from type alias, can be one of: 
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.DoNotDisplay
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.UseCollectionName
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.UseLabel
    */
    trait AssociatedMenuBehavior extends js.Object
    
    trait AssociatedMenuConfiguration extends js.Object {
      var Behavior: AssociatedMenuBehavior
      var Group: AssociatedMenuGroup
      var Label: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.Label
      var Order: scala.Double
    }
    
    /* Rewritten from type alias, can be one of: 
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Details
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Marketing
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Sales
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Service
    */
    trait AssociatedMenuGroup extends js.Object
    
    @js.native
    sealed trait AttributeMetadataProperties extends js.Object
    
    @js.native
    class AttributeQueryExpression protected () extends js.Object {
      def this(criteria: MetadataFilterExpression, properties: MetadataPropertiesExpression) = this()
    }
    
    trait CascadeConfiguration extends js.Object {
      var Assign: CascadeType
      var Delete: CascadeType
      var ExtensionData: CascadeType
      var Merge: CascadeType
      var Reparent: CascadeType
      var Share: CascadeType
      var Unshare: CascadeType
    }
    
    /* Rewritten from type alias, can be one of: 
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Active
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Cascade
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.NoCascade
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.UserOwned
    */
    trait CascadeType extends js.Object
    
    @js.native
    sealed trait DeletedMetadataFilters extends js.Object
    
    @js.native
    sealed trait EntityMetadataProperties extends js.Object
    
    @js.native
    class EntityQueryExpression protected () extends js.Object {
      def this(criteria: MetadataFilterExpression, properties: MetadataPropertiesExpression) = this()
      def this(criteria: MetadataFilterExpression, properties: MetadataPropertiesExpression, attributeQuery: AttributeQueryExpression) = this()
      def this(criteria: MetadataFilterExpression, properties: MetadataPropertiesExpression, attributeQuery: AttributeQueryExpression, relationshipQuery: RelationshipQueryExpression) = this()
      def this(criteria: MetadataFilterExpression, properties: MetadataPropertiesExpression, attributeQuery: AttributeQueryExpression, relationshipQuery: RelationshipQueryExpression, labelQuery: LabelQueryExpression) = this()
    }
    
    trait IAttributeMetadata extends js.Object {
      var AttributeOf: java.lang.String
      var AttributeType: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Customer | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.DateTime | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Decimal | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Double | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.EntityName | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Integer | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Lookup | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.ManagedProperty | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Memo | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Money | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Owner | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.PartyList | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Picklist | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.State | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Status | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Uniqueidentifier | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Virtual
      var AttributeTypeName: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.BigIntType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.BooleanType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.CalendarRulesType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.CustomerType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.DateTimeType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.DecimalType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.DoubleType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.EntityNameType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.ImageType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.IntegerType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.LookupType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.ManagedPropertyType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.MemoType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.MoneyType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.OwnerType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.PartyListType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.PicklistType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.StateTypeBACKSLASHtStatusType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.StringType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.UniqueidentifierType | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.VirtualType
      var CalculationOf: js.Any
      var CanBeSecuredForCreate: scala.Boolean
      var CanBeSecuredForRead: scala.Boolean
      var CanBeSecuredForUpdate: scala.Boolean
      var CanModifyAdditionalSettings: ManagedProperty[scala.Boolean]
      var ColumnNumber: scala.Double
      var DefaultFormValue: js.Any
      var DefaultValue: js.Any
      var DeprecatedVersion: js.Any
      var Description: Label
      var DisplayName: Label
      var EntityLogicalName: java.lang.String
      var Format: js.Any
      var FormatName: java.lang.String
      var ImeMode: js.Any
      var IntroducedVersion: js.Any
      var IsAuditEnabled: scala.Boolean
      var IsCustomAttribute: scala.Boolean
      var IsCustomizable: ManagedProperty[scala.Boolean]
      var IsManaged: scala.Boolean
      var IsPrimaryId: scala.Boolean
      var IsPrimaryName: scala.Boolean
      var IsRenameable: ManagedProperty[scala.Boolean]
      var IsSecured: scala.Boolean
      var IsValidForAdvancedFind: ManagedProperty[scala.Boolean]
      var IsValidForCreate: scala.Boolean
      var IsValidForRead: scala.Boolean
      var IsValidForUpdate: scala.Boolean
      var LinkedAttributeId: java.lang.String
      var LogicalName: java.lang.String
      var MaxLength: scala.Double
      var MaxValue: js.Any
      var MetadataId: java.lang.String
      var MinValue: scala.Double
      var OptionSet: js.Any
      var Precision: js.Any
      var PrecisionSource: js.Any
      var RequiredLevel: ManagedProperty[java.lang.String]
      var SchemaName: java.lang.String
      var Targets: js.Array[java.lang.String]
      var YomiOf: js.Any
    }
    
    trait IEntityMetadata extends js.Object {
      var ActivityTypeMask: scala.Double
      var Attributes: js.Array[IAttributeMetadata]
      var AutoCreateAccessTeams: js.Any
      var AutoRouteToOwnerQueue: scala.Boolean
      var CanBeInManyToMany: ManagedProperty[scala.Boolean]
      var CanBePrimaryEntityInRelationship: ManagedProperty[scala.Boolean]
      var CanBeRelatedEntityInRelationship: ManagedProperty[scala.Boolean]
      var CanCreateAttributes: ManagedProperty[scala.Boolean]
      var CanCreateCharts: ManagedProperty[scala.Boolean]
      var CanCreateForms: ManagedProperty[scala.Boolean]
      var CanCreateViews: ManagedProperty[scala.Boolean]
      var CanModifyAdditionalSettings: ManagedProperty[scala.Boolean]
      var CanTriggerWorkflow: scala.Boolean
      var Description: Label
      var DisplayCollectionName: Label
      var DisplayName: Label
      var IconLargeName: java.lang.String
      var IconMediumName: java.lang.String
      var IconSmallName: java.lang.String
      var IntroducedVersion: js.Any
      var IsAIRUpdated: scala.Boolean
      var IsActivity: scala.Boolean
      var IsActivityParty: scala.Boolean
      var IsAuditEnabled: ManagedProperty[scala.Boolean]
      var IsAvailableOffline: scala.Boolean
      var IsBusinessProcessEnabled: scala.Boolean
      var IsChildEntity: scala.Boolean
      var IsConnectionsEnabled: ManagedProperty[scala.Boolean]
      var IsCustomEntity: scala.Boolean
      var IsCustomizable: ManagedProperty[scala.Boolean]
      var IsDocumentManagementEnabled: scala.Boolean
      var IsDuplicateDetectionEnabled: ManagedProperty[scala.Boolean]
      var IsEnabledForCharts: scala.Boolean
      var IsImportable: scala.Boolean
      var IsIntersect: scala.Boolean
      var IsMailMergeEnabled: ManagedProperty[scala.Boolean]
      var IsManaged: scala.Boolean
      var IsMappable: ManagedProperty[scala.Boolean]
      var IsQuickCreateEnabled: scala.Boolean
      var IsReadingPaneEnabled: scala.Boolean
      var IsRenameable: scala.Boolean
      var IsValidForAdvancedFind: scala.Boolean
      var IsValidForQueue: ManagedProperty[scala.Boolean]
      var IsVisibleInMobile: ManagedProperty[scala.Boolean]
      var IsVisibleInMobileClient: scala.Boolean
      var LogicalName: java.lang.String
      var ManyToManyRelationships: ManyToManyRelationshipMetadata
      var ManyToOneRelationships: OneToManyRelationshipMetadata
      var MetadataId: java.lang.String
      var ObjectTypeCode: scala.Double
      var OneToManyRelationships: OneToManyRelationshipMetadata
      var OwnershipType: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.BusinessOwned | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.BusinessParented | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.NoneBACKSLASHtOrganizationOwned | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.TeamOwnedBACKSLASHtUserOwned
      var PrimaryIdAttribute: java.lang.String
      var PrimaryImageAttribute: java.lang.String
      var PrimaryNameAttribute: java.lang.String
      var Privileges: js.Array[SecurityPrivilegeMetadata]
      var RecurrenceBaseEntityLogicalName: java.lang.String
      var ReportViewName: java.lang.String
      var SchemaName: java.lang.String
    }
    
    trait Label extends js.Object {
      var LocalizedLabels: js.Array[LocalizedLabel]
      var UserLocalizedLabel: LocalizedLabel
    }
    
    @js.native
    class LabelQueryExpression protected () extends js.Object {
      def this(languages: js.Array[scala.Double]) = this()
    }
    
    trait LocalizedLabel extends js.Object {
      var HasChanged: scala.Boolean
      var IsManaged: scala.Boolean
      var Label: java.lang.String
      var LangaugeCode: scala.Double
      var MetadataId: java.lang.String
    }
    
    @js.native
    sealed trait LogicalOperator extends js.Object
    
    trait ManagedProperty[T] extends js.Object {
      var CanBeChanged: scala.Boolean
      var ManagedPropertyLogicalName: java.lang.String
      var Value: T
    }
    
    trait ManyToManyRelationshipMetadata extends js.Object {
      var Entity1AssociatedMenuConfiguration: AssociatedMenuConfiguration
      var Entity1IntersectAttribute: java.lang.String
      var Entity1LogicalName: java.lang.String
      var Entity2AssociatedMenuConfiguration: AssociatedMenuConfiguration
      var Entity2IntersectAttribute: java.lang.String
      var Entity2LogicalName: java.lang.String
      var HasChanged: scala.Boolean
      var IntersectEntityName: java.lang.String
      var IntroducedVersion: js.Any
      var IsCustomRelationship: scala.Boolean
      var IsCustomizable: ManagedProperty[scala.Boolean]
      var IsManaged: scala.Boolean
      var IsValidForAdvancedFind: scala.Boolean
      var MetadataId: java.lang.String
      var RelationshipType: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipType
      var SchemaName: java.lang.String
      var SecurityTypes: SecurityType
    }
    
    @js.native
    sealed trait MetadataConditionOperator extends js.Object
    
    @js.native
    class MetadataFilterExpression protected () extends js.Object {
      def this(filterOperator: LogicalOperator) = this()
      def addCondition(propertyName: SearchableAttributeMetadataProperties, conditionOperator: MetadataConditionOperator): scala.Unit = js.native
      def addCondition(
        propertyName: SearchableAttributeMetadataProperties,
        conditionOperator: MetadataConditionOperator,
        value: js.Any
      ): scala.Unit = js.native
      def addCondition(
        propertyName: SearchableAttributeMetadataProperties,
        conditionOperator: MetadataConditionOperator,
        value: js.Object
      ): scala.Unit = js.native
      /**
        * Adds a condition. This method accepts either the properties to create a new Sdk.Mdq.MetadataConditionExpression or a Sdk.Mdq.MetadataConditionExpression as the first argument.
        * @param propertyName The metadata property to evaluate.
        * @param conditionOperator The condition operator.
        * @param value The metadata value to evaluate.
        */
      def addCondition(
        propertyName: SearchableEntityMetadataProperties,
        conditionOperator: MetadataConditionOperator,
        value: js.Object
      ): scala.Unit = js.native
      def addCondition(
        propertyName: SearchableRelationshipMetadataProperties,
        conditionOperator: MetadataConditionOperator,
        value: js.Object
      ): scala.Unit = js.native
    }
    
    @js.native
    class MetadataPropertiesExpression protected () extends js.Object {
      def this(allProperties: scala.Boolean) = this()
      def this(allProperties: scala.Boolean, propertyNames: js.Array[
              EntityMetadataProperties | AttributeMetadataProperties | RelationshipMetadataProperties | _
            ]) = this()
    }
    
    trait OneToManyRelationshipMetadata extends js.Object {
      var AssociatedMenuConfiguration: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AssociatedMenuConfiguration
      var CascadeConfiguration: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.CascadeConfiguration
      var HasChanged: js.Any
      var IntroducedVersion: js.Any
      var IsCustomRelationship: scala.Boolean
      var IsCustomizable: ManagedProperty[scala.Boolean]
      var IsHierarchical: js.Any
      var IsManaged: scala.Boolean
      var IsValidForAdvancedFind: scala.Boolean
      var MetadataId: java.lang.String
      var ReferencedAttribute: java.lang.String
      var ReferencedEntity: java.lang.String
      var ReferencingAttribute: java.lang.String
      var ReferencingEntity: java.lang.String
      var RelationshipType: java.lang.String
      var SchemaName: java.lang.String
      var SecurityTypes: js.Any
    }
    
    @js.native
    sealed trait RelationshipMetadataProperties extends js.Object
    
    @js.native
    class RelationshipQueryExpression protected () extends js.Object {
      def this(criteria: MetadataFilterExpression, properties: MetadataPropertiesExpression) = this()
    }
    
    /* Rewritten from type alias, can be one of: 
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Default
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.ManyToManyRelationship
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.OneToManyRelationship
    */
    trait RelationshipType extends js.Object
    
    @js.native
    sealed trait SearchableAttributeMetadataProperties extends js.Object
    
    @js.native
    sealed trait SearchableEntityMetadataProperties extends js.Object
    
    @js.native
    sealed trait SearchableRelationshipMetadataProperties extends js.Object
    
    trait SecurityPrivilegeMetadata extends js.Object {
      var CanBeBasic: scala.Boolean
      var CanBeDeep: scala.Boolean
      var CanBeEntityReference: scala.Boolean
      var CanBeGlobal: scala.Boolean
      var CanBeLocal: scala.Boolean
      var CanBeParentEntityReference: scala.Boolean
      var ExtensionData: scala.Boolean
      var Name: java.lang.String
      var PrivilegeId: java.lang.String
      var PrivilegeType: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Append | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.AppendTo | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Assign | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Create | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Delete | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.None | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Read | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Share | microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Write
    }
    
    /* Rewritten from type alias, can be one of: 
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Append
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Inheritance
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.None
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.ParentChild
      - microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapLibStrings.Pointer
    */
    trait SecurityType extends js.Object
    
    @js.native
    object AttributeMetadataProperties extends js.Object {
      @js.native
      sealed trait AttributeOf
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait AttributeType
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait AttributeTypeName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait CalculationOf
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait CanBeSecuredForCreate
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait CanBeSecuredForRead
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait CanBeSecuredForUpdate
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait CanModifyAdditionalSettings
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait ColumnNumber
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait DefaultFormValue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait DefaultValue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait DeprecatedVersion
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait Description
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait DisplayName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait EntityLogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait Format
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait FormatName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait ImeMode
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IntroducedVersion
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsAuditEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsCustomAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsCustomizable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsManaged
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsPrimaryId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsPrimaryName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsRenameable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsSecured
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsValidForAdvancedFind
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsValidForCreate
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsValidForRead
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait IsValidForUpdate
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait LinkedAttributeId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait LogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait MaxLength
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait MaxValue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait MetadataId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait MinValue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait OptionSet
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait Precision
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait PrecisionSource
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait RequiredLevel
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait SchemaName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait Targets
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      @js.native
      sealed trait YomiOf
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties
      
      /* 0 */ val AttributeOf: AttributeOf with scala.Double = js.native
      /* 1 */ val AttributeType: AttributeType with scala.Double = js.native
      /* 2 */ val AttributeTypeName: AttributeTypeName with scala.Double = js.native
      /* 3 */ val CalculationOf: CalculationOf with scala.Double = js.native
      /* 4 */ val CanBeSecuredForCreate: CanBeSecuredForCreate with scala.Double = js.native
      /* 5 */ val CanBeSecuredForRead: CanBeSecuredForRead with scala.Double = js.native
      /* 6 */ val CanBeSecuredForUpdate: CanBeSecuredForUpdate with scala.Double = js.native
      /* 7 */ val CanModifyAdditionalSettings: CanModifyAdditionalSettings with scala.Double = js.native
      /* 8 */ val ColumnNumber: ColumnNumber with scala.Double = js.native
      /* 9 */ val DefaultFormValue: DefaultFormValue with scala.Double = js.native
      /* 10 */ val DefaultValue: DefaultValue with scala.Double = js.native
      /* 11 */ val DeprecatedVersion: DeprecatedVersion with scala.Double = js.native
      /* 12 */ val Description: Description with scala.Double = js.native
      /* 13 */ val DisplayName: DisplayName with scala.Double = js.native
      /* 14 */ val EntityLogicalName: EntityLogicalName with scala.Double = js.native
      /* 15 */ val Format: Format with scala.Double = js.native
      /* 16 */ val FormatName: FormatName with scala.Double = js.native
      /* 17 */ val ImeMode: ImeMode with scala.Double = js.native
      /* 18 */ val IntroducedVersion: IntroducedVersion with scala.Double = js.native
      /* 19 */ val IsAuditEnabled: IsAuditEnabled with scala.Double = js.native
      /* 20 */ val IsCustomAttribute: IsCustomAttribute with scala.Double = js.native
      /* 21 */ val IsCustomizable: IsCustomizable with scala.Double = js.native
      /* 22 */ val IsManaged: IsManaged with scala.Double = js.native
      /* 23 */ val IsPrimaryId: IsPrimaryId with scala.Double = js.native
      /* 24 */ val IsPrimaryName: IsPrimaryName with scala.Double = js.native
      /* 25 */ val IsRenameable: IsRenameable with scala.Double = js.native
      /* 26 */ val IsSecured: IsSecured with scala.Double = js.native
      /* 27 */ val IsValidForAdvancedFind: IsValidForAdvancedFind with scala.Double = js.native
      /* 28 */ val IsValidForCreate: IsValidForCreate with scala.Double = js.native
      /* 29 */ val IsValidForRead: IsValidForRead with scala.Double = js.native
      /* 30 */ val IsValidForUpdate: IsValidForUpdate with scala.Double = js.native
      /* 31 */ val LinkedAttributeId: LinkedAttributeId with scala.Double = js.native
      /* 32 */ val LogicalName: LogicalName with scala.Double = js.native
      /* 33 */ val MaxLength: MaxLength with scala.Double = js.native
      /* 34 */ val MaxValue: MaxValue with scala.Double = js.native
      /* 35 */ val MetadataId: MetadataId with scala.Double = js.native
      /* 36 */ val MinValue: MinValue with scala.Double = js.native
      /* 37 */ val OptionSet: OptionSet with scala.Double = js.native
      /* 38 */ val Precision: Precision with scala.Double = js.native
      /* 39 */ val PrecisionSource: PrecisionSource with scala.Double = js.native
      /* 40 */ val RequiredLevel: RequiredLevel with scala.Double = js.native
      /* 41 */ val SchemaName: SchemaName with scala.Double = js.native
      /* 42 */ val Targets: Targets with scala.Double = js.native
      /* 43 */ val YomiOf: YomiOf with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.AttributeMetadataProperties with scala.Double
          ] = js.native
    }
    
    @js.native
    object DeletedMetadataFilters extends js.Object {
       // All deleted metadata
      @js.native
      sealed trait All
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.DeletedMetadataFilters
      
       // Deleted Attribute metadata
      @js.native
      sealed trait Attribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.DeletedMetadataFilters
      
       // The value used if not set. Equals Entity
      @js.native
      sealed trait Default
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.DeletedMetadataFilters
      
       //Deleted Entity metadata
      @js.native
      sealed trait Entity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.DeletedMetadataFilters
      
       //Deleted Label metadata
      @js.native
      sealed trait Label
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.DeletedMetadataFilters
      
       // Deleted OptionSet metadata
      @js.native
      sealed trait OptionSet
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.DeletedMetadataFilters
      
       //Deleted Relationship metadata
      @js.native
      sealed trait Relationship
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.DeletedMetadataFilters
      
      /* 0 */ val All: All with scala.Double = js.native
      /* 1 */ val Attribute: Attribute with scala.Double = js.native
      /* 2 */ val Default: Default with scala.Double = js.native
      /* 3 */ val Entity: Entity with scala.Double = js.native
      /* 4 */ val Label: Label with scala.Double = js.native
      /* 5 */ val OptionSet: OptionSet with scala.Double = js.native
      /* 6 */ val Relationship: Relationship with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.DeletedMetadataFilters with scala.Double
          ] = js.native
    }
    
    @js.native
    object EntityMetadataProperties extends js.Object {
      @js.native
      sealed trait ActivityTypeMask
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait Attributes
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait AutoCreateAccessTeams
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait AutoRouteToOwnerQueue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait CanBeInManyToMany
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait CanBePrimaryEntityInRelationship
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait CanBeRelatedEntityInRelationship
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait CanCreateAttributes
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait CanCreateCharts
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait CanCreateForms
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait CanCreateViews
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait CanModifyAdditionalSettings
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait CanTriggerWorkflow
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait Description
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait DisplayCollectionName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait DisplayName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IconLargeName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IconMediumName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IconSmallName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IntroducedVersion
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsAIRUpdated
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsActivity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsActivityParty
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsAuditEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsAvailableOffline
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsBusinessProcessEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsChildEntity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsConnectionsEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsCustomEntity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsCustomizable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsDocumentManagementEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsDuplicateDetectionEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsEnabledForCharts
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsImportable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsIntersect
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsMailMergeEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsManaged
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsMappable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsQuickCreateEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsReadingPaneEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsRenameable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsValidForAdvancedFind
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsValidForQueue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsVisibleInMobile
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait IsVisibleInMobileClient
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait LogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait ManyToManyRelationships
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait ManyToOneRelationships
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait MetadataId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait ObjectTypeCode
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait OneToManyRelationships
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait OwnershipType
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait PrimaryIdAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait PrimaryImageAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait PrimaryNameAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait Privileges
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait RecurrenceBaseEntityLogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait ReportViewName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      @js.native
      sealed trait SchemaName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties
      
      /* 0 */ val ActivityTypeMask: ActivityTypeMask with scala.Double = js.native
      /* 1 */ val Attributes: Attributes with scala.Double = js.native
      /* 2 */ val AutoCreateAccessTeams: AutoCreateAccessTeams with scala.Double = js.native
      /* 3 */ val AutoRouteToOwnerQueue: AutoRouteToOwnerQueue with scala.Double = js.native
      /* 4 */ val CanBeInManyToMany: CanBeInManyToMany with scala.Double = js.native
      /* 5 */ val CanBePrimaryEntityInRelationship: CanBePrimaryEntityInRelationship with scala.Double = js.native
      /* 6 */ val CanBeRelatedEntityInRelationship: CanBeRelatedEntityInRelationship with scala.Double = js.native
      /* 7 */ val CanCreateAttributes: CanCreateAttributes with scala.Double = js.native
      /* 8 */ val CanCreateCharts: CanCreateCharts with scala.Double = js.native
      /* 9 */ val CanCreateForms: CanCreateForms with scala.Double = js.native
      /* 10 */ val CanCreateViews: CanCreateViews with scala.Double = js.native
      /* 11 */ val CanModifyAdditionalSettings: CanModifyAdditionalSettings with scala.Double = js.native
      /* 12 */ val CanTriggerWorkflow: CanTriggerWorkflow with scala.Double = js.native
      /* 13 */ val Description: Description with scala.Double = js.native
      /* 14 */ val DisplayCollectionName: DisplayCollectionName with scala.Double = js.native
      /* 15 */ val DisplayName: DisplayName with scala.Double = js.native
      /* 16 */ val IconLargeName: IconLargeName with scala.Double = js.native
      /* 17 */ val IconMediumName: IconMediumName with scala.Double = js.native
      /* 18 */ val IconSmallName: IconSmallName with scala.Double = js.native
      /* 19 */ val IntroducedVersion: IntroducedVersion with scala.Double = js.native
      /* 22 */ val IsAIRUpdated: IsAIRUpdated with scala.Double = js.native
      /* 20 */ val IsActivity: IsActivity with scala.Double = js.native
      /* 21 */ val IsActivityParty: IsActivityParty with scala.Double = js.native
      /* 23 */ val IsAuditEnabled: IsAuditEnabled with scala.Double = js.native
      /* 24 */ val IsAvailableOffline: IsAvailableOffline with scala.Double = js.native
      /* 25 */ val IsBusinessProcessEnabled: IsBusinessProcessEnabled with scala.Double = js.native
      /* 26 */ val IsChildEntity: IsChildEntity with scala.Double = js.native
      /* 27 */ val IsConnectionsEnabled: IsConnectionsEnabled with scala.Double = js.native
      /* 28 */ val IsCustomEntity: IsCustomEntity with scala.Double = js.native
      /* 29 */ val IsCustomizable: IsCustomizable with scala.Double = js.native
      /* 30 */ val IsDocumentManagementEnabled: IsDocumentManagementEnabled with scala.Double = js.native
      /* 31 */ val IsDuplicateDetectionEnabled: IsDuplicateDetectionEnabled with scala.Double = js.native
      /* 32 */ val IsEnabledForCharts: IsEnabledForCharts with scala.Double = js.native
      /* 33 */ val IsImportable: IsImportable with scala.Double = js.native
      /* 34 */ val IsIntersect: IsIntersect with scala.Double = js.native
      /* 35 */ val IsMailMergeEnabled: IsMailMergeEnabled with scala.Double = js.native
      /* 36 */ val IsManaged: IsManaged with scala.Double = js.native
      /* 37 */ val IsMappable: IsMappable with scala.Double = js.native
      /* 38 */ val IsQuickCreateEnabled: IsQuickCreateEnabled with scala.Double = js.native
      /* 39 */ val IsReadingPaneEnabled: IsReadingPaneEnabled with scala.Double = js.native
      /* 40 */ val IsRenameable: IsRenameable with scala.Double = js.native
      /* 41 */ val IsValidForAdvancedFind: IsValidForAdvancedFind with scala.Double = js.native
      /* 42 */ val IsValidForQueue: IsValidForQueue with scala.Double = js.native
      /* 43 */ val IsVisibleInMobile: IsVisibleInMobile with scala.Double = js.native
      /* 44 */ val IsVisibleInMobileClient: IsVisibleInMobileClient with scala.Double = js.native
      /* 45 */ val LogicalName: LogicalName with scala.Double = js.native
      /* 46 */ val ManyToManyRelationships: ManyToManyRelationships with scala.Double = js.native
      /* 47 */ val ManyToOneRelationships: ManyToOneRelationships with scala.Double = js.native
      /* 48 */ val MetadataId: MetadataId with scala.Double = js.native
      /* 49 */ val ObjectTypeCode: ObjectTypeCode with scala.Double = js.native
      /* 50 */ val OneToManyRelationships: OneToManyRelationships with scala.Double = js.native
      /* 51 */ val OwnershipType: OwnershipType with scala.Double = js.native
      /* 52 */ val PrimaryIdAttribute: PrimaryIdAttribute with scala.Double = js.native
      /* 53 */ val PrimaryImageAttribute: PrimaryImageAttribute with scala.Double = js.native
      /* 54 */ val PrimaryNameAttribute: PrimaryNameAttribute with scala.Double = js.native
      /* 55 */ val Privileges: Privileges with scala.Double = js.native
      /* 56 */ val RecurrenceBaseEntityLogicalName: RecurrenceBaseEntityLogicalName with scala.Double = js.native
      /* 57 */ val ReportViewName: ReportViewName with scala.Double = js.native
      /* 58 */ val SchemaName: SchemaName with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.EntityMetadataProperties with scala.Double
          ] = js.native
    }
    
    @js.native
    object LogicalOperator extends js.Object {
      @js.native
      sealed trait And
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.LogicalOperator
      
      @js.native
      sealed trait Or
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.LogicalOperator
      
      /* 0 */ val And: And with scala.Double = js.native
      /* 1 */ val Or: Or with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.LogicalOperator with scala.Double
          ] = js.native
    }
    
    @js.native
    object MetadataConditionOperator extends js.Object {
      @js.native
      sealed trait Equals
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.MetadataConditionOperator
      
      @js.native
      sealed trait GreaterThan
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.MetadataConditionOperator
      
      @js.native
      sealed trait In
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.MetadataConditionOperator
      
      @js.native
      sealed trait LessThan
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.MetadataConditionOperator
      
      @js.native
      sealed trait NotEquals
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.MetadataConditionOperator
      
      @js.native
      sealed trait NotIn
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.MetadataConditionOperator
      
      /* 0 */ val Equals: Equals with scala.Double = js.native
      /* 4 */ val GreaterThan: GreaterThan with scala.Double = js.native
      /* 2 */ val In: In with scala.Double = js.native
      /* 5 */ val LessThan: LessThan with scala.Double = js.native
      /* 1 */ val NotEquals: NotEquals with scala.Double = js.native
      /* 3 */ val NotIn: NotIn with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.MetadataConditionOperator with scala.Double
          ] = js.native
    }
    
    @js.native
    object RelationshipMetadataProperties extends js.Object {
      @js.native
      sealed trait AssociatedMenuConfiguration
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait CascadeConfiguration
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait Entity1AssociatedMenuConfiguration
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait Entity1IntersectAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait Entity1LogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait Entity2AssociatedMenuConfiguration
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait Entity2IntersectAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait Entity2LogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait HasChanged
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait IntersectEntityName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait IntroducedVersion
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait IsCustomRelationship
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait IsCustomizable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait IsManaged
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait IsValidForAdvancedFind
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait MetadataId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait ReferencedAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait ReferencedEntity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait ReferencingAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait ReferencingEntity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait RelationshipType
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait SchemaName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      @js.native
      sealed trait SecurityTypes
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties
      
      /* 0 */ val AssociatedMenuConfiguration: AssociatedMenuConfiguration with scala.Double = js.native
      /* 1 */ val CascadeConfiguration: CascadeConfiguration with scala.Double = js.native
      /* 3 */ val Entity1AssociatedMenuConfiguration: Entity1AssociatedMenuConfiguration with scala.Double = js.native
      /* 4 */ val Entity1IntersectAttribute: Entity1IntersectAttribute with scala.Double = js.native
      /* 5 */ val Entity1LogicalName: Entity1LogicalName with scala.Double = js.native
      /* 6 */ val Entity2AssociatedMenuConfiguration: Entity2AssociatedMenuConfiguration with scala.Double = js.native
      /* 7 */ val Entity2IntersectAttribute: Entity2IntersectAttribute with scala.Double = js.native
      /* 8 */ val Entity2LogicalName: Entity2LogicalName with scala.Double = js.native
      /* 2 */ val HasChanged: HasChanged with scala.Double = js.native
      /* 9 */ val IntersectEntityName: IntersectEntityName with scala.Double = js.native
      /* 11 */ val IntroducedVersion: IntroducedVersion with scala.Double = js.native
      /* 12 */ val IsCustomRelationship: IsCustomRelationship with scala.Double = js.native
      /* 10 */ val IsCustomizable: IsCustomizable with scala.Double = js.native
      /* 13 */ val IsManaged: IsManaged with scala.Double = js.native
      /* 14 */ val IsValidForAdvancedFind: IsValidForAdvancedFind with scala.Double = js.native
      /* 15 */ val MetadataId: MetadataId with scala.Double = js.native
      /* 16 */ val ReferencedAttribute: ReferencedAttribute with scala.Double = js.native
      /* 17 */ val ReferencedEntity: ReferencedEntity with scala.Double = js.native
      /* 18 */ val ReferencingAttribute: ReferencingAttribute with scala.Double = js.native
      /* 19 */ val ReferencingEntity: ReferencingEntity with scala.Double = js.native
      /* 20 */ val RelationshipType: RelationshipType with scala.Double = js.native
      /* 21 */ val SchemaName: SchemaName with scala.Double = js.native
      /* 22 */ val SecurityTypes: SecurityTypes with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.RelationshipMetadataProperties with scala.Double
          ] = js.native
    }
    
    @js.native
    object SearchableAttributeMetadataProperties extends js.Object {
      @js.native
      sealed trait AttributeOf
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait AttributeType
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait CalculationOf
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait CanBeSecuredForCreate
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait CanBeSecuredForRead
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait CanBeSecuredForUpdate
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait CanModifyAdditionalSettings
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait ColumnNumber
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait DefaultFormValue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait DefaultValue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait DeprecatedVersion
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait EntityLogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait Format
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait FormatName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait ImeMode
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IntroducedVersion
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsAuditEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsCustomAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsCustomizable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsManaged
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsPrimaryId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsPrimaryName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsRenameable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsSecured
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsValidForAdvancedFind
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsValidForCreate
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsValidForRead
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait IsValidForUpdate
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait LinkedAttributeId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait LogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait MaxLength
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait MaxValue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait MetadataId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait MinValue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait Precision
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait PrecisionSource
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait RequiredLevel
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait SchemaName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      @js.native
      sealed trait YomiOf
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties
      
      /* 0 */ val AttributeOf: AttributeOf with scala.Double = js.native
      /* 1 */ val AttributeType: AttributeType with scala.Double = js.native
      /* 2 */ val CalculationOf: CalculationOf with scala.Double = js.native
      /* 3 */ val CanBeSecuredForCreate: CanBeSecuredForCreate with scala.Double = js.native
      /* 4 */ val CanBeSecuredForRead: CanBeSecuredForRead with scala.Double = js.native
      /* 5 */ val CanBeSecuredForUpdate: CanBeSecuredForUpdate with scala.Double = js.native
      /* 6 */ val CanModifyAdditionalSettings: CanModifyAdditionalSettings with scala.Double = js.native
      /* 7 */ val ColumnNumber: ColumnNumber with scala.Double = js.native
      /* 8 */ val DefaultFormValue: DefaultFormValue with scala.Double = js.native
      /* 9 */ val DefaultValue: DefaultValue with scala.Double = js.native
      /* 10 */ val DeprecatedVersion: DeprecatedVersion with scala.Double = js.native
      /* 11 */ val EntityLogicalName: EntityLogicalName with scala.Double = js.native
      /* 12 */ val Format: Format with scala.Double = js.native
      /* 13 */ val FormatName: FormatName with scala.Double = js.native
      /* 14 */ val ImeMode: ImeMode with scala.Double = js.native
      /* 15 */ val IntroducedVersion: IntroducedVersion with scala.Double = js.native
      /* 16 */ val IsAuditEnabled: IsAuditEnabled with scala.Double = js.native
      /* 17 */ val IsCustomAttribute: IsCustomAttribute with scala.Double = js.native
      /* 18 */ val IsCustomizable: IsCustomizable with scala.Double = js.native
      /* 19 */ val IsManaged: IsManaged with scala.Double = js.native
      /* 20 */ val IsPrimaryId: IsPrimaryId with scala.Double = js.native
      /* 21 */ val IsPrimaryName: IsPrimaryName with scala.Double = js.native
      /* 22 */ val IsRenameable: IsRenameable with scala.Double = js.native
      /* 23 */ val IsSecured: IsSecured with scala.Double = js.native
      /* 24 */ val IsValidForAdvancedFind: IsValidForAdvancedFind with scala.Double = js.native
      /* 25 */ val IsValidForCreate: IsValidForCreate with scala.Double = js.native
      /* 26 */ val IsValidForRead: IsValidForRead with scala.Double = js.native
      /* 27 */ val IsValidForUpdate: IsValidForUpdate with scala.Double = js.native
      /* 28 */ val LinkedAttributeId: LinkedAttributeId with scala.Double = js.native
      /* 29 */ val LogicalName: LogicalName with scala.Double = js.native
      /* 30 */ val MaxLength: MaxLength with scala.Double = js.native
      /* 31 */ val MaxValue: MaxValue with scala.Double = js.native
      /* 32 */ val MetadataId: MetadataId with scala.Double = js.native
      /* 33 */ val MinValue: MinValue with scala.Double = js.native
      /* 34 */ val Precision: Precision with scala.Double = js.native
      /* 35 */ val PrecisionSource: PrecisionSource with scala.Double = js.native
      /* 36 */ val RequiredLevel: RequiredLevel with scala.Double = js.native
      /* 37 */ val SchemaName: SchemaName with scala.Double = js.native
      /* 38 */ val YomiOf: YomiOf with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableAttributeMetadataProperties with scala.Double
          ] = js.native
    }
    
    @js.native
    object SearchableEntityMetadataProperties extends js.Object {
      @js.native
      sealed trait ActivityTypeMask
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait AutoCreateAccessTeams
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait AutoRouteToOwnerQueue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait CanBeInManyToMany
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait CanBePrimaryEntityInRelationship
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait CanBeRelatedEntityInRelationship
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait CanCreateAttributes
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait CanCreateCharts
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait CanCreateForms
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait CanCreateViews
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait CanModifyAdditionalSettings
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait CanTriggerWorkflow
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IconLargeName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IconMediumName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IconSmallName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IntroducedVersion
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsAIRUpdated
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsActivity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsActivityParty
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsAuditEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsAvailableOffline
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsBusinessProcessEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsChildEntity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsConnectionsEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsCustomEntity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsCustomizable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsDocumentManagementEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsDuplicateDetectionEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsEnabledForCharts
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsImportable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsIntersect
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsMailMergeEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsManaged
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsMappable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsQuickCreateEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsReadingPaneEnabled
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsRenameable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsValidForAdvancedFind
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsValidForQueue
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsVisibleInMobile
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait IsVisibleInMobileClient
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait LogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait MetadataId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait ObjectTypeCode
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait OwnershipType
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait PrimaryIdAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait PrimaryImageAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait PrimaryNameAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait RecurrenceBaseEntityLogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait ReportViewName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      @js.native
      sealed trait SchemaName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties
      
      /* 0 */ val ActivityTypeMask: ActivityTypeMask with scala.Double = js.native
      /* 1 */ val AutoCreateAccessTeams: AutoCreateAccessTeams with scala.Double = js.native
      /* 2 */ val AutoRouteToOwnerQueue: AutoRouteToOwnerQueue with scala.Double = js.native
      /* 3 */ val CanBeInManyToMany: CanBeInManyToMany with scala.Double = js.native
      /* 4 */ val CanBePrimaryEntityInRelationship: CanBePrimaryEntityInRelationship with scala.Double = js.native
      /* 5 */ val CanBeRelatedEntityInRelationship: CanBeRelatedEntityInRelationship with scala.Double = js.native
      /* 6 */ val CanCreateAttributes: CanCreateAttributes with scala.Double = js.native
      /* 7 */ val CanCreateCharts: CanCreateCharts with scala.Double = js.native
      /* 8 */ val CanCreateForms: CanCreateForms with scala.Double = js.native
      /* 9 */ val CanCreateViews: CanCreateViews with scala.Double = js.native
      /* 10 */ val CanModifyAdditionalSettings: CanModifyAdditionalSettings with scala.Double = js.native
      /* 11 */ val CanTriggerWorkflow: CanTriggerWorkflow with scala.Double = js.native
      /* 12 */ val IconLargeName: IconLargeName with scala.Double = js.native
      /* 13 */ val IconMediumName: IconMediumName with scala.Double = js.native
      /* 14 */ val IconSmallName: IconSmallName with scala.Double = js.native
      /* 15 */ val IntroducedVersion: IntroducedVersion with scala.Double = js.native
      /* 18 */ val IsAIRUpdated: IsAIRUpdated with scala.Double = js.native
      /* 16 */ val IsActivity: IsActivity with scala.Double = js.native
      /* 17 */ val IsActivityParty: IsActivityParty with scala.Double = js.native
      /* 19 */ val IsAuditEnabled: IsAuditEnabled with scala.Double = js.native
      /* 20 */ val IsAvailableOffline: IsAvailableOffline with scala.Double = js.native
      /* 21 */ val IsBusinessProcessEnabled: IsBusinessProcessEnabled with scala.Double = js.native
      /* 22 */ val IsChildEntity: IsChildEntity with scala.Double = js.native
      /* 23 */ val IsConnectionsEnabled: IsConnectionsEnabled with scala.Double = js.native
      /* 24 */ val IsCustomEntity: IsCustomEntity with scala.Double = js.native
      /* 25 */ val IsCustomizable: IsCustomizable with scala.Double = js.native
      /* 26 */ val IsDocumentManagementEnabled: IsDocumentManagementEnabled with scala.Double = js.native
      /* 27 */ val IsDuplicateDetectionEnabled: IsDuplicateDetectionEnabled with scala.Double = js.native
      /* 28 */ val IsEnabledForCharts: IsEnabledForCharts with scala.Double = js.native
      /* 29 */ val IsImportable: IsImportable with scala.Double = js.native
      /* 30 */ val IsIntersect: IsIntersect with scala.Double = js.native
      /* 31 */ val IsMailMergeEnabled: IsMailMergeEnabled with scala.Double = js.native
      /* 32 */ val IsManaged: IsManaged with scala.Double = js.native
      /* 33 */ val IsMappable: IsMappable with scala.Double = js.native
      /* 34 */ val IsQuickCreateEnabled: IsQuickCreateEnabled with scala.Double = js.native
      /* 35 */ val IsReadingPaneEnabled: IsReadingPaneEnabled with scala.Double = js.native
      /* 36 */ val IsRenameable: IsRenameable with scala.Double = js.native
      /* 37 */ val IsValidForAdvancedFind: IsValidForAdvancedFind with scala.Double = js.native
      /* 38 */ val IsValidForQueue: IsValidForQueue with scala.Double = js.native
      /* 39 */ val IsVisibleInMobile: IsVisibleInMobile with scala.Double = js.native
      /* 40 */ val IsVisibleInMobileClient: IsVisibleInMobileClient with scala.Double = js.native
      /* 41 */ val LogicalName: LogicalName with scala.Double = js.native
      /* 42 */ val MetadataId: MetadataId with scala.Double = js.native
      /* 43 */ val ObjectTypeCode: ObjectTypeCode with scala.Double = js.native
      /* 44 */ val OwnershipType: OwnershipType with scala.Double = js.native
      /* 45 */ val PrimaryIdAttribute: PrimaryIdAttribute with scala.Double = js.native
      /* 46 */ val PrimaryImageAttribute: PrimaryImageAttribute with scala.Double = js.native
      /* 47 */ val PrimaryNameAttribute: PrimaryNameAttribute with scala.Double = js.native
      /* 48 */ val RecurrenceBaseEntityLogicalName: RecurrenceBaseEntityLogicalName with scala.Double = js.native
      /* 49 */ val ReportViewName: ReportViewName with scala.Double = js.native
      /* 50 */ val SchemaName: SchemaName with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableEntityMetadataProperties with scala.Double
          ] = js.native
    }
    
    @js.native
    object SearchableRelationshipMetadataProperties extends js.Object {
      @js.native
      sealed trait Entity1IntersectAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait Entity1LogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait Entity2IntersectAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait Entity2LogicalName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait HasChanged
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait IntersectEntityName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait IntroducedVersion
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait IsCustomRelationship
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait IsCustomizable
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait IsManaged
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait IsValidForAdvancedFind
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait MetadataId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait ReferencedAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait ReferencedEntity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait ReferencingAttribute
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait ReferencingEntity
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait RelationshipType
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait SchemaName
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      @js.native
      sealed trait SecurityTypes
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties
      
      /* 1 */ val Entity1IntersectAttribute: Entity1IntersectAttribute with scala.Double = js.native
      /* 2 */ val Entity1LogicalName: Entity1LogicalName with scala.Double = js.native
      /* 3 */ val Entity2IntersectAttribute: Entity2IntersectAttribute with scala.Double = js.native
      /* 4 */ val Entity2LogicalName: Entity2LogicalName with scala.Double = js.native
      /* 0 */ val HasChanged: HasChanged with scala.Double = js.native
      /* 5 */ val IntersectEntityName: IntersectEntityName with scala.Double = js.native
      /* 7 */ val IntroducedVersion: IntroducedVersion with scala.Double = js.native
      /* 8 */ val IsCustomRelationship: IsCustomRelationship with scala.Double = js.native
      /* 6 */ val IsCustomizable: IsCustomizable with scala.Double = js.native
      /* 9 */ val IsManaged: IsManaged with scala.Double = js.native
      /* 10 */ val IsValidForAdvancedFind: IsValidForAdvancedFind with scala.Double = js.native
      /* 11 */ val MetadataId: MetadataId with scala.Double = js.native
      /* 12 */ val ReferencedAttribute: ReferencedAttribute with scala.Double = js.native
      /* 13 */ val ReferencedEntity: ReferencedEntity with scala.Double = js.native
      /* 14 */ val ReferencingAttribute: ReferencingAttribute with scala.Double = js.native
      /* 15 */ val ReferencingEntity: ReferencingEntity with scala.Double = js.native
      /* 16 */ val RelationshipType: RelationshipType with scala.Double = js.native
      /* 17 */ val SchemaName: SchemaName with scala.Double = js.native
      /* 18 */ val SecurityTypes: SecurityTypes with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.SearchableRelationshipMetadataProperties with scala.Double
          ] = js.native
    }
    
    @JSName("ValueEnums")
    @js.native
    object ValueEnumsNs extends js.Object {
      @js.native
      sealed trait AttributeRequiredLevel extends js.Object
      
      @js.native
      sealed trait AttributeTypeCode extends js.Object
      
      @js.native
      sealed trait DateTimeFormat extends js.Object
      
      @js.native
      sealed trait ImeMode extends js.Object
      
      @js.native
      sealed trait IntegerFormat extends js.Object
      
      @js.native
      sealed trait OwnershipType extends js.Object
      
      @js.native
      sealed trait SecurityTypes extends js.Object
      
      @js.native
      sealed trait StringFormat extends js.Object
      
      @js.native
      object AttributeRequiredLevel extends js.Object {
        @js.native
        sealed trait ApplicationRequired
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeRequiredLevel
        
        @js.native
        sealed trait None
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeRequiredLevel
        
        @js.native
        sealed trait Recommended
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeRequiredLevel
        
        @js.native
        sealed trait SystemRequired
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeRequiredLevel
        
        /* 0 */ val ApplicationRequired: ApplicationRequired with scala.Double = js.native
        /* 1 */ val None: None with scala.Double = js.native
        /* 2 */ val Recommended: Recommended with scala.Double = js.native
        /* 3 */ val SystemRequired: SystemRequired with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeRequiredLevel with scala.Double
              ] = js.native
      }
      
      @js.native
      object AttributeTypeCode extends js.Object {
        @js.native
        sealed trait BigInt
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Boolean
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait CalendarRules
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Customer
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait DateTime
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Decimal
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Double
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait EntityName
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Integer
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Lookup
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait ManagedProperty
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Memo
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Money
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Owner
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait PartyList
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Picklist
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait State
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Status
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait String
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Uniqueidentifier
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        @js.native
        sealed trait Virtual
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode
        
        /* 0 */ val BigInt: BigInt with scala.Double = js.native
        /* 1 */ val Boolean: Boolean with scala.Double = js.native
        /* 2 */ val CalendarRules: CalendarRules with scala.Double = js.native
        /* 3 */ val Customer: Customer with scala.Double = js.native
        /* 4 */ val DateTime: DateTime with scala.Double = js.native
        /* 5 */ val Decimal: Decimal with scala.Double = js.native
        /* 6 */ val Double: Double with scala.Double = js.native
        /* 7 */ val EntityName: EntityName with scala.Double = js.native
        /* 8 */ val Integer: Integer with scala.Double = js.native
        /* 9 */ val Lookup: Lookup with scala.Double = js.native
        /* 10 */ val ManagedProperty: ManagedProperty with scala.Double = js.native
        /* 11 */ val Memo: Memo with scala.Double = js.native
        /* 12 */ val Money: Money with scala.Double = js.native
        /* 13 */ val Owner: Owner with scala.Double = js.native
        /* 14 */ val PartyList: PartyList with scala.Double = js.native
        /* 15 */ val Picklist: Picklist with scala.Double = js.native
        /* 16 */ val State: State with scala.Double = js.native
        /* 17 */ val Status: Status with scala.Double = js.native
        /* 18 */ val String: String with scala.Double = js.native
        /* 19 */ val Uniqueidentifier: Uniqueidentifier with scala.Double = js.native
        /* 20 */ val Virtual: Virtual with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.AttributeTypeCode with scala.Double
              ] = js.native
      }
      
      @js.native
      object DateTimeFormat extends js.Object {
        @js.native
        sealed trait DateAndTime
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.DateTimeFormat
        
        @js.native
        sealed trait DateOnly
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.DateTimeFormat
        
        /* 0 */ val DateAndTime: DateAndTime with scala.Double = js.native
        /* 1 */ val DateOnly: DateOnly with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.DateTimeFormat with scala.Double
              ] = js.native
      }
      
      @js.native
      object ImeMode extends js.Object {
        @js.native
        sealed trait Active
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.ImeMode
        
        @js.native
        sealed trait Auto
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.ImeMode
        
        @js.native
        sealed trait Disabled
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.ImeMode
        
        @js.native
        sealed trait Inactive
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.ImeMode
        
        /* 0 */ val Active: Active with scala.Double = js.native
        /* 1 */ val Auto: Auto with scala.Double = js.native
        /* 2 */ val Disabled: Disabled with scala.Double = js.native
        /* 3 */ val Inactive: Inactive with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.ImeMode with scala.Double
              ] = js.native
      }
      
      @js.native
      object IntegerFormat extends js.Object {
        @js.native
        sealed trait Duration
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.IntegerFormat
        
        @js.native
        sealed trait Language
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.IntegerFormat
        
        @js.native
        sealed trait Locale
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.IntegerFormat
        
        @js.native
        sealed trait None
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.IntegerFormat
        
        @js.native
        sealed trait TimeZone
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.IntegerFormat
        
        /* 0 */ val Duration: Duration with scala.Double = js.native
        /* 1 */ val Language: Language with scala.Double = js.native
        /* 2 */ val Locale: Locale with scala.Double = js.native
        /* 3 */ val None: None with scala.Double = js.native
        /* 4 */ val TimeZone: TimeZone with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.IntegerFormat with scala.Double
              ] = js.native
      }
      
      @js.native
      object OwnershipType extends js.Object {
        @js.native
        sealed trait None
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.OwnershipType
        
        @js.native
        sealed trait OrganizationOwned
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.OwnershipType
        
        @js.native
        sealed trait TeamOwned
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.OwnershipType
        
        @js.native
        sealed trait UserOwned
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.OwnershipType
        
        /* 0 */ val None: None with scala.Double = js.native
        /* 1 */ val OrganizationOwned: OrganizationOwned with scala.Double = js.native
        /* 2 */ val TeamOwned: TeamOwned with scala.Double = js.native
        /* 3 */ val UserOwned: UserOwned with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.OwnershipType with scala.Double
              ] = js.native
      }
      
      @js.native
      object SecurityTypes extends js.Object {
        @js.native
        sealed trait Append
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.SecurityTypes
        
        @js.native
        sealed trait Inheritance
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.SecurityTypes
        
        @js.native
        sealed trait None
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.SecurityTypes
        
        @js.native
        sealed trait ParentChild
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.SecurityTypes
        
        @js.native
        sealed trait Pointer
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.SecurityTypes
        
        /* 0 */ val Append: Append with scala.Double = js.native
        /* 1 */ val Inheritance: Inheritance with scala.Double = js.native
        /* 2 */ val None: None with scala.Double = js.native
        /* 3 */ val ParentChild: ParentChild with scala.Double = js.native
        /* 4 */ val Pointer: Pointer with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.SecurityTypes with scala.Double
              ] = js.native
      }
      
      @js.native
      object StringFormat extends js.Object {
        @js.native
        sealed trait Email
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.StringFormat
        
        @js.native
        sealed trait PhoneticGuide
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.StringFormat
        
        @js.native
        sealed trait Text
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.StringFormat
        
        @js.native
        sealed trait TextArea
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.StringFormat
        
        @js.native
        sealed trait TickerSymbol
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.StringFormat
        
        @js.native
        sealed trait Url
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.StringFormat
        
        @js.native
        sealed trait VersionNumber
          extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.StringFormat
        
        /* 0 */ val Email: Email with scala.Double = js.native
        /* 1 */ val PhoneticGuide: PhoneticGuide with scala.Double = js.native
        /* 2 */ val Text: Text with scala.Double = js.native
        /* 3 */ val TextArea: TextArea with scala.Double = js.native
        /* 4 */ val TickerSymbol: TickerSymbol with scala.Double = js.native
        /* 5 */ val Url: Url with scala.Double = js.native
        /* 6 */ val VersionNumber: VersionNumber with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.MdqNs.ValueEnumsNs.StringFormat with scala.Double
              ] = js.native
      }
      
    }
    
  }
  
  /* static members */
  @js.native
  object Q extends js.Object {
    /**
      * Creates a link between records.
      * @param entityName The logical name of the entity that is specified in the entityId parameter.
      * @param entityId The ID of the record to which the related records are associated.
      * @param relationship The name of the relationship to be used to create the link.
      * @param relatedEntities A collection of Sdk.EntityReference objects to be associated.
      */
    def associate(
      entityName: java.lang.String,
      entityId: java.lang.String,
      relationship: java.lang.String,
      relatedEntities: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[
          microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.EntityReference
        ]
    ): qLib.qMod.Promise[scala.Unit] = js.native
    /**
      * Creates an entity record and returns a string representation of the GUID value that is the Id of the created entity.
      * @param entity An entity instance.
      */
    def create(entity: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Entity): qLib.qMod.Promise[java.lang.String] = js.native
    /**
      * Deletes an entity record
      * @param entityName The LogicalName of the entity to delete.
      * @param id An ID of the record to delete.
      */
    def del(entityName: java.lang.String, id: java.lang.String): qLib.qMod.Promise[scala.Unit] = js.native
    /**
      * Removes a link between records.
      * @param entityName The logical name of the entity that is specified in the entityId parameter.
      * @param entityId The ID of the record to which the related records are disassociated.
      * @param relationship The name of the relationship to be used to remove the link.
      * @param relatedEntities A collection of Sdk.EntityReference objects to be disassociated.
      */
    def disassociate(
      entityName: java.lang.String,
      entityId: java.lang.String,
      relationship: java.lang.String,
      relatedEntities: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[
          microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.EntityReference
        ]
    ): qLib.qMod.Promise[scala.Unit] = js.native
    /**
      * Executes a SOAP Request using the SOAPAction Execute.
      * @param request A request object.
      */
    def execute(request: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.OrganizationRequest): qLib.qMod.Promise[
        microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.OrganizationResponse
      ] = js.native
    /**
      * Retrieves an entity instance.
      * @param entityName The logical name of the entity to retrieve.
      * @param id The id of the entity to retrieve.
      * @param columnSet The columns of the entities to retrieve.
      */
    def retrieve(
      entityName: java.lang.String,
      id: java.lang.String,
      columnSet: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.ColumnSet
    ): qLib.qMod.Promise[microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Entity] = js.native
    /**
      * Retrieves the results of a query
      * @param query An Sdk.Query.FetchExpression query.
      */
    def retrieveMultiple(
      query: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.FetchExpression
    ): qLib.qMod.Promise[
        microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.EntityCollection
      ] = js.native
    /**
      * Retrieves the results of a query
      * @param query An Sdk.Query.QueryByAttribute query.
      */
    def retrieveMultiple(
      query: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.QueryByAttribute
    ): qLib.qMod.Promise[
        microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.EntityCollection
      ] = js.native
    /**
      * Retrieves the results of a query
      * @param query An Sdk.Query.QueryExpression query.
      */
    def retrieveMultiple(
      query: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.QueryExpression
    ): qLib.qMod.Promise[
        microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.EntityCollection
      ] = js.native
    /**
      * Updates an entity instance.
      * @param entity An entity instance to update.
      */
    def update(entity: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Entity): qLib.qMod.Promise[scala.Boolean] = js.native
  }
  
  @JSName("Query")
  @js.native
  object QueryNs extends js.Object {
    /**
      * Specifies Boolean values to be compared in the query.
      * @param args An array of Boolean values.
      */
    @js.native
    class Booleans protected () extends ValueBase {
      def this(args: js.Array[scala.Boolean]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of boolean values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[scala.Boolean] = js.native
      /**
        * Specifies a Boolean value to be compared in the query.
        * @param setValueArgs An array of boolean values.
        */
      def setValues(setValueArgs: js.Array[scala.Boolean]): scala.Unit = js.native
    }
    
    @js.native
    class ConditionExpression protected () extends js.Object {
      /**
        * Contains a condition expression used to filter the results of the query.
        * @param name entityName The logical name of the entity in the condition expression.
        * @param name attributeName The logical name of the attribute in the condition expression.
        * @param name operator The condition operator.
        * @param name values The value(s) to compare.
        *  Use one of the following classes that inherit from Sdk.Query.ValueBase: </para>
        *  - Sdk.Query.Booleans </para>
        *  - Sdk.Query.BooleanManagedProperties </para>
        *  - Sdk.Query.Dates </para>
        *  - Sdk.Query.Decimals </para>
        *  - Sdk.Query.Doubles </para>
        *  - Sdk.Query.EntityReferences </para>
        *  - Sdk.Query.Guids </para>
        *  - Sdk.Query.Ints </para>
        *  - Sdk.Query.Longs </para>
        *  - Sdk.Query.Money </para>
        *  - Sdk.Query.OptionSets </para>
        *  - Sdk.Query.Strings </para>
        */
      def this(entityName: java.lang.String, attributeName: java.lang.String, operator: ConditionOperator) = this()
      def this(entityName: java.lang.String, attributeName: java.lang.String, operator: ConditionOperator, values: ValueBase) = this()
      /**
        * Returns the logical name of the attribute in the condition expression.
        */
      def getAttributeName(): java.lang.String = js.native
      /**
        * Returns the logical name of the entity in the condition expression.
        */
      def getEntityName(): java.lang.String = js.native
      /**
        * Returns the condition operator.
        */
      def getOperator(): ConditionOperator = js.native
      /**
        * Returns the values for the attribute.
        */
      def getValues(): ValueBase = js.native
      /**
        * Sets the logical name of the attribute in the condition expression.
        * @param name The logical name of the attribute in the condition expression.
        */
      def setAttributeName(name: java.lang.String): scala.Unit = js.native
      /**
        * Sets the logical name of the entity in the condition expression.
        * @param name The logical name of the entity in the condition expression.
        */
      def setEntityName(name: java.lang.String): scala.Unit = js.native
      /**
        * Sets the condition operator.
        * @param operator The condition operator.
        */
      def setOperator(operator: ConditionOperator): scala.Unit = js.native
      /**
        * Sets the values for the attribute.
        * @param The value(s) to compare
        *  Use one of the following classes that inherit from Sdk.Query.ValueBase:
        *  - Sdk.Query.Booleans
        *  - Sdk.Query.BooleanManagedProperties
        *  - Sdk.Query.Dates
        *  - Sdk.Query.Decimals
        *  - Sdk.Query.Doubles
        *  - Sdk.Query.EntityReferences
        *  - Sdk.Query.Guids
        *  - Sdk.Query.Ints
        *  - Sdk.Query.Longs
        *  - Sdk.Query.Money
        *  - Sdk.Query.OptionSets
        *  - Sdk.Query.Strings
        */
      def setValues(values: ValueBase): scala.Unit = js.native
    }
    
    @js.native
    sealed trait ConditionOperator extends js.Object
    
    /**
      * Specifies the Date values to be compared in the query.
      * @param args An array of Date values.
      */
    @js.native
    class Dates protected () extends ValueBase {
      def this(args: js.Array[stdLib.Date]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of Date values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[stdLib.Date] = js.native
      /**
        * Specifies the Date values to be compared in the query.
        * @param setValueArgs An array of Date values.
        */
      def setValues(setValueArgs: js.Array[stdLib.Date]): scala.Unit = js.native
    }
    
    /**
      * Specifies the Decimal values to be compared in the query.
      * @param args An array of Decimal values.
      */
    @js.native
    class Decimals protected () extends ValueBase {
      def this(args: js.Array[scala.Double]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of number values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[scala.Double] = js.native
      /**
        * Specifies the Decimal values to be compared in the query.
        * @param setValueArgs An array of number values.
        */
      def setValues(setValueArgs: js.Array[scala.Double]): scala.Unit = js.native
    }
    
    /**
      * Specifies the Double values to be compared in the query.
      * @param args An array of Double values.
      */
    @js.native
    class Doubles protected () extends ValueBase {
      def this(args: js.Array[scala.Double]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of number values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[scala.Double] = js.native
      /**
        * Specifies the Double values to be compared in the query.
        * @param setValueArgs An array of number values.
        */
      def setValues(setValueArgs: js.Array[scala.Double]): scala.Unit = js.native
    }
    
    /**
      * Specifies the Sdk.EntityReference values to be compared in the query.
      * @param args An array of Sdk.EntityReference values.
      */
    @js.native
    class EntityReferences protected () extends ValueBase {
      def this(args: js.Array[
              microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.EntityReference
            ]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of Sdk.EntityReference values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[scala.Double] = js.native
      /**
        * Specifies the Long values to be compared in the query.
        * @param setValueArgs An array of Sdk.EntityReference values.
        */
      def setValues(
        setValueArgs: js.Array[
              microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.EntityReference
            ]
      ): scala.Unit = js.native
    }
    
    @js.native
    class FetchExpression protected () extends js.Object {
      /**
        * @param fetchXml The FetchXml to be used in a query.
        */
      def this(fetchXml: java.lang.String) = this()
      /**
        * Gets the FetchXml to be used in a query.
        */
      def getFetchXml(): java.lang.String = js.native
      /**
        * Sets the FetchXml to be used in a query.
        * @param fetchXml The FetchXml to be used in a query.
        */
      def setFetchXml(fetchXml: java.lang.String): scala.Unit = js.native
    }
    
    /**
      * Specifies complex condition and logical filter expressions used for filtering the results of the query.
      * @param logicalOperator The filter operator.
      */
    @js.native
    class FilterExpression protected () extends js.Object {
      def this(logicalOperator: LogicalOperator) = this()
      /**
        * Adds a condition to the filter expression setting the attribute name, condition operator, and values.
        * @param entityName The entityName of the new ConditionExpression that will be instantiated using the other parameters.
        * @param attributeName The attribute name to use in the condition expression.
        * @param conditionOperator The condition operator if the first parameter is a string.
        * @param values The value(s) to compare.
        *  Use one of the following classes that
        *  - Sdk.Query.Booleans
        *  - Sdk.Query.BooleanManagedProperties
        *  - Sdk.Query.Dates
        *  - Sdk.Query.Decimals
        *  - Sdk.Query.Doubles
        *  - Sdk.Query.EntityReferences
        *  - Sdk.Query.Guids
        *  - Sdk.Query.Ints
        *  - Sdk.Query.Longs
        *  - Sdk.Query.Money
        *  - Sdk.Query.OptionSets
        *  - Sdk.Query.Strings
        */
      def addCondition(
        entityName: java.lang.String,
        attributeName: java.lang.String,
        conditionOperator: ConditionOperator
      ): scala.Unit = js.native
      def addCondition(
        entityName: java.lang.String,
        attributeName: java.lang.String,
        conditionOperator: ConditionOperator,
        values: ValueBase
      ): scala.Unit = js.native
      /**
        * Adds a condition to the filter expression setting the attribute name, condition operator, and values.
        * @param conditionExpression The expression that will set the condition.
        */
      def addCondition(firstParam: ConditionExpression): scala.Unit = js.native
      /**
        * Adds a child filter to the filter expression.
        * @param filterExpression The filter to add.
        */
      def addFilter(filterExpression: FilterExpression): scala.Unit = js.native
      /**
        * Adds a child filter to the filter expression.
        * @param logicalOperator Creates new FilterExpression with the specified logical operator and adds it.
        */
      def addFilter(logicalOperator: LogicalOperator): scala.Unit = js.native
      /**
        * Returns a collection of Sdk.Query.ConditionExpression values.
        */
      def getConditions(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[ConditionExpression] = js.native
      /**
        * Gets the logical AND/OR filter operator.
        */
      def getFilterOperator(): LogicalOperator = js.native
      /**
        * Returns an Sdk.Collection of Sdk.Query.FilterExpression.
        */
      def getFilters(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[FilterExpression] = js.native
      /**
        * Gets whether the expression is part of a quick find query.
        */
      def getIsQuickFindFilter(): scala.Boolean = js.native
      /**
        * Sets the filter operator.
        * @param filterOperator The filter operator.
        */
      def setFilterOperator(filterOperator: LogicalOperator): scala.Unit = js.native
      /**
        * Sets whether the expression is part of a quick find query.
        * @param isQuickFind True if the filter is part of a quick find query; otherwise, false.
        */
      def setIsQuickFindFilter(isQuickFind: scala.Boolean): scala.Unit = js.native
    }
    
    /**
      * Specifies the Sdk.Query.Guids values to be compared in the query.
      * @param args An array of GUID string values.
      */
    @js.native
    class Guids protected () extends ValueBase {
      def this(args: js.Array[java.lang.String]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of GUID string values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[java.lang.String] = js.native
      /**
        * Specifies the Long values to be compared in the query.
        * @param setValueArgs An array of GUID string values.
        */
      def setValues(setValueArgs: js.Array[java.lang.String]): scala.Unit = js.native
    }
    
    /**
      * Specifies the Int values to be compared in the query.
      * @param args An array of Int values.
      */
    @js.native
    class Ints protected () extends ValueBase {
      def this(args: js.Array[scala.Double]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of number values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[scala.Double] = js.native
      /**
        * Specifies the Int values to be compared in the query
        * @param setValueArgs An array of number values.
        */
      def setValues(setValueArgs: js.Array[scala.Double]): scala.Unit = js.native
    }
    
    @js.native
    sealed trait JoinOperator extends js.Object
    
    @js.native
    class LinkEntity protected () extends js.Object {
      /**
        * Initializes a new instance of the Sdk.Query.LinkEntity class setting the required properties.
        * @param linkFromEntityName The logical name of the entity to link from.
        * @param linkToEntityName The logical name of the entity to link to.
        * @param linkFromAttributeName The name of the attribute to link from.
        * @param linkToAttributeName The name of the attribute to link to.
        * @param joinOperator The join operator.
        * @param entityAlias The string representing an alias for the linkToEntityName.
        */
      def this(linkFromEntityName: java.lang.String, linkToEntityName: java.lang.String, linkFromAttributeName: java.lang.String, linkToAttributeName: java.lang.String, joinOperator: JoinOperator, entityAlias: java.lang.String) = this()
      /**
        * Adds a linked entity.
        * @param linkEntity An Sdk.Query.LinkEntity to add.
        */
      def addLink(linkEntity: LinkEntity): scala.Unit = js.native
      /**
        * Gets the column set.
        */
      def getColumns(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.ColumnSet = js.native
      /**
        * Gets the alias for the entity.
        */
      def getEntityAlias(): java.lang.String = js.native
      /**
        * Gets the join operator.
        */
      def getJoinOperator(): JoinOperator = js.native
      /**
        * Gets the complex condition and logical filter expressions that filter the results of the query.
        */
      def getLinkCriteria(): FilterExpression = js.native
      /**
        * Gets the collection of Sdk.Query.LinkEntity that define links between multiple entity types.
        */
      def getLinkEntities(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[LinkEntity] = js.native
      /**
        * Gets the logical name of the attribute of the entity that you are linking from.
        */
      def getLinkFromAttributeName(): java.lang.String = js.native
      /**
        * Gets the logical name of the entity that you are linking from.
        */
      def getLinkFromEntityName(): java.lang.String = js.native
      /**
        * Gets the logical name of the attribute of the entity that you are linking to
        */
      def getLinkToAttributeName(): java.lang.String = js.native
      /**
        * Gets the logical name of the entity that you are linking to.
        */
      def getLinkToEntityName(): java.lang.String = js.native
      /**
        * Sets the columns to include.
        * @param columns Pass each attribute logical name as an argument.
        */
      def setColumns(columns: java.lang.String*): scala.Unit = js.native
      /**
        * Sets the columns to include.
        * @param columns An Array of attribute logical names for the columns to return.
        */
      def setColumns(columns: js.Array[java.lang.String]): scala.Unit = js.native
      /**
        * Sets the columns to include.
        * @param columns An Sdk.ColumnSet instance.
        */
      def setColumns(columns: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.ColumnSet): scala.Unit = js.native
      /**
        * Sets the alias for the entity.
        * @param alias The alias for the entity.
        */
      def setEntityAlias(alias: java.lang.String): scala.Unit = js.native
      /**
        * Sets the join operator.
        * @param operator The join operator.
        */
      def setJoinOperator(operator: JoinOperator): scala.Unit = js.native
      /**
        * Sets the complex condition and logical filter expressions that filter the results of the query.
        * @param criteria The complex condition and logical filter expressions that filter the results of the query.
        */
      def setLinkCriteria(criteria: FilterExpression): scala.Unit = js.native
      /**
        * Sets the logical name of the attribute of the entity that you are linking from.
        * @param name The logical name of the attribute of the entity that you are linking from.
        */
      def setLinkFromAttributeName(name: java.lang.String): scala.Unit = js.native
      /**
        * Sets the logical name of the entity that you are linking from.
        * @param name The logical name of the entity that you are linking from.
        */
      def setLinkFromEntityName(name: java.lang.String): scala.Unit = js.native
      /**
        * Sets the logical name of the attribute of the entity that you are linking to.
        * @param name The logical name of the attribute of the entity that you are linking to.
        */
      def setLinkToAttributeName(name: java.lang.String): scala.Unit = js.native
      /**
        * Sets the logical name of the entity that you are linking to.
        * @param name The logical name of the entity that you are linking to.
        */
      def setLinkToEntityName(name: java.lang.String): scala.Unit = js.native
      /**
        * Gets the serialized link entity values.
        */
      def toValueXml(): java.lang.String = js.native
      /**
        * Gets the serialized link entity.
        */
      def toXml(): java.lang.String = js.native
    }
    
    @js.native
    sealed trait LogicalOperator extends js.Object
    
    /**
      * Specifies the Long values to be compared in the query.
      * @param args An array of Long values.
      */
    @js.native
    class Longs protected () extends ValueBase {
      def this(args: js.Array[scala.Double]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of number values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[scala.Double] = js.native
      /**
        * Specifies the Long values to be compared in the query.
        * @param setValueArgs An array of number values.
        */
      def setValues(setValueArgs: js.Array[scala.Double]): scala.Unit = js.native
    }
    
    /**
      * Specifies the Money values to be compared in the query.
      * @param args An array of number values.
      */
    @js.native
    class Money protected () extends ValueBase {
      def this(args: js.Array[scala.Double]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of number values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[scala.Double] = js.native
      /**
        * Specifies the Money values to be compared in the query.
        * @param setValueArgs An array of number values.
        */
      def setValues(setValueArgs: js.Array[scala.Double]): scala.Unit = js.native
    }
    
    /**
      * Specifies the OptionSet values to be compared in the query.
      * @param args An array of number values.
      */
    @js.native
    class OptionSets protected () extends ValueBase {
      def this(args: js.Array[scala.Double]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of number values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[scala.Double] = js.native
      /**
        * Specifies the OptionSet values to be compared in the query.
        * @param setValueArgs An array of number values.
        */
      def setValues(setValueArgs: js.Array[scala.Double]): scala.Unit = js.native
    }
    
    @js.native
    class OrderExpression () extends js.Object
    
    @js.native
    sealed trait OrderType extends js.Object
    
    @js.native
    class PagingInfo () extends js.Object {
      /**
        * Gets the number of entity instances returned per page.
        */
      def getCount(): scala.Double = js.native
      /**
        * Gets the number of pages returned from the query.
        */
      def getPageNumber(): scala.Double = js.native
      /**
        * Gets the info used to page large result sets.
        */
      def getPagingCookie(): java.lang.String = js.native
      /**
        * Gets whether the total number of records should be returned from the query.
        */
      def getReturnTotalRecordCount(): scala.Boolean = js.native
      /**
        * Sets the number of entity instances returned per page.
        * @param The number of entity instances returned per page
        */
      def setCount(count: scala.Double): scala.Unit = js.native
      /**
        * Sets the number of pages returned from the query.
        * @param The number of pages returned from the query.
        */
      def setPageNumber(pages: scala.Double): scala.Unit = js.native
      /**
        * Sets the info used to page large result sets.
        */
      def setPagingCookie(cookie: java.lang.String): scala.Unit = js.native
      /**
        * Sets whether the total number of records should be returned from the query.
        * @param Specifies whether the TotalRecordCount should be set when the query is executed.
        */
      def setReturnTotalRecordCount(returnTotalRecordsCount: scala.Boolean): scala.Unit = js.native
      /// prototype methods
      /**
        * Gets the serialized paging info.
        *
        toXml():string;
        / **
        * Gets the serialized paging info values.
        */
      def toValueXml(): java.lang.String = js.native
    }
    
    @js.native
    class QueryBase protected () extends js.Object {
      /**
        * Internal Use Only.
        * @param type An Abstract class for different query classes to inherit from.
        */
      def this(`type`: java.lang.String) = this()
      /**
        * Adds the specified column to the column set.
        * @param columnName The logical name of the column to add.
        */
      def addColumn(columnName: java.lang.String): scala.Unit = js.native
      /**
        * Gets the columns to include.
        */
      def getColumnSet(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.ColumnSet = js.native
      /**
        * Gets the logical name of the entity.
        */
      def getEntityName(): java.lang.String = js.native
      /**
        * Gets an Sdk.Collection of Sdk.Query.OrderExpression instances that define the order in which the entity instances are returned from the query.
        */
      def getOrders(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[OrderExpression] = js.native
      /**
        * Gets the number of pages and the number of entity instances per page returned from the query.
        */
      def getPageInfo(): PagingInfo = js.native
      /**
        *
        */
      def getQueryType(): java.lang.String = js.native
      /**
        * Gets the number of rows to be returned.
        */
      def getTopCount(): scala.Double = js.native
      /**
        * Removes a column from the ColumnSet used by the query.
        * @param columnName The logical name of an attribute to be removed from the ColumnSet.
        * @param errorIfNotFound Whether to throw an error when the column to remove is not found. The default is false.
        */
      def removeColumn(columnName: java.lang.String): scala.Unit = js.native
      def removeColumn(columnName: java.lang.String, errorIfNotFound: scala.Boolean): scala.Unit = js.native
      /**
        * Sets the columns to include.
        * @param columns Pass each attribute logical name as an argument.
        */
      def setColumnSet(columns: java.lang.String*): scala.Unit = js.native
      /**
        * Sets the columns to include.
        * @param columns An array of attribute logical names for the columns to return.
        */
      def setColumnSet(columns: js.Array[java.lang.String]): scala.Unit = js.native
      /**
        * Sets the columns to include.
        * @param columns An Sdk.ColumnSet instance.
        */
      def setColumnSet(columns: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.ColumnSet): scala.Unit = js.native
      /**
        * Sets the logical name of the entity.
        * @param name The logical name of the entity.
        */
      def setEntityName(name: java.lang.String): scala.Unit = js.native
      /**
        * Sets the number of pages and the number of entity instances per page returned from the query.
        * @param pageInfo The number of pages and the number of entity instances per page returned from the query.
        */
      def setPageInfo(pageInfo: PagingInfo): scala.Unit = js.native
      /**
        * Sets the number of rows to be returned.
        * @param count The number of rows to be returned.
        */
      def setTopCount(count: scala.Double): scala.Unit = js.native
      /**
        * Gets the serialized QueryExpression values.
        */
      def toValueXml(): java.lang.String = js.native
      /**
        * Gets the serialized QueryExpression.
        */
      def toXml(): java.lang.String = js.native
    }
    
    @js.native
    class QueryByAttribute protected () extends QueryBase {
      /**
        * Initializes a new instance of the QueryByAttribute class setting the entity name.
        * @param entityName The logical name of the entity.
        *
        */
      def this(entityName: java.lang.String) = this()
      /// prototype methods
      /**
        * Adds the attribute with values to include in the query.
        * @param attributeValue One of the classes that inherit from Sdk.AttributeBase including the value to use as criteria.
        */
      def addAttributeValue(attributeValue: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.AttributeBase): scala.Unit = js.native
      /**
        * Adds an order to apply to the results of the query.
        * @param order An order expression.
        */
      def addOrder(order: OrderExpression): scala.Unit = js.native
      /**
        * Gets An Sdk.Collection of Sdk.AttributeBase attributes.
        */
      def getAttributeValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.AttributeBase
          ] = js.native
      /**
        * Removes an attribute with values to include in the query.
        * @param attributeValue One of the classes that inherit from Sdk.AttributeBase including the value to use as criteria.
        * @param errorIfNotFound Whether to throw an error when the attribute to remove is not found. The default is false.
        */
      def removeAttributeValue(attributeValue: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.AttributeBase): scala.Unit = js.native
      def removeAttributeValue(
        attributeValue: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.AttributeBase,
        errorIfNotFound: scala.Boolean
      ): scala.Unit = js.native
      /**
        * Sets an Sdk.Collection of Sdk.Query.OrderExpression instances that define the order in which the entity instances are returned from the query.
        * @param orders An Sdk.Collection of Sdk.Query.OrderExpression instances that define the order in which the entity instances are returned from the query.
        */
      def setOrders(
        orders: microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[OrderExpression]
      ): scala.Unit = js.native
    }
    
    @js.native
    class QueryExpression protected () extends QueryBase {
      /**
        * Initializes a new instance of the QueryExpression class setting the entity name.
        * @param entityName The name of the entity.
        */
      def this(entityName: java.lang.String) = this()
      /// prototype methods
      /**
        *  Contains a condition expression used to filter the results of the query.
        * @param entityName The logical name of the entity in the condition expression.
        * @param attributeName The logical name of the attribute in the condition expression.
        * @param operator The condition operator.
        * @param values The value(s) to compare. Use one of the following classes that inherit from Sdk.Query.ValueBase:
        *          Sdk.Query.Booleans
        *          Sdk.Query.BooleanManagedProperties
        *          Sdk.Query.Dates
        *          Sdk.Query.Decimals
        *          Sdk.Query.Doubles
        *          Sdk.Query.EntityReferences
        *          Sdk.Query.Guids
        *          Sdk.Query.Ints
        *          Sdk.Query.Longs
        *          Sdk.Query.Money
        *          Sdk.Query.OptionSets
        *          Sdk.Query.Strings
        */
      def addCondition(
        entityName: java.lang.String,
        attributeName: java.lang.String,
        conditionOperator: ConditionOperator,
        values: ValueBase
      ): scala.Unit = js.native
      /**
        * Adds the specified link to the query expression setting the entity name to link to, the attribute name to link from and the attribute name to link to.
        * @param firstParam The name of entity to link from.
        * @param linkFromAttributeName The name of the attribute to link from.
        * @param linkToAttributeName The name of the attribute to link to.
        * @param joinOperator The join operator. The default value is Inner
        */
      def addLink(
        firstParam: java.lang.String,
        linkFromAttributeName: java.lang.String,
        linkToAttributeName: java.lang.String,
        joinOperator: JoinOperator
      ): scala.Unit = js.native
      /**
        * Adds the specified link to the query expression setting the entity name to link to, the attribute name to link from and the attribute name to link to.
        * @param firstParam An Sdk.Query.LinkEntity instance.
        */
      def addLink(firstParam: LinkEntity): scala.Unit = js.native
      /**
        * Adds the specified order expression to the query expression.
        * @param attributeName The name of the attribute.
        * @param orderType The order, ascending or descending. Ascending is the default if not specified.
        */
      def addOrder(attributeName: java.lang.String, orderType: OrderType): scala.Unit = js.native
      /**
        * Gets the complex condition and logical filter expressions that filter the results of the query.
        */
      def getCriteria(): FilterExpression = js.native
      /**
        * Gets whether the results of the query contain duplicate entity instances.
        */
      def getDistinct(): scala.Boolean = js.native
      /**
        * Gets an Sdk.Collection of Sdk.Query.LinkEntity instances.
        */
      def getLinkEntities(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[LinkEntity] = js.native
      /**
        * Gets a value that indicates that no shared locks are issued against the data that would prohibit other transactions from modifying the data in the records returned from the query.
        */
      def getNoLock(): scala.Boolean = js.native
      /**
        * Sets the complex condition and logical filter expressions that filter the results of the query.
        * @param criteria The query condition and filter criteria.
        */
      def setCriteria(criteria: FilterExpression): scala.Unit = js.native
      /**
        * Sets whether the results of the query contain duplicate entity instances.
        */
      def setDistinct(isDistinct: scala.Boolean): scala.Unit = js.native
      /**
        * Sets a value that indicates that no shared locks are issued against the data that would prohibit other transactions from modifying the data in the records returned from the query.
        * @param isNoLock True if there are no shared locks are issued against the data that would prohibit other transactions from modifying the data in the records returned from the query; otherwise, false.
        */
      def setNoLock(isNoLock: scala.Boolean): scala.Unit = js.native
    }
    
    /**
      * Specifies the String values to be compared in the query.
      * @param args An array of String values.
      */
    @js.native
    class Strings protected () extends ValueBase {
      def this(args: js.Array[java.lang.String]) = this()
      /**
        * Returns the type of value with namespace prefix.
        */
      def getType(): java.lang.String = js.native
      /**
        * Returns an Sdk.Collection of String values.
        */
      def getValues(): microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.Collection[java.lang.String] = js.native
      /**
        * Specifies the String values to be compared in the query.
        * @param setValueArgs An array of String values.
        */
      def setValues(setValueArgs: js.Array[java.lang.String]): scala.Unit = js.native
    }
    
    @js.native
    class ValueBase () extends js.Object
    
    @js.native
    object ConditionOperator extends js.Object {
      @js.native
      sealed trait BeginsWith
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Between
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Contains
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait DoesNotBeginWith
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait DoesNotContain
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait DoesNotEndWith
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait EndsWith
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Equal
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait EqualBusinessId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait EqualUserId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait EqualUserLanguage
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait EqualUserOrUserTeams
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait EqualUserTeams
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait GreaterEqual
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait GreaterThan
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait In
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait InFiscalPeriod
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait InFiscalPeriodAndYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait InFiscalYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait InOrAfterFiscalPeriodAndYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait InOrBeforeFiscalPeriodAndYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Last7Days
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastFiscalPeriod
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastFiscalYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastMonth
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastWeek
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastXDays
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastXFiscalPeriods
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastXFiscalYears
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastXHours
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastXMonths
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastXWeeks
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastXYears
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LastYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LessEqual
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait LessThan
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Like
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Mask
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Next7Days
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextFiscalPeriod
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextFiscalYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextMonth
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextWeek
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextXDays
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextXFiscalPeriods
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextXFiscalYears
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextXHours
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextXMonths
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextXWeeks
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextXYears
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NextYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NotBetween
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NotEqual
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NotEqualBusinessId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NotEqualUserId
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NotIn
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NotLike
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NotMask
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NotNull
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait NotOn
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Null
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait OlderThanXMonths
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait On
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait OnOrAfter
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait OnOrBefore
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait ThisFiscalPeriod
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait ThisFiscalYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait ThisMonth
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait ThisWeek
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait ThisYear
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Today
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Tomorrow
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      @js.native
      sealed trait Yesterday
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator
      
      /* 52 */ val BeginsWith: BeginsWith with scala.Double = js.native
      /* 10 */ val Between: Between with scala.Double = js.native
      /* 47 */ val Contains: Contains with scala.Double = js.native
      /* 53 */ val DoesNotBeginWith: DoesNotBeginWith with scala.Double = js.native
      /* 48 */ val DoesNotContain: DoesNotContain with scala.Double = js.native
      /* 55 */ val DoesNotEndWith: DoesNotEndWith with scala.Double = js.native
      /* 54 */ val EndsWith: EndsWith with scala.Double = js.native
      /* 0 */ val Equal: Equal with scala.Double = js.native
      /* 43 */ val EqualBusinessId: EqualBusinessId with scala.Double = js.native
      /* 41 */ val EqualUserId: EqualUserId with scala.Double = js.native
      /* 49 */ val EqualUserLanguage: EqualUserLanguage with scala.Double = js.native
      /* 71 */ val EqualUserOrUserTeams: EqualUserOrUserTeams with scala.Double = js.native
      /* 72 */ val EqualUserTeams: EqualUserTeams with scala.Double = js.native
      /* 4 */ val GreaterEqual: GreaterEqual with scala.Double = js.native
      /* 2 */ val GreaterThan: GreaterThan with scala.Double = js.native
      /* 8 */ val In: In with scala.Double = js.native
      /* 67 */ val InFiscalPeriod: InFiscalPeriod with scala.Double = js.native
      /* 68 */ val InFiscalPeriodAndYear: InFiscalPeriodAndYear with scala.Double = js.native
      /* 66 */ val InFiscalYear: InFiscalYear with scala.Double = js.native
      /* 70 */ val InOrAfterFiscalPeriodAndYear: InOrAfterFiscalPeriodAndYear with scala.Double = js.native
      /* 69 */ val InOrBeforeFiscalPeriodAndYear: InOrBeforeFiscalPeriodAndYear with scala.Double = js.native
      /* 17 */ val Last7Days: Last7Days with scala.Double = js.native
      /* 61 */ val LastFiscalPeriod: LastFiscalPeriod with scala.Double = js.native
      /* 60 */ val LastFiscalYear: LastFiscalYear with scala.Double = js.native
      /* 22 */ val LastMonth: LastMonth with scala.Double = js.native
      /* 19 */ val LastWeek: LastWeek with scala.Double = js.native
      /* 33 */ val LastXDays: LastXDays with scala.Double = js.native
      /* 63 */ val LastXFiscalPeriods: LastXFiscalPeriods with scala.Double = js.native
      /* 62 */ val LastXFiscalYears: LastXFiscalYears with scala.Double = js.native
      /* 31 */ val LastXHours: LastXHours with scala.Double = js.native
      /* 37 */ val LastXMonths: LastXMonths with scala.Double = js.native
      /* 35 */ val LastXWeeks: LastXWeeks with scala.Double = js.native
      /* 39 */ val LastXYears: LastXYears with scala.Double = js.native
      /* 28 */ val LastYear: LastYear with scala.Double = js.native
      /* 5 */ val LessEqual: LessEqual with scala.Double = js.native
      /* 3 */ val LessThan: LessThan with scala.Double = js.native
      /* 6 */ val Like: Like with scala.Double = js.native
      /* 45 */ val Mask: Mask with scala.Double = js.native
      /* 18 */ val Next7Days: Next7Days with scala.Double = js.native
      /* 59 */ val NextFiscalPeriod: NextFiscalPeriod with scala.Double = js.native
      /* 58 */ val NextFiscalYear: NextFiscalYear with scala.Double = js.native
      /* 24 */ val NextMonth: NextMonth with scala.Double = js.native
      /* 21 */ val NextWeek: NextWeek with scala.Double = js.native
      /* 34 */ val NextXDays: NextXDays with scala.Double = js.native
      /* 65 */ val NextXFiscalPeriods: NextXFiscalPeriods with scala.Double = js.native
      /* 64 */ val NextXFiscalYears: NextXFiscalYears with scala.Double = js.native
      /* 32 */ val NextXHours: NextXHours with scala.Double = js.native
      /* 38 */ val NextXMonths: NextXMonths with scala.Double = js.native
      /* 36 */ val NextXWeeks: NextXWeeks with scala.Double = js.native
      /* 40 */ val NextXYears: NextXYears with scala.Double = js.native
      /* 30 */ val NextYear: NextYear with scala.Double = js.native
      /* 11 */ val NotBetween: NotBetween with scala.Double = js.native
      /* 1 */ val NotEqual: NotEqual with scala.Double = js.native
      /* 44 */ val NotEqualBusinessId: NotEqualBusinessId with scala.Double = js.native
      /* 42 */ val NotEqualUserId: NotEqualUserId with scala.Double = js.native
      /* 9 */ val NotIn: NotIn with scala.Double = js.native
      /* 7 */ val NotLike: NotLike with scala.Double = js.native
      /* 46 */ val NotMask: NotMask with scala.Double = js.native
      /* 13 */ val NotNull: NotNull with scala.Double = js.native
      /* 50 */ val NotOn: NotOn with scala.Double = js.native
      /* 12 */ val Null: Null with scala.Double = js.native
      /* 51 */ val OlderThanXMonths: OlderThanXMonths with scala.Double = js.native
      /* 25 */ val On: On with scala.Double = js.native
      /* 27 */ val OnOrAfter: OnOrAfter with scala.Double = js.native
      /* 26 */ val OnOrBefore: OnOrBefore with scala.Double = js.native
      /* 57 */ val ThisFiscalPeriod: ThisFiscalPeriod with scala.Double = js.native
      /* 56 */ val ThisFiscalYear: ThisFiscalYear with scala.Double = js.native
      /* 23 */ val ThisMonth: ThisMonth with scala.Double = js.native
      /* 20 */ val ThisWeek: ThisWeek with scala.Double = js.native
      /* 29 */ val ThisYear: ThisYear with scala.Double = js.native
      /* 15 */ val Today: Today with scala.Double = js.native
      /* 16 */ val Tomorrow: Tomorrow with scala.Double = js.native
      /* 14 */ val Yesterday: Yesterday with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.ConditionOperator with scala.Double
          ] = js.native
    }
    
    @js.native
    object JoinOperator extends js.Object {
      @js.native
      sealed trait Inner
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.JoinOperator
      
      @js.native
      sealed trait LeftOuter
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.JoinOperator
      
      @js.native
      sealed trait Natural
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.JoinOperator
      
      /* 0 */ val Inner: Inner with scala.Double = js.native
      /* 1 */ val LeftOuter: LeftOuter with scala.Double = js.native
      /* 2 */ val Natural: Natural with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.JoinOperator with scala.Double
          ] = js.native
    }
    
    @js.native
    object LogicalOperator extends js.Object {
      @js.native
      sealed trait And
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.LogicalOperator
      
      @js.native
      sealed trait Or
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.LogicalOperator
      
      /* 1 */ val And: And with scala.Double = js.native
      /* 0 */ val Or: Or with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.LogicalOperator with scala.Double
          ] = js.native
    }
    
    @js.native
    object OrderType extends js.Object {
      @js.native
      sealed trait Ascending
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.OrderType
      
      @js.native
      sealed trait Descending
        extends microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.OrderType
      
      /* 0 */ val Ascending: Ascending with scala.Double = js.native
      /* 1 */ val Descending: Descending with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            microsoftDashSdkDashSoapLib.microsoftDashSdkDashSoapMod.Global.SdkNs.QueryNs.OrderType with scala.Double
          ] = js.native
    }
    
  }
  
  @JSName("Util")
  @js.native
  object UtilNs extends js.Object {
    /**
      * Creates an entity from XML.
      * @param The serialized entity returned from the SOAP service as XML.
      */
    def createEntityFromNode(node: java.lang.String): scala.Unit = js.native
    /**
      * Formats a string with the arguments from an array.
      * @param string The string containing placeholders for items in the array.
      * @param args An array of strings to replace the placeholders.
      */
    def format(string: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
    /**
      * Returns the clinent URL.
      */
    def getClientUrl(): java.lang.String = js.native
    /**
      * Verifies the parameter is a valid enum value.
      * @param enumeration The enumeration.
      * @param value The value to check.
      */
    /**
      * Returns an empty GUID.
      */
    def getEmptyGuid(): java.lang.String = js.native
    /**
      *
      */
    def getError(resp: js.Any): java.lang.String = js.native
    /**
      *
      */
    def getXMLHttpRequest(action: java.lang.String, async: scala.Boolean): js.Any = js.native
    /**
      * Verifies the parameter is a string formatted as a GUID.
      * @param value The value to check.
      */
    def isGuid(value: java.lang.String): scala.Boolean = js.native
    /**
      * Verifies the parameter is a string formatted as a GUID or null.
      * @param value The value to check.
      */
    def isGuidOrNull(value: java.lang.String): scala.Boolean = js.native
    /**
      * Provides a way to override the client Url when a client-side context is not available.
      * @param url The client URL to use instead of the default.
      */
    def setClientUrl(url: java.lang.String): scala.Unit = js.native
  }
  
  type IEntityReferenceCollectionView = js.Array[IEntityReferenceView]
}


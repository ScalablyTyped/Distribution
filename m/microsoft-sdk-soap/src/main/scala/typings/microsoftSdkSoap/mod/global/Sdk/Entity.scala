package typings.microsoftSdkSoap.mod.global.Sdk

import typings.microsoftSdkSoap.mod.global.Sdk.Mdq.IEntityMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Entity")
@js.native
class Entity protected () extends StObject {
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
  def addAttribute(attribute: AttributeBase): Unit = js.native
  def addAttribute(attribute: AttributeBase, isChanged: scala.Boolean): Unit = js.native
  
  /**
    * Adds an entity to the related entities.
    * @param relationshipSchemaName The relationship SchemaName.
    * @param entity The entity to add.
    */
  def addRelatedEntity(relationshipSchemaName: java.lang.String, entity: Entity): Unit = js.native
  
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
  def initializeSubClass(metadata: IEntityMetadata): Unit = js.native
  
  /**
    * Sets the collection of attributes for the entity.
    * @param attributes The collection of attributes for the entity.
    */
  def setAttributes(attributes: AttributeCollection): Unit = js.native
  
  /**
    * Sets the state of the entity.
    * @param state The state of the entity.
    */
  def setEntityState(state: EntityState): Unit = js.native
  
  /**
    * Sets the collection of formatted values for the entity attributes.
    * @param values" The collection of formatted values for the entity attributes.
    */
  def setFormattedValues(values: FormattedValueCollection): Unit = js.native
  
  /**
    * Sets the Id of the record represented by this entity instance.
    * @param id The Id of the record represented by this entity instance.
    * @param override Allow setting the Id property, for example when creating a new record from an existing one.
    */
  def setId(id: java.lang.String): Unit = js.native
  def setId(id: java.lang.String, `override`: scala.Boolean): Unit = js.native
  
  /**
    * Sets the value to indicate whether data for the entity has changed.
    * @param isChanged The value to indicate whether data for the entity has changed.
    */
  def setIsChanged(isChanged: scala.Boolean): Unit = js.native
  
  /**
    * Sets a collection of related entities.
    * @param relatedEntities A collection of related entities.
    */
  def setRelatedEntities(relatedEntities: RelatedEntitiesCollection): Unit = js.native
  
  /**
    * Sets the logical name of the entity.
    * @param type The logical name of the entity.
    */
  def setType(`type`: java.lang.String): Unit = js.native
  
  /**
    * Sets the value of the specified attribute.
    * @param logicalName The logical name of the attribute.
    * @param value The value for the attribute. Simple JavaScript types may be used for most attribute types. Sdk.EntityReference, Sdk.EntityCollection, and Sdk.BooleanManagedPropertyValue cannot use simple JavaScript types.
    */
  def setValue(logicalName: java.lang.String, value: js.Object): Unit = js.native
  
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

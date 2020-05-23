package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk.EntityReferenceCollection")
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
  def remove(entityReference: EntityReference): Unit = js.native
  /**
    * Sets the collection of entity references.
    * @param entityReferences The entity references
    */
  def setEntityReferences(entityReferences: Collection[EntityReference]): Unit = js.native
  /**
    * Returns the values of serialized entity reference collection as XML nodes.
    */
  def toValueXml(): java.lang.String = js.native
  /**
    * Returns a view of the data in an entity reference collection instance.
    */
  def view(): IEntityReferenceCollectionView = js.native
}


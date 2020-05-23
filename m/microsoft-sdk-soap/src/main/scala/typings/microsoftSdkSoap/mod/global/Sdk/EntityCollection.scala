package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk.EntityCollection")
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
  def addEntity(entity: Entity): Unit = js.native
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
  def setEntity(id: Guid, value: Entity): Unit = js.native
  /**
    * Sets an item in the collection.
    * @param index The index of the entity in the collection.
    * @param value The Sdk.Entity value to set.
    */
  def setEntity(index: scala.Double, value: Entity): Unit = js.native
  /**
    * Sets the logical name of the entity.
    * @param name The logical name of the entity.
    */
  def setEntityName(name: java.lang.String): Unit = js.native
  /**
    * Sets the lowest active row version value.
    * @param minActiveRowVersion The lowest active row version value.
    */
  def setMinActiveRowVersion(minActiveRowVersion: java.lang.String): Unit = js.native
  /**
    * Sets whether there are more records available.
    * @param moreRecords Whether there are more records available.
    */
  def setMoreRecords(moreRecords: scala.Boolean): Unit = js.native
  /**
    * Sets the current paging information.
    * @param pagingCookie The current paging information.
    */
  def setPagingCookie(pagingCookie: java.lang.String): Unit = js.native
  /**
    * Sets the total number of records in the collection if ReturnTotalRecordCount was true when the query was executed.
    * @param totalRecordCount The total number of records in the collection if ReturnTotalRecordCount was true when the query was executed.
    */
  def setTotalRecordCount(totalRecordCount: scala.Double): Unit = js.native
  /**
    * Sets whether the results of the query exceeds the total record count.
    * @param totalRecordCountLimitExceeded Whether the results of the query exceeds the total record count.
    */
  def setTotalRecordCountLimitExceeded(totalRecordCountLimitExceeded: scala.Boolean): Unit = js.native
  /**
    * XML definition of an the child nodes of an entity.
    */
  def toValueXml(): java.lang.String = js.native
  /**
    * Returns a view of the entity collection
    */
  def view(): IEntityCollectionView = js.native
}


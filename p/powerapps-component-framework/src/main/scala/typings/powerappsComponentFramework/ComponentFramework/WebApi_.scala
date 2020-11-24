package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.WebApi.Entity
import typings.powerappsComponentFramework.ComponentFramework.WebApi.RetrieveMultipleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for context.webApi
  */
@js.native
trait WebApi_ extends js.Object {
  
  /**
    * Creates an entity record.
    * @param entityType logical name of the entity type record to create
    * @param data dictionary with attribute schema name and value
    * @returns The deferred object for the result of the operation. The created record object will be resolved if successful.
    */
  def createRecord(entityType: String, data: Entity): js.Promise[EntityReference] = js.native
  
  /**
    * Deletes an entity record.
    * @param id GUID of the entity record you want to delete.
    * @param entityType logical name of the entity type record to delete
    * @returns The deferred object for the result of the operation. The deleted record object will be resolved if successful.
    */
  def deleteRecord(entityType: String, id: String): js.Promise[EntityReference] = js.native
  
  /**
    * Retrieves a collection of entity records.
    * @param entityType logical name of the entity type record to retrieve
    * @param options OData system query options or FetchXML query to retrieve your data.
    * For support options, please refer to https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/retrievemultiplerecords
    * @param maxPageSize Max number of records to be retrieved per page
    * @returns The deferred object for the result of the operation. An object with interface RetrieveMultipleResponse will be resolved if successful.
    */
  def retrieveMultipleRecords(entityType: String): js.Promise[RetrieveMultipleResponse] = js.native
  def retrieveMultipleRecords(entityType: String, options: js.UndefOr[scala.Nothing], maxPageSize: Double): js.Promise[RetrieveMultipleResponse] = js.native
  def retrieveMultipleRecords(entityType: String, options: String): js.Promise[RetrieveMultipleResponse] = js.native
  def retrieveMultipleRecords(entityType: String, options: String, maxPageSize: Double): js.Promise[RetrieveMultipleResponse] = js.native
  
  /**
    * Retrieves an entity record.
    * @param id GUID of the entity record you want to retrieve.
    * @param entityType logical name of the entity type record to retrieve
    * @param options OData system query options, $select and $expand, to retrieve your data.
    * For support options, please refer to https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/retrieverecord
    * @returns The deferred object for the result of the operation. A JSON object with the retrieved properties and values will be resolved if successful.
    */
  def retrieveRecord(entityType: String, id: String): js.Promise[Entity] = js.native
  def retrieveRecord(entityType: String, id: String, options: String): js.Promise[Entity] = js.native
  
  /**
    * Updates an entity record.
    * @param id GUID of the entity record you want to update.
    * @param data dictionary containing to-change attributes with schema name and value
    * @param entityType logical name of the entity type record to update
    * @returns The deferred object for the result of the operation. The updated record object will be resolved if successful.
    */
  def updateRecord(entityType: String, id: String, data: Entity): js.Promise[EntityReference] = js.native
}

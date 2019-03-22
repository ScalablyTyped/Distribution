package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for context.webApi
	 */
@js.native
trait WebApi extends js.Object {
  /**
  		 * Creates an entity record.
  		 * @param entityType logical name of the entity type record to create
  		 * @param data dictionary with attribute schema name and value
  		 * @returns The deferred object for the result of the operation. The created record object will be resolved if successful.
  		 */
  def createRecord(
    entityType: java.lang.String,
    data: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.WebApiNs.Entity
  ): js.Promise[EntityReference] = js.native
  /**
  		 * Deletes an entity record.
  		 * @param id GUID of the entity record you want to delete.
  		 * @param entityType logical name of the entity type record to delete
  		 * @returns The deferred object for the result of the operation. The deleted record object will be resolved if successful.
  		 */
  def deleteRecord(entityType: java.lang.String, id: java.lang.String): js.Promise[EntityReference] = js.native
  /**
  		 * Retrieves a collection of entity records.
  		 * @param entityType logical name of the entity type record to retrieve
  		 * @param options OData system query options or FetchXML query to retrieve your data.
  		 * For support options, please refer to https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/retrievemultiplerecords
  		 * @param maxPageSize Max number of records to be retrieved per page
  		 * @returns The deferred object for the result of the operation. An object with interface RetrieveMultipleResponse will be resolved if successful.
  		 */
  def retrieveMultipleRecords(entityType: java.lang.String): js.Promise[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.WebApiNs.RetrieveMultipleResponse
  ] = js.native
  def retrieveMultipleRecords(entityType: java.lang.String, options: java.lang.String): js.Promise[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.WebApiNs.RetrieveMultipleResponse
  ] = js.native
  def retrieveMultipleRecords(entityType: java.lang.String, options: java.lang.String, maxPageSize: scala.Double): js.Promise[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.WebApiNs.RetrieveMultipleResponse
  ] = js.native
  /**
  		 * Retrieves an entity record.
  		 * @param id GUID of the entity record you want to retrieve.
  		 * @param entityType logical name of the entity type record to retrieve
  		 * @param options OData system query options, $select and $expand, to retrieve your data.
  		 * For support options, please refer to https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/retrieverecord
  		 * @returns The deferred object for the result of the operation. A JSON object with the retrieved properties and values will be resolved if successful.
  		 */
  def retrieveRecord(entityType: java.lang.String, id: java.lang.String): js.Promise[powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.WebApiNs.Entity] = js.native
  def retrieveRecord(entityType: java.lang.String, id: java.lang.String, options: java.lang.String): js.Promise[powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.WebApiNs.Entity] = js.native
  /**
  		 * Updates an entity record.
  		 * @param id GUID of the entity record you want to update.
  		 * @param data dictionary containing to-change attributes with schema name and value
  		 * @param entityType logical name of the entity type record to update
  		 * @returns The deferred object for the result of the operation. The updated record object will be resolved if successful.
  		 */
  def updateRecord(
    entityType: java.lang.String,
    id: java.lang.String,
    data: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.WebApiNs.Entity
  ): js.Promise[EntityReference] = js.native
}


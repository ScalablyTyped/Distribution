package typings.microsoftSdkSoap.mod.global.Sdk

import typings.microsoftSdkSoap.mod.global.Sdk.Query.FetchExpression
import typings.microsoftSdkSoap.mod.global.Sdk.Query.QueryByAttribute
import typings.microsoftSdkSoap.mod.global.Sdk.Query.QueryExpression
import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Q")
@js.native
class Q () extends js.Object
/* static members */
@JSGlobal("Sdk.Q")
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
    relatedEntities: Collection[EntityReference]
  ): Promise[Unit] = js.native
  
  /**
    * Creates an entity record and returns a string representation of the GUID value that is the Id of the created entity.
    * @param entity An entity instance.
    */
  def create(entity: Entity): Promise[java.lang.String] = js.native
  
  /**
    * Deletes an entity record
    * @param entityName The LogicalName of the entity to delete.
    * @param id An ID of the record to delete.
    */
  def del(entityName: java.lang.String, id: java.lang.String): Promise[Unit] = js.native
  
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
    relatedEntities: Collection[EntityReference]
  ): Promise[Unit] = js.native
  
  /**
    * Executes a SOAP Request using the SOAPAction Execute.
    * @param request A request object.
    */
  def execute(request: OrganizationRequest): Promise[OrganizationResponse] = js.native
  
  /**
    * Retrieves an entity instance.
    * @param entityName The logical name of the entity to retrieve.
    * @param id The id of the entity to retrieve.
    * @param columnSet The columns of the entities to retrieve.
    */
  def retrieve(entityName: java.lang.String, id: java.lang.String, columnSet: ColumnSet): Promise[Entity] = js.native
  
  /**
    * Retrieves the results of a query
    * @param query An Sdk.Query.FetchExpression query.
    */
  def retrieveMultiple(query: FetchExpression): Promise[EntityCollection] = js.native
  /**
    * Retrieves the results of a query
    * @param query An Sdk.Query.QueryByAttribute query.
    */
  def retrieveMultiple(query: QueryByAttribute): Promise[EntityCollection] = js.native
  /**
    * Retrieves the results of a query
    * @param query An Sdk.Query.QueryExpression query.
    */
  def retrieveMultiple(query: QueryExpression): Promise[EntityCollection] = js.native
  
  /**
    * Updates an entity instance.
    * @param entity An entity instance to update.
    */
  def update(entity: Entity): Promise[scala.Boolean] = js.native
}

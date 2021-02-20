package typings.microsoftSdkSoap.mod.global.Sdk

import typings.microsoftSdkSoap.mod.global.Sdk.Query.FetchExpression
import typings.microsoftSdkSoap.mod.global.Sdk.Query.QueryByAttribute
import typings.microsoftSdkSoap.mod.global.Sdk.Query.QueryExpression
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Q")
@js.native
class Q () extends StObject
object Q {
  
  /**
    * Creates a link between records.
    * @param entityName The logical name of the entity that is specified in the entityId parameter.
    * @param entityId The ID of the record to which the related records are associated.
    * @param relationship The name of the relationship to be used to create the link.
    * @param relatedEntities A collection of Sdk.EntityReference objects to be associated.
    */
  /* static member */
  @JSGlobal("Sdk.Q.associate")
  @js.native
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
  /* static member */
  @JSGlobal("Sdk.Q.create")
  @js.native
  def create(entity: Entity): Promise[java.lang.String] = js.native
  
  /**
    * Deletes an entity record
    * @param entityName The LogicalName of the entity to delete.
    * @param id An ID of the record to delete.
    */
  /* static member */
  @JSGlobal("Sdk.Q.del")
  @js.native
  def del(entityName: java.lang.String, id: java.lang.String): Promise[Unit] = js.native
  
  /**
    * Removes a link between records.
    * @param entityName The logical name of the entity that is specified in the entityId parameter.
    * @param entityId The ID of the record to which the related records are disassociated.
    * @param relationship The name of the relationship to be used to remove the link.
    * @param relatedEntities A collection of Sdk.EntityReference objects to be disassociated.
    */
  /* static member */
  @JSGlobal("Sdk.Q.disassociate")
  @js.native
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
  /* static member */
  @JSGlobal("Sdk.Q.execute")
  @js.native
  def execute(request: OrganizationRequest): Promise[OrganizationResponse] = js.native
  
  /**
    * Retrieves an entity instance.
    * @param entityName The logical name of the entity to retrieve.
    * @param id The id of the entity to retrieve.
    * @param columnSet The columns of the entities to retrieve.
    */
  /* static member */
  @JSGlobal("Sdk.Q.retrieve")
  @js.native
  def retrieve(entityName: java.lang.String, id: java.lang.String, columnSet: ColumnSet): Promise[Entity] = js.native
  
  /**
    * Retrieves the results of a query
    * @param query An Sdk.Query.FetchExpression query.
    */
  /* static member */
  @JSGlobal("Sdk.Q.retrieveMultiple")
  @js.native
  def retrieveMultiple(query: FetchExpression): Promise[EntityCollection] = js.native
  /**
    * Retrieves the results of a query
    * @param query An Sdk.Query.QueryByAttribute query.
    */
  /* static member */
  @JSGlobal("Sdk.Q.retrieveMultiple")
  @js.native
  def retrieveMultiple(query: QueryByAttribute): Promise[EntityCollection] = js.native
  /**
    * Retrieves the results of a query
    * @param query An Sdk.Query.QueryExpression query.
    */
  /* static member */
  @JSGlobal("Sdk.Q.retrieveMultiple")
  @js.native
  def retrieveMultiple(query: QueryExpression): Promise[EntityCollection] = js.native
  
  /**
    * Updates an entity instance.
    * @param entity An entity instance to update.
    */
  /* static member */
  @JSGlobal("Sdk.Q.update")
  @js.native
  def update(entity: Entity): Promise[scala.Boolean] = js.native
}

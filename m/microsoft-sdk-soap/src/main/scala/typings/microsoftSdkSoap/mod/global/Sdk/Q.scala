package typings.microsoftSdkSoap.mod.global.Sdk

import typings.microsoftSdkSoap.mod.global.Sdk.Query.FetchExpression
import typings.microsoftSdkSoap.mod.global.Sdk.Query.QueryByAttribute
import typings.microsoftSdkSoap.mod.global.Sdk.Query.QueryExpression
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Q")
@js.native
class Q () extends StObject
object Q {
  
  @JSGlobal("Sdk.Q")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a link between records.
    * @param entityName The logical name of the entity that is specified in the entityId parameter.
    * @param entityId The ID of the record to which the related records are associated.
    * @param relationship The name of the relationship to be used to create the link.
    * @param relatedEntities A collection of Sdk.EntityReference objects to be associated.
    */
  /* static member */
  inline def associate(
    entityName: java.lang.String,
    entityId: java.lang.String,
    relationship: java.lang.String,
    relatedEntities: Collection[EntityReference]
  ): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("associate")(entityName.asInstanceOf[js.Any], entityId.asInstanceOf[js.Any], relationship.asInstanceOf[js.Any], relatedEntities.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  /**
    * Creates an entity record and returns a string representation of the GUID value that is the Id of the created entity.
    * @param entity An entity instance.
    */
  /* static member */
  inline def create(entity: Entity): Promise[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entity.asInstanceOf[js.Any]).asInstanceOf[Promise[java.lang.String]]
  
  /**
    * Deletes an entity record
    * @param entityName The LogicalName of the entity to delete.
    * @param id An ID of the record to delete.
    */
  /* static member */
  inline def del(entityName: java.lang.String, id: java.lang.String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(entityName.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  /**
    * Removes a link between records.
    * @param entityName The logical name of the entity that is specified in the entityId parameter.
    * @param entityId The ID of the record to which the related records are disassociated.
    * @param relationship The name of the relationship to be used to remove the link.
    * @param relatedEntities A collection of Sdk.EntityReference objects to be disassociated.
    */
  /* static member */
  inline def disassociate(
    entityName: java.lang.String,
    entityId: java.lang.String,
    relationship: java.lang.String,
    relatedEntities: Collection[EntityReference]
  ): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("disassociate")(entityName.asInstanceOf[js.Any], entityId.asInstanceOf[js.Any], relationship.asInstanceOf[js.Any], relatedEntities.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  /**
    * Executes a SOAP Request using the SOAPAction Execute.
    * @param request A request object.
    */
  /* static member */
  inline def execute(request: OrganizationRequest): Promise[OrganizationResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(request.asInstanceOf[js.Any]).asInstanceOf[Promise[OrganizationResponse]]
  
  /**
    * Retrieves an entity instance.
    * @param entityName The logical name of the entity to retrieve.
    * @param id The id of the entity to retrieve.
    * @param columnSet The columns of the entities to retrieve.
    */
  /* static member */
  inline def retrieve(entityName: java.lang.String, id: java.lang.String, columnSet: ColumnSet): Promise[Entity] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(entityName.asInstanceOf[js.Any], id.asInstanceOf[js.Any], columnSet.asInstanceOf[js.Any])).asInstanceOf[Promise[Entity]]
  
  /**
    * Retrieves the results of a query
    * @param query An Sdk.Query.FetchExpression query.
    */
  /* static member */
  inline def retrieveMultiple(query: FetchExpression): Promise[EntityCollection] = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveMultiple")(query.asInstanceOf[js.Any]).asInstanceOf[Promise[EntityCollection]]
  /**
    * Retrieves the results of a query
    * @param query An Sdk.Query.QueryByAttribute query.
    */
  /* static member */
  inline def retrieveMultiple(query: QueryByAttribute): Promise[EntityCollection] = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveMultiple")(query.asInstanceOf[js.Any]).asInstanceOf[Promise[EntityCollection]]
  /**
    * Retrieves the results of a query
    * @param query An Sdk.Query.QueryExpression query.
    */
  /* static member */
  inline def retrieveMultiple(query: QueryExpression): Promise[EntityCollection] = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveMultiple")(query.asInstanceOf[js.Any]).asInstanceOf[Promise[EntityCollection]]
  
  /**
    * Updates an entity instance.
    * @param entity An entity instance to update.
    */
  /* static member */
  inline def update(entity: Entity): Promise[scala.Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(entity.asInstanceOf[js.Any]).asInstanceOf[Promise[scala.Boolean]]
}

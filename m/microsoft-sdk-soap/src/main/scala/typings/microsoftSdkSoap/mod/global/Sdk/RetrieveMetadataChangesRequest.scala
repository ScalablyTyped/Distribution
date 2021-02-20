package typings.microsoftSdkSoap.mod.global.Sdk

import typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters
import typings.microsoftSdkSoap.mod.global.Sdk.Mdq.EntityQueryExpression
import typings.microsoftSdkSoap.mod.global.Sdk.Mdq.IEntityMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to retrieve metadata and metadata changes.
  * @param query The Sdk.Mdq.EntityQueryExpression that defines the query.
  * @param clientVersionStamp The Sdk.Mdq.RetrieveMetadataChangesResponse.ServerVersionStamp value from a previous request. When included only the metadata changes since the previous request will be returned.
  * @param deletedMetadataFilters An Sdk.Mdq.DeletedMetadataFilters enumeration value. When included the deleted metadata changes will be limited to the types defined by the enumeration.
  */
@JSGlobal("Sdk.RetrieveMetadataChangesRequest")
@js.native
class RetrieveMetadataChangesRequest protected () extends OrganizationRequest {
  def this(query: EntityQueryExpression) = this()
  def this(query: EntityQueryExpression, clientVersionStamp: java.lang.String) = this()
  def this(
    query: EntityQueryExpression,
    clientVersionStamp: js.UndefOr[scala.Nothing],
    deletedMetadataFilters: DeletedMetadataFilters
  ) = this()
  def this(
    query: EntityQueryExpression,
    clientVersionStamp: java.lang.String,
    deletedMetadataFilters: DeletedMetadataFilters
  ) = this()
  
  def getDeletedMetadata(): js.Object = js.native
  
  def getEntityMetadata(): js.Array[IEntityMetadata] = js.native
  
  def getServerVersionStamp(): java.lang.String = js.native
}

package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.DeletedMetadataFilters
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.EntityQueryExpression
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.IEntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    clientVersionStamp: java.lang.String,
    deletedMetadataFilters: DeletedMetadataFilters
  ) = this()
  def getDeletedMetadata(): js.Object = js.native
  def getEntityMetadata(): js.Array[IEntityMetadata] = js.native
  def getServerVersionStamp(): java.lang.String = js.native
}


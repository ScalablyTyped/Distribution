package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.IEntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to RetrieveMetadataChangesRequest.
  * @param resopnseXml The response XML.
  */
@JSGlobal("Sdk.RetrieveMetadataChangesResponse")
@js.native
class RetrieveMetadataChangesResponse protected () extends js.Object {
  def this(responseXml: java.lang.String) = this()
  /***
    *
    */
  def getDeletedMetadata(): js.Any = js.native
  /***
    *
    */
  def getEntityMetadata(): js.Array[IEntityMetadata] = js.native
  /***
    *
    */
  def getServerVersionStamp(): java.lang.String = js.native
}


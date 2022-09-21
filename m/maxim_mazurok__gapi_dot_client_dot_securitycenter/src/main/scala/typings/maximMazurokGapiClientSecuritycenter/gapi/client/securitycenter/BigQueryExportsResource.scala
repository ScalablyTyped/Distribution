package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSecuritycenter.anon.BigQueryExportId
import typings.maximMazurokGapiClientSecuritycenter.anon.Name
import typings.maximMazurokGapiClientSecuritycenter.anon.PageSize
import typings.maximMazurokGapiClientSecuritycenter.anon.Parent
import typings.maximMazurokGapiClientSecuritycenter.anon.PrettyPrint
import typings.maximMazurokGapiClientSecuritycenter.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigQueryExportsResource extends StObject {
  
  /** Creates a big query export. */
  def create(request: BigQueryExportId): Request[GoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def create(request: Parent, body: GoogleCloudSecuritycenterV1BigQueryExport): Request[GoogleCloudSecuritycenterV1BigQueryExport] = js.native
  
  /** Deletes an existing big query export. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets a big query export. */
  def get(): Request[GoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def get(request: Name): Request[GoogleCloudSecuritycenterV1BigQueryExport] = js.native
  
  /**
    * Lists BigQuery exports. Note that when requesting BigQuery exports at a given level all exports under that level are also returned e.g. if requesting BigQuery exports under a
    * folder, then all BigQuery exports immediately under the folder plus the ones created under the projects within the folder are returned.
    */
  def list(): Request[ListBigQueryExportsResponse] = js.native
  def list(request: PageSize): Request[ListBigQueryExportsResponse] = js.native
  
  /** Updates a BigQuery export. */
  def patch(request: PrettyPrint): Request[GoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def patch(request: QuotaUser, body: GoogleCloudSecuritycenterV1BigQueryExport): Request[GoogleCloudSecuritycenterV1BigQueryExport] = js.native
}

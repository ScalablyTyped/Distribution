package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientProdTtSasportal.anon.Alt
import typings.maximMazurokGapiClientProdTtSasportal.anon.Name
import typings.maximMazurokGapiClientProdTtSasportal.anon.PageSize
import typings.maximMazurokGapiClientProdTtSasportal.anon.Parent
import typings.maximMazurokGapiClientProdTtSasportal.anon.QuotaUser
import typings.maximMazurokGapiClientProdTtSasportal.anon.UpdateMask
import typings.maximMazurokGapiClientProdTtSasportal.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesResource extends StObject {
  
  def create(request: Alt, body: SasPortalNode): Request[SasPortalNode] = js.native
  /** Creates a new node. */
  def create(request: Parent): Request[SasPortalNode] = js.native
  
  /** Deletes a node. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  var deployments: DeploymentsResource = js.native
  
  var devices: DevicesResource = js.native
  
  /** Returns a requested node. */
  def get(): Request[SasPortalNode] = js.native
  def get(request: Name): Request[SasPortalNode] = js.native
  
  /** Lists nodes. */
  def list(): Request[SasPortalListNodesResponse] = js.native
  def list(request: PageSize): Request[SasPortalListNodesResponse] = js.native
  
  def move(request: Name, body: SasPortalMoveNodeRequest): Request[SasPortalOperation] = js.native
  /** Moves a node under another node or customer. */
  def move(request: Xgafv): Request[SasPortalOperation] = js.native
  
  var nodes: NodesResource = js.native
  
  def patch(request: QuotaUser, body: SasPortalNode): Request[SasPortalNode] = js.native
  /** Updates an existing node. */
  def patch(request: UpdateMask): Request[SasPortalNode] = js.native
}

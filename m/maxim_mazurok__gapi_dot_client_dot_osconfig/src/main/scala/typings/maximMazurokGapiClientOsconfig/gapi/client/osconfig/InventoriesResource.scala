package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientOsconfig.anon.Accesstoken
import typings.maximMazurokGapiClientOsconfig.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoriesResource extends StObject {
  
  /** Get inventory data for the specified VM instance. If the VM has no associated inventory, the message `NOT_FOUND` is returned. */
  def get(): Request[Inventory] = js.native
  def get(request: Accesstoken): Request[Inventory] = js.native
  
  /** List inventory data for all VM instances in the specified zone. */
  def list(): Request[ListInventoriesResponse] = js.native
  def list(request: Alt): Request[ListInventoriesResponse] = js.native
}

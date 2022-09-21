package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSpanner.anon.Accesstoken
import typings.maximMazurokGapiClientSpanner.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceConfigsResource extends StObject {
  
  /** Gets information about a particular instance configuration. */
  def get(): Request[InstanceConfig] = js.native
  def get(request: Accesstoken): Request[InstanceConfig] = js.native
  
  /** Lists the supported instance configurations for a given project. */
  def list(): Request[ListInstanceConfigsResponse] = js.native
  def list(request: Callback): Request[ListInstanceConfigsResponse] = js.native
  
  var operations: OperationsResource = js.native
}

package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicenetworking.anon.Key
import typings.maximMazurokGapiClientServicenetworking.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolesResource extends StObject {
  
  def add(request: Key, body: AddRolesRequest): Request[Operation] = js.native
  /**
    * Service producers can use this method to add roles in the shared VPC host project. Each role is bound to the provided member. Each role must be selected from within an allowlisted
    * set of roles. Each role is applied at only the granularity specified in the allowlist.
    */
  def add(request: Xgafv): Request[Operation] = js.native
}

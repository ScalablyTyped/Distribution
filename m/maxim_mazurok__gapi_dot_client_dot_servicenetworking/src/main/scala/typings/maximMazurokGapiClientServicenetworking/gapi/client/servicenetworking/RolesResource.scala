package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicenetworking.anon.AccesstokenAlt
import typings.maximMazurokGapiClientServicenetworking.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolesResource extends StObject {
  
  /**
    * Service producers can use this method to add roles in the shared VPC host project. Each role is bound to the provided member. Each role must be selected from within an allowlisted
    * set of roles. Each role is applied at only the granularity specified in the allowlist.
    */
  def add(request: AccesstokenAlt): Request[Operation] = js.native
  def add(request: Key, body: AddRolesRequest): Request[Operation] = js.native
}

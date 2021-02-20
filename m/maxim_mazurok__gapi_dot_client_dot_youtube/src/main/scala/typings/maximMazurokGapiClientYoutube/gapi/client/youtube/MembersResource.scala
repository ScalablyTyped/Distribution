package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.FilterByMemberChannelId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersResource extends StObject {
  
  /** Retrieves a list of members that match the request criteria for a channel. */
  def list(): Request[MemberListResponse] = js.native
  def list(request: FilterByMemberChannelId): Request[MemberListResponse] = js.native
}

package typings.maximMazurokGapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGames.anon.ClientRevision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionsResource extends StObject {
  
  /** Checks whether the games client is out of date. */
  def check(): Request[RevisionCheckResponse] = js.native
  def check(request: ClientRevision): Request[RevisionCheckResponse] = js.native
}

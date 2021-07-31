package typings.maximMazurokGapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGames.anon.ApplicationId
import typings.maximMazurokGapiClientGames.anon.Oauthtoken
import typings.maximMazurokGapiClientGames.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationsResource extends StObject {
  
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified `platformType`, the returned response will not include
    * any instance data.
    */
  def get(): Request[Application] = js.native
  def get(request: ApplicationId): Request[Application] = js.native
  
  /** Indicate that the currently authenticated user is playing your application. */
  def played(): Request[Unit] = js.native
  def played(request: Oauthtoken): Request[Unit] = js.native
  
  /** Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for. */
  def verify(): Request[ApplicationVerifyResponse] = js.native
  def verify(request: PrettyPrint): Request[ApplicationVerifyResponse] = js.native
}

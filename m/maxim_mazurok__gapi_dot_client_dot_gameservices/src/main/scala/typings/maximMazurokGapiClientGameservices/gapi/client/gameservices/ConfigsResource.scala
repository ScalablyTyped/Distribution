package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGameservices.anon.Accesstoken
import typings.maximMazurokGapiClientGameservices.anon.Alt
import typings.maximMazurokGapiClientGameservices.anon.Callback
import typings.maximMazurokGapiClientGameservices.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigsResource extends StObject {
  
  /**
    * Creates a new game server config in a given project, location, and game server deployment. Game server configs are immutable, and are not applied until referenced in the game server
    * deployment rollout resource.
    */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: GameServerConfig): Request[Operation] = js.native
  
  /** Deletes a single game server config. The deletion will fail if the game server config is referenced in a game server deployment rollout. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single game server config. */
  def get(): Request[GameServerConfig] = js.native
  def get(request: Callback): Request[GameServerConfig] = js.native
  
  /** Lists game server configs in a given project, location, and game server deployment. */
  def list(): Request[ListGameServerConfigsResponse] = js.native
  def list(request: Fields): Request[ListGameServerConfigsResponse] = js.native
}

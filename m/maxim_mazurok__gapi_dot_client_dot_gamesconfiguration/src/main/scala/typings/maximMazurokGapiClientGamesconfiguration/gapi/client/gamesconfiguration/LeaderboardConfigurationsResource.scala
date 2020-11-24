package typings.maximMazurokGapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGamesconfiguration.anon.ApplicationId
import typings.maximMazurokGapiClientGamesconfiguration.anon.Callback
import typings.maximMazurokGapiClientGamesconfiguration.anon.Key
import typings.maximMazurokGapiClientGamesconfiguration.anon.LeaderboardId
import typings.maximMazurokGapiClientGamesconfiguration.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaderboardConfigurationsResource extends js.Object {
  
  /** Delete the leaderboard configuration with the given ID. */
  def delete(): Request[Unit] = js.native
  def delete(request: Key): Request[Unit] = js.native
  
  /** Retrieves the metadata of the leaderboard configuration with the given ID. */
  def get(): Request[LeaderboardConfiguration] = js.native
  def get(request: Key): Request[LeaderboardConfiguration] = js.native
  
  def insert(request: ApplicationId, body: LeaderboardConfiguration): Request[LeaderboardConfiguration] = js.native
  /** Insert a new leaderboard configuration in this application. */
  def insert(request: Oauthtoken): Request[LeaderboardConfiguration] = js.native
  
  /** Returns a list of the leaderboard configurations in this application. */
  def list(): Request[LeaderboardConfigurationListResponse] = js.native
  def list(request: Callback): Request[LeaderboardConfigurationListResponse] = js.native
  
  def update(request: Key, body: LeaderboardConfiguration): Request[LeaderboardConfiguration] = js.native
  /** Update the metadata of the leaderboard configuration with the given ID. */
  def update(request: LeaderboardId): Request[LeaderboardConfiguration] = js.native
}

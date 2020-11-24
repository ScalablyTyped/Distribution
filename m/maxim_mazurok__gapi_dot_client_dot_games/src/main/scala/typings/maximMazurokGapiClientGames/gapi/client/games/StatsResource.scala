package typings.maximMazurokGapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGames.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsResource extends js.Object {
  
  /** Returns engagement and spend statistics in this application for the currently authenticated user. */
  def get(): Request[StatsResponse] = js.native
  def get(request: Oauthtoken): Request[StatsResponse] = js.native
}

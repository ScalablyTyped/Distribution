package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGamesmanagement.anon.Accesstoken
import typings.maximMazurokGapiClientGamesmanagement.anon.Alt
import typings.maximMazurokGapiClientGamesmanagement.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementsResource extends StObject {
  
  /** Resets the achievement with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application. */
  def reset(): Request[AchievementResetResponse] = js.native
  def reset(request: Accesstoken): Request[AchievementResetResponse] = js.native
  
  /** Resets all achievements for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for your application. */
  def resetAll(): Request[AchievementResetAllResponse] = js.native
  def resetAll(request: Alt): Request[AchievementResetAllResponse] = js.native
  
  /** Resets all draft achievements for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(): Request[Unit] = js.native
  def resetAllForAllPlayers(request: Alt): Request[Unit] = js.native
  
  /** Resets the achievement with the given ID for all players. This method is only available to user accounts for your developer console. Only draft achievements can be reset. */
  def resetForAllPlayers(): Request[Unit] = js.native
  def resetForAllPlayers(request: Accesstoken): Request[Unit] = js.native
  
  def resetMultipleForAllPlayers(request: Alt, body: AchievementResetMultipleForAllRequest): Request[Unit] = js.native
  /** Resets achievements with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft achievements may be reset. */
  def resetMultipleForAllPlayers(request: Callback): Request[Unit] = js.native
}

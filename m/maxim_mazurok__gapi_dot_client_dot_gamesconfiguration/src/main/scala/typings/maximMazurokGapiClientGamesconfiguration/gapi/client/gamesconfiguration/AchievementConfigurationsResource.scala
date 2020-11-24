package typings.maximMazurokGapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGamesconfiguration.anon.Accesstoken
import typings.maximMazurokGapiClientGamesconfiguration.anon.AchievementId
import typings.maximMazurokGapiClientGamesconfiguration.anon.Alt
import typings.maximMazurokGapiClientGamesconfiguration.anon.ApplicationId
import typings.maximMazurokGapiClientGamesconfiguration.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementConfigurationsResource extends js.Object {
  
  /** Delete the achievement configuration with the given ID. */
  def delete(): Request[Unit] = js.native
  def delete(request: Accesstoken): Request[Unit] = js.native
  
  /** Retrieves the metadata of the achievement configuration with the given ID. */
  def get(): Request[AchievementConfiguration] = js.native
  def get(request: Accesstoken): Request[AchievementConfiguration] = js.native
  
  /** Insert a new achievement configuration in this application. */
  def insert(request: Alt): Request[AchievementConfiguration] = js.native
  def insert(request: ApplicationId, body: AchievementConfiguration): Request[AchievementConfiguration] = js.native
  
  /** Returns a list of the achievement configurations in this application. */
  def list(): Request[AchievementConfigurationListResponse] = js.native
  def list(request: Callback): Request[AchievementConfigurationListResponse] = js.native
  
  def update(request: Accesstoken, body: AchievementConfiguration): Request[AchievementConfiguration] = js.native
  /** Update the metadata of the achievement configuration with the given ID. */
  def update(request: AchievementId): Request[AchievementConfiguration] = js.native
}

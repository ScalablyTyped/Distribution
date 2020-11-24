package typings.maximMazurokGapiClientPlaycustomapp.gapi.client.playcustomapp

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPlaycustomapp.anon.Accesstoken
import typings.maximMazurokGapiClientPlaycustomapp.anon.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAppsResource extends js.Object {
  
  /** Creates a new custom app. */
  def create(request: Accesstoken): Request[CustomApp] = js.native
  def create(request: Account, body: CustomApp): Request[CustomApp] = js.native
}

package typings.maximMazurokGapiClientOauth2.gapi.client.oauth2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientOauth2.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserinfoResource extends js.Object {
  
  def get(): Request[Userinfo] = js.native
  def get(request: Alt): Request[Userinfo] = js.native
  
  var v2: V2Resource = js.native
}

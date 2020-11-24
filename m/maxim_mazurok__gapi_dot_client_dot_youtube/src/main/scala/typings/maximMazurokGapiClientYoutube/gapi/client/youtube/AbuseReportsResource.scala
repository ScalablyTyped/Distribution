package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.Accesstoken
import typings.maximMazurokGapiClientYoutube.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbuseReportsResource extends js.Object {
  
  /** Inserts a new resource into this collection. */
  def insert(request: Accesstoken): Request[AbuseReport] = js.native
  def insert(request: Alt, body: AbuseReport): Request[AbuseReport] = js.native
}

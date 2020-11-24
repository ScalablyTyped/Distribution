package typings.maximMazurokGapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStorage.anon.Resource
import typings.maximMazurokGapiClientStorage.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends js.Object {
  
  /** Stop watching resources through this channel */
  def stop(request: Resource): Request[Unit] = js.native
  def stop(request: UserIp, body: Channel): Request[Unit] = js.native
}

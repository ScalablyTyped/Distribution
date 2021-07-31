package typings.maximMazurokGapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDrive.anon.Alt
import typings.maximMazurokGapiClientDrive.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends StObject {
  
  def stop(request: Alt, body: Channel): Request[Unit] = js.native
  /** Stop watching resources through this channel */
  def stop(request: Key): Request[Unit] = js.native
}

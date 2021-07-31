package typings.maximMazurokGapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDrive.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AboutResource extends StObject {
  
  /** Gets information about the user, the user's Drive, and system capabilities. */
  def get(): Request[About] = js.native
  def get(request: Alt): Request[About] = js.native
}

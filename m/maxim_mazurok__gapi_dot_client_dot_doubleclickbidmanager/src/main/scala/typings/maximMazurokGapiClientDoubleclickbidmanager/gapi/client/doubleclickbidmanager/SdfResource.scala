package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Alt
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdfResource extends StObject {
  
  def download(request: Alt, body: DownloadRequest): Request[DownloadResponse] = js.native
  /** Retrieves entities in SDF format. */
  def download(request: QuotaUser): Request[DownloadResponse] = js.native
}

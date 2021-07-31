package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.ChannelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResource extends StObject {
  
  /** Retrieves a list of search resources */
  def list(): Request[SearchListResponse] = js.native
  def list(request: ChannelType): Request[SearchListResponse] = js.native
}

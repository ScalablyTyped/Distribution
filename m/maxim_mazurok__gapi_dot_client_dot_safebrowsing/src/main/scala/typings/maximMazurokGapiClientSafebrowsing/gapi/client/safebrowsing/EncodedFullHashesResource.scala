package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSafebrowsing.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodedFullHashesResource extends StObject {
  
  def get(): Request[GoogleSecuritySafebrowsingV4FindFullHashesResponse] = js.native
  def get(request: Accesstoken): Request[GoogleSecuritySafebrowsingV4FindFullHashesResponse] = js.native
}

package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.Alt
import typings.maximMazurokGapiClientYoutube.anon.ResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestsResource extends StObject {
  
  def insert(request: Alt, body: TestItem): Request[TestItem] = js.native
  /** POST method. */
  def insert(request: ResourceUploadType): Request[TestItem] = js.native
}

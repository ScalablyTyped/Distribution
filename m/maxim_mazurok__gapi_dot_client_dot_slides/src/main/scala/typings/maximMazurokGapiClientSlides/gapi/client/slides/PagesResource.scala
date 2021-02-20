package typings.maximMazurokGapiClientSlides.gapi.client.slides

import typings.maximMazurokGapiClientSlides.anon.Accesstoken
import typings.maximMazurokGapiClientSlides.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagesResource extends StObject {
  
  /** Gets the latest version of the specified page in the presentation. */
  def get(): typings.gapiClient.gapi.client.Request[Page] = js.native
  def get(request: Accesstoken): typings.gapiClient.gapi.client.Request[Page] = js.native
  
  /**
    * Generates a thumbnail of the latest version of the specified page in the presentation and returns a URL to the thumbnail image. This request counts as an [expensive read
    * request](/slides/limits) for quota purposes.
    */
  def getThumbnail(): typings.gapiClient.gapi.client.Request[Thumbnail] = js.native
  def getThumbnail(request: Alt): typings.gapiClient.gapi.client.Request[Thumbnail] = js.native
}

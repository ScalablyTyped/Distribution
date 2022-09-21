package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.ResourceName
import typings.maximMazurokGapiClientDisplayvideo.anon.ResourceResourceName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaResource extends StObject {
  
  /**
    * Downloads media. Download is supported on the URI `/download/{resource_name=**}?alt=media.` **Note**: Download requests will not be successful without including `alt=media` query
    * string.
    */
  def download(): Request[GoogleBytestreamMedia] = js.native
  def download(request: ResourceName): Request[GoogleBytestreamMedia] = js.native
  
  def upload(request: ResourceName, body: GoogleBytestreamMedia): Request[GoogleBytestreamMedia] = js.native
  /**
    * Uploads media. Upload is supported on the URI `/upload/media/{resource_name=**}?upload_type=media.` **Note**: Upload requests will not be successful without including
    * `upload_type=media` query string.
    */
  def upload(request: ResourceResourceName): Request[GoogleBytestreamMedia] = js.native
}

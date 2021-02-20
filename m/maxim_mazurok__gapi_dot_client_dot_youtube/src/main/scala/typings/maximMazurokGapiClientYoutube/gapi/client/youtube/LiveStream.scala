package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveStream extends StObject {
  
  /** The cdn object defines the live stream's content delivery network (CDN) settings. These settings provide details about the manner in which you stream your content to YouTube. */
  var cdn: js.UndefOr[CdnSettings] = js.native
  
  /** The content_details object contains information about the stream, including the closed captions ingestion URL. */
  var contentDetails: js.UndefOr[LiveStreamContentDetails] = js.native
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The ID that YouTube assigns to uniquely identify the stream. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveStream". */
  var kind: js.UndefOr[String] = js.native
  
  /** The snippet object contains basic details about the stream, including its channel, title, and description. */
  var snippet: js.UndefOr[LiveStreamSnippet] = js.native
  
  /** The status object contains information about live stream's status. */
  var status: js.UndefOr[LiveStreamStatus] = js.native
}
object LiveStream {
  
  @scala.inline
  def apply(): LiveStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStream]
  }
  
  @scala.inline
  implicit class LiveStreamMutableBuilder[Self <: LiveStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdn(value: CdnSettings): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
    
    @scala.inline
    def setContentDetails(value: LiveStreamContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: LiveStreamSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setStatus(value: LiveStreamStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelsResponse extends StObject {
  
  /** The list of channels. This list will be absent if empty. */
  var channels: js.UndefOr[js.Array[Channel]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListChannels` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListChannelsResponse {
  
  @scala.inline
  def apply(): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsResponse]
  }
  
  @scala.inline
  implicit class ListChannelsResponseMutableBuilder[Self <: ListChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[Channel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

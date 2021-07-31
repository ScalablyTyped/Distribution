package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoCategorySnippet extends StObject {
  
  var assignable: js.UndefOr[Boolean] = js.undefined
  
  /** The YouTube channel that created the video category. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** The video category's title. */
  var title: js.UndefOr[String] = js.undefined
}
object VideoCategorySnippet {
  
  @scala.inline
  def apply(): VideoCategorySnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoCategorySnippet]
  }
  
  @scala.inline
  implicit class VideoCategorySnippetMutableBuilder[Self <: VideoCategorySnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignable(value: Boolean): Self = StObject.set(x, "assignable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignableUndefined: Self = StObject.set(x, "assignable", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

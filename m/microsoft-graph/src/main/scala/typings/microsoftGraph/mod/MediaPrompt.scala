package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPrompt extends Prompt {
  
  // The media information
  var mediaInfo: js.UndefOr[MediaInfo] = js.native
}
object MediaPrompt {
  
  @scala.inline
  def apply(): MediaPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPrompt]
  }
  
  @scala.inline
  implicit class MediaPromptMutableBuilder[Self <: MediaPrompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaInfo(value: MediaInfo): Self = StObject.set(x, "mediaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaInfoUndefined: Self = StObject.set(x, "mediaInfo", js.undefined)
  }
}

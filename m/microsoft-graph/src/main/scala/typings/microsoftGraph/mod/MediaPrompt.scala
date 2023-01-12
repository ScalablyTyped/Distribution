package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPrompt
  extends StObject
     with Prompt {
  
  // The media information
  var mediaInfo: js.UndefOr[MediaInfo] = js.undefined
}
object MediaPrompt {
  
  inline def apply(): MediaPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPrompt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaPrompt] (val x: Self) extends AnyVal {
    
    inline def setMediaInfo(value: MediaInfo): Self = StObject.set(x, "mediaInfo", value.asInstanceOf[js.Any])
    
    inline def setMediaInfoUndefined: Self = StObject.set(x, "mediaInfo", js.undefined)
  }
}

package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchStream extends StObject {
  
  var hasAudio: js.UndefOr[Boolean] = js.undefined
  
  var hasVideo: js.UndefOr[Boolean] = js.undefined
}
object PatchStream {
  
  inline def apply(): PatchStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchStream] (val x: Self) extends AnyVal {
    
    inline def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    inline def setHasAudioUndefined: Self = StObject.set(x, "hasAudio", js.undefined)
    
    inline def setHasVideo(value: Boolean): Self = StObject.set(x, "hasVideo", value.asInstanceOf[js.Any])
    
    inline def setHasVideoUndefined: Self = StObject.set(x, "hasVideo", js.undefined)
  }
}

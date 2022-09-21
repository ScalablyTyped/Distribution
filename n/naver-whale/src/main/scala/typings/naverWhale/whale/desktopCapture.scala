package typings.naverWhale.whale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// DesktopCapture
////////////////////
/**
  * Desktop Capture API that can be used to capture content of screen, individual windows or tabs.
  * Availability: Since Chrome 34.
  * Permissions:  "desktopCapture"
  */
object desktopCapture {
  
  trait StreamOptions extends StObject {
    
    /** True if "audio" is included in parameter sources, and the end user does not uncheck the "Share audio" checkbox. Otherwise false, and in this case, one should not ask for audio stream through getUserMedia call. */
    var canRequestAudioTrack: Boolean
  }
  object StreamOptions {
    
    inline def apply(canRequestAudioTrack: Boolean): StreamOptions = {
      val __obj = js.Dynamic.literal(canRequestAudioTrack = canRequestAudioTrack.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamOptions]
    }
    
    extension [Self <: StreamOptions](x: Self) {
      
      inline def setCanRequestAudioTrack(value: Boolean): Self = StObject.set(x, "canRequestAudioTrack", value.asInstanceOf[js.Any])
    }
  }
}

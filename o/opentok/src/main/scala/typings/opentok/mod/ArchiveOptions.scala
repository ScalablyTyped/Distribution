package typings.opentok.mod

import typings.opentok.opentokStrings.auto
import typings.opentok.opentokStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveOptions extends StObject {
  
  var hasAudio: js.UndefOr[Boolean] = js.undefined
  
  var hasVideo: js.UndefOr[Boolean] = js.undefined
  
  var layout: js.UndefOr[ArchiveLayoutOptions] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var outputMode: js.UndefOr[OutputMode] = js.undefined
  
  var resolution: js.UndefOr[String] = js.undefined
  
  var streamMode: js.UndefOr[auto | manual] = js.undefined
}
object ArchiveOptions {
  
  inline def apply(): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArchiveOptions] (val x: Self) extends AnyVal {
    
    inline def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    inline def setHasAudioUndefined: Self = StObject.set(x, "hasAudio", js.undefined)
    
    inline def setHasVideo(value: Boolean): Self = StObject.set(x, "hasVideo", value.asInstanceOf[js.Any])
    
    inline def setHasVideoUndefined: Self = StObject.set(x, "hasVideo", js.undefined)
    
    inline def setLayout(value: ArchiveLayoutOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputMode(value: OutputMode): Self = StObject.set(x, "outputMode", value.asInstanceOf[js.Any])
    
    inline def setOutputModeUndefined: Self = StObject.set(x, "outputMode", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setStreamMode(value: auto | manual): Self = StObject.set(x, "streamMode", value.asInstanceOf[js.Any])
    
    inline def setStreamModeUndefined: Self = StObject.set(x, "streamMode", js.undefined)
  }
}

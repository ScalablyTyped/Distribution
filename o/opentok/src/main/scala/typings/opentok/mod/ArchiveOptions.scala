package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveOptions extends StObject {
  
  var hasAudio: js.UndefOr[Boolean] = js.native
  
  var hasVideo: js.UndefOr[Boolean] = js.native
  
  var layout: js.UndefOr[ArchiveLayoutOptions] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var outputMode: js.UndefOr[OutputMode] = js.native
  
  var resolution: js.UndefOr[String] = js.native
}
object ArchiveOptions {
  
  @scala.inline
  def apply(): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveOptions]
  }
  
  @scala.inline
  implicit class ArchiveOptionsMutableBuilder[Self <: ArchiveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAudioUndefined: Self = StObject.set(x, "hasAudio", js.undefined)
    
    @scala.inline
    def setHasVideo(value: Boolean): Self = StObject.set(x, "hasVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasVideoUndefined: Self = StObject.set(x, "hasVideo", js.undefined)
    
    @scala.inline
    def setLayout(value: ArchiveLayoutOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputMode(value: OutputMode): Self = StObject.set(x, "outputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputModeUndefined: Self = StObject.set(x, "outputMode", js.undefined)
    
    @scala.inline
    def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}

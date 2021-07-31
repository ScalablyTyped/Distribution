package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionOptions extends StObject {
  
  var archiveMode: js.UndefOr[ArchiveMode] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var mediaMode: js.UndefOr[MediaMode] = js.undefined
}
object SessionOptions {
  
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit class SessionOptionsMutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveMode(value: ArchiveMode): Self = StObject.set(x, "archiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveModeUndefined: Self = StObject.set(x, "archiveMode", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMediaMode(value: MediaMode): Self = StObject.set(x, "mediaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaModeUndefined: Self = StObject.set(x, "mediaMode", js.undefined)
  }
}

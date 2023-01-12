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
  
  inline def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
    inline def setArchiveMode(value: ArchiveMode): Self = StObject.set(x, "archiveMode", value.asInstanceOf[js.Any])
    
    inline def setArchiveModeUndefined: Self = StObject.set(x, "archiveMode", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMediaMode(value: MediaMode): Self = StObject.set(x, "mediaMode", value.asInstanceOf[js.Any])
    
    inline def setMediaModeUndefined: Self = StObject.set(x, "mediaMode", js.undefined)
  }
}

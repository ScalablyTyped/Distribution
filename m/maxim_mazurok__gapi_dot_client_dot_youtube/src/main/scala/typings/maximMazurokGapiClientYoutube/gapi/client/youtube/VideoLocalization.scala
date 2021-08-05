package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoLocalization extends StObject {
  
  /** Localized version of the video's description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Localized version of the video's title. */
  var title: js.UndefOr[String] = js.undefined
}
object VideoLocalization {
  
  inline def apply(): VideoLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoLocalization]
  }
  
  extension [Self <: VideoLocalization](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

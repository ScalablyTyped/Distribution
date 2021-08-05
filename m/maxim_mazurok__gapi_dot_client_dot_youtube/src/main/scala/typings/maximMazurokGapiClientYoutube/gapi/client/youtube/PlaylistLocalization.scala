package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistLocalization extends StObject {
  
  /** The localized strings for playlist's description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The localized strings for playlist's title. */
  var title: js.UndefOr[String] = js.undefined
}
object PlaylistLocalization {
  
  inline def apply(): PlaylistLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistLocalization]
  }
  
  extension [Self <: PlaylistLocalization](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

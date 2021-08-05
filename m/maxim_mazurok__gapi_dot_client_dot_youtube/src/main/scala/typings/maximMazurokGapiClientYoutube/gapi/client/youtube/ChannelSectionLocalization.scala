package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSectionLocalization extends StObject {
  
  /** The localized strings for channel section's title. */
  var title: js.UndefOr[String] = js.undefined
}
object ChannelSectionLocalization {
  
  inline def apply(): ChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSectionLocalization]
  }
  
  extension [Self <: ChannelSectionLocalization](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

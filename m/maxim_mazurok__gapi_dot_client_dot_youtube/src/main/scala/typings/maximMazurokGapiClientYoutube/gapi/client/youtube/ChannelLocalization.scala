package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelLocalization extends StObject {
  
  /** The localized strings for channel's description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The localized strings for channel's title. */
  var title: js.UndefOr[String] = js.undefined
}
object ChannelLocalization {
  
  inline def apply(): ChannelLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelLocalization]
  }
  
  extension [Self <: ChannelLocalization](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

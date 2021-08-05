package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageLinks extends StObject {
  
  // Opens the page in the OneNote native client if it's installed.
  var oneNoteClientUrl: js.UndefOr[NullableOption[ExternalLink]] = js.undefined
  
  // Opens the page in OneNote on the web.
  var oneNoteWebUrl: js.UndefOr[NullableOption[ExternalLink]] = js.undefined
}
object PageLinks {
  
  inline def apply(): PageLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLinks]
  }
  
  extension [Self <: PageLinks](x: Self) {
    
    inline def setOneNoteClientUrl(value: NullableOption[ExternalLink]): Self = StObject.set(x, "oneNoteClientUrl", value.asInstanceOf[js.Any])
    
    inline def setOneNoteClientUrlNull: Self = StObject.set(x, "oneNoteClientUrl", null)
    
    inline def setOneNoteClientUrlUndefined: Self = StObject.set(x, "oneNoteClientUrl", js.undefined)
    
    inline def setOneNoteWebUrl(value: NullableOption[ExternalLink]): Self = StObject.set(x, "oneNoteWebUrl", value.asInstanceOf[js.Any])
    
    inline def setOneNoteWebUrlNull: Self = StObject.set(x, "oneNoteWebUrl", null)
    
    inline def setOneNoteWebUrlUndefined: Self = StObject.set(x, "oneNoteWebUrl", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenotePagePreview extends StObject {
  
  var links: js.UndefOr[NullableOption[OnenotePagePreviewLinks]] = js.undefined
  
  var previewText: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnenotePagePreview {
  
  inline def apply(): OnenotePagePreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePagePreview]
  }
  
  extension [Self <: OnenotePagePreview](x: Self) {
    
    inline def setLinks(value: NullableOption[OnenotePagePreviewLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksNull: Self = StObject.set(x, "links", null)
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setPreviewText(value: NullableOption[String]): Self = StObject.set(x, "previewText", value.asInstanceOf[js.Any])
    
    inline def setPreviewTextNull: Self = StObject.set(x, "previewText", null)
    
    inline def setPreviewTextUndefined: Self = StObject.set(x, "previewText", js.undefined)
  }
}

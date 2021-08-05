package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenotePagePreviewLinks extends StObject {
  
  var previewImageUrl: js.UndefOr[NullableOption[ExternalLink]] = js.undefined
}
object OnenotePagePreviewLinks {
  
  inline def apply(): OnenotePagePreviewLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePagePreviewLinks]
  }
  
  extension [Self <: OnenotePagePreviewLinks](x: Self) {
    
    inline def setPreviewImageUrl(value: NullableOption[ExternalLink]): Self = StObject.set(x, "previewImageUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageUrlNull: Self = StObject.set(x, "previewImageUrl", null)
    
    inline def setPreviewImageUrlUndefined: Self = StObject.set(x, "previewImageUrl", js.undefined)
  }
}

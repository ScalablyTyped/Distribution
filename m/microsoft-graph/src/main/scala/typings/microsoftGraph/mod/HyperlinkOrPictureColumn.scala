package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperlinkOrPictureColumn extends StObject {
  
  // Specifies whether the display format used for URL columns is an image or a hyperlink.
  var isPicture: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object HyperlinkOrPictureColumn {
  
  inline def apply(): HyperlinkOrPictureColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkOrPictureColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HyperlinkOrPictureColumn] (val x: Self) extends AnyVal {
    
    inline def setIsPicture(value: NullableOption[Boolean]): Self = StObject.set(x, "isPicture", value.asInstanceOf[js.Any])
    
    inline def setIsPictureNull: Self = StObject.set(x, "isPicture", null)
    
    inline def setIsPictureUndefined: Self = StObject.set(x, "isPicture", js.undefined)
  }
}

package typings.openui5.anon

import typings.openui5.sapUiCoreLibraryMod.CSSSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentWidth extends StObject {
  
  /**
    * Height configuration for the related popup container
    */
  var contentHeight: js.UndefOr[CSSSize] = js.undefined
  
  /**
    * Width configuration for the related popup container
    */
  var contentWidth: js.UndefOr[CSSSize] = js.undefined
}
object ContentWidth {
  
  inline def apply(): ContentWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentWidth]
  }
  
  extension [Self <: ContentWidth](x: Self) {
    
    inline def setContentHeight(value: CSSSize): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
    
    inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
    
    inline def setContentWidth(value: CSSSize): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
  }
}

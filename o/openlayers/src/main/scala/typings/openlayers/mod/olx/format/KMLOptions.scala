package typings.openlayers.mod.olx.format

import typings.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KMLOptions extends StObject {
  
  var defaultStyle: js.UndefOr[js.Array[Style]] = js.undefined
  
  var extractStyles: js.UndefOr[Boolean] = js.undefined
  
  var showPointNames: js.UndefOr[Boolean] = js.undefined
  
  var writeStyles: js.UndefOr[Boolean] = js.undefined
}
object KMLOptions {
  
  inline def apply(): KMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KMLOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultStyle(value: js.Array[Style]): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
    
    inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
    
    inline def setDefaultStyleVarargs(value: Style*): Self = StObject.set(x, "defaultStyle", js.Array(value*))
    
    inline def setExtractStyles(value: Boolean): Self = StObject.set(x, "extractStyles", value.asInstanceOf[js.Any])
    
    inline def setExtractStylesUndefined: Self = StObject.set(x, "extractStyles", js.undefined)
    
    inline def setShowPointNames(value: Boolean): Self = StObject.set(x, "showPointNames", value.asInstanceOf[js.Any])
    
    inline def setShowPointNamesUndefined: Self = StObject.set(x, "showPointNames", js.undefined)
    
    inline def setWriteStyles(value: Boolean): Self = StObject.set(x, "writeStyles", value.asInstanceOf[js.Any])
    
    inline def setWriteStylesUndefined: Self = StObject.set(x, "writeStyles", js.undefined)
  }
}

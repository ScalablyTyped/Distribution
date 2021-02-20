package typings.openlayers.mod.olx.format

import typings.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMLOptions extends StObject {
  
  var defaultStyle: js.UndefOr[js.Array[Style]] = js.native
  
  var extractStyles: js.UndefOr[Boolean] = js.native
  
  var showPointNames: js.UndefOr[Boolean] = js.native
  
  var writeStyles: js.UndefOr[Boolean] = js.native
}
object KMLOptions {
  
  @scala.inline
  def apply(): KMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMLOptions]
  }
  
  @scala.inline
  implicit class KMLOptionsMutableBuilder[Self <: KMLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultStyle(value: js.Array[Style]): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
    
    @scala.inline
    def setDefaultStyleVarargs(value: Style*): Self = StObject.set(x, "defaultStyle", js.Array(value :_*))
    
    @scala.inline
    def setExtractStyles(value: Boolean): Self = StObject.set(x, "extractStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractStylesUndefined: Self = StObject.set(x, "extractStyles", js.undefined)
    
    @scala.inline
    def setShowPointNames(value: Boolean): Self = StObject.set(x, "showPointNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPointNamesUndefined: Self = StObject.set(x, "showPointNames", js.undefined)
    
    @scala.inline
    def setWriteStyles(value: Boolean): Self = StObject.set(x, "writeStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteStylesUndefined: Self = StObject.set(x, "writeStyles", js.undefined)
  }
}

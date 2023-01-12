package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentHeight extends StObject {
  
  /**
    * Height configuration for the related popup container
    */
  var contentHeight: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Width configuration for the related popup container
    */
  var contentWidth: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The mode is used by the `sap.m.p13n.Popup` control
    */
  var mode: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The source control to be used by the `sap.m.p13n.Popup` control (only necessary if the mode is set to
    * `ResponsivePopover`)
    */
  var source: js.UndefOr[default] = js.undefined
  
  /**
    * The title for the `sap.m.p13n.Popup` control
    */
  var title: js.UndefOr[String] = js.undefined
}
object ContentHeight {
  
  inline def apply(): ContentHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentHeight] (val x: Self) extends AnyVal {
    
    inline def setContentHeight(value: js.Object): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
    
    inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
    
    inline def setContentWidth(value: js.Object): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
    
    inline def setMode(value: js.Object): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSource(value: default): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

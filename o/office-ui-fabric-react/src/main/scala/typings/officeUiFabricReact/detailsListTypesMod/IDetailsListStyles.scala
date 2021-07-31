package typings.officeUiFabricReact.detailsListTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDetailsListStyles extends StObject {
  
  var contentWrapper: IStyle
  
  var focusZone: IStyle
  
  var headerWrapper: IStyle
  
  var root: IStyle
}
object IDetailsListStyles {
  
  @scala.inline
  def apply(): IDetailsListStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsListStyles]
  }
  
  @scala.inline
  implicit class IDetailsListStylesMutableBuilder[Self <: IDetailsListStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentWrapper(value: IStyle): Self = StObject.set(x, "contentWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWrapperNull: Self = StObject.set(x, "contentWrapper", null)
    
    @scala.inline
    def setContentWrapperUndefined: Self = StObject.set(x, "contentWrapper", js.undefined)
    
    @scala.inline
    def setFocusZone(value: IStyle): Self = StObject.set(x, "focusZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusZoneNull: Self = StObject.set(x, "focusZone", null)
    
    @scala.inline
    def setFocusZoneUndefined: Self = StObject.set(x, "focusZone", js.undefined)
    
    @scala.inline
    def setHeaderWrapper(value: IStyle): Self = StObject.set(x, "headerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderWrapperNull: Self = StObject.set(x, "headerWrapper", null)
    
    @scala.inline
    def setHeaderWrapperUndefined: Self = StObject.set(x, "headerWrapper", js.undefined)
    
    @scala.inline
    def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

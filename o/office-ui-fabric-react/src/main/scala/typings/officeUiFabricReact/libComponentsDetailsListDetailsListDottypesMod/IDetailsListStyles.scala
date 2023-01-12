package typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod

import typings.uifabricMergeStyles.libIstyleMod.IStyle
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
  
  inline def apply(): IDetailsListStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsListStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDetailsListStyles] (val x: Self) extends AnyVal {
    
    inline def setContentWrapper(value: IStyle): Self = StObject.set(x, "contentWrapper", value.asInstanceOf[js.Any])
    
    inline def setContentWrapperNull: Self = StObject.set(x, "contentWrapper", null)
    
    inline def setContentWrapperUndefined: Self = StObject.set(x, "contentWrapper", js.undefined)
    
    inline def setFocusZone(value: IStyle): Self = StObject.set(x, "focusZone", value.asInstanceOf[js.Any])
    
    inline def setFocusZoneNull: Self = StObject.set(x, "focusZone", null)
    
    inline def setFocusZoneUndefined: Self = StObject.set(x, "focusZone", js.undefined)
    
    inline def setHeaderWrapper(value: IStyle): Self = StObject.set(x, "headerWrapper", value.asInstanceOf[js.Any])
    
    inline def setHeaderWrapperNull: Self = StObject.set(x, "headerWrapper", null)
    
    inline def setHeaderWrapperUndefined: Self = StObject.set(x, "headerWrapper", js.undefined)
    
    inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

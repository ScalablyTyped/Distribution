package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typings.officeUiFabricReact.libComponentsFocusTrapZoneFocusTrapZoneDottypesMod.IFocusTrapZoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalloutFocusTrapCalloutDottypesMod {
  
  trait IFocusTrapCalloutProps
    extends StObject
       with ICalloutProps {
    
    /**
      * Optional props to be passed on to FocusTrapZone
      */
    var focusTrapProps: js.UndefOr[IFocusTrapZoneProps] = js.undefined
  }
  object IFocusTrapCalloutProps {
    
    inline def apply(): IFocusTrapCalloutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFocusTrapCalloutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFocusTrapCalloutProps] (val x: Self) extends AnyVal {
      
      inline def setFocusTrapProps(value: IFocusTrapZoneProps): Self = StObject.set(x, "focusTrapProps", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapPropsUndefined: Self = StObject.set(x, "focusTrapProps", js.undefined)
    }
  }
}

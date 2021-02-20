package typings.officeUiFabricReact

import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusTrapCalloutTypesMod {
  
  @js.native
  trait IFocusTrapCalloutProps extends ICalloutProps {
    
    /**
      * Optional props to be passed on to FocusTrapZone
      */
    var focusTrapProps: js.UndefOr[IFocusTrapZoneProps] = js.native
  }
  object IFocusTrapCalloutProps {
    
    @scala.inline
    def apply(): IFocusTrapCalloutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFocusTrapCalloutProps]
    }
    
    @scala.inline
    implicit class IFocusTrapCalloutPropsMutableBuilder[Self <: IFocusTrapCalloutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusTrapProps(value: IFocusTrapZoneProps): Self = StObject.set(x, "focusTrapProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusTrapPropsUndefined: Self = StObject.set(x, "focusTrapProps", js.undefined)
    }
  }
}

package typings.mraid

import typings.mraid.mod.MRAIDOrientation
import typings.mraid.mraidStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<mraid.mraid.MRAIDExpandProperties> */
  trait PartialMRAIDExpandPropert extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var isModal: js.UndefOr[Boolean] = js.undefined
    
    var useCustomClose: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PartialMRAIDExpandPropert {
    
    inline def apply(): PartialMRAIDExpandPropert = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMRAIDExpandPropert]
    }
    
    extension [Self <: PartialMRAIDExpandPropert](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsModal(value: Boolean): Self = StObject.set(x, "isModal", value.asInstanceOf[js.Any])
      
      inline def setIsModalUndefined: Self = StObject.set(x, "isModal", js.undefined)
      
      inline def setUseCustomClose(value: Boolean): Self = StObject.set(x, "useCustomClose", value.asInstanceOf[js.Any])
      
      inline def setUseCustomCloseUndefined: Self = StObject.set(x, "useCustomClose", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mraid.mraid.MRAIDOrientationProperties> */
  trait PartialMRAIDOrientationPr extends StObject {
    
    var allowOrientationChange: js.UndefOr[Boolean] = js.undefined
    
    var forceOrientation: js.UndefOr[MRAIDOrientation | none] = js.undefined
  }
  object PartialMRAIDOrientationPr {
    
    inline def apply(): PartialMRAIDOrientationPr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMRAIDOrientationPr]
    }
    
    extension [Self <: PartialMRAIDOrientationPr](x: Self) {
      
      inline def setAllowOrientationChange(value: Boolean): Self = StObject.set(x, "allowOrientationChange", value.asInstanceOf[js.Any])
      
      inline def setAllowOrientationChangeUndefined: Self = StObject.set(x, "allowOrientationChange", js.undefined)
      
      inline def setForceOrientation(value: MRAIDOrientation | none): Self = StObject.set(x, "forceOrientation", value.asInstanceOf[js.Any])
      
      inline def setForceOrientationUndefined: Self = StObject.set(x, "forceOrientation", js.undefined)
    }
  }
}

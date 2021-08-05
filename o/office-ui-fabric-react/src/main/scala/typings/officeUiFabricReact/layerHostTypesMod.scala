package typings.officeUiFabricReact

import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerHostTypesMod {
  
  trait ILayerHost extends StObject
  
  trait ILayerHostProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /**
      * Optional callback to access the ILayerHost interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ILayerHost]] = js.undefined
  }
  object ILayerHostProps {
    
    inline def apply(): ILayerHostProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILayerHostProps]
    }
    
    extension [Self <: ILayerHostProps](x: Self) {
      
      inline def setComponentRef(value: IRefObject[ILayerHost]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ILayerHost | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    }
  }
}

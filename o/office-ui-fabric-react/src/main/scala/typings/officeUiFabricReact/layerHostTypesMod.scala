package typings.officeUiFabricReact

import typings.react.mod.HTMLAttributes
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerHostTypesMod {
  
  trait ILayerHost extends StObject {
    
    /**
      * The hostId for this host, to be propagatd to layers using Customizer.
      */
    var hostId: String
    
    /**
      * Notifies the layer host that layers may have been added or removed within its root element.
      */
    def notifyLayersChanged(): Unit
    
    /**
      * An element ref to the layer host's content root.
      * This is the element to which layers will be added.
      */
    var rootRef: RefObject[HTMLDivElement | Null]
  }
  object ILayerHost {
    
    inline def apply(hostId: String, notifyLayersChanged: () => Unit, rootRef: RefObject[HTMLDivElement | Null]): ILayerHost = {
      val __obj = js.Dynamic.literal(hostId = hostId.asInstanceOf[js.Any], notifyLayersChanged = js.Any.fromFunction0(notifyLayersChanged), rootRef = rootRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILayerHost]
    }
    
    extension [Self <: ILayerHost](x: Self) {
      
      inline def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
      
      inline def setNotifyLayersChanged(value: () => Unit): Self = StObject.set(x, "notifyLayersChanged", js.Any.fromFunction0(value))
      
      inline def setRootRef(value: RefObject[HTMLDivElement | Null]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
    }
  }
  
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

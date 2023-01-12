package typings.mobxReact

import typings.mobxReact.distTypesIreactcomponentMod.IReactComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIwrappedcomponentMod {
  
  trait IWrappedComponent[P] extends StObject {
    
    var wrappedComponent: IReactComponent[P]
  }
  object IWrappedComponent {
    
    inline def apply[P](wrappedComponent: IReactComponent[P]): IWrappedComponent[P] = {
      val __obj = js.Dynamic.literal(wrappedComponent = wrappedComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWrappedComponent[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWrappedComponent[?], P] (val x: Self & IWrappedComponent[P]) extends AnyVal {
      
      inline def setWrappedComponent(value: IReactComponent[P]): Self = StObject.set(x, "wrappedComponent", value.asInstanceOf[js.Any])
    }
  }
}

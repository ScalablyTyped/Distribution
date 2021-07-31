package typings.mobxReact

import typings.mobxReact.ireactcomponentMod.IReactComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iwrappedcomponentMod {
  
  trait IWrappedComponent[P] extends StObject {
    
    var wrappedComponent: IReactComponent[P]
  }
  object IWrappedComponent {
    
    @scala.inline
    def apply[P](wrappedComponent: IReactComponent[P]): IWrappedComponent[P] = {
      val __obj = js.Dynamic.literal(wrappedComponent = wrappedComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWrappedComponent[P]]
    }
    
    @scala.inline
    implicit class IWrappedComponentMutableBuilder[Self <: IWrappedComponent[?], P] (val x: Self & IWrappedComponent[P]) extends AnyVal {
      
      @scala.inline
      def setWrappedComponent(value: IReactComponent[P]): Self = StObject.set(x, "wrappedComponent", value.asInstanceOf[js.Any])
    }
  }
}

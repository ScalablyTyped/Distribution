package typings.miniStore

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait WrappedComponent[C /* <: ComponentType[_] */] extends StObject {
    
    var WrappedComponent: C = js.native
  }
  object WrappedComponent {
    
    @scala.inline
    def apply[C /* <: ComponentType[_] */](WrappedComponent: C): WrappedComponent[C] = {
      val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedComponent[C]]
    }
    
    @scala.inline
    implicit class WrappedComponentMutableBuilder[Self <: WrappedComponent[_], C /* <: ComponentType[_] */] (val x: Self with WrappedComponent[C]) extends AnyVal {
      
      @scala.inline
      def setWrappedComponent(value: C): Self = StObject.set(x, "WrappedComponent", value.asInstanceOf[js.Any])
    }
  }
}

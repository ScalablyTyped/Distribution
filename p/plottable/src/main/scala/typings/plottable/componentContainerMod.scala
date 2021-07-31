package typings.plottable

import typings.plottable.componentMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentContainerMod {
  
  @JSImport("plottable/build/src/components/componentContainer", "ComponentContainer")
  @js.native
  class ComponentContainer () extends Component {
    
    /* protected */ def _adoptAndAnchor(component: Component): Unit = js.native
    
    var _detachCallback: js.Any = js.native
    
    /**
      * Invokes a callback on each Component in the ComponentContainer.
      */
    /* protected */ def _forEach(callback: js.Function1[/* component */ Component, Unit]): Unit = js.native
    
    /**
      * Carry out the actual removal of a Component.
      * Implementation dependent on the type of container.
      *
      * @return {boolean} true if the Component was successfully removed, false otherwise.
      */
    /* protected */ def _remove(component: Component): Boolean = js.native
    
    /**
      * Checks whether the specified Component is in the ComponentContainer.
      */
    def has(component: Component): Boolean = js.native
    
    /**
      * Removes the specified Component from the ComponentContainer.
      */
    def remove(component: Component): this.type = js.native
  }
}

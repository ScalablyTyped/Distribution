package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/decorators/BaseDecorator", JSImport.Namespace)
@js.native
object libUtilitiesDecoratorsBaseDecoratorMod extends js.Object {
  @js.native
  class BaseDecorator[TProps, TState] protected () extends BaseComponent[TProps, TState] {
    def this(props: TProps) = this()
    var _composedComponentInstance: Component[TProps, TState, _] = js.native
    var _hoisted: js.Any = js.native
    /**
      * Updates the ref to the component composed by the decorator, which will also take care of hoisting
      * (and unhoisting as appropriate) methods from said component.
      *
      * Pass this method as the argument to the 'ref' property of the composed component.
      */
    /* protected */ def _updateComposedComponentRef(composedComponentInstance: Component[TProps, TState, _]): Unit = js.native
  }
  
}


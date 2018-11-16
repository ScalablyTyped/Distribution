package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Utilities", "BaseComponent")
@js.native
class BaseComponent[TProps /* <: atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[_] */, TState] protected ()
  extends atUifabricUtilitiesLib.utilitiesMod.BaseComponent[TProps, TState] {
  /**
       * BaseComponent constructor
       * @param props - The props for the component.
       * @param context - The context for the component.
       */
  def this(props: TProps) = this()
  /**
       * BaseComponent constructor
       * @param props - The props for the component.
       * @param context - The context for the component.
       */
  def this(props: TProps, context: js.Any) = this()
}

@JSImport("office-ui-fabric-react/lib/Utilities", "BaseComponent")
@js.native
object BaseComponent extends js.Object {
  /**
       * @deprecated Use React's error boundaries instead.
       */
  def onError(): scala.Unit = js.native
  /**
       * @deprecated Use React's error boundaries instead.
       */
  def onError(errorMessage: java.lang.String): scala.Unit = js.native
  /**
       * @deprecated Use React's error boundaries instead.
       */
  def onError(errorMessage: java.lang.String, ex: js.Any): scala.Unit = js.native
}


package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "BaseComponent")
@js.native
class BaseComponent[TProps /* <: IBaseProps[_] */, TState] protected ()
  extends typings.officeUiFabricReact.utilitiesMod.BaseComponent[TProps, TState] {
  /**
    * BaseComponent constructor
    * @param props - The props for the component.
    * @param context - The context for the component.
    */
  def this(props: TProps) = this()
  def this(props: TProps, context: js.Any) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "BaseComponent")
@js.native
object BaseComponent extends js.Object {
  /**
    * @deprecated Use React's error boundaries instead.
    */
  def onError(): Unit = js.native
  def onError(errorMessage: String): Unit = js.native
  def onError(errorMessage: String, ex: js.Any): Unit = js.native
}


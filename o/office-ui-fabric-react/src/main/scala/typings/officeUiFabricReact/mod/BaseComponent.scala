package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object BaseComponent {
  
  /**
    * @deprecated Use React's error boundaries instead.
    */
  @JSImport("office-ui-fabric-react", "BaseComponent.onError")
  @js.native
  def onError(): Unit = js.native
  @JSImport("office-ui-fabric-react", "BaseComponent.onError")
  @js.native
  def onError(errorMessage: js.UndefOr[scala.Nothing], ex: js.Any): Unit = js.native
  @JSImport("office-ui-fabric-react", "BaseComponent.onError")
  @js.native
  def onError(errorMessage: String): Unit = js.native
  @JSImport("office-ui-fabric-react", "BaseComponent.onError")
  @js.native
  def onError(errorMessage: String, ex: js.Any): Unit = js.native
}

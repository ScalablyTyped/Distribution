package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "BaseComponent")
@js.native
class BaseComponent[TProps /* <: IBaseProps[js.Any] */, TState] protected ()
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
  
  @JSImport("office-ui-fabric-react", "BaseComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated Use React's error boundaries instead.
    */
  @scala.inline
  def onError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")().asInstanceOf[Unit]
  @scala.inline
  def onError(errorMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onError(errorMessage: String, ex: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onError")(errorMessage.asInstanceOf[js.Any], ex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onError(errorMessage: Unit, ex: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onError")(errorMessage.asInstanceOf[js.Any], ex.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

package typings.officeUiFabricReact.indexBundleMod

import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "BaseComponent")
@js.native
class BaseComponent[TProps /* <: IBaseProps[_] */, TState] protected ()
  extends typings.officeUiFabricReact.mod.BaseComponent[TProps, TState] {
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
  @JSImport("office-ui-fabric-react/lib/index.bundle", "BaseComponent.onError")
  @js.native
  def onError(): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "BaseComponent.onError")
  @js.native
  def onError(errorMessage: js.UndefOr[scala.Nothing], ex: js.Any): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "BaseComponent.onError")
  @js.native
  def onError(errorMessage: String): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "BaseComponent.onError")
  @js.native
  def onError(errorMessage: String, ex: js.Any): Unit = js.native
}

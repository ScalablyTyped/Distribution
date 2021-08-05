package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.spinnerTypesMod.ISpinnerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "SpinnerBase")
@js.native
class SpinnerBase protected ()
  extends typings.officeUiFabricReact.mod.SpinnerBase {
  def this(props: ISpinnerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ISpinnerProps, context: js.Any) = this()
}
/* static members */
object SpinnerBase {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "SpinnerBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "SpinnerBase.defaultProps")
  @js.native
  def defaultProps: ISpinnerProps = js.native
  inline def defaultProps_=(x: ISpinnerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}

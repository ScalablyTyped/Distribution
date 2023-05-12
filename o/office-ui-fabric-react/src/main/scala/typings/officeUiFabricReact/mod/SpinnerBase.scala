package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.ISpinnerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "SpinnerBase")
@js.native
open class SpinnerBase protected ()
  extends typings.officeUiFabricReact.libSpinnerMod.SpinnerBase {
  def this(props: ISpinnerProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: ISpinnerProps, context: Any) = this()
}
/* static members */
object SpinnerBase {
  
  @JSImport("office-ui-fabric-react", "SpinnerBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "SpinnerBase.defaultProps")
  @js.native
  def defaultProps: ISpinnerProps = js.native
  inline def defaultProps_=(x: ISpinnerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}

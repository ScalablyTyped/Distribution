package typings.officeUiFabricReact

import typings.officeUiFabricReact.spinnerTypesMod.ISpinnerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.base", "SpinnerBase")
  @js.native
  class SpinnerBase protected ()
    extends Component[ISpinnerProps, js.Any, js.Any] {
    def this(props: ISpinnerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ISpinnerProps, context: js.Any) = this()
  }
  /* static members */
  object SpinnerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.base", "SpinnerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.base", "SpinnerBase.defaultProps")
    @js.native
    def defaultProps: ISpinnerProps = js.native
    @scala.inline
    def defaultProps_=(x: ISpinnerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}

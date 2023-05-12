package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.ISpinnerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSpinnerSpinnerDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.base", "SpinnerBase")
  @js.native
  open class SpinnerBase protected () extends Component[ISpinnerProps, Any, Any] {
    def this(props: ISpinnerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ISpinnerProps, context: Any) = this()
  }
  /* static members */
  object SpinnerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.base", "SpinnerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.base", "SpinnerBase.defaultProps")
    @js.native
    def defaultProps: ISpinnerProps = js.native
    inline def defaultProps_=(x: ISpinnerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}

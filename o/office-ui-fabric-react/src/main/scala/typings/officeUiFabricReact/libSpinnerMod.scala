package typings.officeUiFabricReact

import typings.officeUiFabricReact.spinnerTypesMod.ISpinnerProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Spinner", JSImport.Namespace)
@js.native
object libSpinnerMod extends js.Object {
  
  val Spinner: FunctionComponent[ISpinnerProps] = js.native
  
  @js.native
  class SpinnerBase ()
    extends typings.officeUiFabricReact.spinnerMod.SpinnerBase
  /* static members */
  @js.native
  object SpinnerBase extends js.Object {
    
    var defaultProps: ISpinnerProps = js.native
  }
  
  @js.native
  object SpinnerSize extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize with Double] = js.native
    
    /* 3 */ val large: typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize.large with Double = js.native
    
    /* 2 */ val medium: typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize.medium with Double = js.native
    
    /* 1 */ val small: typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize.small with Double = js.native
    
    /* 0 */ val xSmall: typings.officeUiFabricReact.spinnerTypesMod.SpinnerSize.xSmall with Double = js.native
  }
  
  @js.native
  object SpinnerType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.spinnerTypesMod.SpinnerType with Double] = js.native
    
    /* 1 */ val large: typings.officeUiFabricReact.spinnerTypesMod.SpinnerType.large with Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.spinnerTypesMod.SpinnerType.normal with Double = js.native
  }
}

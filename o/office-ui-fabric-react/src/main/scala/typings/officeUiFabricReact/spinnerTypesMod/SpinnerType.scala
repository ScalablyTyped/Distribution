package typings.officeUiFabricReact.spinnerTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpinnerType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerType")
@js.native
object SpinnerType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpinnerType with Double] = js.native
  
  /**
    * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.large` instead.
    * @deprecated Use `SpinnerSize.large` instead.
    */
  @js.native
  sealed trait large extends SpinnerType
  /* 1 */ @js.native
  object large extends TopLevel[large with Double]
  
  /**
    * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.medium` instead.
    * @deprecated Use `SpinnerSize.medium` instead.
    */
  @js.native
  sealed trait normal extends SpinnerType
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
}

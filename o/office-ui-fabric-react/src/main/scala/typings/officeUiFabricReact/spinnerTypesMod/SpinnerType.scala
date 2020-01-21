package typings.officeUiFabricReact.spinnerTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpinnerType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerType")
@js.native
object SpinnerType extends js.Object {
  /**
    * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.large` instead.
    * @deprecated Use `SpinnerSize.large` instead.
    */
  @js.native
  sealed trait large extends SpinnerType
  
  /**
    * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.medium` instead.
    * @deprecated Use `SpinnerSize.medium` instead.
    */
  @js.native
  sealed trait normal extends SpinnerType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpinnerType with Double] = js.native
  /* 1 */ @js.native
  object large extends TopLevel[large with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}


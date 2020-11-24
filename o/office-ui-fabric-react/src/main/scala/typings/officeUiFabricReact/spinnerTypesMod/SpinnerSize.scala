package typings.officeUiFabricReact.spinnerTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpinnerSize extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerSize")
@js.native
object SpinnerSize extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpinnerSize with Double] = js.native
  
  /**
    * 28px Spinner diameter
    */
  @js.native
  sealed trait large extends SpinnerSize
  /* 3 */ @js.native
  object large extends TopLevel[large with Double]
  
  /**
    * 20px Spinner diameter
    */
  @js.native
  sealed trait medium extends SpinnerSize
  /* 2 */ @js.native
  object medium extends TopLevel[medium with Double]
  
  /**
    * 16px Spinner diameter
    */
  @js.native
  sealed trait small extends SpinnerSize
  /* 1 */ @js.native
  object small extends TopLevel[small with Double]
  
  /**
    * 12px Spinner diameter
    */
  @js.native
  sealed trait xSmall extends SpinnerSize
  /* 0 */ @js.native
  object xSmall extends TopLevel[xSmall with Double]
}

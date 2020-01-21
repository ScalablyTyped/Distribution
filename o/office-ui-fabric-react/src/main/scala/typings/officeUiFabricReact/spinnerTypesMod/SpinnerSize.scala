package typings.officeUiFabricReact.spinnerTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpinnerSize extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerSize")
@js.native
object SpinnerSize extends js.Object {
  /**
    * 28px Spinner diameter
    */
  @js.native
  sealed trait large extends SpinnerSize
  
  /**
    * 20px Spinner diameter
    */
  @js.native
  sealed trait medium extends SpinnerSize
  
  /**
    * 16px Spinner diameter
    */
  @js.native
  sealed trait small extends SpinnerSize
  
  /**
    * 12px Spinner diameter
    */
  @js.native
  sealed trait xSmall extends SpinnerSize
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpinnerSize with Double] = js.native
  /* 3 */ @js.native
  object large extends TopLevel[large with Double]
  
  /* 2 */ @js.native
  object medium extends TopLevel[medium with Double]
  
  /* 1 */ @js.native
  object small extends TopLevel[small with Double]
  
  /* 0 */ @js.native
  object xSmall extends TopLevel[xSmall with Double]
  
}


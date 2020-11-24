package typings.officeUiFabricReact.spinButtonSpinButtonMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyboardSpinDirection extends js.Object
@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "KeyboardSpinDirection")
@js.native
object KeyboardSpinDirection extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyboardSpinDirection with Double] = js.native
  
  @js.native
  sealed trait down extends KeyboardSpinDirection
  /* -1 */ @js.native
  object down extends TopLevel[down with Double]
  
  @js.native
  sealed trait notSpinning extends KeyboardSpinDirection
  /* 0 */ @js.native
  object notSpinning extends TopLevel[notSpinning with Double]
  
  @js.native
  sealed trait up extends KeyboardSpinDirection
  /* 1 */ @js.native
  object up extends TopLevel[up with Double]
}

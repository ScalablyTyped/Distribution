package typings.officeUiFabricReact.focusZoneTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FocusZoneDirection extends js.Object

@JSImport("office-ui-fabric-react/lib/components/FocusZone/FocusZone.types", "FocusZoneDirection")
@js.native
object FocusZoneDirection extends js.Object {
  /** React to all arrows. */
  @js.native
  sealed trait bidirectional extends FocusZoneDirection
  
  /**
    * React to all arrows. Navigate next item in DOM on right/down arrow keys and previous - left/up arrow keys.
    * Right and Left arrow keys are swapped in RTL mode.
    */
  @js.native
  sealed trait domOrder extends FocusZoneDirection
  
  /** Only react to left/right arrows. */
  @js.native
  sealed trait horizontal extends FocusZoneDirection
  
  /** Only react to up/down arrows. */
  @js.native
  sealed trait vertical extends FocusZoneDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FocusZoneDirection with Double] = js.native
  /* 2 */ @js.native
  object bidirectional extends TopLevel[bidirectional with Double]
  
  /* 3 */ @js.native
  object domOrder extends TopLevel[domOrder with Double]
  
  /* 1 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /* 0 */ @js.native
  object vertical extends TopLevel[vertical with Double]
  
}


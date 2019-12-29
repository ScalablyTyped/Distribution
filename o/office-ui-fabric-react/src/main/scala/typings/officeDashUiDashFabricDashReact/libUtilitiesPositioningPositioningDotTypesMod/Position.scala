package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait bottom extends Position
  
  @js.native
  sealed trait end extends Position
  
  @js.native
  sealed trait start extends Position
  
  @js.native
  sealed trait top extends Position
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
  /* 1 */ @js.native
  object bottom extends TopLevel[bottom with Double]
  
  /* 3 */ @js.native
  object end extends TopLevel[end with Double]
  
  /* 2 */ @js.native
  object start extends TopLevel[start with Double]
  
  /* 0 */ @js.native
  object top extends TopLevel[top with Double]
  
}


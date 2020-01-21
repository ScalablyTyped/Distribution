package typings.officeUiFabricReact.positioningTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RectangleEdge extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "RectangleEdge")
@js.native
object RectangleEdge extends js.Object {
  @js.native
  sealed trait bottom extends RectangleEdge
  
  @js.native
  sealed trait left extends RectangleEdge
  
  @js.native
  sealed trait right extends RectangleEdge
  
  @js.native
  sealed trait top extends RectangleEdge
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RectangleEdge with Double] = js.native
  /* -1 */ @js.native
  object bottom extends TopLevel[bottom with Double]
  
  /* 2 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* -2 */ @js.native
  object right extends TopLevel[right with Double]
  
  /* 1 */ @js.native
  object top extends TopLevel[top with Double]
  
}


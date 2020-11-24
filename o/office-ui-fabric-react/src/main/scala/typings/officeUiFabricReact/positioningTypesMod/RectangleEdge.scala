package typings.officeUiFabricReact.positioningTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RectangleEdge extends js.Object
@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "RectangleEdge")
@js.native
object RectangleEdge extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RectangleEdge with Double] = js.native
  
  @js.native
  sealed trait bottom extends RectangleEdge
  /* -1 */ @js.native
  object bottom extends TopLevel[bottom with Double]
  
  @js.native
  sealed trait left extends RectangleEdge
  /* 2 */ @js.native
  object left extends TopLevel[left with Double]
  
  @js.native
  sealed trait right extends RectangleEdge
  /* -2 */ @js.native
  object right extends TopLevel[right with Double]
  
  @js.native
  sealed trait top extends RectangleEdge
  /* 1 */ @js.native
  object top extends TopLevel[top with Double]
}

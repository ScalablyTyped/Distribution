package typings.officeUiFabricReact.positioningTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Position extends js.Object
@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "Position")
@js.native
object Position extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
  
  @js.native
  sealed trait bottom extends Position
  /* 1 */ @js.native
  object bottom extends TopLevel[bottom with Double]
  
  @js.native
  sealed trait end extends Position
  /* 3 */ @js.native
  object end extends TopLevel[end with Double]
  
  @js.native
  sealed trait start extends Position
  /* 2 */ @js.native
  object start extends TopLevel[start with Double]
  
  @js.native
  sealed trait top extends Position
  /* 0 */ @js.native
  object top extends TopLevel[top with Double]
}

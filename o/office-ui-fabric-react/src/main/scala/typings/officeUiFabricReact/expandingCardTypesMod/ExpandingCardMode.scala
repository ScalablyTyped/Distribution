package typings.officeUiFabricReact.expandingCardTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExpandingCardMode extends js.Object
@JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.types", "ExpandingCardMode")
@js.native
object ExpandingCardMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExpandingCardMode with Double] = js.native
  
  /**
    * To have top compact card only
    */
  @js.native
  sealed trait compact extends ExpandingCardMode
  /* 0 */ @js.native
  object compact extends TopLevel[compact with Double]
  
  /**
    * To have both top compact and bottom expanded card
    */
  @js.native
  sealed trait expanded extends ExpandingCardMode
  /* 1 */ @js.native
  object expanded extends TopLevel[expanded with Double]
}

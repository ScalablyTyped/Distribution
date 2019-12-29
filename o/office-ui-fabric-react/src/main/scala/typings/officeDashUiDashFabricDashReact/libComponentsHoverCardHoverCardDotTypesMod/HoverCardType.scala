package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HoverCardType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.types", "HoverCardType")
@js.native
object HoverCardType extends js.Object {
  /**
    * File card consisting of two parts: compact and expanded. Has some default sizes if not specified.
    */
  @js.native
  sealed trait expanding extends HoverCardType
  
  /**
    * Plain card consisting of one part responsive to the size of content.
    */
  @js.native
  sealed trait plain extends HoverCardType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HoverCardType with String] = js.native
  /* "ExpandingCard" */ @js.native
  object expanding extends TopLevel[expanding with String]
  
  /* "PlainCard" */ @js.native
  object plain extends TopLevel[plain with String]
  
}


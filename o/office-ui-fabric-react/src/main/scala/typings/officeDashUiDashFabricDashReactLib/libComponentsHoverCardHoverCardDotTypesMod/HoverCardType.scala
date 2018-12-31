package typings
package officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod

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
  sealed trait expanding
    extends officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod.HoverCardType
  
  /**
    * Plain card consisting of one part responsive to the size of content.
    */
  @js.native
  sealed trait plain
    extends officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod.HoverCardType
  
  /* "ExpandingCard" */ val expanding: expanding with java.lang.String = js.native
  /* "PlainCard" */ val plain: plain with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod.HoverCardType with java.lang.String
  ] = js.native
}


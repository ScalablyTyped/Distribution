package typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StickyPositionType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky.types", "StickyPositionType")
@js.native
object StickyPositionType extends js.Object {
  @js.native
  sealed trait Both extends StickyPositionType
  
  @js.native
  sealed trait Footer extends StickyPositionType
  
  @js.native
  sealed trait Header extends StickyPositionType
  
  /* 0 */ val Both: typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Both with Double = js.native
  /* 2 */ val Footer: typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Footer with Double = js.native
  /* 1 */ val Header: typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Header with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StickyPositionType with Double] = js.native
}


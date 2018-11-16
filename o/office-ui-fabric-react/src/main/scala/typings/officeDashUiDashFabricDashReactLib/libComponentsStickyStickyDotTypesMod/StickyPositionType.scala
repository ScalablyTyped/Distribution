package typings
package officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StickyPositionType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky.types", "StickyPositionType")
@js.native
object StickyPositionType extends js.Object {
  @js.native
  sealed trait Both
    extends officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod.StickyPositionType
  
  @js.native
  sealed trait Footer
    extends officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod.StickyPositionType
  
  @js.native
  sealed trait Header
    extends officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod.StickyPositionType
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 2 */ val Footer: Footer with scala.Double = js.native
  /* 1 */ val Header: Header with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod.StickyPositionType with scala.Double
  ] = js.native
}


package typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Both
import typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Footer
import typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Header
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StickyPositionType with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 2 */ @js.native
  object Footer extends TopLevel[Footer with Double]
  
  /* 1 */ @js.native
  object Header extends TopLevel[Header with Double]
  
}


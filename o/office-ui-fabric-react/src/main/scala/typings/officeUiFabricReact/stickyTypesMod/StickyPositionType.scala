package typings.officeUiFabricReact.stickyTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StickyPositionType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky.types", "StickyPositionType")
@js.native
object StickyPositionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StickyPositionType with Double] = js.native
  
  @js.native
  sealed trait Both extends StickyPositionType
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  @js.native
  sealed trait Footer extends StickyPositionType
  /* 2 */ @js.native
  object Footer extends TopLevel[Footer with Double]
  
  @js.native
  sealed trait Header extends StickyPositionType
  /* 1 */ @js.native
  object Header extends TopLevel[Header with Double]
}

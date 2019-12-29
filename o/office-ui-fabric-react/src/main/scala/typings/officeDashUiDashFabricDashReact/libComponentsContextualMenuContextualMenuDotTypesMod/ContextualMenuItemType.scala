package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextualMenuItemType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "ContextualMenuItemType")
@js.native
object ContextualMenuItemType extends js.Object {
  @js.native
  sealed trait Divider extends ContextualMenuItemType
  
  @js.native
  sealed trait Header extends ContextualMenuItemType
  
  @js.native
  sealed trait Normal extends ContextualMenuItemType
  
  @js.native
  sealed trait Section extends ContextualMenuItemType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContextualMenuItemType with Double] = js.native
  /* 1 */ @js.native
  object Divider extends TopLevel[Divider with Double]
  
  /* 2 */ @js.native
  object Header extends TopLevel[Header with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 3 */ @js.native
  object Section extends TopLevel[Section with Double]
  
}


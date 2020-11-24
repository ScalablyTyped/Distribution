package typings.officeUiFabricReact.selectableOptionTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectableOptionMenuItemType extends js.Object
@JSImport("office-ui-fabric-react/lib/utilities/selectableOption/SelectableOption.types", "SelectableOptionMenuItemType")
@js.native
object SelectableOptionMenuItemType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType with Double] = js.native
  
  @js.native
  sealed trait Divider extends SelectableOptionMenuItemType
  /* 1 */ @js.native
  object Divider extends TopLevel[Divider with Double]
  
  @js.native
  sealed trait Header extends SelectableOptionMenuItemType
  /* 2 */ @js.native
  object Header extends TopLevel[Header with Double]
  
  @js.native
  sealed trait Normal extends SelectableOptionMenuItemType
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
}

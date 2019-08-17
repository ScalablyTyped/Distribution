package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CheckboxVisibility extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "CheckboxVisibility")
@js.native
object CheckboxVisibility extends js.Object {
  /**
    * Visible always.
    */
  @js.native
  sealed trait always extends CheckboxVisibility
  
  /**
    * Hide checkboxes.
    */
  @js.native
  sealed trait hidden extends CheckboxVisibility
  
  /**
    * Visible on hover.
    */
  @js.native
  sealed trait onHover extends CheckboxVisibility
  
  /* 1 */ val always: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility.always with Double = js.native
  /* 2 */ val hidden: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility.hidden with Double = js.native
  /* 0 */ val onHover: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility.onHover with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckboxVisibility with Double] = js.native
}


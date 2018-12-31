package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod

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
  sealed trait always
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility
  
  /**
    * Hide checkboxes.
    */
  @js.native
  sealed trait hidden
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility
  
  /**
    * Visible on hover.
    */
  @js.native
  sealed trait onHover
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility
  
  /* 1 */ val always: always with scala.Double = js.native
  /* 2 */ val hidden: hidden with scala.Double = js.native
  /* 0 */ val onHover: onHover with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility with scala.Double
  ] = js.native
}


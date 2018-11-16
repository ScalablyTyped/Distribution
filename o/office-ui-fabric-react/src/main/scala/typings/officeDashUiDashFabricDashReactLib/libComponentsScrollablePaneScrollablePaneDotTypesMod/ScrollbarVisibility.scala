package typings
package officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScrollbarVisibility extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.types", "ScrollbarVisibility")
@js.native
object ScrollbarVisibility extends js.Object {
  @js.native
  sealed trait always
    extends officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod.ScrollbarVisibility
  
  @js.native
  sealed trait auto
    extends officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod.ScrollbarVisibility
  
  /* "always" */ val always: always with java.lang.String = js.native
  /* "auto" */ val auto: auto with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod.ScrollbarVisibility with java.lang.String
  ] = js.native
}


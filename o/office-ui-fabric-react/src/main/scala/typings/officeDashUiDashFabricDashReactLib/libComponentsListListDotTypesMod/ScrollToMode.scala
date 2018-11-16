package typings
package officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScrollToMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/List/List.types", "ScrollToMode")
@js.native
object ScrollToMode extends js.Object {
  /**
       * Does not make any consideration to where in the viewport the item should align to.
       */
  @js.native
  sealed trait auto
    extends officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.ScrollToMode
  
  /**
       * Attempts to scroll the list so the bottom of the desired item is aligned with the bottom of the viewport.
       */
  @js.native
  sealed trait bottom
    extends officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.ScrollToMode
  
  /**
       * Attempts to scroll the list so the desired item is in the exact center of the viewport.
       */
  @js.native
  sealed trait center
    extends officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.ScrollToMode
  
  /**
       * Attempts to scroll the list so the top of the desired item is aligned with the top of the viewport.
       */
  @js.native
  sealed trait top
    extends officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.ScrollToMode
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 2 */ val bottom: bottom with scala.Double = js.native
  /* 3 */ val center: center with scala.Double = js.native
  /* 1 */ val top: top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.ScrollToMode with scala.Double
  ] = js.native
}


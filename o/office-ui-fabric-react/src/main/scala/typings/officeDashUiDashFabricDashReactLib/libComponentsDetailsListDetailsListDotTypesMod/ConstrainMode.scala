package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConstrainMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ConstrainMode")
@js.native
object ConstrainMode extends js.Object {
  /**
       * If specified, constrains the list to the given layout space.
       */
  @js.native
  sealed trait horizontalConstrained
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode
  
  /** If specified, lets the content grow which allows the page to manage scrolling. */
  @js.native
  sealed trait unconstrained
    extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode
  
  /* 1 */ val horizontalConstrained: horizontalConstrained with scala.Double = js.native
  /* 0 */ val unconstrained: unconstrained with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode with scala.Double
  ] = js.native
}


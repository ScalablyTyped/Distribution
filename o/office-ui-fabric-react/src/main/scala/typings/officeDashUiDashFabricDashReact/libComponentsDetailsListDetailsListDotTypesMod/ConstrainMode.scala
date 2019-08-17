package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod

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
  sealed trait horizontalConstrained extends ConstrainMode
  
  /** If specified, lets the content grow which allows the page to manage scrolling. */
  @js.native
  sealed trait unconstrained extends ConstrainMode
  
  /* 1 */ val horizontalConstrained: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode.horizontalConstrained with Double = js.native
  /* 0 */ val unconstrained: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode.unconstrained with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstrainMode with Double] = js.native
}


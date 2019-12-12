package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode.horizontalConstrained
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode.unconstrained
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstrainMode with Double] = js.native
  /* 1 */ @js.native
  object horizontalConstrained extends TopLevel[horizontalConstrained with Double]
  
  /* 0 */ @js.native
  object unconstrained extends TopLevel[unconstrained with Double]
  
}


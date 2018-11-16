package typings
package officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElementType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ElementType")
@js.native
object ElementType extends js.Object {
  /** <a> element. */
  @js.native
  sealed trait anchor
    extends officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ElementType
  
  /** <button> element. */
  @js.native
  sealed trait button
    extends officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ElementType
  
  /* 1 */ val anchor: anchor with scala.Double = js.native
  /* 0 */ val button: button with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ElementType with scala.Double
  ] = js.native
}


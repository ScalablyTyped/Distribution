package typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ElementType.anchor
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ElementType.button
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
  sealed trait anchor extends ElementType
  
  /** <button> element. */
  @js.native
  sealed trait button extends ElementType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementType with Double] = js.native
  /* 1 */ @js.native
  object anchor extends TopLevel[anchor with Double]
  
  /* 0 */ @js.native
  object button extends TopLevel[button with Double]
  
}


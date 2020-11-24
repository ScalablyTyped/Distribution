package typings.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckboxVisibility extends js.Object
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "CheckboxVisibility")
@js.native
object CheckboxVisibility extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckboxVisibility with Double] = js.native
  
  /** Visible always. */
  @js.native
  sealed trait always extends CheckboxVisibility
  /* 1 */ @js.native
  object always extends TopLevel[always with Double]
  
  /** Hide checkboxes. */
  @js.native
  sealed trait hidden extends CheckboxVisibility
  /* 2 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /** Visible on hover. */
  @js.native
  sealed trait onHover extends CheckboxVisibility
  /* 0 */ @js.native
  object onHover extends TopLevel[onHover with Double]
}

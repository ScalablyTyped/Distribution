package typings.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConstrainMode extends StObject
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ConstrainMode")
@js.native
object ConstrainMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstrainMode with Double] = js.native
  
  /** Constrains the list to the given layout space. */
  @js.native
  sealed trait horizontalConstrained extends ConstrainMode
  /* 1 */ val horizontalConstrained: typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode.horizontalConstrained with Double = js.native
  
  /** Lets the content grow which allows the page to manage scrolling. */
  @js.native
  sealed trait unconstrained extends ConstrainMode
  /* 0 */ val unconstrained: typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode.unconstrained with Double = js.native
}

package typings.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConstrainMode extends js.Object
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ConstrainMode")
@js.native
object ConstrainMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstrainMode with Double] = js.native
  
  /** Constrains the list to the given layout space. */
  @js.native
  sealed trait horizontalConstrained extends ConstrainMode
  /* 1 */ @js.native
  object horizontalConstrained extends TopLevel[horizontalConstrained with Double]
  
  /** Lets the content grow which allows the page to manage scrolling. */
  @js.native
  sealed trait unconstrained extends ConstrainMode
  /* 0 */ @js.native
  object unconstrained extends TopLevel[unconstrained with Double]
}

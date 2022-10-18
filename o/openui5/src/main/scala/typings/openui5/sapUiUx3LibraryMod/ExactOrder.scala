package typings.openui5.sapUiUx3LibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExactOrder extends StObject
@JSImport("sap/ui/ux3/library", "ExactOrder")
@js.native
object ExactOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ExactOrder & String] = js.native
  
  /**
    * The order of the sub lists is defined by order of the defined sub attributes.
    */
  @js.native
  sealed trait Fixed
    extends StObject
       with ExactOrder
  /* "Fixed" */ val Fixed: typings.openui5.sapUiUx3LibraryMod.ExactOrder.Fixed & String = js.native
  
  /**
    * The order of the sub lists is defined by the selection order of the user.
    */
  @js.native
  sealed trait Select
    extends StObject
       with ExactOrder
  /* "Select" */ val Select: typings.openui5.sapUiUx3LibraryMod.ExactOrder.Select & String = js.native
}

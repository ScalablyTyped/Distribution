package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FactoryApiNs.PopupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PopupType extends js.Object

@JSGlobal("ComponentFramework.FactoryApi.Popup.PopupType")
@js.native
object PopupType extends js.Object {
  /**
  			 * Not root popup in the popup stack
  			 */
  @js.native
  sealed trait Nested
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FactoryApiNs.PopupNs.PopupType
  
  /**
  			 * Root popup in the popup stack
  			 */
  @js.native
  sealed trait Root
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FactoryApiNs.PopupNs.PopupType
  
  val Nested: Nested with scala.Double = js.native
  /* 1 */ val Root: Root with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FactoryApiNs.PopupNs.PopupType with scala.Double
  ] = js.native
}


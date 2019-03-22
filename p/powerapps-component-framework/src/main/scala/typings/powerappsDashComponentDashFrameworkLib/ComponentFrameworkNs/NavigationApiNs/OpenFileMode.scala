package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenFileMode extends js.Object

/**
		 * The options for openFile mode.
		 */
@JSGlobal("ComponentFramework.NavigationApi.OpenFileMode")
@js.native
object OpenFileMode extends js.Object {
  /**
  			 * default. mode open
  			 */
  @js.native
  sealed trait open
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.OpenFileMode
  
  /**
  			 * mode save
  			 */
  @js.native
  sealed trait save
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.OpenFileMode
  
  /* 1 */ val open: open with scala.Double = js.native
  /* 2 */ val save: save with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.OpenFileMode with scala.Double
  ] = js.native
}


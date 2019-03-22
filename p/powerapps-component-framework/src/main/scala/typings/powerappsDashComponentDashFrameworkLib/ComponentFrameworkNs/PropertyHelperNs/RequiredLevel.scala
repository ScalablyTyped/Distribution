package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RequiredLevel extends js.Object

/**
		 * Attribute required level
		 */
@JSGlobal("ComponentFramework.PropertyHelper.RequiredLevel")
@js.native
object RequiredLevel extends js.Object {
  @js.native
  sealed trait ApplicationRequired
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel
  
  @js.native
  sealed trait None
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel
  
  @js.native
  sealed trait Recommended
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel
  
  @js.native
  sealed trait SystemRequired
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel
  
  @js.native
  sealed trait Unknown
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel
  
  /* 2 */ val ApplicationRequired: ApplicationRequired with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val Recommended: Recommended with scala.Double = js.native
  /* 1 */ val SystemRequired: SystemRequired with scala.Double = js.native
  /* -1 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel with scala.Double
  ] = js.native
}


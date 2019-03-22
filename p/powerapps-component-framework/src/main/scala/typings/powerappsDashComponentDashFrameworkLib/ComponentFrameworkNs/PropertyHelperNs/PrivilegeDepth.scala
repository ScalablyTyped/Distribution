package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrivilegeDepth extends js.Object

/**
		 * Entity Priviledge Depth
		 */
@JSGlobal("ComponentFramework.PropertyHelper.PrivilegeDepth")
@js.native
object PrivilegeDepth extends js.Object {
  @js.native
  sealed trait Basic
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeDepth
  
  @js.native
  sealed trait Deep
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeDepth
  
  @js.native
  sealed trait Global
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeDepth
  
  @js.native
  sealed trait Local
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeDepth
  
  @js.native
  sealed trait None
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeDepth
  
  /* 0 */ val Basic: Basic with scala.Double = js.native
  /* 2 */ val Deep: Deep with scala.Double = js.native
  /* 3 */ val Global: Global with scala.Double = js.native
  /* 1 */ val Local: Local with scala.Double = js.native
  /* -1 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeDepth with scala.Double
  ] = js.native
}


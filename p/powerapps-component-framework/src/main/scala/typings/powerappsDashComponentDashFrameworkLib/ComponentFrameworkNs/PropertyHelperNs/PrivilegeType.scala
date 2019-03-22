package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrivilegeType extends js.Object

/**
		 * Entity privilege types.
		 */
@JSGlobal("ComponentFramework.PropertyHelper.PrivilegeType")
@js.native
object PrivilegeType extends js.Object {
  @js.native
  sealed trait Append
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType
  
  @js.native
  sealed trait AppendTo
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType
  
  @js.native
  sealed trait Assign
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType
  
  @js.native
  sealed trait Create
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType
  
  @js.native
  sealed trait Delete
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType
  
  @js.native
  sealed trait None
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType
  
  @js.native
  sealed trait Read
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType
  
  @js.native
  sealed trait Share
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType
  
  @js.native
  sealed trait Write
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType
  
  /* 7 */ val Append: Append with scala.Double = js.native
  /* 8 */ val AppendTo: AppendTo with scala.Double = js.native
  /* 5 */ val Assign: Assign with scala.Double = js.native
  /* 1 */ val Create: Create with scala.Double = js.native
  /* 4 */ val Delete: Delete with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Read: Read with scala.Double = js.native
  /* 6 */ val Share: Share with scala.Double = js.native
  /* 3 */ val Write: Write with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.PrivilegeType with scala.Double
  ] = js.native
}


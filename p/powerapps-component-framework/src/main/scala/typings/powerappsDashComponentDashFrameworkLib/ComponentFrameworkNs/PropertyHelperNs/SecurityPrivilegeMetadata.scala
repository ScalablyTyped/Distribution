package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Entity metadata security privileges.
		 */
trait SecurityPrivilegeMetadata extends js.Object {
  var CanBeBasic: scala.Boolean
  var CanBeDeep: scala.Boolean
  var CanBeEntityReference: scala.Boolean
  var CanBeGlobal: scala.Boolean
  var CanBeLocal: scala.Boolean
  var CanBeParentEntityReference: scala.Boolean
  var Name: java.lang.String
  var PrivilegeId: java.lang.String
  var PrivilegeType: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.PrivilegeType
}

object SecurityPrivilegeMetadata {
  @scala.inline
  def apply(
    CanBeBasic: scala.Boolean,
    CanBeDeep: scala.Boolean,
    CanBeEntityReference: scala.Boolean,
    CanBeGlobal: scala.Boolean,
    CanBeLocal: scala.Boolean,
    CanBeParentEntityReference: scala.Boolean,
    Name: java.lang.String,
    PrivilegeId: java.lang.String,
    PrivilegeType: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.PrivilegeType
  ): SecurityPrivilegeMetadata = {
    val __obj = js.Dynamic.literal(CanBeBasic = CanBeBasic, CanBeDeep = CanBeDeep, CanBeEntityReference = CanBeEntityReference, CanBeGlobal = CanBeGlobal, CanBeLocal = CanBeLocal, CanBeParentEntityReference = CanBeParentEntityReference, Name = Name, PrivilegeId = PrivilegeId, PrivilegeType = PrivilegeType)
  
    __obj.asInstanceOf[SecurityPrivilegeMetadata]
  }
}


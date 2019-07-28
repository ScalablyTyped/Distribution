package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.PrivilegeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Entity metadata security privileges.
		 */
trait SecurityPrivilegeMetadata extends js.Object {
  var CanBeBasic: Boolean
  var CanBeDeep: Boolean
  var CanBeEntityReference: Boolean
  var CanBeGlobal: Boolean
  var CanBeLocal: Boolean
  var CanBeParentEntityReference: Boolean
  var Name: String
  var PrivilegeId: String
  var PrivilegeType: typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.PrivilegeType
}

object SecurityPrivilegeMetadata {
  @scala.inline
  def apply(
    CanBeBasic: Boolean,
    CanBeDeep: Boolean,
    CanBeEntityReference: Boolean,
    CanBeGlobal: Boolean,
    CanBeLocal: Boolean,
    CanBeParentEntityReference: Boolean,
    Name: String,
    PrivilegeId: String,
    PrivilegeType: PrivilegeType
  ): SecurityPrivilegeMetadata = {
    val __obj = js.Dynamic.literal(CanBeBasic = CanBeBasic, CanBeDeep = CanBeDeep, CanBeEntityReference = CanBeEntityReference, CanBeGlobal = CanBeGlobal, CanBeLocal = CanBeLocal, CanBeParentEntityReference = CanBeParentEntityReference, Name = Name, PrivilegeId = PrivilegeId, PrivilegeType = PrivilegeType)
  
    __obj.asInstanceOf[SecurityPrivilegeMetadata]
  }
}

